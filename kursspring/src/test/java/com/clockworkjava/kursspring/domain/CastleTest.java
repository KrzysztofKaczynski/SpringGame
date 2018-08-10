package com.clockworkjava.kursspring.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CastleTest {

    @Test
    public void castleToStringMessage() {
        Quest quest = new Quest();
        Knight knight = new Knight();
        knight.setQuest(quest);
        Castle castle = new Castle(knight,"Castle Black");
        String except = "Znajduje sie tu zamek o nazwie Castle Black. Zamieszkaly przez rycerza Rycerz o imieniu Lancelot(29). Ma za zadanie: Uratuj ksiezniczke";
        assertEquals(except, castle.toString());
    }
}
