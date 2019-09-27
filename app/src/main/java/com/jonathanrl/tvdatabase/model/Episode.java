package com.jonathanrl.tvdatabase.model;

import java.util.ArrayList;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @ToString
public class Episode {
    private int id, airedSeason;
    private String episodeName;
    private String firstAired;
    private String guestStar;
    private String director;
    private double rating;
    private String imageUrl;

    public Episode(int id, int airedSeason, String episodeName, String firstAired, String guestStar, String director, double rating, String imageUrl) {
        this.id = id;
        this.airedSeason = airedSeason;
        this.episodeName = episodeName;
        this.firstAired = firstAired;
        this.director = director;
        this.rating = rating;
        this.imageUrl = imageUrl;
        this.guestStar = guestStar;
    }
}
