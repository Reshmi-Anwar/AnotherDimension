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

  public static boolean isRowMagic(int[][] matrix){
    int x = sum(matrix[0]);
    for(int i = 1; i < matrix.length; i++){
      if(sum(matrix[i]) != x){
        return false;
      }
    }
    return true;
  }

  public static int sumOfEachColumn(int[][] matrix, int column){
    int x = 0;
    for(int i = 0; i < matrix.length; i++){
      x = x + matrix[i][column];
    }
    return x;
  }
  public static boolean isColMagic(int[][] matrix){
    int x = sumOfEachColumn(matrix, 0);
    for(int i = 1; i< matrix[0].length; i++){
      if(sumOfEachColumn(matrix, i) != sumOfEachColumn(matrix, i - 1)){
        return false;
      }
    }
    return true;
  }

  public static boolean isLocationMagic(int[][] matrix, int row, int col){
    if (sum(matrix[row]) == sumOfEachColumn(matrix, col)){
      return true;
    }
    else{
      return false;
    }
  }

}
