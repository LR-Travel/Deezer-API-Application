package com.LRmusic.LR_music.controller;

import com.LRmusic.LR_music.model.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/artist")
@RestController
public class ArtistController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public Artist getArtist(@PathVariable int id){
        Artist artist = restTemplate.getForObject("https://api.deezer.com/artist/" + id, Artist.class);
        return artist;
    }
}
