package ThisJava;
public class MyThread extends Thread {
    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
