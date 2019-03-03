import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc =new Scanner(System.in);
    int size= sc.nextInt();
    int arr[]=new int[size];
    int i;int sum1=0,sum2=0;
    for(i=0;i<size;i++)
    {
      arr[i]=sc.nextInt();
    }
    for(i=0;i<3;i++)
    {
     sum1 =sum1 +arr[i];
    }
    for(i=3;i<6;i++)
    {
      sum2 =sum2 +arr[i];
    }
    if(sum1 == sum2)
      System.out.print("Perfect Batch");
    else
      System.out.print("Not a Perfect Batch");
  }
}