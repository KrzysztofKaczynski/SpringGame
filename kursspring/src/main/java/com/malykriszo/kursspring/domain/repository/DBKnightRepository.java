package com.malykriszo.kursspring.domain.repository;

import com.malykriszo.kursspring.domain.Knight;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Collection;

/**
 * com.malykriszo.kursspring.domain.repository Created by MałyKriszo on 2018-08-17.
 */
@Repository
public class DBKnightRepository implements KnightRepository{

    @Override
    public void createKnight(String name, int age) {

        System.out.println("uzywam bazy danych");
    }

    @Override
    public Collection<Knight> getAllKnights() {
        System.out.println("uzywam bazy danych");
        return null;
    }

    @Override
    public Knight getKnight(String name) {
        System.out.println("uzywam bazy danych");
        return null;
    }

    @Override
    public void deleteKnight(String name) {
        System.out.println("uzywam bazy danych");
    }

    @Override
    @PostConstruct
    public void build() {

    }
}
