
import java.util.Scanner;

public class Lab1_Bai1_DTB {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Nhap ho va ten
		System.out.println("Nhap ho va ten sinh vien: ");
		String hoten = scanner.nextLine();
		//Nhap diem trung binh
		System.out.println("Nhap diem trung binh: ");
		Double dtb = scanner.nextDouble();
		//In ra 
		System.out.println("Ho va ten la: "+ hoten);
		System.out.println("Diem trung binh la: "+ dtb);
		scanner.close();
		}
	}

