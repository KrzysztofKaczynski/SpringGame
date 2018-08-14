package com.malykriszo.kursspring;

import com.malykriszo.kursspring.domain.repository.KnightRepository;
import com.malykriszo.kursspring.domain.repository.QuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner {

    @Autowired
    KnightRepository knightRepository;

    @Autowired
    QuestRepository questRepository;


    @Override
    public void run(String... args) throws Exception {

        System.out.println(knightRepository);
    }
}
