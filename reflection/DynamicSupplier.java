package reflection;

import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @author Man Yu
 * @version 2023/1/17
 * @email manyu@hongtastock.com
 */
class ID {
    private static long counter;
    private final long id = counter++;
    @Override public String toString() {
        return Long.toString(id);
    }

    public ID() {}
}
public class DynamicSupplier<T> implements Supplier<T> {
    private Class<T> type;
    public DynamicSupplier(Class<T> type) {
        this.type = type;
    }

    @Override public T get() {
        try {
            return type.getConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Stream.generate(new DynamicSupplier<>(ID.class)).skip(10).limit(5).forEach(System.out::println);
    }
}
