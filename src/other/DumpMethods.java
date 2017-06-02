package other;
import java.lang.reflect.*;
/**
 * Created by Administrator on 2017/6/2.
 */
public class DumpMethods {
    public static void main(String[] args) {
        int x = 8;
        int y =x>>3;
        try {
            Class c=Class.forName(args[0]);
            Method m[]=c.getDeclaredMethods();
            for (int i = 0; i < m.length; i++) {
                System.out.println(m[i].toString());
            }
        } catch (Throwable e) {
            System.err.println(e);
        }
    }
}
