package com.malykriszo.kursspring.services;


import com.malykriszo.kursspring.domain.Quest;
import com.malykriszo.kursspring.domain.repository.InMemoryRepository;
import com.malykriszo.kursspring.domain.repository.QuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class QuestService {

    @Autowired
    InMemoryRepository inMemoryRepository;

    @Autowired
    QuestRepository questRepository;

    final static Random rand = new Random();

    public void assignRandomQuest(String knightName) {
        List<Quest> allQuests = questRepository.getAll();
        Quest randomQuest = allQuests.get(rand.nextInt(allQuests.size()));
        inMemoryRepository.getKnight(knightName).setQuest(randomQuest);
        questRepository.deleteQuest(randomQuest);
    }
}
