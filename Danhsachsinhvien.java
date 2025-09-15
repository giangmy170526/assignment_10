 
package Bai_2;
 import java.util.*;

public class Danhsachsinhvien {
  
    private ArrayList<Sinhvien> Danhsachsinhvien = new ArrayList<>();
    private int masinhvien;

    public void themDanhSach(Sinhvien sv) {
        Danhsachsinhvien.add(sv);
    }

    public void capNhatDanhSach(int maSinhvien, Sinhvien svMoi) {
        for (int i = 0; i < Danhsachsinhvien.size(); i++) {
            if (Danhsachsinhvien.get(i).getmasinhvien() == masinhvien) {
                Danhsachsinhvien.set(i, svMoi);
                return;
            }
        }
    }

    public void xoaDanhSach(int maSinhVien) {
        Danhsachsinhvien.removeIf(sv -> sv.getmasinhvien() == maSinhVien);
    }

    public void timKiem(int maSinhVien) {
        for (Sinhvien sv : Danhsachsinhvien) {
            if (sv.getmasinhvien() == maSinhVien) {
                System.out.println(sv);
                return;
            }
        }
        System.out.println("Khong tim thay sinh vien.");
    }

    public void xuatDanhSach() {
        for (Sinhvien sv : Danhsachsinhvien) {
            System.out.println(sv);
        }
    }

    public void inSinhVienHocBong() {
        for (Sinhvien sv : Danhsachsinhvien) {
            if (sv.xethocbong().equals("Dat hoc bong")) {
                System.out.println(sv);
            }
        }
    }
    public void xoaSinhVienYeu() {
        long count = Danhsachsinhvien.stream().filter(sv -> sv.getdiemtb() < 5.5).count();
        if (count >= 2) {
            Danhsachsinhvien.removeIf(sv -> sv.getdiemtb() < 5.5);
            System.out.println("Da xoa cac sinh vien co diem TB < 5.5");
        } else {
            System.out.println("Khong du 2 sinh vien de xoa.");
        }
    }
}   

