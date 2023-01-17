package collections;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Man Yu
 * @version 2023/1/17
 * @email manyu@hongtastock.com
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            c.add(i);// int i -> 用Integer包装类进行装箱存入Integer集合类c中
        }
        for (Integer i : c) {
            System.out.print(i + ", ");
        }
    }
}
