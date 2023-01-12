package ru.itsjava.threads.hw;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

@AllArgsConstructor
public class PrinterThreadHW extends Thread {

    private final long delay;

    @SneakyThrows
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            Thread.sleep(delay);
            System.out.print(i + " ");
        }
    }
}
