public class learnTheBasics {

  public static void nForest(int n) {
      for (int i = 0 ;i<n; i++ ){
          for (int j = 0 ;j<n;j++){
              System.out.print("* ");
          }
          System.out.println();
      }
  }

  public static void nForest(int n) {
    for (int i = 0 ;i< n ;i++){
        for (int j = 0;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
  }

  public static void nTriangle(int n) {
    // Write your code here
    int k = 1;
    for (int i = 0 ;i<n;i++ ){
        k=1;
        for (int j = -1 ;j<i;j++ ){
            System.out.print(k+" ");
            k++;
        }
        System.out.println();
    }
  }

  public static void nTriangle(int n) {
    // Write your code here
    
    for (int i =0;i<n;i++){
        for (int j= 0;j<=i;j++){
            
            System.out.print(i+1+" ");
            
        }
        System.out.println();
    }
  }


  public static void seeding(int n) {
    // Write your code here
    for (int i = 0 ;i<n;i++ ){
        for (int j = n ;j>i ; j--){
            System.out.print("* ");

        }
        System.out.println();
    }
  }

  public static void nNumberTriangle(int n) {
    // Write your code here
    for (int i = 0; i <n;i++){
        int k = 1;
        for (int j = n; j>i;j--){
            System.out.print(k+" ");
            k++;
        }
        System.out.println();
    }
  }


  public static void nStarTriangle(int n) {
    for(int i=1; i<=n;i++){
        for(int j=1; j<=(2*n-2*i); j++){
                System.out.print(" ");
        }
        for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
        }
        System.out.println();
    }
  }

  public static void nStarTriangle(int n) {
    // Write your code here
    for(int i=1; i<=n;i++){
        for(int j=1; j<=(2*i-2); j++){
                System.out.print(" ");
        }
        for(int j=1; j<=(2*n-2*i+1); j++){
                System.out.print("*");
        }
        System.out.println();
    }
  }


  public static void nStarDiamond(int n) {
    // Write your code here
    for (int i=1;i<=n;i++ ){
        for (int j=1;j<=(2*n-2*i);j++){
            System.out.print(" "); 
        }
        for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for (int i = 1;i<=n;i++){
        for (int j=1;j<=2*i-2;j++){
            System.out.print(" ");
        }
        for (int j = 1;j<=(2*n-2*i+1);j++){
            System.out.print("*");
        }
        System.out.println();
    }
  }

  public static void nStarTriangle(int n) {
    // Write your code here
    for (int i = 1;i<=n;i++){
        for (int j =1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();

    }

    for (int i = n - 1; i > 0; i--) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }




    
  }


  public static void nBinaryTriangle(int n) {
        
    for(int i=1;i<=n;i++){
        for(int j=i;j>0;j--){
            System.out.print(j%2+" ");
        }
        System.out.println();
    }
  }



  public static void numberCrown(int n) {


    for(int i=1;i<=n;i++){

        for(int j=1;j<=i;j++){

            System.out.print(j+" ");

        }

        //spaces

        for(int j=0;j<n-i;j++){

            System.out.print(" ");

        }

        for(int j=i;j>=1;j--){

            System.out.print(j+" ");

        }

        System.out.println();



    }

    }




    public static void nNumberTriangle(int n) {
        // Write your code here
        int k =1;
        for (int i = 1;i<=n;i++){
            for (int j = 1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }





    public static void nLetterTriangle(int n) {
        // Write your code here
        for(int i = 1 ;i<=n;i++){
            char ch = 'A';
            for (int j = 1;j<=i;j++){
                System.out.print(ch+" "); 
                ch++;
            }
            System.out.println();
        }
    }





    public static void nLetterTriangle(int n) {
        // Write your code here
        for (int i = 0;i<=n;i++){
            char ch = 'A';
            for(int j=0;j<=n-i-1;j++){
                System.out.print(ch+ " ");
                ch++;
            }
            System.out.println();
        }
    }





    public static void alphaRamp(int n) {
        // Write your code here\
        char ch ='A';
        for (int i=0 ;i<n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print(ch+" ");

            }
            System.out.println();
            ch++;
        }
    }



    // alphaHill
    public static void alphaHill(int n) {
        // Write your code here


        for (int i=1;i<=n;i++){
            for (int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            char ch = 'A';
            for (int j=1;j<=2*i-1;j++){
                System.out.print(ch+" ");
                if(j<i){
                    ch++;
                }else{
                    ch--;
                }
                

            }
            
            System.out.println();
        }
    }



    //alphaTriangle
    public static void alphaTriangle(int n) {
        // Write your code here
        // int c =n; 
        for (int i=1;i<=n;i++){
            char ch=(char)('A'+n);
            for (int j =1;j<=i;j++){
                System.out.print((char)(ch-j)+" ");
                // c--;
            }
            System.out.println();
        }
    }




    // symmetric void

    public static void symmetry(int n) {

        first(n);

        second(n);

    }

 

    static void first(int n){

        for(int i=1;i<=n;i++){

            for(int j=1;j<=n-i+1;j++){

                System.out.print("* ");

            }

            for(int j=1;j<=2*i-2;j++){

                System.out.print("  ");

            }

            for(int j=1;j<=n-i+1;j++){

                System.out.print("* ");

            }

            System.out.println();

        }

    }

    static void second(int n){

        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){

                System.out.print("* ");

            }

            for(int j=1;j<=2*(n-i);j++){

                System.out.print("  ");

            }

            for(int j=1;j<=i;j++){

                System.out.print("* ");

            }

            System.out.println();

        }

    }


    // butterfly pattern

    public static void symmetry(int n) {
        // Write your code here
        for (int i =1;i<=n;i++){
            for (int j =1;j<=i;j++){
                System.out.print("*"+" ");
            }
            for (int j = 1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for (int j = 1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        for (int i =n-1;i>=1;i--){
            for (int j =1;j<=i;j++){
                System.out.print("*"+" ");
            }
            for (int j = 1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for (int j = 1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }



    // hollow rhombus
    public static void getStarPattern(int n) {
        // Write your code here
        for (int i=1;i<=n;i++){
            for (int j = 1;j<=n;j++){
                if (i == 1 || i== n || j== 1 || j == n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }




    // numberPattern
    public static void getNumberPattern(int n) {

        for(int i=0;i<2*n-1;i++){

            for(int j=0;j<2*n-1;j++){

                int top=i;

                int left=j;

                int right=(2*n-2)-j;

                int down=(2*n-2)-i;

                System.out.print(n-(Math.min(Math.min(top, down),Math.min(right, left))));

            }

            System.out.println();

        }

    }




    public static int countDigits(int n){
        int x=n;
        int count = 0 ;
        while(x>0){
            int rem = x%10;
            x=x/10;
            if (rem ==0){
                continue;

            }if(n%rem==0){
                count++;
            }
            

        }
        return count;
    }




    public static long reverseBits(long n) {

        long arr[]=new long[32];

        int count=0;

        while(n!=0){

            long rem=n%2;

            arr[count]=rem;

            n/=2;

            count++;

        }

        count=0;

        long result=0;

        for(int i=31; i>=0; i--){

            result+=(long)Math.pow(2,count)*arr[i];

            count++;

        }

        return result;

    }





    public int reverse(int x) {

    int n=x;
    // count = 0;
    int rev=0;
    while(n!=0){
        int lastDig= n%10;
        rev= rev*10+lastDig;
        n= n/10;

    }
    return rev; 
    
    }
    



    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x=n;
		// int n=x;/
        // count = 0;
        int rev=0;
        while(n!=0){
            int lastDig= n%10;
            rev= rev*10+lastDig;
            n= n/10;


        }
		if (rev == x){
			System.out.print("true");
		}
		else{
			System.out.print("false");
		}
	}
    




    public boolean isPalindrome(int n) {
        int x=n;
		// int n=x;/
        // count = 0;
        int rev=0;
        if (n<0){
            return false;
        }
        while(n!=0){
            int lastDig= n%10;
            rev= rev*10+lastDig;
            n= n/10;


        }
		if (rev == x){
			return true;
		}
		else{
			return false;
		}
    }






    public static int calcGCD(int n, int m){
        // Write your code here.
        int div =1;
        for (int i =1;i<=Math.min(n,m);i++){
            if ((n%i==0) && (m%i == 0)){
                div =  i;
            }
        }
        return div;
    }




    public static void main(String[] args) {
    // Write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x=n;
    // int count =0;
    int numDig =(int) Math.log10(x)+1;
    
    int sum =0 ;
    while (x > 0) {
        int last = x % 10;
        int num =(int) Math.pow(last,numDig); 
        sum = sum+num; 
        x=x/10;
    }

    
    if( sum == n ){
        System.out.print("true");
    }
    else{
        System.out.print("false");
    }
    

    }
    








    public static String isPrime(int n) {
        if (n <= 1) {
            return "NO"; 
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return "NO";  
            }
        }

        return "YES";  
    }




    public static int sumOfAllDivisors(int n){
        // Write your code here.
        int ans=0;

        for(int i=1;i<=n;i++)

        {

        ans+=(n/i)*i;   // this formula to find the divisors (N/i)*i 

        }

        return ans;

        
    }







    public static int[] print(int arr[], int x){
        if (x>0){
            arr[x-1] = x;
            print(arr, x-1);
        }
        return arr;
    }
    public static int[] printNos(int x) {
        // Write Your Code Here
        int arr[]=new int[x];
        // for(int i = 0 ;i < x;i++){
        //     arr[i] = i+1;

        // }
        // return arr;
        return print(arr, x);

    }







    public static List<String> print(List<String> l,int n){

        if(n>0){

        l.add("Coding Ninjas");

        print(l,n-1);

        }

        return l;

    }

    public static List<String> printNtimes(int n){

        List<String> l = new ArrayList<>();

        return print(l,n);

    }






    public static int[] print( int[] arr , int x, int idx){
        // int val = 1;
        if(x>0){
            arr[idx] = x;
            print(arr , x-1,idx+1);
        }
        return arr; 
    }
    
    

    public static int[] printNos(int x) {
        // Write Your Code Here
        int arr[]= new int[x];
        return print(arr , x,0);

    }





    public static long sumFirstN(long n) {
        // Write your code here.
        if (n == 0) {
            return 0;
        } else{
            // Recursive case: sum of first 'n' natural numbers is n + sum of first (n-1) natural numbers
            return n + sumFirstN(n - 1);
        }
    }




    // factorial recursion

    public static long fact(long n ){
        if (n==1){
            return 1;
        }
        return (n * fact(n-1));

    }
    
    public static List<Long> factorialNumbers(long n) {
        
        List<Long> l =  new ArrayList<>();
        if ( n ==1 ){
            l.add(n);
            return l;
        }else{
            for (int i = 1;i<=n;i++){
                long fact = fact(i);
                if (fact <= n){
                    l.add(fact);

                }else{
                    break; 
                }
            }
        }
        return l;

    }







    // reverse an array
    public static int[] reverseArray(int n, int []nums) {
        
        revArray(nums,0, n-1);
        return nums;

    }
    public static void revArray(int [] nums, int start, int end){
        if(start<end){
            // swapping... 
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            revArray(nums, start+1, end-1);
        }
    }





    // palindrom using recursion 
    
    public static boolean isPalindrome(String str) {
        // Write your code here.
        int n = str.length();

        return check(str, 0 , n);
    }
    public static boolean check(String str, int i, int n){
        if (i>=n/2){
            return true;

        }
        if (str.charAt(i)!=str.charAt(n-i-1)){
            return false;
        }
        return check(str,i+1,n);
    }



    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
        	return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
        	char currFirst = s.charAt(start);
        	char currLast = s.charAt(last);
        	if (!Character.isLetterOrDigit(currFirst )) {
        		start++;
        	} else if(!Character.isLetterOrDigit(currLast)) {
        		last--;
        	} else {
        		if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
        			return false;
        		}
        		start++;
        		last--;
        	}
        }
        return true;
    }




    //fibonnacci series
    public static int[] generateFibonacciNumbers(int n) {

    // Write your code here.

        int[] arr = new int[n];

        fibonacciNums(0,arr,n);

        return arr;
    }

    private static int[] fibonacciNums(int i,int[] arr,int n){

        if(n>0){
            if(i>1){
                arr[i] = arr[i-1]+arr[i-2];
            }else if(i==0){
                arr[i] = i;
            }else if(i==1){
                arr[i] = i;
            }
            fibonacciNums(i+1,arr,n-1);
        }
        return arr;
    }





    // hashing
    public static int[] countFrequency(int n, int x, int []nums){
        // Write your code here.
        int hash[] = new int[n];
        for (int i=0; i<n ; i++){
            if (nums[i]<=n){
                hash[nums[i]-1]+=1;
            }
        }
        return hash;
    }






    // get frequency of highest and lowest element count hashing 
    public static int[] getFrequencies(int[] v) {

        int[] res = new int[2];
        
        int len = v.length;

        int maxNum = Integer.MIN_VALUE, maxCount = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE, minCount = Integer.MAX_VALUE;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<len;i++){
            int num = v[i];
    
            if(map.containsKey(num)){
                int count = map.get(num);
                map.put(num,count+1);
            }else{
                map.put(v[i],1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer count = entry.getValue();

            // System.out.print("Key => "+key+":"+"Value => "+count);

            if(maxCount < count){
                maxCount = count;
                maxNum = key;
            }else if(maxCount == count){
                if(maxNum > key){
                    maxNum = key;
                }
            }

            if(minCount > count){
                minCount = count;
                minNum = key; 
            }else if(minCount == count){
                if(minNum > key){
                    minNum = key;
                }
            }
            // System.out.println();
        }

        
        res[0]=maxNum;
        res[1]=minNum;

        return res;
    }

}