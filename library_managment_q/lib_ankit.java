
public class lib_ankit{
	public static void main(String args[]) {
		Book b = new Book();
		System.out.println(b.amount(1));
		
		Magazine m = new Magazine();
		System.out.println(m.amount(1));
		
		newspaper n = new newspaper();
		System.out.println(n.amount(1));
		
	}
}
class Library{
	float LateFee = 100.00f;
	
}
class Book extends Library{
	float bookcharg  = 10.00f;
	
	float 	amount(int day) {
		System.out.print("Book late fee is: ");
		return (LateFee+bookcharg)*day;
	}
}
class Magazine extends Library{
	float bookcharg  = 20.00f;
	float amount(int day) {
		System.out.print("Magazine late fee is: ");
		return (LateFee+bookcharg)*day;
	}
}
class newspaper extends Library{
	float bookcharg  = 5.00f;
	float amount(int day) {
		System.out.print("newspaper late fee is: ");
		return (LateFee+bookcharg)*day;
	}
}