package com.malykriszo.kursspring;

import com.malykriszo.kursspring.domain.Castle;
import com.malykriszo.kursspring.domain.Knight;
import com.malykriszo.kursspring.domain.Quest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner {

    @Autowired
    Castle castle;

    @Override
    public void run(String... args) throws Exception {

        System.out.println(castle);

    }
}