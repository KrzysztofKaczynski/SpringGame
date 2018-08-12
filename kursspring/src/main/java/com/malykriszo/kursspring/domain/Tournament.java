package com.malykriszo.kursspring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class Tournament {

    @Autowired
    List<Knight> knights;

    public Tournament() {
    }

    public void duel() {
        //       knight.setAge(knight.getAge() + 1);
    }

    @Override
    public String toString() {
        return "W turnieju bierą udział rycerze: "
                + knights.stream().map(Objects::toString).collect(Collectors.joining(","));
    }

    public void setKnight(List<Knight> knights) {
        this.knights = knights;
    }

    //   public Knight getKnight() {
    //     return knight;
}

