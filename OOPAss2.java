package OOP;

/*
Create a class Student that contains following data members
● static variable to create unique number
● A variable to store roll no
● A variable to store name
● An array to store marks of 5 subjects
This class should have following member functions:
A constructor with no-parameters that increments static variable and assign it to roll
number. Remaining data members should be initialized to zero or empty values.
Input() function to input name and marks of 5 subjects from user
Show() function to display roll number, name and marks of 5 subjects to the user
TotalStudents() function that should display the number of objects that has been
created so far. This function should be static.
TotalMarks() function that should calculate and return to total marks of a student
getHighest() function that returns highest marks of the student
getLowest() function that returns lowest marks of the student
getAverage() function that returns average marks of student
getPassCount() function that counts and returns total number of subjects in which the
student is passed. (A student is passed if he gets 50% or above marks)
In main function, create three objects, input their values and display them. For each
student, display his total marks, highest, lowest, average marks and the number of
subjects in which he is passed. Also display how many students have been registered so
far.
 */

import java.util.Arrays;

public class OOPAss2 {
    public static void main(String[] args) {
        Stud s1 = new Stud();
        s1.input("OM",new int[]{10,10,10,30,40});
        Stud s2 = new Stud();
        s2.input("JD",new int[]{20,70,50,30,90});
        Stud s3 = new Stud();
        s3.input("NENC",new int[]{30,20,10,30,70});
        Stud s4 = new Stud();
        s4.input("DHRV",new int[]{40,50,70,20,45});

        s3.show();
        Stud.totaclstud();
        System.out.println( "Total Marks : " + s1.totalMarks());
        System.out.println("Highest Subject Marks : " + s1.gethighestmarks());
        System.out.println("Lowest Subject Marks : " + s1.getlowestmarks());
        System.out.println("Average Marks : " + s1.getavgmarks());
        System.out.println("Total Passed Sub : " + s1.getpasscount());
    }
}

class Stud{
    private static int number =1 ;
    private int rno;
    private String name;
    private int[] marks ;
    private static int TotalStudent;

    public Stud() {
        this.rno = number++;
        this.name = "";
        this.marks = null;
        TotalStudent++;
    }

    public static void totaclstud() {
        System.out.println(TotalStudent);
    }
    public void input(String name, int[] marks) {
        this.name = name;
        if(marks.length == 5){
            this.marks = marks;
        }else{
            System.out.println("Plese Enter Marks.");
        }
    }

    public void show() {
        System.out.println(rno + " " + name + " " + Arrays.toString(marks));
    }

    public int totalMarks() {
        int sum = 0;
        for(int i = 0; i<marks.length; i++){
            sum += marks[i];
        }
        return sum;
    }

    public int gethighestmarks() {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<marks.length; i++){
            if(marks[i] > max){
                max = marks[i];
            }
        }
        return max;
    }

    public int getlowestmarks() {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<marks.length; i++){
            if(marks[i] < min){
                min = marks[i];
            }
        }
        return min;
    }

    public int getavgmarks() {
        int sum = 0;
        for(int i = 0; i<marks.length; i++){
            sum += marks[i];
        }
        return sum/marks.length;
    }

    public int getpasscount() {
        int count = 0;
        for(int i = 0; i<marks.length; i++){
            if(marks[i] > 30 ){
                count++;
            }
        }
        return count;
    }
}
