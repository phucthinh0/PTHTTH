public class PhanSo {
    float tuSo;
    float mauSo;

    PhanSo(float TuSo, float MauSo){
        tuSo = TuSo;
        mauSo = MauSo;
    }

    void inPhanSo(){
        System.out.println("Phân số: "+(int)tuSo+"/"+(int)mauSo);
    }

    void sothuc(){
        System.out.println("Số thực của phân số: "+(float)((float)tuSo/mauSo));
    }

   

  

    public static void main(String[] args) {
        PhanSo p1 = new PhanSo(4, 8);
        p1.inPhanSo();
        p1.sothuc();

        PhanSo p2 =  new PhanSo(3, 7);
        p2.inPhanSo();
        p2.sothuc();
        
    }
}
