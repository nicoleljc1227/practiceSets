package zhenti2017.NetEas;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by xl on 2017/9/8.
 */
public class num3 {


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String res = process(str);
            System.out.println(res);
        }
    }
    public static String process(String s) {
        char[] arr=s.toCharArray();
        List<Integer> ls=new ArrayList<>();
        int num=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                ls.add(num);
                num=1;
            }
            else {
                num++;
            }
        }
        ls.add(num);
        int result=0;
        for(int i:ls){
            result+=i;
        }
        DecimalFormat df=new DecimalFormat("#.00");
        return df.format((result+0.001)/ls.size());
    }


}
