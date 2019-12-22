package cbiu.ac.bd.inheritance;

public class Mythread {

    public static void main(String[] args) {

        Thread thread = new Thread()
        {
            @Override
            public void run() {
                for (int i = 0 ; i < 10; i++)
                {
                    System.out.print(i+"+");
                    try {
                        sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        thread.start();

    }
}
