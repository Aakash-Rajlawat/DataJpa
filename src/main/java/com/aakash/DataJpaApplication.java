package com.aakash;

import com.aakash.entity.Player;
import com.aakash.repository.PlayerRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DataJpaApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(DataJpaApplication.class, args);
        PlayerRepository playerRepository = configurableApplicationContext.getBean(PlayerRepository.class);

        Player p1 = new Player();
        p1.setPlayerId(2);
        p1.setPlayerName("Sarjak");
        p1.setPlayerAge(21);
        p1.setLocation("Kathmandu");

        playerRepository.save(p1); //Upsert Method
        System.out.println("Record inserted...");

    }

}

