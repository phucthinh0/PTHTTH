package DateTime;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class TCPEchoServer {
    public final static int serverPort = 7;

    public static void main(String[] args) throws IOException {
        DataOutputStream dos = null;
        DataInputStream dis = null;
        Socket s = null;

        try {
            ServerSocket ss = new ServerSocket(serverPort);
            System.out.println("Server Create...");
            
            int cv;


            while(true){
                s = ss.accept();
                dos = new DataOutputStream(s.getOutputStream());
                dis = new DataInputStream(s.getInputStream());

                String yeucau = " 1. Time \n 2. Date \n 3. Date & Time ";
    
                dos.writeUTF(yeucau);
                String kq = null;

                while(true){
                    cv = dis.readInt();
                    
                    if(cv != 0){
                        if(cv >=1 && cv <=3){
                            switch(cv){
                                case 1:
                                    LocalTime nowtime = LocalTime.now();
                                    kq = nowtime.toString();
                                    break;
                                case 2:
                                    LocalDate nowdate = LocalDate.now();
                                    kq = nowdate.toString();
                                    break;
                                case 3:
                                    LocalDateTime nowdt = LocalDateTime.now(); 
                                    kq = nowdt.toString();
                                    break;
                            }
                            dos.writeUTF(kq);
                        }
                        else{
                            dos.writeUTF("Nhap yeu cau 1, 2, 3!!!");
                        }
                    }
                    else{
                        dos.writeUTF("Exit!!");
                    }

                }

            }
            
        } catch (Exception e) {
            dos.close();
            dis.close();
            s.close();
        }
    }
}