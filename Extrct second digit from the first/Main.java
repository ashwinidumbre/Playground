import java.util.*;
class Main
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int digit_count = 0;
      int n = num;
      while(n > 0)
      {
         n = n / 10;
         digit_count = digit_count + 1;
      }
    digit_count = digit_count - 2;
      while( digit_count != 0)
      {
        num = num/10;
        digit_count = digit_count - 1;
      }
     num = num % 10;
    System.out.println(num);
	}
}
  
