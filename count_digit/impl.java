import java.rmi.*;
import java.rmi.server.*;

public class impl extends UnicastRemoteObject implements inter
{
	public impl()throws RemoteException
	{
		
	}
	public int ans(String str)
	{
		int tot=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>=48 && str.charAt(i)<=57)
			{
				tot=tot+1;
			}				
		}
		return tot;
	}
}