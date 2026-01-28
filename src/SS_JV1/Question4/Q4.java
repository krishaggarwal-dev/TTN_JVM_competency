package SS_JV1.Question4;

public class Q4 {

    public static void main(String[] args) {

        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int rows = arr.length;
        int cols = arr[0].length;

        System.out.println("Sum of all elements of each column : ");
        for(int i=0; i<cols; i++) {
            int colsum = 0;
            for(int j=0; j<rows; j++) {
                colsum += arr[j][i];
            }
            System.out.println("Column " + (i+1) + " = " + colsum);
        }

        System.out.println("Sum of all elements of each row : ");
        for(int i=0; i<rows; i++) {
            int rowsum = 0;
            for(int j=0; j<cols; j++) {
                rowsum += arr[i][j];
            }
            System.out.println("Row " + (i+1) + " = " + rowsum);
        }
    }
}
