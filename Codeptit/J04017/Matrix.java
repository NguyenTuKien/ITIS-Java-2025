package J04017;

import java.util.Scanner;

public class Matrix {
    int n, m;
    int[][] matrix;

    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        matrix = new int[n][m];
    }

    public void nextMatrix(Scanner sc){
        for (int i = 0; i < n; ++i){
            for (int j = 0; j < m; ++j){
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    public int getM(){
        return this.m;
    }

    public int getValue(int i, int j){
        return matrix[i][j];
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public Matrix trans(){
        Matrix trans = new Matrix(m,n);
        int [][] matrix = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[j][i] = this.matrix[i][j];
            }
        }
        trans.setMatrix(matrix);
        return trans;
    }

    public String mul(Matrix o){
        StringBuilder sb = new StringBuilder();
        for(int i = 0;  i < n; i++){
            for(int j = 0; j < o.getM(); j++){
                int val = 0;
                for (int k = 0; k < m; k++){
                    val += matrix[i][k]*o.getValue(k,j);
                }
                sb.append(val).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}
