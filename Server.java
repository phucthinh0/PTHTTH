import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            Implement obj = new Implement();
            System.out.println("khoi tao doi tuong thanh cong");

            LocateRegistry.createRegistry(7070);
            Registry reg = LocateRegistry.getRegistry(7070);
            reg.bind("Xulychuoi", obj);
            System.out.println("da dang ky doi tuong voi registry");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}