package pl.malykriszo.crud.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String grade;
    private String faculty;

    public Student() {
        // empty
    }

    public Student(String name, String surname, String grade, String faculty) {
        this.name = name;
        this.surname = surname;
        this.grade = grade;
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", grade='" + grade + '\'' +
                ", faculty='" + faculty + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGrade() {
        return grade;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
