package ru.netology.AndreyS;

public class Main {

    public static void main(String[] args) {

        Worker.OnTaskDoneListener listener = System.out::println;
        Worker.OnTaskErrorListener errorListener = System.out::println;

        Worker worker = new Worker(listener, errorListener);
        worker.x = 33;

        worker.start();
    }
}
