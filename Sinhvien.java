package Bai_2;
 
public abstract class Sinhvien {
    private int masinhvien;
    private String hovaten;
    private String khoa;
    private float diemtb;
    public Sinhvien() {}
    public Sinhvien (int masinhvien, String hovaten, String khoa, float diemtb) {
        this.masinhvien = masinhvien;
        this.hovaten = hovaten;
        this.khoa = khoa;
        this.diemtb = diemtb;
    }
    public int getmasinhvien() {return  masinhvien;}
    public void setmasinhvien(int masinhvien) {this.masinhvien = masinhvien;}
    public String gethovaten() {return hovaten;}
    public void sethovaten(String hovaten) {this.hovaten = hovaten;}
    public String getkhoa() {return khoa;}
        public void setkhoa(String khoa) {this.khoa = khoa;}
    public float getdiemtb() {return diemtb;}
    public void setdiemtb (float diemtb) {this.diemtb = diemtb;}
    public abstract String xethocbong();
    @Override
    public String toString () {
        return "ma SV: " + masinhvien + ",ho va ten: " + hovaten + ",khoa:  " + khoa+ ",diem trung binh: "+ diemtb;
    }
    
}