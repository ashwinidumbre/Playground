import java.util.Scanner;
class Main{
  public static int pair_ele(int size,int arr[],int value)
  {
    for(int i=0;i<size;i++)
    {
      for(int j=i+1;j<size;j++)
      {
       int result = arr[i]+arr[j];
        if(result==value)
        {
          System.out.println(arr[i] + "," + " "+arr[j]);
        }
      }
     
    }
    return -1;
  }
    public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int arr[] = new int[size];
      for(int i=0;i<size;i++)
      {
        arr[i]=sc.nextInt();
      }
      int value=sc.nextInt();
      pair_ele(size,arr,value);
    }
}