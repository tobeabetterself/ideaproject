public class Demo05 {
    public static void main(String[] args) throws InterruptedException {
        new Thread(){
            public void run(){
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"执行");
                }
            }
        }.start();

        new Thread(){
            public void run(){
                for(int i =0;i<10;i++){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"执行了");
                }
            }
        }.start();
    }
}
