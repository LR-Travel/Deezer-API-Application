package com.LRmusic.LR_music.controller;

import com.LRmusic.LR_music.model.AlbumData;
import com.LRmusic.LR_music.model.ArtistData;
import com.LRmusic.LR_music.model.PodcastData;
import com.LRmusic.LR_music.model.TrackData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;



@RequestMapping("/search")
@RestController
@CrossOrigin(origins = "http://localhost:63342/")

public class SearchController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/track")
    public TrackData getSearch(@RequestParam("q") String VarSearch){
        TrackData searchTrack = restTemplate.getForObject("https://api.deezer.com/search/track?q=" + VarSearch, TrackData.class);
        return searchTrack;
    }

    @GetMapping("/album")
    public AlbumData getAlbum(@RequestParam("q") String VarSearch){
        AlbumData searchAlbum = restTemplate.getForObject("https://api.deezer.com/search/album?q=" + VarSearch, AlbumData.class);
        return searchAlbum;
    }

    @GetMapping("/artist")
    public ArtistData getArtist(@RequestParam("q") String VarSearch){
        ArtistData searchArtist = restTemplate.getForObject("https://api.deezer.com/search/artist?q=" + VarSearch, ArtistData.class);
        return searchArtist;
    }

    @GetMapping("/podcast")
    public PodcastData getPodcast(@RequestParam("q") String VarSearch){
        PodcastData searchPodcast = restTemplate.getForObject("https://api.deezer.com/search/podcast?q=" + VarSearch, PodcastData.class);
        return searchPodcast;
    }


}
