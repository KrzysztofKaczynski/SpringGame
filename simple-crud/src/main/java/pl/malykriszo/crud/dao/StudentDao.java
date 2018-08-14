package pl.malykriszo.crud.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.malykriszo.crud.domain.Student;

@Repository
public interface StudentDao extends CrudRepository<Student, Long> {
}
