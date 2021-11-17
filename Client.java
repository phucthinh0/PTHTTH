import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
public class Client {
    public static void main(String[] args) throws NotBoundException {
        Registry reg;
        try {
            reg = LocateRegistry.getRegistry(7070);
            Interface cItf = (Interface) reg.lookup("Xulychuoi");



            String s;
            Scanner sc= new Scanner(System.in);          
            System.out.println("Nhập chuỗi: ");
            s = sc.nextLine();
                     
            System.out.println (" 1. Dao ky tu\n 2.Dem so lan xuat hien \n 3. Dem tu \n 4.Dem khoang trang \n 5.Xoa khoang trang \n 6. In hoa");  
            
                                      
            String kq = null;
                
                while(true){
                    int cv;         
                    System.out.print("Nhập yêu cầu: ");
                    cv = sc.nextInt();
                    
                    if(cv != 0){
                        if(cv >=1 && cv <=6){
                            switch(cv){
                                 case 1:                                                                   
                                    kq=cItf.dao(s);   
                                    System.out.println("Chuoi xu ly theo yeu cau ( dao ):  " + kq);                                 
                                    break;
                                case 2:                                    
                                    System.out.print("Nhập ký tự: ");                                                          
                                    char k = sc.next().charAt(0);
                                    System.out.println("Số lần xuất hiện của ký tự:  " +  cItf.demSolanxuathien(s,k));
                                    break;
                                case 3:                                  
                                    System.out.println("Số lượng từ là:  " +  cItf.Demtu(s));
                                    break;
                                case 4:                                   
                                    System.out.println("Số khoảng trắng của chuỗi:  " +  cItf.demKhoangtrang(s));
                                    break;
                                case 5:
                                    System.out.println("Chuỗi sau khi xóa khoảng trắng: "+ cItf.xoaKhoangtrang(s));
                                    break;
                                case 6:                                   
                                    kq=cItf.inhoa(s);  
                                    System.out.println("Chuỗi xử lý theo yêu cầu (In hoa):  " + kq);                                 
                                    break;
                            }                           
                        }
                        else{
                            System.out.println("Nhap yeu cau 1, 2, 3, 4, 5, 6!!!");
                        }
                    }
                    else{
                        System.out.println("Exit!!");
                        kq=null;
                        break;
                    }

                }
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }
}