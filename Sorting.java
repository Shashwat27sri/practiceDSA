public class Solution {



  // selection sort



  public static void selectionSort(int[] arr) {
      //Your code goes here
      int n = arr.length;
      for (int i =0; i<n-1; i++ ){
          int min  = i;
          for (int j= i+1;j<n ; j++){
              if (arr[j]  < arr[i]){
                  min = j;
                  int temp =  arr[min];
                  arr[min] = arr[i];
                  arr[i] = temp;
              }
          }

      }
      
  }





  // bubble sort
  public static void bubbleSort(int[] arr, int n) {
    //Your code goes here
    for (int i =0  ;i <n-1; i++ ){
        for (int j =i+1; j<n ; j++ ){
            if (arr[j] < arr[i]){
                int temp =  arr[j]; 
                arr[j] = arr[i];
                arr[i] = temp;
            }
        } 
    }
  }





  // insertion sort
  public static void insertionSort(int[] arr, int size) {
  //Your code goes here
    for (int i = 0 ; i<size-1; i++){
        for (int j = size-1 ; j>0; j-- ){
            if (arr[j-1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1]; 
                arr[j-1] = temp;
            }
        }
    }
  }





    //merge Sort
    public static void mergeSort(int[] arr, int l, int r){

    // Write your code here

    if(l<r){

    int mid=(l+r)/2;

    mergeSort(arr,l,mid);

    mergeSort(arr,mid+1,r);



    merge(arr,l,mid,r);

    }



    }

    private static void merge(int[]arr,int l,int mid,int r){

    int n1=mid-l+1;

    int n2= r-mid;



    int larr[]=new int[n1];

    int rarr[]=new int[n2];

    for(int x=0;x<n1;x++){

    larr[x]=arr[l+x];

    }

    for(int x=0;x<n2;x++){

    rarr[x]=arr[mid+1+x];



    }

    int i=0;

    int j=0;

    int k=l;

    while(i<n1 && j<n2){

    if(larr[i]<rarr[j]){

    arr[k]=larr[i];

    i++;

    }

    else{

    arr[k]=rarr[j];

    j++;

    }

    k++;

    }

    while(i<n1){

    arr[k]=larr[i];

    i++;

    k++;

    }

    }   
}