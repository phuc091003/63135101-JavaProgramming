import java.util.Scanner;
public class Lab1_Bai2 {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Nhap chieu dai: ");
			double length = scanner.nextDouble();
			
			System.out.print("Nhap chieu rong: ");
			double width = scanner.nextDouble();
			
			double chuvi = 2 * (length + width);
			double dientich = length * width;
			
			double canhnho = Math.min(length, width);
			
			System.out.println("Chu vi: "+chuvi);
			System.out.println("Dien tich: "+dientich);
			System.out.println("Canh nho hon: "+canhnho);
			
			scanner.close();

		}

	}

