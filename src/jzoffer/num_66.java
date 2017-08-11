package jzoffer;

import java.util.Scanner;

/**机器人运动范围
 * Created by xl on 2017/6/15.
 */
public class num_66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int rows = sc.nextInt();
            int cols = sc.nextInt();
            int res = movingCount(n,rows,cols);
            System.out.println();

        }
    }


    public static int movingCount(int threshold, int rows, int cols)
    {
        boolean[][] visited = new boolean[rows][cols];//是否访问过

        return countSteps(threshold,cols,0,rows,0,visited);


    }

    //static int down = 0,up=0,left=0,right=0;

    //使用递归的方法 递归遍历
    public static int countSteps(int limit,int cols,int c,int rows,int r,boolean[][] visited){

        if(c>=cols||c<0||r<0||r>=rows||visited[r][c]||(bitSum(c)+bitSum(r)>limit)){//如果坐标 r,c超过边界且被访问过 并且不符合条件则返回
            return 0;
        }
        visited[r][c] = true;
        //从四个方向出发 分别统计的步数

        return countSteps(limit,cols,c,rows,r-1,visited)
                +countSteps(limit,cols,c-1,rows,r,visited)
                +countSteps(limit,cols,c,rows,r+1,visited)
                +countSteps(limit,cols,c+1,rows,r,visited)+1;

    }

    public static int bitSum(int t){//求出坐标每一位的数字 的合
        int count=0;
        while (t!=0){
            count+=t%10;
            t/=10;
        }
        return count;
    }



}
