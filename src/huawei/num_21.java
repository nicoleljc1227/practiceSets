package huawei;

import java.util.Scanner;

/**
 * Created by xl on 2017/5/24.
 */
public class num_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String key = sc.nextLine();
            String res = "";
            for (int i = 0; i < key.length(); i++) {
                char item = key.charAt(i);
                if (item=='a'||item=='b'||item=='c'){
                    res +="2";
                }
                else if (item=='d'||item=='e'||item=='f'){
                    res +="3";
                }
                else if (item=='g'||item=='h'||item=='i'){
                    res +="4";
                }
                else if (item=='j'||item=='k'||item=='l'){
                    res +="5";
                }
                else if (item=='m'||item=='o'||item=='n'){
                    res +="6";
                }
                else if (item=='p'||item=='q'||item=='r'||item=='s'){
                    res +="7";
                }
                else if (item=='t'||item=='u'||item=='v'){
                    res +="8";
                }
                else if (item=='w'||item=='x'||item=='y'||item=='z'){
                    res +="9";
                }
                else if (item=='p'||item=='q'||item=='r'||item=='s'){
                    res +="7";
                }
                else if (Character.isUpperCase(item)){
                    if (item=='Z'){
                        item = 'a';
                    }else {
                        item = (char) (item+33);
                    }
                    res+=item;
                }else {
                    res+=item;
                }
// if(str.charAt(i)>='A'&&str.charAt(i)<='Z')s[i]=(char)((s[i]+32+1-'a')%26+'a')
            }
            System.out.println(res);

        }
    }
}
