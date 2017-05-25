package huawei;

import java.util.Scanner;

/**
 * Created by xl on 2017/5/24.
 */
public class num_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1;
        String str2;
        while(sc.hasNext()) {
            String key = sc.next();
            int count1 = 0;
            int count2= 0;
            int count3 = 0;
            int count4 = 0;
            int count =0;
            char[] keys = key.toCharArray();
            for(Character c: keys){
                if(c>='a'&&c<='z'){
                    count1=1;
                }
                else if(c>='A'&&c<='Z'){
                    count2=1;
                }
                else if(c>='0'&&c<='9'){
                    count3=1;
                }
                else {
                    count4=1;
                }
            }

            for (int i = 0; i <= key.length()-3; i++) {
                str1 = key.substring(i,i+3);
                for (int j = i+1; j <= key.length()-3 ; j++) {
                    str2 = key.substring(j,j+3);
                    if(str1.equals(str2)){
                        count=1;
                        break;
                    }
                }

            }
            System.out.println(key);

            if (key.length()<8){

                System.out.println("NG1");
            }else if((count1+count2+count3+count4)<3){
                System.out.println("NG2");
            }else if (count==1){
                System.out.println("NG3");
            }else {
                System.out.println("OK");
            }

        }
    }
}
