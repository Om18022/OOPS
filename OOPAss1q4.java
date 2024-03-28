package OOP;

/*
Create a class Student with attributes rollNo, Name, marks1, marks2,
marks3.
create a method getTop3Student() which accepts a list of Students and returns an
array of 3 top students with the highest percentage.
 */


class Std{
    private int rno;
    private String name;
    private int m1;
    private int m2;
    private int m3;
    int total ;
    public Std(int rno,String name,int m1, int m2, int m3){
        this.rno = rno;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    public int getTotal(){
        return m1+m2+m3;
    }
    public String getName(){
        return name;
    }

    public static void getTop3Std(Std[] s) {
        for(int i = 0; i<s.length; i++) {
            for (int j = 0; j < s.length-i-1; j++) {
                if (s[j].getTotal() > s[j+1].getTotal()) {
                    Std temp = s[j];
                    s[j] = s[j+1];
                    s[j+1] = temp;
                }
            }
        }
        System.out.println("Top 1 : " + s[s.length-1].getName() + " " + s[s.length-1].getTotal());
        System.out.println("Top 2 : " + s[s.length-2].getName()+ " " + s[s.length-2].getTotal());
        System.out.println("Top 3 : " + s[s.length-3].getName()+ " " + s[s.length-3].getTotal());
    }

}


public class OOPAss1q4 {
    public static void main(String[] args) {
        Std s1 = new Std(1,"Meet",8,5,6); //19
        Std s2 = new Std(1,"Om",1,4,4); // 9
        Std s3 = new Std(1,"Darshan",4,4,7); //15
        Std s4 = new Std(1,"Raj",5,2,4); //11
        Std s5 = new Std(1,"Paresh",6,5,3); //14
        Std s6 = new Std(1,"Rudra",9,8,6); //23
        Std s7 = new Std(1,"Jasmin",2,6,9); //17
        Std s8 = new Std(1,"Jitu",6,4,6);   //16
        Std[] s = {s1,s2,s3,s4,s5,s6,s7,s8};
        Std.getTop3Std(s);
    }
}

