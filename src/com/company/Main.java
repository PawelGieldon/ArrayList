package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<>();
    static String name;


    public static void main(String[] args) {


        Student student = new Student("Jan Nowak");
        Student student1 = new Student("Kuba Kowalski");
        Student student2 = new Student("Łukasz Markowski");

        student.insertGrade(3);
        student.insertGrade1(3,4);
        student.insertGrade1(3,5);
        student1.insertGrade1(2,5);
        student1.insertGrade1(1,4);
        student1.insertGrade(2);
        student2.insertGrade(2);
        student2.insertGrade(3);
        student2.insertGrade(1);
        student2.insertGrade1(4,5);
        System.out.println(student);
        System.out.println(student1);
        System.out.println(student2);


        while(name!="E") {

            insertStudent();
            students.forEach(System.out::println);
            System.out.println(student);
            System.out.println(student1);

        }

    }

    public static String getName() {
        return name;
    }


    static void insertStudent(){
        System.out.println("Podaj imie studenta: ");
        String name = getName();
     name = scanner.nextLine();

    Student student = new Student(name);

        students.add(student);
}


    static void removeStudent(){
        System.out.println("Podaj identyfikator studenta");
        int name = scanner.nextInt();
        students.remove(name);
    }

    static boolean chooseOption() {
        int option = scanner.nextInt();

        return true;
    }


}
