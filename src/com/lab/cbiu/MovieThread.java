package com.lab.cbiu;

public class MovieThread {

    public static void main(String[] args) {

        Thread thread = new Thread(){
            @Override
            public void run() {

                // write you code here
                for (int i= 0; i <= 10; i++)
                {
                    System.out.println("Printing "+i);
                    try {
                        sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        };
        // it will help to you to start thread
        thread.start();


    }

}
