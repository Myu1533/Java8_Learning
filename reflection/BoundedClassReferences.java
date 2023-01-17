package reflection;

/**
 * @author Man Yu
 * @version 2023/1/17
 * @email manyu@hongtastock.com
 */
public class BoundedClassReferences {
    public static void main(String[] args) {
        Class<? extends Number> bounded = int.class;
        bounded = double.class;
        bounded = Number.class;
        // ...其他任何继承于Number的类
    }
}
