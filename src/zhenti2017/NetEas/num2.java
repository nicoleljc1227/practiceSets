package zhenti2017.NetEas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by xl on 2017/9/8.
 */
public class num2 {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            while (sc.hasNext()) {
                String str = sc.nextLine();

                char[] chars = str.toCharArray();
                int len = chars.length;
                int count = 1;
                int flag = 1;

                ArrayList list = new ArrayList();
                for (int i = 1; i <len ; i++) {
                    if(chars[i]==chars[i-1]){
                        count++;
                    }else {
                        flag++;
                        list.add(count);
                        count=1;
                    }
                    if(count==1){
                        list.add(count);
                    }
                }

                int sum = 0;
                for (int i = 0; i <list.size() ; i++) {
                    sum+=(int)list.get(i);
                }
                System.out.println((float) sum/flag);



            }

    }

}
