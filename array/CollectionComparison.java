package array;

import java.util.ArrayList;
import java.util.function.Supplier;

/**
 * @author Man Yu
 * @version 2023/1/16
 * @email manyu@hongtastock.com
 */
class BerylliumSphere {
    private static long counter;
    private final long id = counter++;
    @Override
    public String toString() {
        return "Sphere " + id;
    }
}
public class CollectionComparison {
    public static void main(String[] args) {
        BerylliumSphere[] spheres = new BerylliumSphere[10];
        for(int i = 0; i < 5; i++) {
            spheres[i] = new BerylliumSphere();
        }
//        show(spheres);
//        System.out.println(spheres[4]);
//
//        List<BerylliumSphere> sphereList = Suppliers.create(ArrayList::new, BerylliumSphere::new, 5);
//        System.out.println(sphereList);
//        System.out.println(sphereList.get(4));
    }
}
