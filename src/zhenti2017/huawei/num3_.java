package zhenti2017.huawei;

import java.util.Scanner;

/**
 * Created by xl on 2017/9/24.
 */
public class num3_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str1 = sc.nextLine();
            String str1_ = sc.nextLine();
            String str2 = sc.nextLine();
            String str2_ = sc.nextLine();

            String[] s1 = str1.split(".");
            String[] s1_ = str1.split(".");
            String[] s2 = str1.split(".");
            String[] s2_ = str1.split(".");


            boolean flag = false;
            for (int i = 0; i < s1.length; i++) {
                if (!((Integer.valueOf(s2[i]) < Integer.valueOf(s1[i] )&&Integer.valueOf(s2_[i])< Integer.valueOf(s1[i]))
                        || ((Integer.valueOf(s2[i] )> Integer.valueOf(s1_[i] )&& Integer.valueOf(s2_[i])>Integer.valueOf(s1_[i]))))) {
                    flag = false;
                    break;
                }
                flag = true;
            }
            if(flag){
                System.out.println("No Overlap IP");
            }else {
                System.out.println("Overlap IP");
            }

        }

    }
}
