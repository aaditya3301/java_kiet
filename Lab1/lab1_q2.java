import java.util.Scanner;

class lab1_q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i = 1; i<=100 ; i++){
            if((i/2)*2 != i){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}