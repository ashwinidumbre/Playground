import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int digit_count = 0;
      int num;
      double sum=0;
      int temp = n;
      while(temp!=0)
      {
        digit_count++;
        temp = temp/10;
      }
      temp = n;
      while(temp!=0)
      {
        num = temp%10;
        sum =sum +Math.pow(num,digit_count);
        temp = temp/10;
   
      }
   if(n == sum)
     System.out.println("Armstrong Number");
   else
     System.out.println("Not a Armstrong Number");
	}
}