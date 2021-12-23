package TCPSocket;
import java.io.*;
import java.net.Socket;
import java.util.Scanner;
public class client {
    public final static String serverIP = "127.0.0.1";
    public final static int serverPort = 7;
    public static void main(String[] args) throws InterruptedException,IOException {
        Socket s= null;
        try{
            s=new Socket(serverIP,serverPort);
            System.out.println("Client da duoc tao");
            InputStream is =s.getInputStream();
            OutputStream os = s.getOutputStream();
                Scanner sc = new Scanner(System.in);
                System.out.println("Nhap mã số sinh viên: ");
                int cv = 0;
                cv = sc.nextInt();
                os.write(cv);
                int ch=is.read();
                System.out.println((char)ch);
                Thread.sleep(2000);           
        }catch (IOException ie){
            System.out.println("Error: Can not create socket");
        }finally{
            if(s!=null){
                s.close();
            }
        }
    }

}
