package com.LRmusic.LR_music.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Album {
    private int id;
    private String title;
    private String cover_big;
    private Artist artist;
}
