package pl.malykriszo.crud.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.malykriszo.crud.dao.StudentDao;
import pl.malykriszo.crud.domain.Student;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    private static Logger logger = LoggerFactory.getLogger(StudentServiceImpl.class);

    private StudentDao studentDao;

    @Autowired
    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> findAllStudents() {
        logger.info("findAllStudents()");
        return (List<Student>) studentDao.findAll();
    }

    @Override
    public Optional<Student> findStudentById(Long studentId) {
        logger.info("findStudentById, id: {}", studentId);
        return studentDao.findById(studentId);
    }

    @Override
    public void saveStudent(Student student) {
        logger.info("saveStudent(), student: {}", student);
        studentDao.save(student);
    }

    @Override
    public void deleteStudent(long id) {
        logger.info("deleteStudent(), id: {}", id);
        studentDao.deleteById(id);
    }

}
