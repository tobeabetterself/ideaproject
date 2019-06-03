public class Demo07 {
    public static void main(String[] args) {
        Print p = new Print();
        new Thread(){
            public void run(){
                for (int i = 0; i < 500; i++) {
                    p.print1();
                }
            }
        }.start();

        new Thread(){
            public void run(){
                for (int i = 0; i < 500; i++) {
                    p.print2();
                }
            }
        }.start();
    }
}
class Print{
    Object obj = new Object();
    public static synchronized void print1(){
        System.out.print("黑");
        System.out.print("马");
        System.out.print("程");
        System.out.print("序");
        System.out.print("员");
        System.out.println();
    }

    public void print2(){
        synchronized (Print.class){
            System.out.print("传");
            System.out.print("智");
            System.out.print("播");
            System.out.print("客");
            System.out.println();
        }
    }
}
