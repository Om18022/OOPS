package OOP;
/*
A company has 10 employees with id 1001,1002,...1010. Create a class
SalarySlip with attributes empId, name, salary, month (1 to 12). Create
an array of SalarySlip objects and Calculate top 2 highest salary of each
month 1 to 12
Output:
1 -> 1005,1006
2 -> 1001,1003
… 12 -> 1002,1004
 */

public class OOPAss3q3 {
    public static void main(String[] args) {
        SalarySlip s1[]=new SalarySlip[12];
        s1[0]=new SalarySlip(101,"Virat",1,25000);
        s1[1]=new SalarySlip(101,"Virat",2,22000);
        s1[2]=new SalarySlip(101,"Virat",3,28000);
        s1[3]=new SalarySlip(101,"Virat",4,20000);
        s1[4]=new SalarySlip(101,"Virat",5,23000);
        s1[5]=new SalarySlip(101,"Virat",6,20000);
        s1[6]=new SalarySlip(101,"Virat",7,29000);
        s1[7]=new SalarySlip(101,"Virat",8,30000);
        s1[8]=new SalarySlip(101,"Virat",9,10000);
        s1[9]=new SalarySlip(101,"Virat",10,5000);
        s1[10]=new SalarySlip(101,"Virat",11,3000);
        s1[11]=new SalarySlip(101,"Virat",12,25000);

        SalarySlip s2[]=new SalarySlip[12];
        s2[0]=new SalarySlip(102,"rohit",1,55000);
        s2[1]=new SalarySlip(102,"rohit",2,32000);
        s2[2]=new SalarySlip(102,"rohit",3,15000);
        s2[3]=new SalarySlip(102,"rohit",4,26000);
        s2[4]=new SalarySlip(102,"rohit",5,27000);
        s2[5]=new SalarySlip(102,"rohit",6,22000);
        s2[6]=new SalarySlip(102,"rohit",7,32000);
        s2[7]=new SalarySlip(102,"rohit",8,3000);
        s2[8]=new SalarySlip(102,"rohit",9,17000);
        s2[9]=new SalarySlip(102,"rohit",10,7000);
        s2[10]=new SalarySlip(102,"rohit",11,4000);
        s2[11]=new SalarySlip(102,"rohit",12,27000);

        SalarySlip s3[]=new SalarySlip[12];
        s3[0]=new SalarySlip(103,"rahul",1,36000);
        s3[1]=new SalarySlip(103,"rahul",2,22000);
        s3[2]=new SalarySlip(103,"rahul",3,17000);
        s3[3]=new SalarySlip(103,"rahul",4,16000);
        s3[4]=new SalarySlip(103,"rahul",5,37000);
        s3[5]=new SalarySlip(103,"rahul",6,52000);
        s3[6]=new SalarySlip(103,"rahul",7,92000);
        s3[7]=new SalarySlip(103,"rahul",8,3500);
        s3[8]=new SalarySlip(103,"rahul",9,11000);
        s3[9]=new SalarySlip(103,"rahul",10,2000);
        s3[10]=new SalarySlip(103,"rahul",11,6000);
        s3[11]=new SalarySlip(103,"rahul",12,25000);

        SalarySlip.MAx_sal(s1,s2,s3);
//        SalarySlip employees[][]=new SalarySlip[3][12];
//
//        employees[0]=s1;
//
//        employees[1]=s2;
//
//        employees[2]=s2;

    }
}
class SalarySlip{
    private int empId;
    private String name;
    private int  month;

    public int getSalary() {
        return salary;
    }

    private int salary;

    public int getEmpId() {
        return empId;
    }

    public int getMonth() {
        return month;
    }

    public String getName() {
        return name;
    }

    public SalarySlip() {
    }

    public SalarySlip(int empId, String name, int month,int salary) {
        this.empId = empId;
        this.name = name;
        this.month = month;
        this.salary=salary;
    }
    public static void MAx_sal(SalarySlip obj1[],SalarySlip obj2[],SalarySlip obj3[])
    {
        for(int i=0;i<12;++i)
        {
            int id1=obj1[0].getEmpId();
            int id2=obj1[0].getEmpId();
            int max1=Integer.MIN_VALUE;
            int max2=Integer.MIN_VALUE;
            if( max1<obj1[i].getSalary())
            {
                max2=max1;
                max1=obj1[1].getSalary();
                id2=id1;
                id1=obj1[0].getEmpId();
            }
            if( max1<obj2[i].getSalary())
            {
                max2=max1;
                max1=obj2[i].getSalary();
                id2=id1;
                id1=obj2[i].getEmpId();
            }else if(max2<obj2[i].getSalary())
            {
                max2=obj2[i].getSalary();
                id2=obj2[i].getEmpId();
            }
            if(max1<obj3[i].getSalary())
            {
                max2=max1;
                max1=obj3[i].getSalary();
                id2=id1;
                id1=obj3[i].getEmpId();
            }else if (max2<obj3[i].getSalary())
            {
                max2=obj3[i].getSalary();
                id2=obj3[i].getEmpId();
            }
            System.out.println(i+1+"->"+id1+" "+id2);
        }
    }

}

