import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Interface extends Remote {
   

    public String inhoa(String s) throws RemoteException;

    public String dao(String s) throws RemoteException;

    public int Demtu(String s) throws RemoteException;
    
}