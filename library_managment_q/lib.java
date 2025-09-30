// In a library management system, you have a book, magazine and a newspaper as items that can be checked out. Each item type has a different policy for late fee. Design the class structure to handle the calculation of late fees using inheritance

import java.util.*;
class lib {
    public static void main(String[] args) {
        System.out.println("Enter the item you want : 1-book , 2-magazine, 3-newspaper ");
        Scanner sc = new Scanner(System.in);
        int item = sc.nextInt();
        switch (item) {
            case 1:
                book b = new book();
                System.out.println("Book price: " + b.price);
                System.out.println("Book late fee: " + b.latefee);
                break;
            case 2:
                magazine m = new magazine();
                System.out.println("Magazine price: " + m.price);
                System.out.println("Magazine late fee: " + m.latefee);
                break;
            case 3:
                newspaper n = new newspaper();
                System.out.println("Newspaper price: " + n.price);
                System.out.println("Newspaper late fee: " + n.latefee);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}

class book{
    int price = 100;
    int latefee = 10;
}

class magazine {
    int price = 70;
    int latefee = 7;
}

class newspaper {
    int price = 40;
    int latefee = 4;
}