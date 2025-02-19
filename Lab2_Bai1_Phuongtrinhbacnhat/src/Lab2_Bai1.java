import java.util.Scanner;
public class Lab2_Bai1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Nhap he so a va b
		System.out.print("Nhap he so a: ");
		double a = scanner.nextDouble();
		System.out.print("Nhap he so b: ");
		double b = scanner.nextDouble();
		// Giai phuong trinh bac nhat
		if(a==0) {
			if(b==0) {
				System.out.println("Phuong trinh co vo so nghiem");
			}else {
				System.out.println("Phuong trinh vo nghiem");
			}
		}else {
			double x = -b/a;
			System.out.println("Nghiem cua phuong trinh la: x = "+x);
		}
		scanner.close();

	}

}
