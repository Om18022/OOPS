package OOP;

/*
The Java class called Holiday is stated below. An object of class Holiday
represents a holiday during the year. This class has three instance variables:
● name, which is a String representing the name of the holiday
● day, which is an int representing the day of the month of the holiday
● month, which is a String representing the month the holiday is in
public class Holiday {
private String name;
private int day;
private String month;
}
a) Write a constructor for the class Holiday, which takes a String representing the
name, an int representing the day, and a String representing the month as its
arguments, and sets the class variables to these values.
b) Write a method inSameMonth, which compares two instances of the class Holiday,and
returns the Boolean value true if they have the same month, and false if they do not.
c) Write a method avgDate which takes an array of base type Holiday as its
argument, and returns a double that is the average of the day variables in the
Holiday instances in the array. You may assume that the array is full (i.e. does not have
any null entries).
 */

class Holiday{
    private String name;
    private int day;
    private String month;

    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public boolean inSameMonth(Holiday h2) {
        if(this.getMonth().equals(h2.month)){
            return true;
        }
        return false;
    }
    public static double avgDate(Holiday[] h) {
        int sum =0;
        for(int i =0; i<h.length; i++){
            sum = sum + h[i].getDay();
        }
        return sum/h.length;
    }
}


public class OOPAdv1 {
    public static void main(String[] args) {
        Holiday h1 = new Holiday("Inde_day",26,"jan");
        Holiday h2 = new Holiday("Uttran",14,"jan");
        Holiday h3 = new Holiday("lori",13,"jan");
        Holiday h4 = new Holiday("Pujan_day",14,"feb");
        Holiday h5 = new Holiday("ead",10,"feb");
        Holiday h6 = new Holiday("holi",15,"mar");
        System.out.println(h1.inSameMonth(h4));
        Holiday[] h = new Holiday[6];
        h[0] = h1;
        h[1] = h2;
        h[2] = h3;
        h[3] = h4;
        h[4] = h5;
        h[5] = h6;
        System.out.println(Holiday.avgDate(h));
    }
}

