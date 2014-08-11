package com.hexlet;

import com.hexlet.common.Course;
import com.hexlet.humans.Student;

public class Main {
    public static void main(String[] args){

        Student studentMax = new Student();
        studentMax.course = new Course();
        studentMax.course.name="Java Course";
        studentMax.name = "Max";
        studentMax.sayHello();

        Student studentSlava = new Student();
        studentSlava.course = new Course();
        studentSlava.sayHello();





    }



}
