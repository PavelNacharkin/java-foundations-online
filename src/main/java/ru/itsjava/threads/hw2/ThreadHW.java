package ru.itsjava.threads.hw2;

public class ThreadHW {

    public static void main(String[] args) {

        Runnable hello = () -> System.out.println("Привет я Runnable");
        Thread thread = new Thread(hello);
        thread.start();


        Runnable wakeUp = () -> {
            for (int i = 0; i < 4; i++) {
                System.out.println("Привет я проснулся после 4 секунд");
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };


        Thread thread1 = new Thread(wakeUp);
        thread1.setDaemon(true);
        thread1.start();
    }
}
