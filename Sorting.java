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






    // RECURSIVE BUBBLESORT

    public static void bubbleSort(int arr[ ] , int n) {


    if (n == 1){
            return;
        }

    for(int i = 0 ; i<=n-2 ; i++){
        if (arr[i] > arr[i+1]){
            int temp = arr[i]; 
            arr[i] = arr[i+1]; 
            arr[i+1]= temp; 
        }

    }

    bubbleSort(arr , n-1);

    }





    // RECURSIVE INSERTION SORT

    public static void insertionSort(int[] arr , int size) {
        helper(arr,0,size);

    }

    public static void helper(int[] arr , int i , int n  ){

        // recursive approach
        if(i == n ){
            return; 
        }
        int j = i ;
        while(j>0 && arr[j-1] > arr[j]){
            int temp = arr[j]; 
            arr[j] =arr[j-1];
            arr[j-1] = temp; 
            j--;
        }

        helper(arr , i+1 , n );
    }




    //QUICK SORT

    public static void quickSort(int[] input,int startIndex, int endIndex) {

        if(startIndex >= endIndex) return;
        int pIndex = partition(input, startIndex, endIndex);
        quickSort(input, startIndex, pIndex-1);
        quickSort(input, pIndex+1, endIndex);

    }

 

    public static int partition(int[] arr, int low, int high){
        int piviot = arr[low];
        int i = low;
        int j = high;
        while(i < j){
            while(arr[i] <= piviot && i <= high - 1){
                i++;
            }
            while(arr[j] > piviot && j >= low + 1){
                j--;
            }
            if(i < j){
				swap(arr, i , j);
            }
        }
        swap(arr, low, j);

        return j;

    }

 

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

}