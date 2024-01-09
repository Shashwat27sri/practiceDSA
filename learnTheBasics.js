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
}