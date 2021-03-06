package com.malykriszo.kursspring.domain;

public class Knight {


    private String name;

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private Quest quest;

    public Knight() {
        this.name = "Lancelot";
        this.age = 29;
    }

    public Knight(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public void setQuest(Quest quest) {
        System.out.println("Ustawiam zadanie dla rycerza");
        this.quest = quest;
    }

    @Override
    public String toString() {
        return "Rycerz o imieniu : " + name + "(" + age + "). Ma za zadanie: " + quest + ".";
    }
}
