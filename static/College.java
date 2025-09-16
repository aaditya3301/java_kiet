public class College
{
    static int a = 10;          
    static String collegeName = "KIET";           //static is class level memory as it has class level memory
    // final int a = 10;                         //STATIC MEANS MEMORY BECOMES STATIC , VALUE CAN CHANGE
                                                 //for not changing use final
    static int my(){                            //static variable can be accessed by only static method ,static saves a lot of memory
        a = a + 20;
        return a;
    }

    static int rollNo =0;
    String name;

    College(String name) {
        this.name = name;
        this.rollNo++;
    }

    static int sum(int x,int y){         //static bana ke instead of object ke class se call karo method
        return x + y;
    }
    public static void main(String[] args) {
        
        int y = my();               //static method can be called without object 
        System.out.println(y);
        System.out.println(College.collegeName);

        College s1 = new College("Aaditya");
        College.rollNo = 001;
        System.out.println("1st student name is "+ s1.name);
        System.out.println("1st student roll no is "+ s1.rollNo);

        College s2 = new College("Jessica");
        College.rollNo = 002;
        int m = College.sum(10,30);         //method ko static bana ke we save memory...
        System.out.println("2nd student name is "+ s2.name);
        System.out.println("2nd student roll no is "+ College.rollNo);
        System.out.println("Sum is "+ m);

        College s3 = new College("Aayush");
        System.out.println("3rd student name is "+ s3.name);
        System.out.println("3rd student roll no is "+ College.rollNo);
    }
}
