package com.malykriszo.kursspring;

import com.malykriszo.kursspring.domain.repository.InMemoryRepository;
import com.malykriszo.kursspring.domain.repository.QuestRepository;
import com.malykriszo.kursspring.services.QuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner {

    @Autowired
    InMemoryRepository inMemoryRepository;

    @Autowired
    QuestRepository questRepository;

    @Autowired
    QuestService questService;


    @Override
    public void run(String... args) throws Exception {

        questRepository.createRandomQuest();
        questRepository.createRandomQuest();
        questRepository.createRandomQuest();
        System.out.println(questRepository);

        questService.assignRandomQuest("Lancelot");
        questService.assignRandomQuest("Percival");
    }
}
