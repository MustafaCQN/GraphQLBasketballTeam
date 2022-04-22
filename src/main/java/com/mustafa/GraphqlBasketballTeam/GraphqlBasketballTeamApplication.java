package com.mustafa.GraphqlBasketballTeam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlBasketballTeamApplication {

	/**
	 * {@link com.coxautodev.graphql.tools.GraphQLQueryResolver} Api call
	 * {@link com.coxautodev.graphql.tools.GraphQLMutationResolver} Changing server resources
	 */

	public static void main(String[] args) {
		SpringApplication.run(GraphqlBasketballTeamApplication.class, args);
	}

}
