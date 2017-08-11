package jzoffer;

import java.util.Scanner;

/**
 * Created by xl on 2017/6/15.
 *
 */
public class num_11_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            String bin = Integer.toBinaryString(n);
            int count = bin.replaceAll("0","").length();
            System.out.println(count);
        }
    }


}
