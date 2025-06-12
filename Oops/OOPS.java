public class OOPS {
    public static void main(String args[])
    {
     Student s1=new Student("aman",23);
     System.out.print(s1.name);
System.out.print(s1.age);


    }
}

class Student{
    String name;
    int age;

    
    Student(String name,int age)
    {
        this.name=name;
        this.age=age;
        System.out.print("hello");
    }
}


