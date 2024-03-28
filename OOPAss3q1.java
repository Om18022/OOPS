package OOP;


/*
Write a Java program to create a class called "Dog" with a name and
colour attribute. Create two instances of the "Dog" class, set their
attributes using the constructor and modify the attributes using the
setter methods and print the updated values.
 */


public class OOPAss3q1 {
    public static void main(String[] args) {
        Dog d1=new Dog("Abc","white");
        Dog d2=new Dog("xyz","brown");
        d1.display();
        d2.display();
        d1.setter("tomi","blue");
        d2.setter("bulDog","Black");
        d1.display();
        d2.display();
    }
}
class Dog{
    private String name;
    private String color;
    Dog(){}
    public Dog(String name,String color)
    {
        this.name=name;
        this.color=color;
    }
    public void setter(String name,String color)
    {
        this.name=name;
        this.color=color;
    }
    public void  display()
    {
        System.out.println(this.name+" "+this.color);
    }
}
