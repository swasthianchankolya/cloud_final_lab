import java.rmi.*;
import java.util.*;

public class client
{
	public static void main(String[] args)
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the String:");
			String str=sc.next();
			
			inter in=(inter)Naming.lookup("rmi://localhost/ansis");
			int sol=in.ans(str);
			if(sol==1)
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
		}
		catch(Exception e)
		{
			
		}
	}
}