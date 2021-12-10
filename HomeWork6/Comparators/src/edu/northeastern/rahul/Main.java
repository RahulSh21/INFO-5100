package edu.northeastern.rahul;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
            List<Student> studentList = new ArrayList<Student>();

        Student Mayank = new Student(111, "Mayank", 3.5, 1990,9,19);
        Student Anshul = new Student(154, "Anshul", 4.0, 1991,12,9);
        Student Prateek = new Student(101, "Prateek", 3.7, 2000,10,20);
        Student Rohit = new Student(190, "Rohit", 3.0, 1990,2,14);
        Student Vijay = new Student(450, "Vijay", 4.1, 1995,1,01);
        Student Manish = new Student(510, "Manish", 2.9, 1981,7,10);
        Student Bob = new Student(109, "Bob", 3.9, 1987,6,1);
        Student Frank = new Student(905, "Frank", 4.9, 1991,8,5);

        studentList.add(Mayank);
        studentList.add(Anshul);
        studentList.add(Prateek);
        studentList.add(Rohit);
        studentList.add(Vijay);
        studentList.add(Manish);
        studentList.add(Bob);
        studentList.add(Frank);

        //Function calling to sort by Name
        compareName(studentList);
        //Function calling to sort in descending order by gpa
        compareGPA(studentList);
        //Function calling to sort by Id
        compareId(studentList);
        //Function calling to sort by Date of Birth
        compareDateOfBirth(studentList);

    }

    public static void toPrint(List<Student> studentList){
        DateFormat dateFormat = new SimpleDateFormat();
        for(Student student : studentList ) {
            System.out.println("Name: " + student.getName() + ", ID: " + student.getId() + ", GPA: " + student.getGpa() + ", Date of birth: " +dateFormat.format(student.getDateOfBirth()));
        }
        System.out.println();
    }

    public static void compareName(List<Student> studentList){
        System.out.println("******Sort by Name********");
        Collections.sort(studentList, (student1, student2) -> student1.getName().compareTo(student2.getName()));
        toPrint(studentList);
    }
    public static void compareId(List<Student> studentList){
        System.out.println("*******Sort by Id********");
        Collections.sort(studentList, (student1, student2) -> student1.getId().compareTo(student2.getId()));
        toPrint(studentList);
    }

    public static void compareGPA(List<Student> studentList){
        System.out.println("*****Sort in descending order of gpa**********");
        Collections.sort(studentList, (student2, student1) -> (student1.getGpa().compareTo(student2.getGpa())));
        toPrint(studentList);
    }
    public static void compareDateOfBirth(List<Student> studentList){
        System.out.println("*****Sort by Date of Birth **********");
        Collections.sort(studentList, (student1, student2) -> (student1.getDateOfBirth().compareTo(student2.getDateOfBirth())));
        toPrint(studentList);
    }
}


