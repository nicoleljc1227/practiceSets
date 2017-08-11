package jzoffer;

import java.util.Scanner;

/**
 * 矩阵中的路劲
 * Created by xl on 2017/6/15.
 */
public class num_65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int rows = sc.nextInt();
            int cols = sc.nextInt();
            String str1 = sc.next();
            String str2 = sc.next();

            char[] chars = str1.toCharArray();
            char[] str = str2.toCharArray();
            System.out.println(hasPath(chars,rows,cols,str));

        }
    }

    public static boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        //一条路径不能2次经过一个格子
        //一条路径不通 是否回退
        boolean[][] visited = new boolean[rows][cols];
        char[][] m = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                m[i][j] = matrix[i * cols + j];
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <cols ; j++) {
                if(fun(m,rows,cols,0,str,i,j,visited)){
                    return true;
                }
            }
        }
        return false;
        //其实位置r,c不能只是设置为0,0因为一0,0 返回false就会终止程序，而应该循环遍历r,c 每个起始点都试一遍
        //return fun(m,rows,cols,0,str,0,0,visited);

    }

    public static boolean fun(char[][] matrix, int rows, int cols, int k, char[] str, int r, int c, boolean[][] visited) {

        if (r < 0 || r >= rows || c < 0 || c >= cols || visited[r][c] || matrix[r][c] != str[k]) {//如果超过边界或者被访问过，或者此时字符不等于对应字符
            //matrix[r][c]!=str[k] ???? 表明这个字符串要和矩阵的路径上的字符一一对应
            return false;
        }
        if (k == str.length - 1) {
            return true;
        }

        visited[r][c] = true;

        if (fun(matrix, rows, cols, k + 1, str, r - 1, c, visited) ||
                fun(matrix, rows, cols, k + 1, str, r + 1, c, visited) ||
                fun(matrix, rows, cols, k + 1, str, r, c + 1, visited) ||
                fun(matrix, rows, cols, k + 1, str, r, c - 1, visited)) {
            return true;
        }
        visited[r][c] = false;
        return false;
    }

}
