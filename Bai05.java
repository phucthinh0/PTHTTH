import java.util.Scanner;
public class Bai05 {
     public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Nhập số phần tử của mảng: ");
        int n;
        n = sc.nextInt();

        float[] mang = new float[n];

        float tong = 0;

        for(int i=0; i<mang.length ;i++){
            System.out.println("Nhap so thu "+(i+1)+": ");
            mang[i] = sc.nextFloat();
        }

        for(int i = 0; i <mang.length;i++){
            if(mang[i]>=0){
                tong+=mang[i];
            }

        }
        System.out.println("Tổng số dương trong mảng: "+tong);
        

    }
}
