package org.example.project18;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {

    List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Ivan Mirolyubov", 4, 3.4);
        Student st2 = new Student("Anna Mishkina", 3, 7.8);
        Student st3 = new Student("Anton Volinskiy", 1, 9.1);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Начало работы getStudents");
        System.out.println(students.get(3));
        System.out.println("Information from nethod getStudents: ");
        System.out.println(students);
        return students;
    }
}
