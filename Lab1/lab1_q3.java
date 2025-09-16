import java.util.Scanner;

class lab1_q3{
    public static void main(String arg[]){
        int arr[] = {23,45,756,23,13,13,55,77,89,9};
        int min = arr[0];
        int max = arr[0];
        for(int i = 0; i< arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            };
            if(arr[i] <  min){
                min = arr[i];
            }
        }
        System.out.println("The Largest number is "+max+" and the Smallest number is "+min);
    }
}
