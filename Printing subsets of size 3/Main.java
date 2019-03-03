import java.util.Scanner;
class Main{
  public static void subset_of_3(int size,int arr[])
  {
    for(int idx1=0;idx1<size-1;idx1++)
    {
      for(int idx2=idx1+1;idx2<size;idx2++)
      {
        for(int idx3=idx2+1;idx3<size;idx3++)
        {
          System.out.print("("+ arr[idx1] + "," + " "+ arr[idx2] + "," + " "+ arr[idx3] + ")" + " ");
        }
      }
       System.out.println();
    }
   
  }
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int arr[]=new int[size];
      for(int i =0;i<size;i++)
      {
        arr[i]=sc.nextInt();
      }
      subset_of_3(size,arr);
    }
}