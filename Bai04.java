import java.util.Scanner;
public class Bai04 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int n;

        System.out.println("Nhập n: ");
        n = sc.nextInt();

        int tong=0;

        for(int i = 1 ; i <= n ; i++){
            tong+=i;
        }

        System.out.println("Tổng từ 1 -> "+n+" = "+tong);
    }
}
