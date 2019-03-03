import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int first_digit, last_digit;
      first_digit = n;
       last_digit = n % 10;
      while(first_digit >= 10)
      {
        first_digit = first_digit/10;
      }
    int sum = first_digit + last_digit;
      System.out.println(sum);
	}
}