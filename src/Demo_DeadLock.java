public class Demo_DeadLock {
    public static void main(String[] args) {
        String s1 = "左筷子";
        String s2 = "右筷子";

        new Thread("亚里士多德") {
            @Override
            public void run() {
                while (true) {
                    synchronized (s1) {
                        System.out.println(getName()+"拿到左筷子，等待右筷子");
                        synchronized (s2) {
                            System.out.println(getName()+"拿到右筷子，开吃");
                        }
                    }
                }
            }
        }.start();

        new Thread("黑格尔") {
            @Override
            public void run() {
                while (true) {
                    synchronized (s2) {
                        System.out.println(getName()+"拿到右筷子，等待左筷子");
                        synchronized (s1) {
                            System.out.println(getName()+"拿到左筷子，开吃");
                        }
                    }
                }
            }
        }.start();
    }
}
