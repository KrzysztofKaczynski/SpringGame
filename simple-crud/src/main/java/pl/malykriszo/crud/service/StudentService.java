package pl.malykriszo.crud.service;

import pl.malykriszo.crud.domain.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> findAllStudents();
    Optional<Student> findStudentById(Long studentId);
    void saveStudent(Student student);
    void deleteStudent(long id);
}
