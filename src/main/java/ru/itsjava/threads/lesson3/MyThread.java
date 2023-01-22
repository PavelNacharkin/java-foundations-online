package ru.itsjava.threads.lesson3;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MyThread extends Thread {

    private final int num;
    private final ThreadPractice threadPractice;

    @Override
    public void run() {
        threadPractice.printNum(num);

    }
}
