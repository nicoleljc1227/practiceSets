package huawei;

import java.util.Scanner;
/**
 * Created by xl on 2017/4/14.
 * 将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
 所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
 */
public class num_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            //StringBuffer stringBuffer = new StringBuffer(sc.nextLine());
            String str = sc.nextLine();
            String temp = "";
            //注意第一个单词的时候
            for (int i = str.length()-1; i >=0  ; i--) {
                char ch = str.charAt(i);
                if(ch==' '){
                    if (temp.length()>0){
                        for (int j = temp.length()-1; j >=0 ; j--) {
                            System.out.print(temp.charAt(j));
                        }

                        temp = "";
                    }
                    if (i!=temp.length()){
                        System.out.print(" ");
                    }
                }else if(i==0){
                    System.out.print(ch);
                    if (temp.length()>0){
                        for (int j = temp.length()-1; j >=0 ; j--) {
                            System.out.print(temp.charAt(j));
                        }
                    }
                        temp = "";
                }
                else {
                    temp+=ch;
                }
            }
        }
    }
}
