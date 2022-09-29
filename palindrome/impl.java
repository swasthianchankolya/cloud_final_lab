import java.rmi.*;
import java.rmi.server.*;

public class impl extends UnicastRemoteObject implements inter
{
	public impl()throws RemoteException
	{
		
	}
	public int ans(String str)
	{
		String newstr="";
		String y="palindrome";
		String n="not_palindrome";
		for(int i=str.length();i>=0;i--)
		{
			newstr=newstr+(str.charAt(i));
		}
		if(newstr.equals(str))
		{
		return 1;	
		}
		else
		{
			return 0;	
		}
			
	}
}