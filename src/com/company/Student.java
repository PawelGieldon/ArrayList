package com.company;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> diary;
    private String student1;
    private String student2;

    public Student(String name) {
        this.name = name;
        this.diary = new ArrayList();

    }

    public void insertGrade(int grade){
        if(grade >= 1 && grade <= 6){
            diary.add(grade);
        }
    }

    public void insertGrade1(int grade, int grade3){
        if(grade >= 1 && grade <= 6){
            diary.add(grade);
        }

        if(grade3 >= 1 && grade3 <= 6){
            diary.add(grade3);
        }
    }

    public double average() {
        double sum = 0;
        for(int i = 0;i < diary.size(); i++){
            sum += diary.get(i);
        }
        return sum / diary.size();
    }



    public String toString(){
        return "nazwisko:" + name
                + " " + " Oceny: " + diary
                + " " + " średnia :" + average();
    }
}

