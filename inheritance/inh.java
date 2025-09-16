//extends is a keyword used in inheritance
// filename will be saved with the class having main

class Person{
    String name;
    int age;

    void eat(){
        System.out.println("Eating...");
    }
}

class Ward extends Person{
    void hobby(){
        System.out.println("Hobby...");
    }
}

class Student extends Ward{      //java does not support multiple inheritance  //child == sub == derived
    int studentId;

    void study(){
        System.out.println("Studying...");
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "John"; 
        s.age = 20;
        s.studentId = 12345;
        s.eat();
        s.study();
        s.hobby();
    }
}