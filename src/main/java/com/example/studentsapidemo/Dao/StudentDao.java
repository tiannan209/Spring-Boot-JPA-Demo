package com.example.studentsapidemo.Dao;

import com.example.studentsapidemo.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDao {

    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>(){
            {
                put(1, new Student(1, "Tian Nan", "Computer Science"));
                put(2, new Student(2, "Nathan Cobby", "Sofeware Engineering"));
                put(3, new Student(3, "Phil Monk", "Information System"));
            }
        };
    }

    public Collection<Student> getAllStudents(){
        return this.students.values();
    }

    public Student getStudentById(int id){
        return this.students.get(id);
    }

    public void addStudent(Student student){
        int indexId = this.students.size() + 1;
        this.students.put(indexId, student);
    }

    public void updateStudent(){

    }

    public void removeStudentById(int id){
        this.students.remove(id);
    }
}