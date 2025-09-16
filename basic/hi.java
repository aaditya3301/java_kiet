import java.util.Scanner;

class hi 
{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x and y: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        String name = "Aaditya";                            //user defined datatype
        System.out.print("Name: " + name + "\n");

        System.out.print("X: " + x + " and Y: " + y + "\n");
        if(x > y)
        {
            System.out.print("X is greater than Y");    
        }
        else if(x < y)
        {
            System.out.print("X is less than Y");
        }
        else
        {
            System.out.print("X is equal to Y");
        }
    }
}