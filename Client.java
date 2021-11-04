import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) throws NotBoundException {
        Registry reg;
        try {
            reg = LocateRegistry.getRegistry(7070);
            Interface cItf = (Interface) reg.lookup("Xulychuoi");
            int yc;
            Scanner sc= new Scanner(System.in);
            System.out.println("1. Time \n 2. Date \n 3. Date & Time ");
            
            System.out.println("Nhập yêu cầu: ");
            yc = sc.nextInt();
                     
            






        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }
}