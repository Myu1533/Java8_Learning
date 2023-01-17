package reflection;

/**
 * @author Man Yu
 * @version 2023/1/17
 * @email manyu@hongtastock.com
 */
public class GenericClassReferences {
    public static void main(String[] args) {
        // 在不指定泛型类的引用的时候，类变量可以重新赋值，在指定了泛型类的引用以后，就不可以重新赋值为其他类对象
        // Class intClass = int.class;
        // 申明一个不具体指明类型的类变量
        Class<?> intClass = int.class;
        intClass = double.class;
        Class<Integer> genericIntClass = int.class;
        genericIntClass = Integer.class;
    }
}
