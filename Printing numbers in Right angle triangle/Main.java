import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n =sc.nextInt();
      int num=1;
      for(int row=1;row<=n;row++)
      {
        for(int col=1;col<=row;col++)
        {
          System.out.print(num);
        }
        System.out.println();
        num= num +1;
      }
	}
}