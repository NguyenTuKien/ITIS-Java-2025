package J04016;

import java.util.Scanner;

public class Matrix {
    int m, n;
    int [][] matrix;

    public Matrix(int m, int n) {
        this.n = n;
        this.m = m;
        this.matrix = new int[m][n];
    }

    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }

    public int getValue(int i, int j) {
        return  matrix[i][j];
    }

    public void nextMatrix(Scanner cin){
        for (int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                this.matrix[i][j] = cin.nextInt();
            }
        }
    }

    public String mul(Matrix o){
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < m; ++i){
            for (int j = 0; j < o.getN(); ++j){
                int val = 0;
                for (int k = 0; k < n; ++k){
                    val += this.matrix[i][k] * o.getValue(k, j);
                }
                s.append(val).append(" ");
            }
            s.append("\n");
        }
        return s.toString();
    }

}