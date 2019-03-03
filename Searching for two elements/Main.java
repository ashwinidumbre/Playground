import java.util.Scanner;
class Main{
    public static void main(String args[]){
       Scanner sc =new Scanner(System.in);
      int size = sc.nextInt();
      int arr[] =new int[size];
      int i;
      for(i=0;i<size;i++)
      {
        arr[i] = sc.nextInt();
      }
      int search_ele1=sc.nextInt();
      int search_ele2=sc.nextInt();
      int ele1_idx=-1;
      int ele2_idx=-1;
      for(i=0;i<size;i++)
      {
        if(search_ele1==arr[i])
          ele1_idx=i;
        if(search_ele2==arr[i])
          ele2_idx=i;
      }
      System.out.println(ele1_idx);
      System.out.println(ele2_idx);
      
    }
}