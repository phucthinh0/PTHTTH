import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Interface extends Remote {
    public String dao(String[] s) throws RemoteException;

    public String inhoa(String[] s) throws RemoteException;

    public String dem(String[] s) throws RemoteException;
}