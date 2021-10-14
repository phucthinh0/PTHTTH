package Chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public final static String serverIP = "localhost";
    public final static int serverPort = 7;

    public static void main(String[] args) throws IOException{
        Socket s = new Socket(serverIP, serverPort);
        System.out.println("Client Connected . . . .");

        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        DataInputStream dis = new DataInputStream(s.getInputStream());
        Scanner sc = new Scanner(System.in);
        String mess_in = null, mess_out = null;

        try {
            while(true){
                mess_out = sc.nextLine();
                dos.writeUTF(mess_out);
    
                mess_in = dis.readUTF();
                System.out.println(mess_in);
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        
    }
}
