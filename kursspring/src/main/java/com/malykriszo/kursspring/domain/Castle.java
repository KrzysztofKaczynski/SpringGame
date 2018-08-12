package com.malykriszo.kursspring.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Component
public class Castle {

    @Value("${my.castle.name:East Watch}")
    private String name;

    Map<String, Knight> knights = new HashMap<>();

    public Castle() {

    }

    Castle(String name) {
        this.name = name;

    }
    public void createKnight(String name, int age){
        knights.put(name, new Knight(name, age));
    }
    public Collection<Knight> getAllKnights() {
        return knights.values();
    }

    public Knight getKnight(String name) {
        return knights.get(name);
    }

    public void deleteKnight(String name){
        knights.remove(name);
    }

    public void build() {
        System.out.println("Wybudowano zamek " + name);
    }


    public void tearDown() {
        System.out.println("Zaraz wyburzymy zamek " + name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Znajduje się tu zamek o nazwie: " + this.name + " Zamieszkały przez rycerza " + knights;
    }
}
