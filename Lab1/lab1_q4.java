import java.util.Scanner;

class lab1_q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");
        int count = 0;
        for(int i=0; i< words.length; i++) {
            count++;
        }
        System.out.println(count);


        String reversed = "";
        for(int i = (str.length()-1); i>=0 ; i--){
            reversed = reversed + str.charAt(i);
        }
        System.out.println(reversed);


        if(str.equals(reversed)){
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }
    }
}