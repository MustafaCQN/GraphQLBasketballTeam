package com.mustafa.GraphqlBasketballTeam.dto;

import com.mustafa.GraphqlBasketballTeam.entity.Player;
import lombok.Data;

@Data
public class PlayerDto {

    private String name;
    private String surname;
    private Player.Position position;

}
