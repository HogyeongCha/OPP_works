package week12.LA4;

public class DeadlockThreeThreadsResolved {
    private static final Object LockA = new Object();
    private static final Object LockB = new Object();
    private static final Object LockC = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            lockInOrder("Thread 1", LockA, LockB, null);
        });

        Thread t2 = new Thread(() -> {
            lockInOrder("Thread 2", LockA, LockB, LockC);
        });

        Thread t3 = new Thread(() -> {
            lockInOrder("Thread 3", LockA, LockC, null);
        });

        t1.start();
        t2.start();
        t3.start();
    }

    private static void lockInOrder(String threadName, Object lock1, Object lock2, Object lock3) {
        synchronized (lock1) {
            System.out.println(threadName + ": " + getLockName(lock1) + " acquired");
            sleep();

            if (lock2 != null) {
                synchronized (lock2) {
                    System.out.println(threadName + ": " + getLockName(lock2) + " acquired");
                    sleep();

                    if (lock3 != null) {
                        synchronized (lock3) {
                            System.out.println(threadName + ": " + getLockName(lock3) + " acquired");
                            sleep();
                        }
                    }
                }
            }
        }
    }

    private static void sleep() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static String getLockName(Object lock) {
        if (lock == LockA) return "LockA";
        if (lock == LockB) return "LockB";
        if (lock == LockC) return "LockC";
        return "UnknownLock";
    }
}