/* Triangle Pattern 6
        *
      * *
    * * *
  * * * *
* * * * *
  * * * *
    * * *
      * *
        *
*/
public class Triangle6 {
  public static void main(String[] args) {
    // Write code here
    int rows = 5;
    for (int i = 1; i <= rows; i++) {
      for (int j = i; j < rows; j++) {
        System.out.print("  ");
      }
      for (int k = 1; k <= i; k++) {
        System.out.print("* ");
      }
      System.out.println("");
    }
    for (int i = rows; i >= 1; i--) {
      for (int j = i; j <= rows; j++) {
        System.out.print("  ");
      }
      for (int k = 1; k < i; k++) {
        System.out.print("* ");
      }
      System.out.println("");
    }
  }
}