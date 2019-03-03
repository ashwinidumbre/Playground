import java.util.Scanner;
class Main{
  public static int greatest_of_three(int n1,int n2,int n3)
  { int n4,largest;
    if(n1>n2)
      n4= n1;
    else
      n4 = n2;
   if(n4>n3)
     largest = n4;
   else
     largest= n3;
   return largest;
  }
 
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
      System.out.println(greatest_of_three(a,b,c));
	}
}