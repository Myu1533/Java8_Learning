package reflection;

import java.util.stream.Stream;

/**
 * @author Man Yu
 * @version 2023/1/17
 * @email manyu@hongtastock.com
 */
public class ID2 {
    private static long counter;
    private final long id = counter++;
    @Override public String toString() {
        return Long.toString(id);
    }

    public static void main(String[] args) {
        Stream.generate(new DynamicSupplier<>(ID2.class)).skip(10).limit(5).forEach(System.out::println);
    }
}
