package com.malykriszo.kursspring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Knight {

    @Value("Lancelot")
    private String name;

    @Value("29")
    private int age;

    private Quest quest;

    public Knight() {
    }


    //    public Knight(String name, int age, Quest quest) {
//        this.name = name;
//        this.age = age;
//        this.quest = quest;
//    }

    @Autowired
    public void setQuest(Quest quest) {
        System.out.println("Ustawiam zadanie dla rycerza");
        this.quest = quest;
    }

    @Override
    public String toString() {
        return "Rycerz o imieniu : " + name + "(" + age + "). Ma za zadanie: " + quest + ".";
    }
}
