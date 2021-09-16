import java.util.Scanner;
public class Bai03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập a, b, c của phương trình bậc 2: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        

        float d = (b*b - (4*a*c))/(2*a);

        if(d < 0){
            System.out.println("Phương trình vô nghiệm.");
        } else if(d == 0){
            System.out.println("Phương trình có nghiệm kép: x1=x2= "+ -b/(2*a));
        }else{
            
            System.out.println("Phương trình có 2 nghiệm: x1 = "+(float)((-b+Math.sqrt(d))/(2*a)) + " và x2= "+(float) ((-b-Math.sqrt(d))/(2*a)));
        }
    }
}
