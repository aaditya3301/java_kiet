import java.util.Scanner;
class student{

    //in every class there is a default constructor - student{} , called overloading of memory
    // there is no global variable in java

    //attributes == properties==state==variable
    int iRollNo;                                                   //class variables
    String sName;
    int aMarks[] = new int[21];
    int iAge;
    String sAddress;

    //Methods == functions == procedure ==  behaviour
    void mCalculateTotalMarks(String sName, int iAge) {
        int total = 0;                                             //local varaibles
        for (int i = 0; i < aMarks.length; i++) {
            total += aMarks[i];
        }
        System.out.println("Total Marks for " + sName + " (Age: " + iAge + "): " + total);
    }

    public static void main(String[] args) {

        // student st1; - when memory is not allocated with "new" - this is just a reference

        Scanner sc = new Scanner(System.in);

        student st1 = new student();           //new allocates memory  , this student() method is called the constructor
        st1.iRollNo = 1;
        System.out.print("Enter name for student with RollNo " + st1.iRollNo + ": ");
        st1.sName = sc.nextLine();
        st1.aMarks[0] = 85;
        st1.aMarks[1] = 90;
        st1.iAge = 20;
        st1.sAddress = "Dhanbad";
        st1.mCalculateTotalMarks(st1.sName, st1.iAge);


        student st2 = new student();
        st2.iRollNo = 2;
        System.out.print("Enter name for student with RollNo " + st2.iRollNo + ": ");
        st2.sName = sc.nextLine();
        st2.iAge = 22;
        st2.aMarks[0] = 78;
        st2.aMarks[1] = 88;
        st2.sAddress = "Delhi";
        st2.mCalculateTotalMarks(st2.sName, st2.iAge);

        
        student st3 = new student();
        st3.iRollNo = 3;
        System.out.print("Enter name for student with RollNo " + st3.iRollNo + ": ");
        st3.sName = sc.nextLine();
        st3.iAge = 21;
        st3.aMarks[0] = 80;
        st3.aMarks[1] = 85;
        st3.sAddress = "Barcelona";
        st3.mCalculateTotalMarks(st3.sName, st3.iAge);
    }
}
