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
}