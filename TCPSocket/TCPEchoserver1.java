package TCPSocket;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPEchoserver1 {
    public final static int serverPort = 7;
    public static void main(String[] args){
       try{
           ServerSocket ss=new ServerSocket(serverPort);
           System.out.println("Server da duoc tao");
           while(true){
                try{
                     Socket s= ss.accept();
                    RequestProcessing rp=new RequestProcessing(s);
                    rp.start();
                }catch(IOException ie1){
                     System.out.println("Connection Error: "+ie1);
                }
           }
       }catch(IOException ie){
           System.out.println("Server creation Error: "+ie);
       }
    }
}
