package zhenti2017.ali;

import java.util.Scanner;

/**
 * Created by xl on 2017/6/16.
 */
public class num1 {

    public int aaa;
    //
    public static void main(String[] args) {


        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int count = 0;
        int[][] M_ = new int[n][n];
        int[][] M = new int[n][n];

        for (int i = 0; i <n ; i++) {
            String str = input.next();
            String[] chars = str.split(",");
            for (int j = 0; j < chars.length; j++) {
                M_[i][j] = Integer.parseInt(chars[j]);
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                M[i][j] = M_[i][j];
                count = DFS(M);
            }
        }

        System.out.println(count);
    }

    public static int DFS(int[][] grid){
        boolean[] visited=new boolean[grid.length];
        int count=0;
        for(int i=0;i<grid.length;i++){
            if(!visited[i]){
                count++;
                dfs(i,grid,visited);
            }
        }
        return count;
    }

    public static void dfs(int i,int[][] grid,boolean[] visited){
        visited[i]=true;
        for(int j=0;j<grid.length;j++){
            if(!visited[j] && grid[i][j]==1){
                dfs(j,grid,visited);
            }
        }
    }

    /*public static int findCircleNum(int rows,int cols, int[][] M) {
        List<>
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <cols ; j++) {
                if(i<j){
                     if(M[i][j]==1){

                     }

                }else {
                    continue;
                }
            }
        }

    }*/
}
