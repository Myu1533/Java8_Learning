package reflection.toys;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Man Yu
 * @version 2023/1/17
 * @email manyu@hongtastock.com
 */
public class GenericToyTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<FancyToy> ftc = FancyToy.class;
        FancyToy fancyToy = ftc.getConstructor().newInstance();
        Class<? super FancyToy> up = ftc.getSuperclass();
        Object obj = up.getConstructor().newInstance();
    }
}
