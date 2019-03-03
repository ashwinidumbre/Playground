import java.util.Scanner;
public class Main{
  public static int gcd_of_three(int n1,int n2,int n3)
  {
    int n4 = 1;int gcd = 1;
    for(int i = 1;i<=n1 && i<=n2;++i)
    {
      if(n1%i==0 && n2%i == 0)
        n4 = i;
    }
     for(int i = 1;i<=n4 && i<=n3;++i)
    {
      if(n4%i==0 && n3%i == 0)
        gcd= i;
    }
    return gcd;
  }
	public static void main (String[] args)
	{
	  Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      System.out.print(gcd_of_three(a,b,c));
      
	}
}