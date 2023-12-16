package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Thong tin mot sinh vien");
		System.out.println(" • ten: ");
		String hovaten = sc.nextLine();
		System.out.println(" • ma sinh vien: ");
		int maso = sc.nextInt();
		System.out.println(" • chung minh nhan dan: ");
		int so = sc.nextInt();
		System.out.println(" • ten lop: ");
		String tenlop = sc.next();
		System.out.println(" • ten truong: ");
		String tentruong = sc.next();
		System.out.println(" • diem trung binh: ");
		double diemtb = sc.nextDouble();
		System.out.println("Thong tin cong nhan");
		System.out.println(" • ten: ");
		String ten = sc.next();
		System.out.println(" • dia chi: ");
		String diachi = sc.next();
		System.out.println(" • so dien thoai: ");
		int sdt = sc.nextInt();
		System.out.println(" • he so luong: ");
		Double hesoluong = sc.nextDouble();
		System.out.println("Thong tin mot chiec xe car");
		System.out.println(" • ten: ");
		String t = sc.next();
		System.out.println(" • hang: ");
		String tenhang = sc.next();
		System.out.println(" • gia: ");
		double giatien = sc.nextDouble();
		System.out.println(" • mau son: ");
		String mauson = sc.next();
	}

}
