public class Demo02 {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        new Thread(mr).start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("主方法执行了");
        }
    }
}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("run方法执行了");
        }
    }
}
