import java.util.Arrays;
public class Tester{
  public static void main(String[]args){
    int[] a = {1, 2, 3, 4, 5};
    int[] b = {0, 2, 5, 3, 7};
    //System.out.println(ArrayOps.sum(a));
    //System.out.println(ArrayOps.sum(b));
    //System.out.println(ArrayOps.largest(a));
    //System.out.println(ArrayOps.largest(b));
    int[][] matrix = {{1, 0, 12, -1}, {7, -2, 2, 1}, {-5, -2, 2, -9}};
    //System.out.println(Arrays.toString(ArrayOps.sumRows(matrix)));
    System.out.println(Arrays.toString(ArrayOps.largestInRows(matrix)));
  }
}
