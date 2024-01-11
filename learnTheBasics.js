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
    
    
}