package hiding;

class Sundae {
    private Sundae() {}

    static Sundae MakeASundae() {
        return new Sundae();
    }
}

public class IceCream {
    public static void main(String[] args) {
        Sundae x = Sundae.MakeASundae();
    }
}
