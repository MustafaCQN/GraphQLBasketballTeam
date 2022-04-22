package com.mustafa.GraphqlBasketballTeam.repository;

import com.mustafa.GraphqlBasketballTeam.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
