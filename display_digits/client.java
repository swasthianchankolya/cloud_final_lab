import java.rmi.*;
import java.util.*;

public class client
{
	public static void main(String[] args)
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the new String:");
			String str=sc.next();
			
			inter in=(inter)Naming.lookup("rmi://localhost/ansis");
			System.out.println(in.ans(str));
		}
		catch(Exception e)
		{
			
		}
	}
}