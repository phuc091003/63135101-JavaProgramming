import java.util.Scanner;
public class Lab2_Bai2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Nhap so a,b,c
		System.out.print("Nhap he so a: ");
		double a = scanner.nextDouble();
		System.out.print("Nhap he so b: ");
		double b = scanner.nextDouble();
		System.out.print("Nhap he so c: ");
		double c = scanner.nextDouble();
		
		if(a==0) {
			//Giai phuong trinh bac nhat
			if(b==0) {
				if(c==0) {
					System.out.println("Phuong trinh co vo so nghiem.");
				}else {
					System.out.println("Phuong trinh vo nghiem.");
				}
			}else {
				double x = -c/b;
				System.out.println("Nghiem cua phuong trinh la : "+x);
			}
		} else {
			
		}

	}

}
