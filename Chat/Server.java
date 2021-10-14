package Chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public final static int serverPort = 7;

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(serverPort);
        System.out.println("Server Created....");

        Socket s =null;
        DataOutputStream dos = null;
        DataInputStream dis = null;
        
        while(true){
            try {
                s = ss.accept();
                dos = new DataOutputStream(s.getOutputStream());
                dis = new DataInputStream(s.getInputStream());

                Scanner sc = new Scanner(System.in);
                String mess_in = null, mess_out = null;

                while (true) {
                    mess_in = dis.readUTF();
                    System.out.println(mess_in);

                    mess_out = sc.nextLine();
                    dos.writeUTF(mess_out);
                }
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
    }
}