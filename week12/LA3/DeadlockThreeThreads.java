package week12.LA3;

public class DeadlockThreeThreads {
    private static final Object LockA = new Object();
    private static final Object LockB = new Object();
    private static final Object LockC = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (LockA) {
                System.out.println("Thread 1: LockA acquired");
                sleep();
                System.out.println("Thread 1: Attempting to acquire LockB");
                synchronized (LockB) {
                    System.out.println("Thread 1: LockB acquired");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (LockB) {
                System.out.println("Thread 2: LockB acquired");
                sleep();
                System.out.println("Thread 2: Attempting to acquire LockC");
                synchronized (LockC) {
                    System.out.println("Thread 2: LockC acquired");
                }
            }
        });

        Thread t3 = new Thread(() -> {
            synchronized (LockC) {
                System.out.println("Thread 3: LockC acquired");
                sleep();
                System.out.println("Thread 3: Attempting to acquire LockA");
                synchronized (LockA) {
                    System.out.println("Thread 3: LockA acquired");
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();
    }

    private static void sleep() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}