package com.boyo.bytely.service;

import com.boyo.bytely.data.models.Link;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
public class LinkServiceImplTest {
    Link link;
    @Autowired
    private LinkService linkService;

    @BeforeEach
    void setUp() {
        link = new Link("google.com");
        linkService.saveLink(link);
    }
    @AfterEach
    void tearDown(){
        linkService.deleteAll();
    }

    @Test
    void saveLink() {
        assertEquals(1, linkService.getAllLinks().size());
    }

    @Test
    void getLink() {
        assertEquals("google.com", linkService.getLinkByTitle("google").getUrl());
    }

    @Test
    void deleteLink() {
        linkService.deleteLink(linkService.getLinkByTitle("google").getId());
        assertEquals(0,linkService.getAllLinks().size());
    }

    @Test
    void updateLink() {
        link.setUrl("yahoo.com");
        linkService.updateLink(linkService.getLinkByTitle("google").getId(), link);
        assertEquals("yahoo.com", linkService.getLinkByTitle("yahoo").getUrl());
    }
    @Test
    void shortenLinkTest(){
        var sh = linkService.shortenLink(linkService.getLinkByTitle("google").getId());
        System.out.println(sh);
        System.out.println(sh);
    }

}