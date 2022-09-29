import java.rmi.*;

public interface inter extends Remote
{
	public int ans(String str)throws RemoteException;
}
