public class Demo03 {
    public static void main(String[] args) {
     /*   new Thread(){           //使用Thread类的方式实现多线程
            public void run(){
                for (int i = 0; i < 1000; i++) {
                    System.out.println("执行run方法");
                }
            }
        }.start();
    */
        new Thread(new Runnable() {         //第二种方式：实现Runnable接口
            @Override
            public void run() {
                for (int i = 0; i <1000 ; i++) {
                    System.out.println("执行run方法");
                    System.out.println("修改了一行代码");
                    System.out.println("我又修改了一行代码");
                }
            }
        }).start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("执行主方法");
        }
    }
}
