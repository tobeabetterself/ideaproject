public class Demo_TicketRunnable {
    public static void main(String[] args) {
        Ticket t = new Ticket();
        new Thread(t).start();
        new Thread(t).start();
        new Thread(t).start();
        new Thread(t).start();
    }
}

class Ticket implements Runnable {
    private static int ticket = 100;

    @Override
    public void run() {
            while (true) {
                synchronized (Ticket.class) {
                if (ticket <= 0) {
                    break;
                }
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "卖了第" + ticket-- + "号票");
            }
        }
    }
}