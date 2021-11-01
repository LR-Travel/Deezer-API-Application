package com.LRmusic.LR_music.controller;

import com.LRmusic.LR_music.model.Album;
import com.LRmusic.LR_music.model.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/album")
@RestController
public class AlbumController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public Album getAlbum(@PathVariable int id){
        Album album = restTemplate.getForObject("https://api.deezer.com/album/" + id, Album.class);
        return album;
    }
}
