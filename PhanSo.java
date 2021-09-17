public class PhanSo {
    int tuSo;
    int mauSo;

    PhanSo(int TuSo, int MauSo){
        tuSo = TuSo;
        mauSo = MauSo;
    }

    void inPhanSo(){
        System.out.println("Phân số: "+(int)tuSo+"/"+(int)mauSo);
    }

    void sothuc(){
        System.out.println("Số thực của phân số: "+(float)((float)tuSo/mauSo));
    }

   
    void nghichdao(){
        System.out.println("Nghịch đảo phân số: "+(int)mauSo+"/"+(int)tuSo);
    }

    static void tinhtoanphanso(PhanSo a, PhanSo b){
       int ts1, ts2, msc;

       ts1 = a.tuSo*b.mauSo;
       ts2 = b.tuSo*a.mauSo;
       msc = a.mauSo*b.mauSo;

       System.out.println("Cộng 2 phân số: "+(ts1+ts2)+"/"+msc);
       System.out.println("Trừ 2 phân số: "+(ts1-ts2)+"/"+msc);
       System.out.println("Nhân 2 phân số: "+(a.tuSo*b.tuSo)+"/"+(a.mauSo*b.mauSo));
       System.out.println("Chia 2 phân số: "+(a.tuSo*b.mauSo)+"/"+(a.mauSo*b.tuSo));
    }

    public static void main(String[] args) {
        PhanSo p1 = new PhanSo(4, 8);
        p1.inPhanSo();
        p1.sothuc();
        p1.nghichdao();
        
        System.out.println("...................................................");

        PhanSo p2 =  new PhanSo(3, 7);
        p2.inPhanSo();
        p2.sothuc();
        p2.nghichdao();

        System.out.println("......................................................");

        tinhtoanphanso(p1, p2);
        
    }
}