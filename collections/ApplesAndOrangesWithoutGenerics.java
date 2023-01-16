package collections;

import java.util.ArrayList;

/**
 * @author Man Yu
 * @version 2023/1/16
 * @email manyu@hongtastock.com
 */
class Apple{
    private static long counter;
    private final long id = counter++;
    public long id() { return id; }
}

class Orange {}
public class ApplesAndOrangesWithoutGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }

        // apples.add(new Orange());
        for(Object apple : apples) {
            ((Apple) apple).id();
        }
    }
}
