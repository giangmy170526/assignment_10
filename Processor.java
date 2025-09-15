 
package Bai_2;
 import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ma sinh vien: ");
        int masv = scanner.nextInt();
        scanner.nextLine();   

        System.out.print("Nhap ho va ten: ");
        String hoten = scanner.nextLine();

        System.out.print("Nhap khoa: ");
        String khoa = scanner.nextLine();

        System.out.print("Nhap diem TB: ");
        float diemtb = scanner.nextFloat();

        System.out.print("Nhap diem Tin ung dung: ");
        float diemtin = scanner.nextFloat();

        Ketoan sv = new Ketoan(masv, hoten, khoa, diemtb, diemtin);
        System.out.println("\n===== Thong tin sinh vien =====");
        System.out.println(sv.toString());

        scanner.close();
    }
}