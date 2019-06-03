public class Demo04 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("我是张无忌线程");
                String str = Thread.currentThread().getName();
                System.out.println(str);
            }
        }).start();
        Thread.currentThread().setName("我是主线程");
        System.out.println(Thread.currentThread().getName());
    }
}
