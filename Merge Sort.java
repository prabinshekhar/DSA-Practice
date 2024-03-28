//Merge Sort 
//Divide and Merge 
  //[3,1,2,4,1,5,2,6,4] => [3,1,2,4,1] [5,2,6,4] => [3,1,2] [4,1] [5,2] [6,4] => [3] [1,2] [4] [1] [5] [2] [6] [4]

public static void MergeSort( int [] a, int low , int high) 
  {
   if(low<high)
   {
     int mid = (low+high)/2;
     MergeSort(a,low,mid);
     MergeSort(a,mid+1,high);
     merge(a,low,mid,high);
   }
}

public static void merge(int []a , int low , int mid,int high)
  {
   int n1= mid-low+1;
   int n2 =high-mid;
//creating temporary array and copy values
   int L[n1],R[n2];
   for(int i=0;i<n1;i++)
     {
       L[i] = a[low+i];
     }
    for(int j=0;j<n2;j++)
      {
        R[j] = a[mid+j];
      }
  int i=0,j=0;
  int k = low;
  
  while(i<=mid && j<=high)
    {
      if(L[i] < R[j] )
      {
        a[k]=L[i];
        i++;
      }
      else
      {
        a[k]=R[j];
        j++;
      }
      k++;
    }
  while(i<=mid)
    {
      a[k]=L[i];
      i++;
      k++;
    }

  while(j<=high)
    {
      a[k]=R[j];
      j++;
      k++;
    }
    }
}
