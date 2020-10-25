import java.util.Arrays;
public class ArrayOps{
  public static int sum(int[] arr){
    int sum = 0;
    for(int i = 0; i < arr.length; i++){
      sum = sum + arr[i];
    }
    return sum;
  }

  public static int largest(int[] arr){
    int max = arr[0];
    for(int i = 0; i < arr.length; i++){
      if(arr[i] > max){
        max = arr[i];
      }
    }
    return max;
  }

  public static int[] sumRows(int[][] matrix){
    int[] rowsSum = new int[matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			rowsSum[i] = sum(matrix[i]);
		}
		return rowsSum;
  }

  public static int[] largestInRows(int[][] matrix){
    int[] x = new int[matrix.length];
    for(int i = 0; i < matrix.length; i++){
      x[i] = largest(matrix[i]);
    }
    return x;
  }

  public static int sum(int[][] arr){
    return (sum(sumRows(arr)));
  }

  public static int[] sumCols(int[][] matrix){
    int[] x = new int[matrix[0].length];
    for(int i = 0; i < matrix[0].length; i++){
      int columnSum = 0;
      for(int j = 0; j < matrix.length;  j++){
        columnSum = columnSum + matrix[j][i];
      }
      x[i] = columnSum;
    }
    return x;
  }



}
