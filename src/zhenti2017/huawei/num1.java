package zhenti2017.huawei;

import java.util.Scanner;

/**
 * Created by xl on 2017/9/24.
 */
public class num1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String str = sc.nextLine();
            int len = 0;


            StringBuilder sb = new StringBuilder();
            char first = str.charAt(0);
            if(first=='-'){
                len = str.length()-1;
            }else {
                len = str.length();
            }
            System.out.println(len);

            if(first=='-'){
                System.out.print(first);
            }

            for (int i = 0; i <str.length() ; i++) {
                char c = str.charAt(i);
                if(i==str.length()-1){
                        System.out.println(c);
                        sb.append(c);

                }else {
                    if(c!='-'){
                        System.out.print(c+" ");
                        sb.append(c);
                    }
                }

            }
            String res = sb.reverse().toString();

            if(first=='-'){
                System.out.print(first);
            }
            System.out.println(res);
        }


    }
}
