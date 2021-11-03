package com.LRmusic.LR_music.controller;

import com.LRmusic.LR_music.model.Album;
import com.LRmusic.LR_music.model.Track;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/track")
@RestController
@CrossOrigin(origins = "http://localhost:63343/")


public class TrackController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public Track getTrack(@PathVariable int id){
        Track track = restTemplate.getForObject("https://api.deezer.com/track/" + id, Track.class);
        return track;
    }
}
