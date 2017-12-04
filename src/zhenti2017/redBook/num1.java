package zhenti2017.redBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by xl on 2017/9/28.
 */
public class num1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            str = str.replaceAll("RED","");
            long res = -2;
            boolean flag = true;
            StringBuffer sb = new StringBuffer();
            List<String> list = new ArrayList<>();
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if(Character.isDigit(c)){
                    sb.append(c);
                    flag=true;
                } else {
                    flag=false;
                    String s = sb.toString();
                    if(s.length()>0){
                        list.add(s);
                    }
                    sb.setLength(0);
                }
            }
            if(flag){//最后一串数字要记得加
                list.add(sb.toString());
            }
            for (String e:list){
                if(e.charAt(0)=='0'){
                    e = e.substring(1,e.length());
                }
                long ie = Long.valueOf(e);
                if(ie>res){
                    res = ie;
                }
            }
            if(res!=-2){
                System.out.println(res);

            }else {
                System.out.println(-1);
            }
        }
    }
}
