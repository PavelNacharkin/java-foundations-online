package ru.itsjava.threads.hw;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

@AllArgsConstructor
public class PrinterRunnableHW implements Runnable {

        private final long delay;

    @SneakyThrows
    @Override
    public void run() {
        for (int i = 5; i >= 0; i--) {
            Thread.sleep(delay);
            System.out.print(i+ " ");
        }
    }
}
