import java.util.* ;
import java.io.*; 

public class Solution {


    // get lastest element
    static int largestElement(int[] arr, int n) {
        // Write your code here.
        int min =  Integer.MIN_VALUE;
        for(int i =0; i< n ; i++ ){
            if (arr[i] > min){
                min = arr[i];
            }
        }
        return min;

    }




    // get second largest and second smallest
    public static int getSmall(int a[] , int n ){
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++)
        {
            if (a[i] < small)
            {
                second_small = small;
                small = a[i];
            }
            else if (a[i] < second_small && a[i] != small)
            {
                second_small = a[i];
            }
        }
        return second_small;
    }

    public static int getLarge(int a[] , int n ){
           int large = Integer.MIN_VALUE;
           int second_large = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++)
            {
                if (a[i] > large)
                {
                    second_large = large;
                    large = a[i];
                }
                else if (a[i] > second_large && a[i] != large)
                {
                    second_large = a[i];
                }
            }
            return second_large;
    }
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        int arr[] = new int[2];
        int secLarge = getLarge(a , n);
        int secSmall =getSmall(a, n);
        // for (int i = 0 ;i < n ; i++){
        arr[0] = secLarge; 
        arr[1] = secSmall;        
        return arr;
    }


 
  
    // issorted 
    public static int isSorted(int n, int []a) {
        
        if (n == 1 || n == 0)
            return 1;
        if (a[n - 1] < a[n - 2])
            return 0;
        return isSorted( n - 1,a);
    
    }




    // remove dulicates 
    public static int removeDuplicates(int[] arr,int n) {

        //USING TwO POINTER APPROACH

        int i=0;
        for(int j=1;j<n;j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
}