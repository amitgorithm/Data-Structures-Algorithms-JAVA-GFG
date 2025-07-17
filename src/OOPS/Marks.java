package OOPS;

import java.util.Arrays;

public class Marks {
    public static class StudentData{
        String name;
        int rno;
        int[] marks;
        StudentData(int s){
            marks = new int[s];
        }
        StudentData(int[] s){
            marks = Arrays.copyOf(s,s.length);
        }

    }
    public static void main(String[] args) {
        int[] arr3 = {4,7,1,4,9};
        StudentData s1 = new StudentData(4);
        StudentData s2 = new StudentData(2);

        s1.marks[0] = 89;
        s1.marks[1] = 90;
        s1.marks[2] = 60;
        s1.marks[3] = 40;


        StudentData s3 = new StudentData(arr3);
        s3.marks[0] = 70;
        System.out.println(s3.marks[0]);


    }
}
