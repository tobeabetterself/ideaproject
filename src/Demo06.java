public class Demo06 {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            public void run(){
                for (int i = 0; i < 10; i++) {
                    System.out.println(getName()+"执行中。。。");
                }
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                for (int i = 0; i < 50; i++) {
                    if(i==2) {
                        try {
                            //t1.join();
                            t1.join(30);    //插入指定的时间
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(getName()+"执行了。。。");
                }
            }
        };
        t1.start();
        t2.start();
    }
}
