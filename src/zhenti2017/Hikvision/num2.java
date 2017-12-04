package zhenti2017.Hikvision;

import java.util.Scanner;

/**
 * Created by xl on 2017/9/8.
 * 拥有的硬币[1,1,2,2,4,4...2^k,2^k...],输入数字n 求凑成n元有多少方案
 */
public class num2 {

    static class TreeNode{
        char ID;
        char name;
        int pre;
        public TreeNode(char x){name = x;}
    }
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            while (sc.hasNext()) {
                String str = sc.nextLine();
                String[] arrs = str.split(";");


                int[] ids = new int[3];
                char[] names = new char[3];
                int[] pres = new int[3];
                for (int i = 0; i <arrs.length; i++) {
                    String s = arrs[i];
                    char a = s.charAt(0);
                    char b = s.charAt(2);
                    char c = s.charAt(4);
                    for (int j = 0; j <3 ; j++) {
                        ids[j] = a;
                        names[j] = b;
                        pres[j] = c;
                    }
                }
                for (int i = 0; i <arrs.length ; i++) {
                    for (int j = 0; j <3 ; j++) {
                        if(pres[j]==0){
                            //TreeNode root = new TreeNode(pres[j]);

                        }
                    }
                }




            }

    }

    public static TreeNode createTree(String str){
        String[] arrs = str.split(";");
        for (int i = 0; i <arrs.length; i++) {
            String s = arrs[i];
            char a = s.charAt(0);
            char b = s.charAt(2);
            char c = s.charAt(4);


            if(c=='0'){
               TreeNode root = new TreeNode(c);
            }


        }
        return null;
    }

}
