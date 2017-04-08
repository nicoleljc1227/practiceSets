package huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by xl on 2017/3/30.
 */
public class num_1 {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in ));
        String str=null;
        try{
            str = br.readLine();
        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println(lastWordLength(str));

    }
    public static int lastWordLength(String str){
        int len = 0;
        if (str.length()>0){
            for (int i = str.length()-1; i >=0; i--) {
                if (i==0){
                    len = str.length()-i;
                    break;
                }
                if (str.charAt(i)==' '){
                    len = str.length()-i-1;
                    break;
                }
            }
        }else {
            len = 0;
        }

        return len;
    }
}
