package com.mustafa.GraphqlBasketballTeam.api;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.mustafa.GraphqlBasketballTeam.dto.PlayerDto;
import com.mustafa.GraphqlBasketballTeam.entity.Player;
import com.mustafa.GraphqlBasketballTeam.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PlayerMutationResolver implements GraphQLMutationResolver {

    private final PlayerRepository playerRepository;

    public Player createPlayer(PlayerDto playerDto) {
        return playerRepository.save(dtoToEntity(playerDto));
    }

    public Boolean deletePlayerById(Long id) {
        playerRepository.deleteById(id);
        return true;
    }

    private Player dtoToEntity(PlayerDto playerDto) {
        Player player = new Player();
        player.setName(playerDto.getName());
        player.setSurname(playerDto.getSurname());
        player.setPosition(playerDto.getPosition());
        return player;
    }
}
