package com.mustafa.GraphqlBasketballTeam.api;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.mustafa.GraphqlBasketballTeam.entity.Player;
import com.mustafa.GraphqlBasketballTeam.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PlayerQueryResolver implements GraphQLQueryResolver {

    private final PlayerRepository playerRepository;

    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }
}
