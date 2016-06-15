import java.io.*;
public class CalArea
{
	
	int a,b,c;
	public CalArea(int p)
	{
		a=p;	
		b=p;
		c=a*b;
	}
	public CalArea(int p,int q)
	{
		a=p;
		b=q;
		c=a*b;
	}
	public void area ()
	{
		if (a==b)
		{
			System.out.println("Area of Square is "+c);	
		}
		else
		{
			System.out.println("Area of Rectangle is "+c);
		}
	}
	public static void main(String args[]) throws Exception
	{	int a,b;
		String str;	
		try
		{ 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter length and breath of Rectangle :");
		str=br.readLine();
		a=Integer.parseInt(str);
		str=br.readLine();
		b=Integer.parseInt(str);
		CalArea C1=new CalArea(a,b);
		C1.area();
		System.out.println("Enter length of the Square:");
		str=br.readLine();
		a=Integer.parseInt(str);
		CalArea C2=new CalArea(a);
		C2.area();
		} 
		catch (IOException e)
		{	e.printStackTrace();
		}
	
	}
}