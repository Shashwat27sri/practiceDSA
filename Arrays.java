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



    // move zeroes to end 
    public static int[] moveZeros(int n, int []a) {
        // Write your code here.
        ArrayList<Integer> temp  = new ArrayList<>(); 
        
        for (int i = 0 ; i< n ; i++ ){
            if (a[i] != 0 ){
                temp.add(a[i]);
            }
        }
        
        int nz = temp.size();
        
        for (int i=0;i < nz; i++ ){
            a[i] = temp.get(i); 
        }
        for (int i = nz; i < n; i++){
            a[i] = 0;
        }
        return a;
    }




    //left rotate by 1 step
    
    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        int temp =arr[0];
        for (int  i=0 ;i< n-1 ;i++){
            arr[i] = arr[i+1];

        }
        arr[n-1]= temp;
        return arr;
    }


    // rotate array by D steps

    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {

        // Write your code here.

        for(int i=1;i<=k;i++){

            int x=arr.get(0);

            arr.remove(0);

            arr.add(x);

        }

        return arr;

    }




    // linear search
    public static int linearSearch(int n, int num, int []arr){
        // Write your code here.
        for (int i = 0 ;i< n ;i++){
            if (arr[i] == num){
                return i;
            }
        }
        return -1;
    }




    // merge 2 sorted array
    public static List< Integer > sortedArray(int []a, int []b) {

        // Write your code here

        int n1 = a.length;

        int n2 = b.length;

        List<Integer> unionArray = new ArrayList<>();

        int i=0,j=0;

        while (i<n1 && j<n2){

            if(a[i]<=b[j]){

                if(unionArray.size()==0||unionArray.get(unionArray.size() - 1)!=a[i]){

                    unionArray.add(a[i]);

                }

                i++;

            }

            else{

                if(unionArray.size()==0||unionArray.get(unionArray.size() - 1)!=b[j]){

                    unionArray.add(b[j]);

                }

                j++;

            }

        }

        while (j<n2){

            if(unionArray.size()==0||unionArray.get(unionArray.size() - 1)!=b[j]){

                unionArray.add(b[j]);

            }

            j++;

        }

        while (i<n1){

            if(unionArray.size()==0||unionArray.get(unionArray.size() - 1)!=a[i]){

                unionArray.add(a[i]);

            }

            i++;

        }

        return unionArray;

    }
}