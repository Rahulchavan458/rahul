import java.util.Scanner;
class prime 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("gdfkgdkjf");
	    int a=sc.nextInt();
        System.out.println("gdfkgdkjf");
	    int b=sc.nextInt();
	    int c=0;
	    for (int i=a;i<=b;i++)
	    {
			for (int j=1;j<i;j++)
			{
				if (i%j==0)
				{
			       c++;
		        }
			}
	    }
	    if (c==2)
	    {
		    System.out.println(a+"prime number");
	    }	
}
}