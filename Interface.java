import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Interface extends Remote {
   

    public String inhoa(String s) throws RemoteException;

    public String dao(String s) throws RemoteException;

    public int Demtu(String s) throws RemoteException;
    
    public int demKhoangtrang(String s) throws RemoteException;

    public String xoaKhoangtrang(String s) throws RemoteException;

    public int demSolanxuathien(String s, char k) throws RemoteException;
}