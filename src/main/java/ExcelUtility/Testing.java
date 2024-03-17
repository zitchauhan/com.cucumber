package ExcelUtility;

public class Testing {

    public static void main(String[] args) {
        Abs an = new Abs();
    }

}

abstract class Vichel {
    int wheel;
    abstract void start();
}

class Abs extends Vichel {

    @Override
    void start() {
        System.out.println("Starting the vehicle");
    }
}
