class Exam {
 
    int sum(int x){
        return 56 ;        //POLYMORPHISM OVERIDING
    }
}

final class modif extends Exam {          //final stops inheritance

    int x = 10;

    int sum(int x){
        return x +10;
    }

    int sum(int x, int y){         //overloading  - same name methods with different signatures in a same class
        return x + y;
    }

    String sum(String x, String y){
        return y + " " + x;
    }

    public static void main(String[] args) {
        modif t1 = new modif();
        System.out.println("Sum with two parameters: " + t1.sum("Aaditya","Singhal"));
        System.out.println("Sum with one parameter: " + t1.sum(5));                      //JO BHI T1 OBJECT KE NEAREST HOGA , WO METHOD CALL HOGA

        Exam t2 = new Exam();
        System.out.println("Sum with one parameter: " + t2.sum(5));
    }
}
// OVERLOADING IS CALLED COMPILE TIME POLYMORPHISM    (JDK ERROR)
// OVERWRITING IS CALLED RUN TIME POLYMORPHISM   (JVM ERROR)