//QuickSort - Pick a Pivot and place it in its corrects place 
//           - Smaller on the left and larger on the right 
//Pivot element - 1st element , Last element , Median of the array .

The key process in quickSort is a partition(). The target of partitions is to place th epivot at its correct
  positions and put all smaller elements to the left of the pivot and all greater elements to the right of the
  pivot.
import java.util.*;

public class Main {
    public static void main(String[] args) {
      int a[]={23,4,56,7,89,97};
      quickSort(a,0,a.length-1);
      
      for(int i=0;i<a.length;i++)
      {
        System.out.print(a[i]+" ");
      }
  }
  
  public static void quickSort(int[] arr,int low , int high)
  {
    if(low<high)
    {
      int pi=partition(arr,low,high);
      quickSort(arr,low,pi-1);
      quickSort(arr,pi+1,high);
    }
  }
  public static int partition(int a[],int low,int high)
  {
    int pivot=a[high];
    int i=low-1;
    for(int j=low;j<high;j++)
    {
      if(a[j]<=pivot)
      {
        i++;
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
      }
    }
    int temp=a[i+1];
    a[i+1]=a[high];
    a[high]=temp;
    
    return i+1;
  }
}
  
