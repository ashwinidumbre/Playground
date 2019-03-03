import java.util.Scanner;
class Main{
  public static void partioning(int size,int arr[])
  {
    int pos[] = new int[size];
    int pos_idx=0;
    int zero[] = new int[size];
    int zero_idx=0;
    for(int i =0;i<size;i++)
    {
      if(arr[i]>0)
      {
        pos[pos_idx]=arr[i];
        pos_idx++;
      }
      else
      {
        zero[zero_idx]=arr[i];
        zero_idx++;
      }
    }
    int arr_size=0;
    for(int i=0;i<pos_idx;i++)
    {
      arr[arr_size]=pos[i];
      arr_size++;
    }
     for(int i=0;i<zero_idx;i++)
    {
      arr[arr_size]=zero[i];
      arr_size++;
    }
  }
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int arr[]=new int[size];
      for(int i=0;i<size;i++)
      {
        arr[i]=sc.nextInt();
      }
      partioning(size,arr);
      for(int i=0;i<size;i++)
      {
        System.out.print(arr[i] +" ");
      }
    }
}