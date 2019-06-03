class MyThread extends Thread{  //1,创建thread类的子类
    public void run(){          //2,重写run方法
        for(int i =0;i<1000;i++){
            System.out.println("执行run方法");  //将需要执行的代码写入run方法中
        }

    }
}

public class Demo01{
    public static void main(String[] args) {
        MyThread mt = new MyThread();   //4,创建thread类的子类对象
        mt.start();     //5,开启线程
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程执行");
        }
    }
}
