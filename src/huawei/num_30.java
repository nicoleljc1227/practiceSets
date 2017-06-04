//package huawei;
//
//import java.util.*;
//
///**
// * Created by xl on 2017/6/4.
// */
//public class num_30 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            String str1 = sc.next();
//            String str2 = sc.nextLine();
//            str1 = str1+str2;
//            char[] arr = str1.toCharArray();
//
//            List list1 = new ArrayList();
//            List list2 = new ArrayList();
//
//            for (int i = 0; i <arr.length ; i++) {
//                if(i%2==0){
//                    list1.add(arr[i]);
//                }else {
//                    list2.add(arr[i]);
//                }
//            }
//            Collections.sort(list1);
//            Collections.sort(list2);
//            StringBuffer sb = new StringBuffer();
//            for (int i = 0; i < list1.size(); i++) {
//                sb.insert(i*2,list1.get(i));
//            }
//            for (int i = 0; i < list2.size(); i++) {
//                sb.insert(i*2+1,list2.get(i));
//            }
//            str1 = sb.toString();
//            char[] arr1 = str1.toCharArray();
//            String bin;
//            for (int i = 0; i < arr1.length; i++) {
//                if(arr1[i]>='0'&&arr1[i]<='9'){
//                    bin  = Integer.toBinaryString(arr1[i]);
//                    StringBuffer cur = new StringBuffer(bin);
//                    cur.reverse();
//                    str1 = Integer.valueOf(cur.toString(),2).toString();
//                    String hex = Integer.toHexString(Integer.parseInt(str1));
//                    //arr1[i] = hex;
//                }
//            }
//
//            }
//        }
//    }
//}
