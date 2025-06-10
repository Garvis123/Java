public class OOPS {
    // public static void main(String args[])
    // {
    // //   Pen p1=new Pen();
    // //   p1.setColor("Red");
    // //   System.out.print(p1.getColor());
    // //   p1.setTip(5);
    // //   System.out.print("\n"+ p1.getTip());


    // }

    public static void main(String args[])
    {
    
      
    }
}

class Student{ 
        String name;
        int age;
        int marks[];

        Student()
        {
            marks=new int[3];
        }
        Student(Student s1)
        {
            marks=new int[3];
            this.name=s1.name;
            this.age=s1.age;
            this.marks=s1.marks;
        }
        // Student(String name)
        // {
        //  this.name=name;
        // }
        // Student(int age)
        // {
        //     this.age=age;
        // }
        // Student() 
        // {
        //     System.out.print("hello");
        // }
}

