import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Implement extends UnicastRemoteObject implements Interface {

    protected Implement() throws RemoteException {
        super();
        // TODO Auto-generated constructor stub
    }

    public String inhoa(String[] s){
        return s.touppercase();
    }
        
    

    public String dao(String[] s){
        Stringbuffer bf = new Stringbuffer(s);
        return bf.reverse().toString();
    }
        


    public //dem{
}