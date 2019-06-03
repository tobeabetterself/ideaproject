public class Demo_Ticket_Thread {
    public static void main(String[] args) {
        Ticket1 T1 = new Ticket1();
        Ticket1 T2 = new Ticket1();
        Ticket1 T3 = new Ticket1();
        Ticket1 T4 = new Ticket1();
        T1.start();
        T2.start();
        T3.start();
        T4.start();
    }
}

class Ticket1 extends Thread {
    private static int ticket = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (Ticket.class) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (ticket == 0) {
                    break;
                }
                System.out.println(getName() + "卖了" + ticket-- + "号票");
            }
        }
    }
}