package objects;

//import onjava.*;

class Book {
    boolean checkedOut = false;
    Book(boolean checkOut) {
        checkedOut = checkOut;
    }

    void checkIN() {
        checkedOut = false;
    }

    @SuppressWarnings("deprecation")
    @Override
    public void finalize() {
        if(checkedOut) {
            System.out.println("Error: checked out");
        }
    }
}

public class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);

        novel.checkIN();
        new Book(true);
        System.gc();
//        new Nap(1);
    }
}
