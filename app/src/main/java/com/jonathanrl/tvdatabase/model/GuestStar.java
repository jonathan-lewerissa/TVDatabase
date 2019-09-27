package com.jonathanrl.tvdatabase.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @ToString
public class GuestStar {
    private int id;
    private String name;
    private String role;
    private String gender;

    public GuestStar(int id, String name, String role, String gender) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.gender = gender;
    }
}
