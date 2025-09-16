import java.util.Scanner;
class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        if(age >= 18) {
            System.out.println(name + " is eligible to vote.");
        }
        else{
            System.out.println(name + " is not eligible to vote");
        }
    }
}
