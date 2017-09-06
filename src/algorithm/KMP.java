package algorithm;

/**
 * Created by xl on 2017/9/6.
 */
public class KMP {
    public static void main(String[] args) {

        String str = "ABCDABD";
        char[] tarchars = str.toCharArray();
        int[] next = new int[tarchars.length];
        String str1 = "BBCABCDABABCDABCDABDE";
        char[] chars = str1.toCharArray();
        System.out.println(kmp(next,chars,tarchars));
    }

    /**
     * 计算部分匹配表，放入next[]数组，数组下标指向字符串字符下标
     * @param next
     * @param chas
     * 只有找到一个子串且该子串的头字符和尾字符相等才会有共同前缀串
     */
    public static  void makeNext(int[] next, char[] chas){
        //求出匹配字符串里每一位字符对应的最大相同前后缀的长度
        next[0] = 0;//模版字符串的第一个字符的最大前后缀长度为0
        int pos, maxSubLen;
        int len = chas.length;
        for (pos = 1, maxSubLen=0; pos <len; pos++) {
            while (maxSubLen>0&& chas[pos]!=chas[maxSubLen]){//递归求出chas[0]到chas[pos]的最大相同的前后缀长度K
                maxSubLen = next[maxSubLen-1];//如果不相等
            }
            if(chas[pos]==chas[maxSubLen]){//直接检查这个子串的当前位置和第0位是否相等，如果不相等那肯定是不会有相同的前后缀
                //"ABCD"的前缀为[A, AB, ABC]，后缀为[BCD, CD, D]，共有元素的长度为0；
                maxSubLen++;
            }
            next[pos] = maxSubLen;
        }
    }

    /**
     *
     * @param next next数组
     * @param chars 字符串
     * @param targetChars 目标匹配字符串
     * 返回目标字符串在字符串中的匹配位置
     */
    public static int kmp(int[] next,char[] chars,char[] targetChars){

        int len = chars.length;
        int tarLen = targetChars.length;
        int i,j;
        makeNext(next,targetChars);
        for (i = 0,j=0;  i<len ; i++) {
            while (j>0&&chars[i]!=targetChars[j]){//j不为0 说明之前至少匹配了一个字符，
                //已经匹配字符数-匹配值=移动位数 移动后的j就是next[j-1]
                j = next[j-1];
            }
            if(targetChars[j] == chars[i]){
                j++;
            }
            if(j==tarLen){
                System.out.println("匹配位置："+(i-tarLen+1));
            }
        }
        return (i-tarLen+1);
    }
}
