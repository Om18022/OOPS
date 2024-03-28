package OOP;

/*
Write a Java program to create a class called “Emp” with attributes
empId, name, JobTitle (Enum: Peon, Prof, HOD, Principal), salary.
Create an array of 10 objects of Emp class. Write a method to
calculate and print titlewise total salary the company has to pay.
Output:
Peon : 210000
Prof : 520000
HOD : 340000
Principle : 540000
 */

public class OOPAss3q2 {
    public static void main(String[] args) {
        Emp emp[]=new Emp[10];
        emp[0]=new Emp(101,"virat",JobEnum.Principle,50000);
        emp[1]=new Emp(102,"Rohit",JobEnum.Peon,60000);
        emp[2]=new Emp(103,"Rahul",JobEnum.Hod,100000);
        emp[3]=new Emp(104,"Bagalo",JobEnum.Prof,10000);
        emp[4]=new Emp(105,"Abc",JobEnum.Peon,20000);
        emp[5]=new Emp(106,"Def",JobEnum.Prof,40000);
        emp[6]=new Emp(107,"Xyz",JobEnum.Principle,50000);
        emp[7]=new Emp(108,"Klj",JobEnum.Hod,60000);
        emp[8]=new Emp(109,"Yul",JobEnum.Peon,30000);
        emp[9]=new Emp(110,"Cdf",JobEnum.Peon,25000);
        Emp.totalSalary(emp);
    }
}
class Emp {
    private int empId;
    private String name;
    private JobEnum jobTitle;
    private int salary;

    public Emp(int empId, String name, JobEnum jobTitle, int salary) {
        this.empId = empId;
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public static void totalSalary(Emp obj[])
    {
        int peon_sal=0,hod_sal=0,principle_sal=0,prof_sal=0;
        for(int i=0;i<10;++i)
        {
            if(obj[i].jobTitle==JobEnum.Peon)
            {
                peon_sal+=obj[i].salary;
            }else if(obj[i].jobTitle==JobEnum.Principle)
            {
                principle_sal+=obj[i].salary;
            }else if(obj[i].jobTitle==JobEnum.Prof)
            {
                prof_sal+=obj[i].salary;
            }else {
                hod_sal+=obj[i].salary;
            }
        }
        System.out.println("Peon-> "+peon_sal);
        System.out.println("Principle-> "+principle_sal);
        System.out.println("Prof-> "+prof_sal);
        System.out.println("Hod-> "+hod_sal);
    }
    public void display()
    {
        System.out.println(this.empId+"  "+this.name+" "+this.salary+" "+this.jobTitle);
    }

}
enum JobEnum{Peon,Prof,Hod,Principle}
