package collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 * Created by xl on 2017/6/12.
 */
public class PropertiesTest {
    public static void main(String[] args) throws Exception{
        Properties props = new Properties();
        //添加属性
        props.setProperty("username","zzz");
        props.setProperty("password","123456");
        //将key-value保存到a.ini文件中
        props.store(new FileOutputStream("a.ini"),"comment line");
        Properties props2 = new Properties();
        //向Properties添加属性
        props2.setProperty("gender","male");
        //将a.ini文件中的key-value追加到props2中
        props2.load(new FileInputStream("a.ini"));
        System.out.println(props2);

    }
}
