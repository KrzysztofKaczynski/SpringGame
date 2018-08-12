package com.malykriszo.kursspring;

import com.malykriszo.kursspring.domain.Castle;
import com.malykriszo.kursspring.domain.Tournament;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner {

    @Autowired
    Castle castle;

    @Autowired
    Tournament tournament;

    @Override
    public void run(String... args) throws Exception {

        System.out.println(castle);

        tournament.duel();
        System.out.println(tournament);



    }
}
