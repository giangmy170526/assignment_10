 
package Bai_2;
public class luat extends Sinhvien  {
    private int diemToeic;
    public luat() {}
    public luat(int masinhvien, String hovaten, String khoa, float diemtb, int diemToeic) {
        super(masinhvien, hovaten, khoa, diemtb);
        this.diemToeic = diemToeic;
    }

    public int getDiemToeic() { return diemToeic; }
    public void setDiemToeic(int diemToeic) { this.diemToeic = diemToeic; }

    @Override
    public String xethocbong() {
        if (getdiemtb() >= 9.0 && diemToeic >= 700) {
            return "dat hoc bong";
        }
        return "Khong dat hoc bong";
    }

    @Override
    public String toString() {
        return super.toString() +
               ", diem TOEIC: " + diemToeic +
               ", Hoc bong: " + xethocbong();
    }
}
