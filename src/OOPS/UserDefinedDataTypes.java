package OOPS;

import java.util.Scanner;
class Student{ // my own data type
    String name;
    int rno;
    double cgpa;
    void print (){
        System.out.println(name+" "+rno+" "+cgpa+" ");
    }
}

public class UserDefinedDataTypes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Student s1 = new Student(); // declaration OR creation of new object
        s1.name = "Khushi";
        s1.rno = 23;
        s1.cgpa = 8.5;

        Student s2 = new Student(); // declaration OR creation of new object
        s2.name = "Amit";
        s2.rno = 23;
        s2.cgpa = 5.4;

        Student s3 = new Student(); // declaration OR creation of new object
        s3.name = "Shubhika";
        s3.rno = 232;
        s3.cgpa = 10;

        System.out.println("name1" + s1.name + "name2 " + s2.name);
        s3.cgpa = 4;
        System.out.println(s3.cgpa);

        s1.print();
        s2.print();
        s3.print();

    }
}
