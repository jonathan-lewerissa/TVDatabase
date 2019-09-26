package com.jonathanrl.tvdatabase.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @ToString
public class TvShow {
    private int id;
    private String seriesName;
    private double rating;
    private Actor actor[];

    public TvShow(int id, String seriesName, double rating, Actor[] actor) {
        this.id = id;
        this.seriesName = seriesName;
        this.rating = rating;
        this.actor = actor;
    }
}
