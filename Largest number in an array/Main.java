import java.util.Scanner;
class Main{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
      int size=sc.nextInt();
      int arr[] = new int[size];
      int i;
      for(i=0;i<size;i++)
      {
        arr[i]=sc.nextInt();
      }
      int max = arr[0];
      for(i=0;i<size;i++)
      {
        if(max<arr[i])
          max=arr[i];
      }
      System.out.print(max);
    }
}