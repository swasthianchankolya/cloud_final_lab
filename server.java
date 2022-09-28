import java.rmi.*;
public class server
{
	public static void main(String[] args)
	{
		try
		{
			impl im=new impl();
			Naming.rebind("ansis",im);
			System.out.println("server is ready");
		}
		catch(Exception e)
		{
			
		}
	}
}