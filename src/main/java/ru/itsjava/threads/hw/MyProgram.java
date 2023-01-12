package ru.itsjava.threads.hw;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

@AllArgsConstructor
public class MyProgram implements Runnable {
    private final String[] message;
    private final long delay;

    @SneakyThrows
    @Override
    public void run() {
        for (int i = 0; i < message.length; i++) {
            Thread.sleep(delay);
            System.out.print(message[i]);
        }
    }
}
