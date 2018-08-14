package pl.malykriszo.crud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.malykriszo.crud.domain.Student;
import pl.malykriszo.crud.service.StudentService;

import java.util.Optional;

@Controller
public class StudentController {

    private static final Logger log = LoggerFactory.getLogger(WelcomeController.class);

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/all-students")
    public String getAllStudents(Model model) {
        model.addAttribute("students", studentService.findAllStudents());

        return "students";
    }

    @GetMapping("/students/edit/{id}")
    public String editStudent(@PathVariable("id") long studentId, Model model) {

        log.info("Editing student of id {}", studentId);

        Optional<Student> maybeStudent = studentService.findStudentById(studentId);
        maybeStudent.ifPresent(student ->  model.addAttribute("student", student));

        return "edit-student";
    }

    @PostMapping("/students/save")
    public String saveStudent(@ModelAttribute Student student) {
        log.info("saveStudent(), student: {}", student);
        studentService.saveStudent(student);

        return "redirect:/all-students";
    }

    @GetMapping("/students/add")
    public String addStudent(Model model) {
        model.addAttribute("newstudent", new Student());

        return "add-student";
    }

    @GetMapping("/students/delete-choice/{id}")
    String deleteChoice(@PathVariable("id") long studentId, Model model) {
        model.addAttribute("sId", studentId);

        return "delete-choice";
    }

    @GetMapping("/students/delete/{deleteId}")
    String deleteStudent(@PathVariable("deleteId") long studentId) {

        log.info("deleteStudent(), id: {}", studentId);
        studentService.deleteStudent(studentId);

        return "redirect:/all-students";
    }
}
