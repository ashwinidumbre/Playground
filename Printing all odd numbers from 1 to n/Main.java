import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int i;
      for(i = 1;i <= n; i= i+1)
      {
        if(i%2 !=0)
        {
          System.out.println(i);
        }
        
      }
      
	}
}