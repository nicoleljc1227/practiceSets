package huawei;


import java.util.Scanner;

/**
 * Created by xl on 2017/4/10.
 * 大小写字母相差32 可以直接(char)c-1-32  (char)c+1+32
 * 可以不用生命接口
 * 还可以枚举吧所有字符对应的解密字符列出来
 * public static final String str1 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
 public static final String str2 = "BCDEFGHIJKLMNOPQRSTUVWXYZAbcdefghijklmnopqrstuvwxyza1234567890";
 */
public class num_29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            char[] auc = str1.toCharArray();
            char[] pass = str2.toCharArray();

            char[] res = new char[auc.length];
            char[] pass_res = new char[pass.length];
            EncrptyUn encrptyUn = new Process();
            encrptyUn.Encrypt(auc,res);
            encrptyUn.unEncrypt(pass,pass_res);


        }
    }

    interface EncrptyUn{
        void Encrypt (char aucPassword[], char aucResult[]);
        int unEncrypt (char result[], char password[]);
    }

    static class Process implements EncrptyUn{

        @Override
        public void Encrypt(char[] aucPassword, char[] aucResult) {
            for (int i = 0; i < aucPassword.length; i++) {
                if(aucPassword[i]>='0'&&aucPassword[i]<'9'){
                    aucResult[i] = (char) (aucPassword[i]+1);
                }else if(aucPassword[i]=='9'){
                    aucResult[i] = '0';
                }else if(Character.isLetter(aucPassword[i])){
                    if(aucPassword[i]=='Z'||aucPassword[i]=='z'){//为最后一个字母时候
                        aucPassword[i] = (char) (aucPassword[i]-25);
                    }else {
                        aucPassword[i]++;
                    }

                    if(Character.isLowerCase(aucPassword[i])){
                        aucResult[i]= Character.toUpperCase(aucPassword[i]);
                    }else {
                        aucResult[i] = Character.toLowerCase(aucPassword[i]);
                    }
                }else {
                    aucResult[i] = aucPassword[i];
                }
            }
            for (int i = 0; i < aucResult.length; i++) {
                System.out.print(aucResult[i]);
            }
            System.out.println();
        }

        @Override
        public int unEncrypt(char[] result, char[] password) {
            for (int i = 0; i < result.length; i++) {
                if(result[i]>'0'&&result[i]<='9'){
                    password[i] = (char) (result[i]-1);
                }else if(result[i]=='0'){
                    password[i] = '9';
                }else if(Character.isLetter(result[i])){
                    if(result[i]=='A'||result[i]=='a'){//为最后一个字母时候
                        password[i] = (char) (result[i]+25);
                    }else {
                        result[i]--;
                    }

                    //result[i]--;
                    if(Character.isLowerCase(result[i])){
                        password[i]= Character.toUpperCase(result[i]);
                    }else {
                        password[i] = Character.toLowerCase(result[i]);
                    }
                }else {
                    password[i] = result[i];
                }
            }
            for (int i = 0; i < password.length; i++) {
                System.out.print(password[i]);
            }

            return 0;
        }
    }
}
