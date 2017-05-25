package huawei;

import java.util.Scanner;

/**
 * Created by xl on 2017/5/24.
 */
public class num_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            int empty;
            int water=0;
            int mod;
            empty = sc.nextInt();

            while(empty>=2){
                if(empty==2){
                    water+=1;
                    break;
                }else {
                    water += empty/3;
                    mod = empty%3;
                    empty = empty/3+mod;
                }
            }
            System.out.println(water);


        }
    }
}
