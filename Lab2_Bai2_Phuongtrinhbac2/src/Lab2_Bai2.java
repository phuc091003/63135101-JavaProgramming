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
			//Giai pt bac 2
			double delta = b*b-4*a*c;
			if(delta < 0) {
				System.out.println("Phuong trinh vo nghiem");
			}else if(delta == 0) {
				double x= -b/(2*a);
				System.out.println("Phuong trinh co nghiem kep: "+x);
			}else {
				double x1=(-b+Math.sqrt(delta))/(2*a);
				double x2=(-b-Math.sqrt(delta))/(2*a);
				System.out.println("Phuong trinh co 2 nghiem phan biet:");
				System.out.println("x1= "+x1);
				System.out.println("x2= "+x2);
			}
		}
		scanner.close();

	}

}
