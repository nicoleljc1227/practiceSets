package zhenti2017.wangyi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by xl on 2017/6/16.
 */
public class num3 {
    static class Node{
        int x;
        int y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//注意while处理多个case
            int n=in.nextInt();
            int[] x=new int[n];
            int[] y=new int[n];
            for(int i=0;i<n;i++){
                x[i]=in.nextInt();
            }
            for(int i=0;i<n;i++){
                y[i]=in.nextInt();
            }

            print(x,y);
        }
        in.close();

    }


    //得到类中心
    public static Node getCentre(List<Node> nodes) {
        int x=0;
        int y=0;
        for(Node n:nodes){
            x+=n.x;
            y+=n.y;
        }
        int size=nodes.size();
        return new Node(x/size,y/size);
    }
    //得到距离
    public static int getDis(List<Node> nodes, Node centre) {
        int distance=0;
        for(Node n:nodes){
            int xd=n.x>centre.x?n.x-centre.x:centre.x-n.x;
            int yd=n.y>centre.y?n.y-centre.y:centre.y-n.y;
            distance+=xd+yd;
        }
        return distance;
    }
    public static int getDis(Node n,Node centre) {
        int xd=n.x>centre.x?n.x-centre.x:centre.x-n.x;
        int yd=n.y>centre.y?n.y-centre.y:centre.y-n.y;
        return xd+yd;
    }


    public static int compute(List<Node> ls,int num){
        if(num<2) return 0;
        List<Node> result=new LinkedList<>();
        int count=num;
        for(Node n:ls){
            result.add(n);
            count--;
            if(count<1) break;
        }
        //迭代加入新点，去掉最远的点
        for(int i=num,j=ls.size();i<j;i++){
            result.add(ls.get(i));
            Node centre=getCentre(result);
            int max=getDis(result.get(0), centre);
            int z=0;
            int index=z;
            for(Node nn:result){
                int rr=getDis(nn, centre);
                if(rr>max){
                    max=rr;
                    index=z;
                }
                z++;
            }
            //去掉离得最远的
            result.remove(index);
        }

        return getDis(result, getCentre(result));
    }

    public static void print(int[] x,int[] y){
        List<Node> list=new ArrayList<>();
        for(int i=0,j=x.length;i<j;i++){
            list.add(new Node(x[i], y[i]));
        }
        StringBuffer sb=new StringBuffer();
        for(int i=1,j=x.length;i<j;i++){
            sb.append(compute(list, i)+" ");
        }
        sb.append(compute(list, x.length)+"");
        System.out.println(sb.toString());
    }


}
