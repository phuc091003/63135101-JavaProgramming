
import java.util.Scanner;

public class Lab1_Bai3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhap canh cua khoi lap phuong: ");
		double canh = scanner.nextDouble();
		
		double thetich = Math.pow(canh, 3);
		
		System.out.println("The tich khoi lap phuong: "+ thetich);
		scanner.close();
	}

}
