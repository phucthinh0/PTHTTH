package UDPSocket;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.io.IOException;
import java.io.InputStream;
import java.net.Inet4Address;

public class UDPEchoclient {
    public final static int serverPort=7;
    public static void main(String[] args){
        try{
            DatagramSocket ds = new DatagramSocket();
            InetAddress server = InetAddInet.getByName("localhost");
            while(true){
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
                String theString = br.readLine();
                byte[] data = theString.getBytes();
                DatagramPacket dp = new DatagramPacket(data,data.length,server,ServerPort);
                ds.send(dp);
                byte[] buffer = new byte[6000];
                DatagramPacket incoming = new DataGramPacket(buffer,buffer.length);
                ds.receive(incoming);
                System.out.println(new String(incoming.getData(),0,incoming.getlength()));

            }
        }catch(IOException ie){
            System.out.println(ie);
        }
    }
}
