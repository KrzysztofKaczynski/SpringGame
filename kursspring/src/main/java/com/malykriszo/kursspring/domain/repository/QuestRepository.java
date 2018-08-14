package com.malykriszo.kursspring.domain.repository;

import com.malykriszo.kursspring.domain.Quest;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class QuestRepository {

    List<Quest> questList  = new ArrayList<>();

    public void createQuest(String description){
        questList.add(new Quest(description));
    }

    @Override
    public String toString() {
        return "QuestRepository{" +
                "questList=" + questList +
                '}';
    }

    public List<Quest> getAll() {
        return questList;
    }

    @PostConstruct
   public void init(){
        createQuest("Uratuj ksiezniczke");
        createQuest("Wez udzial w turnieju");
    }
}
