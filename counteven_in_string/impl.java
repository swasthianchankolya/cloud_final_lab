import java.rmi.*;
import java.rmi.server.*;

public class impl extends UnicastRemoteObject implements inter
{
	public impl()throws RemoteException
	{
		
	}
	public int ans(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==50 || str.charAt(i)==52 || str.charAt(i)==54 || str.charAt(i)==56)
			{
				count=count+1;
			}
		}
		return count;
	}
}