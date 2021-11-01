package com.LRmusic.LR_music.controller;

import com.LRmusic.LR_music.model.Artist;
import com.LRmusic.LR_music.model.Podcast;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/podcast")
@RestController
public class PodcastController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public Podcast getPodcast(@PathVariable int id){
        Podcast podcast = restTemplate.getForObject("https://api.deezer.com/podcast/" + id, Podcast.class);
        return podcast;
    }
}
