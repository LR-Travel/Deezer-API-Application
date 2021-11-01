package com.LRmusic.LR_music.controller;

import com.LRmusic.LR_music.model.Artist;
import com.LRmusic.LR_music.model.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/genre")
@RestController
public class GenreController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public Genre getGenre(@PathVariable int id){
        Genre genre = restTemplate.getForObject("https://api.deezer.com/genre/" + id, Genre.class);
        return genre;
    }
}
