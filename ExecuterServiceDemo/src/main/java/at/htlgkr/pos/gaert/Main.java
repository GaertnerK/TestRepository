package at.htlgkr.pos.gaert;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        ArrayList<Runnable> tasks = new ArrayList<Runnable>();
        tasks.add(() -> System.out.println("A: " + System.currentTimeMillis()));
        tasks.add(() -> System.out.println("B: " + System.currentTimeMillis()));
        tasks.add(() -> System.out.println("C: " + System.currentTimeMillis()));
        tasks.add(() -> System.out.println("D: " + System.currentTimeMillis()));
        tasks.add(() -> System.out.println("E: " + System.currentTimeMillis()));
        tasks.add(() -> System.out.println("F: " + System.currentTimeMillis()));
        tasks.add(() -> System.out.println("G: " + System.currentTimeMillis()));
        tasks.add(new RunnableTask("H"));

        tasks.forEach(executorService::execute);
        executorService.shutdown();
    }
}