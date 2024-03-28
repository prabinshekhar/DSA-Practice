//Bubble Sort - (ascending order)
               // if a[i] > a[i+1] , swap and with each iteration largest element get bubbled up to last of the array and the size of array keep decreasing. 0(n^2)

import java.util.*;

public class Main {
    public static void main(String[] args) {
      int a[] = { 21,3,45,67,8,23};
      BubbleSort(a);
     
  }
  
  public static void BubbleSort(int a[])
  {
    int i,j,temp=0;
    for(i=0;i<a.length-1;i++)
    {
      for(j=0;j<a.length-i-1;j++)
      {
        if(a[j]>a[j+1])
        {
          temp=a[j];
          a[j]=a[j+1];
          a[j+1]=temp;
        }
      }
    }
    for(i=0;i<a.length;i++)
    {
      System.out.print(a[i]+ " ");
    }
  }
    
}
