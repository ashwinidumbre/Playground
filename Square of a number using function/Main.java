import java.util.Scanner;
class Main
{
  public static int square(int n)
  {
   int sq = n * n;
    return sq;
  }
  
	public static void main (String[] args)
    {
	 // Type your code here 
      Scanner sc = new Scanner(System.in);
      int m = sc.nextInt();
      System.out.print(square(m));
	} 
}