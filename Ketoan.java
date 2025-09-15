 
package Bai_2;
 
public class Ketoan extends Sinhvien {
    private float diemtinungdung;
    public Ketoan() {}
    public Ketoan(int masinhvien, String hovaten, String khoa, float diemtb, float diemtinungdung) {
        super (masinhvien, hovaten, khoa, diemtb);
        this.diemtinungdung = diemtinungdung;     
    }
    public float getDiemtinungdung() {
        return diemtinungdung;
    }
        public void setdiemtinungdung(float diemtinungdung) {this.diemtinungdung = diemtinungdung;}
        @Override
        public String xethocbong() {
            if (getdiemtb() >= 9.0 && diemtinungdung >= 9.5) {
                return "Dat hoc bong" ;   
            }
            else
            {
                            return "khong dat hoc bong";
            }
            
        }
        @Override 
        public String toString () {
           return super.toString() + ",diem tin ung dung: " + diemtinungdung + ",hoc bong: " + xethocbong();
        }
        
    }