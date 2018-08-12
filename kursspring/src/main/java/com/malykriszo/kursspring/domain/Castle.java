package com.malykriszo.kursspring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Castle {

    @Value("${my.castle.name:East Watch}")
    private String name;


    Knight knight;

    @Autowired
    public Castle(@Qualifier(value = "lancelot") Knight knight) {
        this.knight = knight;

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
        return "Znajduje się tu zamek o nazwie: " + this.name + " Zamieszkały przez rycerza " + knight;
    }
}
