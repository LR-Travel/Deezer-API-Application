package com.LRmusic.LR_music.controller;

import com.LRmusic.LR_music.model.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/artist")
@RestController
@CrossOrigin(origins = "http://localhost:63343/")
public class ArtistController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public Artist getArtist(@PathVariable int id){
        Artist artist = restTemplate.getForObject("https://api.deezer.com/artist/" + id, Artist.class);
        return artist;
    }
}
