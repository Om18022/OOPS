package OOP;

/*
Write a program which creates a class Student with the following Data Members
rollNum, studName, mark1, mark2, mark3, totalMarks
Methods
setStudDetails() – which sets the values to all the data members except
totalMarks.
calculateTotal() - which calculate the totalMarks
displayStudDetails() – which displays rollNum, studName and totalMarks
Create a class StudentDemo to test the functionality of Student class
 */


class Student{
    private int rNo;
    private String name;
    private int m1;
    private int m2;
    private int m3;
    private int totalMarks;

    public void setdetails(int rNo, String name, int m1,int m2,int m3){
        this.rNo = rNo;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public void totalMarks() {
        System.out.println("Total marks is : " + (m1+m2+m3));
    }

    public void displaydetails() {
        System.out.println("Roll no.: " + rNo + "," + " " + "Name : " + name + "," + "Sub1 :  " + m1+ " " + "Sub2 :  " + " " + m2 + " " + "Sub3 :  " + " " + m3);
    }
}


public class OOPAss1q1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setdetails(1,"Abhi",15,18,10);
        s1.displaydetails();
        s1.totalMarks();

    }
}

