package huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by xl on 2017/3/30.
 */
public class num_2 {
    public static void main(String[] args) {
        String str = null;
        char ch=' ';
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in ));//可以接受空格
        try{
            str = br.readLine();
            ch = (char) br.read();
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(WordCount(str,ch));

    }
    public static int WordCount(String str,char ch){
        int count = 0;
        if (Character.isLowerCase(ch)){
            str = str.toLowerCase();
        }
        if (Character.isUpperCase(ch)){
            str = str.toUpperCase();
        }
        for (int i = 0; i < str.length() ; i++) {
            if (str.charAt(i)==ch)
            {
                count+=1;
            }
        }
        return count;


    }
}
