import java.util.*;
class usersort{
    public static void main(String[] args){

        int n;
        System.out.println("Enter Array Size");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i=0;i<arr.length;i++){
            for(int j = i+1 ; j<arr.length ; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i=0;i<n ;i++){
            System.out.println(arr[i]);
        }
        
    }
}