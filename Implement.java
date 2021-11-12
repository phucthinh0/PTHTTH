import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Implement extends UnicastRemoteObject implements Interface {

    protected Implement() throws RemoteException {
        super();
       
    }
    
    private char SPACE = ' ';
    private char TAB = '\t';
    private char ENTER = '\n';

    public String inhoa(String s){
        return s.toUpperCase();
    }
        
    public String dao(String s){
        StringBuffer bf = new StringBuffer(s);
        return bf.reverse().toString();
    }

    public int Demtu(String s){
        if (s == null) {
            return -1;
        }
        int count = 0;
        int size = s.length();
        boolean notCounted = true;
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) != SPACE && s.charAt(i) != TAB && s.charAt(i) != ENTER) {
                if(notCounted) {
                    count++;
                    notCounted = false;
                }
            } else {
                notCounted = true;
            }
        }
        return count;
    }
        
    public int tinhGiaithua(int a){
        if (a > 0) {
            return a * tinhGiaithua(a- 1);
        } else {
            return 1;
        }
    }
    
    

    
}