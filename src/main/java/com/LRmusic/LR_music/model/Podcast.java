package com.LRmusic.LR_music.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Podcast {
    private int id;
    private String title;
    private String picture_big;
}
