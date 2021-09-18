import java.util.Scanner;

public class Point {
    int x;
    int y;
///////////////////////////////////////////////////////////////////////////
    void toado(int X, int Y){
        this.x = X;
        this.y = Y;
    }
////////////////////////////////////////////////////////////////////////////////////
    void inpoint(){
        System.out.println("Tọa Độ (X,Y): ("+x+","+y+")");
    }
//////////////////////////////////////////////////////////////////////////////////
    void nhappoint(){
        Scanner sc = new Scanner(System.in);
        int a , b;      
        System.out.println("Nhập tọa độ X, Y: ");
        a = sc.nextInt();
        b = sc.nextInt();
        toado(a, b);      
    }
///////////////////////////////////////////////////////////////////////////////////////
    void tinhkhoangcach(){
        double td;
        td = Math.sqrt((x*x)+(y*y));
        System.out.println("Khoang cach voi toa do (0,0): "+td);
    }
///////////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {

        Point p1 = new Point();
        p1.toado(7, 8);
        p1.inpoint();
        p1.tinhkhoangcach();
        System.out.println("-------------------------------------------");     
        Point p2 = new Point();
        p2.nhappoint();
        p2.inpoint();
        p2.tinhkhoangcach();
    
    }
}
