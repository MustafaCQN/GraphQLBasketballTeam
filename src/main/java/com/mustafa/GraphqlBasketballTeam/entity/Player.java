package com.mustafa.GraphqlBasketballTeam.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "player")
@Setter
@Getter
public class Player implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 100, name = "name")
    private String name;

    @Column(length = 100, name = "surname")
    private String surname;

    @Column(length = 100, name = "position")
    private Position position;

    public enum Position {
        Point_guard_PG,
        Shooting_guard_SG,
        Small_forward_SF,
        Power_forward_PF,
        Center_C
    }

}

