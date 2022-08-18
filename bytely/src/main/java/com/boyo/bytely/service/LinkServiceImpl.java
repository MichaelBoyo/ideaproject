package com.boyo.bytely.service;

import com.boyo.bytely.data.models.Link;
import com.boyo.bytely.data.models.ShortLink;
import com.boyo.bytely.data.repositories.LinkRepository;
import com.boyo.bytely.data.repositories.ShortLinkRepository;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinkServiceImpl implements LinkService{
    @Autowired
    private LinkRepository linkRepository;
    @Override
    public String saveLink(Link link) {
        linkRepository.save(link);
        return "saved successfully";
    }

    @Override
    public Link getLink(String id) {
        return linkRepository.findById(id).orElseThrow(
                ()-> new LinkNotFoundException("not found")
        );
    }

    @Override
    public String deleteLink(String id) {
        linkRepository.deleteById(id);
        return "deleted successfully";
    }

    @Override
    public String updateLink(String id, Link link) {
        var _link = getLink(id);
        _link.setUrl(link.getUrl());
        linkRepository.save(_link);
        return "updated successfully";
    }

    @Override
    public List<Link> getAllLinks() {
        return linkRepository.findAll();
    }

    @Override
    public Link getLinkByTitle(String title) {
        var links = linkRepository.findAll();
        for (var link:links){
            var arr = link.getUrl().split("\\.+");
            for (var e: arr){
                if(e.equalsIgnoreCase(title)){
                    return link;
                }
            }
        }

        throw new LinkNotFoundException("link not found");
    }

    @Override
    public void deleteAll() {
        linkRepository.deleteAll();
    }
    @Autowired
    private ShortLinkRepository shortLinkRepository;

    final int SHORT_ID_LENGTH = 5;

    @Override
    public String shortenLink(String linkId) {
        var shortId = RandomStringUtils.random(SHORT_ID_LENGTH);
        var link = getLink(linkId);
        var shortLink = new ShortLink();
        shortLink.setShortUrl("bly"+shortId);
        shortLink.setNormalUrl(link.getUrl());
        var ll = shortLinkRepository.save(shortLink).getShortUrl();
        return ll;
    }
}
