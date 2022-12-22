interface it {
    void display();
}

interface it2 {
    void shape();
}

public class interfacing {
    public static void main(String[] args) {
        it3 obj = new it3();
        it3 obj2 = new it3();
        obj.move_forward();
        obj.display("Im obj 1");
        obj2.display("Im obj 2");
    }

}

class it3 implements it, it2 {
    public void display(String str) {
        System.out.println(str);
    }

    public void shape() {
        System.out.println("Its round");
    }

    public void move_forward() {
        System.out.println("Moving forward");
    }
}
