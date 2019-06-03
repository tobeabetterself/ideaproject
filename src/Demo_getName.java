public class Demo_getName {
    public static void main(String[] args) {
        new Thread("张无忌"){
            public void run(){
                System.out.println(this.getName()+"线程执行了");
            }
        }.start();

        new Thread(){
            public void run(){
                this.setName("赵敏");
                System.out.println(this.getName()+"线程执行了");
            }
        }.start();

        Thread t =new Thread(){
          public void run(){
              System.out.println(this.getName()+"线程执行了");
          }
        };
        t.setName("金毛狮王");
        t.start();
    }
}
