package com.LRmusic.LR_music.controller;

import com.LRmusic.LR_music.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RequestMapping("/chart")
@RestController
@CrossOrigin

public class ChartController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public Chart getChart() {
        Chart chart = restTemplate.getForObject("https://api.deezer.com/chart/0", Chart.class);
        return chart;
    }

    @GetMapping("/track")
    public TrackData getTrackData(){
        TrackData track = restTemplate.getForObject("https://api.deezer.com/chart/0/tracks", TrackData.class);
        return track;
    }

    @GetMapping("/album")
    public AlbumData getAlbumData(){
        AlbumData album = restTemplate.getForObject("https://api.deezer.com/chart/0/albums", AlbumData.class);
        return album;
    }

    @GetMapping("/artist")
    public ArtistData getArtistData(){
        ArtistData artist = restTemplate.getForObject("https://api.deezer.com/chart/0/artists", ArtistData.class);
        return artist;
    }

    @GetMapping("/podcast")
    public PodcastData getPodcastData(){
        PodcastData podcast = restTemplate.getForObject("https://api.deezer.com/chart/0/podcasts", PodcastData.class);
        return podcast;
    }
}
