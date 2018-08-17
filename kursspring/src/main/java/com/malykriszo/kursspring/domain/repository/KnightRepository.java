package com.malykriszo.kursspring.domain.repository;

import com.malykriszo.kursspring.domain.Knight;

import javax.annotation.PostConstruct;
import java.util.Collection;

/**
 * com.malykriszo.kursspring.domain.repository Created by MałyKriszo on 2018-08-17.
 */
public interface KnightRepository {
    void createKnight(String name, int age);

    Collection<Knight> getAllKnights();

    Knight getKnight(String name);

    void deleteKnight(String name);

    @PostConstruct
    void build();
}
