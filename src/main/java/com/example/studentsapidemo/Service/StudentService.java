package com.example.studentsapidemo.Service;

import com.example.studentsapidemo.Dao.StudentDao;
import com.example.studentsapidemo.Entity.Student;
import com.example.studentsapidemo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    //private List<Student> students = new ArrayList<>(Arrays.asList(new Student(1, "Tian Nan", "Computer Science"),
    //        new Student(2, "Nathan Cobby", "Sofeware Engineering"),
    //        new Student(3, "Phil Monk", "Information System")));

    public List<Student> getAllStudents(){
        List<Student> students = new ArrayList<>();
        studentRepository.findAll().forEach(students::add);
        return students;
    }

    public void addStudent(Student student){
        studentRepository.save(student);
    }

    public Student getStudentbyId(int id){
        return studentRepository.findById(id).get();
    }


    public void updateStudent(int id, Student student){
        studentRepository.save(student);
    }

    public void removeStudentById(int id){
        studentRepository.deleteById(id);
    }

    /*@Autowired
    private StudentDao studentDao;

    public Collection<Student> getAllStudents(){
        return studentDao.getAllStudents();
    }

    public Student getStudentById(int id){
        return this.studentDao.getStudentById(id);
    }

    public void addStudent(Student student){
        this.studentDao.addStudent(student);
    }

    public void removeStudentById(int id){
        this.studentDao.removeStudentById(id);
    }*/
}
