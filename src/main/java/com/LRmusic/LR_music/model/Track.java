package com.LRmusic.LR_music.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Track {
    private int id;
    private boolean readable;
    private String title;
    private String title_short;
    private String link;
    private String preview;
    private Artist artist;
    private Album album;
}
