
class Myexception extends Exception {
    public Myexception(String msg) {
        super(msg);
    }
}

public class Ownexception {
    static void Check_Age(int x) throws Exception {
        if (x < 18) {
            throw new Myexception("under age");
        } else {
            System.out.println("Lawful to drink");
        }
    }

    public static void main(String[] args) {
        try {
            Check_Age(78);
        } catch (Exception e) {
            System.out.println("caught error");
            System.out.println(e);
        }
    }
}