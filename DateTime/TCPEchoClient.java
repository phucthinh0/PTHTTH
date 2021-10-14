package DateTime;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class TCPEchoClient {
    public static void main(String[] args) throws IOException {
        Socket s = null;
        DataInputStream dis = null;
        DataOutputStream dos = null;
        
        Scanner sc = new Scanner(System.in);
        String serverIP;
        int serverPort;

        System.out.println("Server IP: ");
        serverIP = sc.nextLine();
        System.out.println("Server Port: ");
        serverPort = sc.nextInt();

        try {
            s = new Socket(serverIP, serverPort);
            
            System.out.println("Client ket noi thanh cong");

            dos = new DataOutputStream(s.getOutputStream());
            dis = new DataInputStream(s.getInputStream());

            int cv = 0;

    
            String yeucau = dis.readUTF();
            System.out.println(yeucau);

            do {
                System.out.println("Nhap cong viec: ");
                cv = sc.nextInt();
                dos.writeInt(cv);
    
                System.out.println(dis.readUTF());
            } while (cv !=0);
            

        } catch (Exception e) {
            System.out.println("Khong the ket noi voi Server!");
        
        }finally{
            if(s!=null){
                s.close();
            }
        }
    }
}