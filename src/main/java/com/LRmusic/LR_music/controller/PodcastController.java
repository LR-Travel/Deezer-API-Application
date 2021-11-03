package com.LRmusic.LR_music.controller;

import com.LRmusic.LR_music.model.Artist;
import com.LRmusic.LR_music.model.Podcast;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/podcast")
@RestController
@CrossOrigin(origins = "http://localhost:63343/")
public class PodcastController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public Podcast getPodcast(@PathVariable int id){
        Podcast podcast = restTemplate.getForObject("https://api.deezer.com/podcast/" + id, Podcast.class);
        return podcast;
    }
}
