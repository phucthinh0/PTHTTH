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
                     
           
            
             while(true){
               

                String yeucau = " 1. Dao \n 2. In hoa \n 3. Dem ";               
                String kq = null;

                while(true){
                    int cv;         
                    System.out.println("Nhập yêu cầu: ");
                    cv = sc.nextInt();
                    
                    if(cv != 0){
                        if(cv >=1 && cv <=3){
                            switch(cv){
                                case 1:
                                   
                                    
                                    
                                    break;
                                case 2:
                                    kq=cItf.inhoa("sssssssssssss");
                                    
                                    
                                    break;
                                case 3:
                                    
                                    break;
                            }
                            System.out.println("Chuỗi xử lý theo yêu cầu:  " + kq);
                        }
                        else{
                            System.out.println("Nhap yeu cau 1, 2, 3!!!");
                        }
                    }
                    else{
                        System.out.println("Exit!!");
                    }

                }

            }




        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }
}