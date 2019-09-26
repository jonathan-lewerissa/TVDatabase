package com.jonathanrl.tvdatabase.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @ToString
public class Actor {
    private int id;
    private String name;
    private String role;

    public Actor(int id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }
}
