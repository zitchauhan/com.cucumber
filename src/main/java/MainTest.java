class P {
    void display() {
        System.out.println("Inside class P");
    }
}

class C extends P {
    C() {
        System.out.println("Inside class C");
    }

    void m1() {
        System.out.println("Method m1 in class C");
    }
}

public class MainTest {
    public static void main(String[] args) {
        // Upcasting
        P p1 = new C();  // Upcasting from subclass C to superclass P
        p1.display();    // Accessing method from class P

        // Downcasting
        if (p1 instanceof C) {  // Check if p1 is an instance of class C
            C c1 = (C) p1;      // Downcasting from superclass P to subclass C
            c1.m1();            // Accessing method from class C
        }
    }
}
