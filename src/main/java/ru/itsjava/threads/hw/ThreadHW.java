package ru.itsjava.threads.hw;

public class ThreadHW {

    public static void main(String[] args) throws InterruptedException {

        PrinterThreadHW printerThreadHW = new PrinterThreadHW(1000l);

        PrinterRunnableHW printerRunnableHW = new PrinterRunnableHW(1000L);
        Thread thread = new Thread(printerRunnableHW);

        System.out.print("Start" + " ");
        thread.start();
        printerThreadHW.start();
        printerThreadHW.join();
        System.out.println("End");


        String[] message = new String[]{"Программа ", "которая ", "выводит сообщения ", "каждые ", "5 ", "секунд"};
        MyProgram myProgram = new MyProgram(message, 5000L);
        Thread program = new Thread(myProgram);
        program.start();
    }
}
