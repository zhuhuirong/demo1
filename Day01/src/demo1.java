import java.util.Scanner;
public class demo1
{	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner p =new Scanner(System.in);		
		int a=p.nextInt();		
        int b=p.nextInt();        
        int m=p.nextInt();       
        if (m==1)
       	 System.out.println(a+b);
        else if (m==2)
       	 System.out.println(a-b);
        else if (m==3)
       	 System.out.println(a*b);
        else if (m==4)
       	 System.out.println(a/b);
        else
       	 System.out.println("«Î ‰»Î1-4");
	}
}
