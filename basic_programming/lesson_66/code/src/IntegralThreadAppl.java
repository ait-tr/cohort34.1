package ait.integral;

import ait.integral.task.SumRectangles;

import java.util.Arrays;

public class IntegralThreadAppl {
    private static final int N_TASKS = 10_000;
    private static final double A = 0;
    private static final double B = 3;
    private static final int N_PARTS = 1_000_000;

    public static void main(String[] args) throws InterruptedException {
        SumRectangles[] tasks = new SumRectangles[N_TASKS];
        for (int i = 0; i < tasks.length; i++) {
            tasks[i] = new SumRectangles(A, B, x -> x * x, N_PARTS, N_TASKS, i);
        }
        long t1 = System.currentTimeMillis();
        Thread[] threads = new Thread[N_TASKS];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(tasks[i]);
            threads[i].start();
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
        }
        long t2 = System.currentTimeMillis();
        System.out.println("Duration = " + (t2 - t1));
        double res = Arrays.stream(tasks).mapToDouble(SumRectangles::getResult).sum();
        System.out.println("Result = " + res);
    }
}
