//Insertion Sort -  a value is put to its right position in each iteration 


import java.util.*;

public class Main {
    public static void main(String[] args) {
      int a[] = { 21,3,45,67,8,23};
      InsertionSort(a);
     
  }
  
  public static void InsertionSort(int a[])
  {
   int i,j,temp=0;
   for(i=0;i<a.length;i++)
   {
     j=i;
     while(j>0 && a[j-1]>a[j])
     {
       temp=a[j-1];
       a[j-1]=a[j];
       a[j]=temp;
       j--;
     }
   }
   
    for(i=0;i<a.length;i++)
    {
      System.out.print(a[i]+ " ");
    }
  }
    
}
