package com.LRmusic.LR_music.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Chart {
    private TrackData tracks;
    private AlbumData albums;
    private ArtistData artists;
    private PodcastData podcasts;
}
