package com.boyo.bytely.service;

import com.boyo.bytely.data.models.Link;
import com.boyo.bytely.data.models.ShortLink;

import java.util.List;

public interface LinkService {
    String saveLink(Link link);
    Link getLink(String id);
    String deleteLink(String id);
    String updateLink(String id, Link link);

    List<Link> getAllLinks();

    Link getLinkByTitle(String title);

    void deleteAll();

    String shortenLink(String linkId);
}
