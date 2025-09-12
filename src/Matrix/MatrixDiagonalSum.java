package Matrix;

public class MatrixDiagonalSum {
    //BRUTE FORCE CODE
    static int diagonalSum(int[][]array){
        int sum=0;
        for(int i=0;i< array.length;i++){
            for(int j=0;j<array[0].length;j++){
                //primary diagonal condition-> i==j
                if(i==j){
                    sum+=array[i][j];
                }
                //secondary diagonal condition->i+j=n-1;
                else if(i+j== array.length-1){
                    sum+=array[i][j];
                }
            }
        }
        return sum;
    }

    //OPTIMISED CODE
    static int optimisedDiagonalSum(int[][]matrix){
        int sum=0;
        for(int i=0;i< matrix.length;i++){
            //primary diagonal
            sum+=matrix[i][i];
            //secondary diagonal
            if(i!= matrix.length-i-1)
                sum+=matrix[i][matrix.length-i-1];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] matrix={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        System.out.println(optimisedDiagonalSum(matrix));
    }
}
