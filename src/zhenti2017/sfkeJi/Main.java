package zhenti2017.sfkeJi;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void process(int x) {
        LinkedList<Integer> ls=parse(x);
        int result=0;
        while(!ls.isEmpty()){
            int a=ls.removeFirst();
            if(a<4){
                result+=(int)(Math.pow(2.0, ls.size()+1)-2+0.01)%(1000000000+7);
                break;
            }
            else if (a>7) {
                result+=(int)(Math.pow(2.0, ls.size()+2)-2+0.01)%(1000000000+7);
            }
            else {
                if(a==4) result+=(int)(Math.pow(2.0, ls.size())+0.01)%(1000000000+7);
                else result+=(int)(Math.pow(2.0, ls.size())+0.01)*2%(1000000000+7);
            }
        }
        result=result%(1000000000+7);
        System.out.println(result);
        ls.clear();
    }

    public static LinkedList<Integer> parse(int x){
        LinkedList<Integer> ls=new LinkedList<>();
        while(x>0){
            ls.addFirst(x%10);//可以把一整串数字128907657添加进来
            x=x/10;
        }
        return ls;
    }


    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            process(in.nextInt());
        }
        in.close();
    }

}

