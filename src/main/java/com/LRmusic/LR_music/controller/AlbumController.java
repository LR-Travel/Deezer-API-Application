package com.LRmusic.LR_music.controller;

import com.LRmusic.LR_music.model.Album;
import com.LRmusic.LR_music.model.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/album")
@RestController
@CrossOrigin(origins = "http://localhost:63343/")
public class AlbumController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public Album getAlbum(@PathVariable int id){
        Album album = restTemplate.getForObject("https://api.deezer.com/album/" + id, Album.class);
        return album;
    }
}
