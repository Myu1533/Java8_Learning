package reflection.toys;

/**
 * @author Man Yu
 * @version 2023/1/17
 * @email manyu@hongtastock.com
 */
interface HasBatteries{}
interface Waterproof{}
interface Shoots{}

class Toy {
    public Toy(){}
    public Toy(int i) {}
}

class FancyToy extends Toy implements HasBatteries,Waterproof,Shoots {
    public FancyToy() {
        super(1);
    }
}

public class ToyTest {
    static void printInfo(Class cc) {
        System.out.println("Class name: " + cc.getName() + " is interface? [" + cc.isInterface() + "]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Canonical name: " + cc.getCanonicalName());
    }

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Class c = null;
        try{
            c = Class.forName("reflection.toys.FancyToy");
        }catch (ClassNotFoundException e) {
            System.out.println("Can't find FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for(Class face : c.getInterfaces()) {
            printInfo(face);
        }
        Class up = c.getSuperclass();
        Object obj = null;
        try{
            obj = up.newInstance();
        }catch (Exception e) {
            throw new RuntimeException("Cannot instantiate");
        }
        printInfo(obj.getClass());
    }
}
