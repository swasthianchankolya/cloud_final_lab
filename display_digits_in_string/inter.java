import java.rmi.*;
public interface inter extends Remote
{
	public String ans(String str)throws RemoteException;
}