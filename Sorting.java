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





  // // insertion sort
  // public static void insertionSort(int[] arr, int size) {
  // //Your code goes here
  //   for (int i = 0 ; i<size-1; i++){
  //       for (int j = size-1 ; j>0; j-- ){
  //           if (arr[j-1] > arr[j]){
  //               int temp = arr[j];
  //               arr[j] = arr[j-1]; 
  //               arr[j-1] = temp;
  //           }
  //       }
  //   }
  // }
}