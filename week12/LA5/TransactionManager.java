package week12.LA5;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class TransactionManager {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> logQueue = new LinkedBlockingQueue<>();
        BankAccount account = new BankAccount(logQueue);

        Runnable depositTask = () -> {
            for (int i = 0; i < 5; i++) {
                double amount = ThreadLocalRandom.current().nextDouble(100, 200);
                account.deposit(amount);
            }
        };

        Runnable withdrawTask = () -> {
            for (int i = 0; i < 5; i++) {
                double amount = ThreadLocalRandom.current().nextDouble(50, 200);
                account.withdraw(amount);
            }
        };

        Runnable balanceCheckTask = () -> {
            for (int i = 0; i < 10; i++) {
                double balance = account.getBalance();
                System.out.println("Check Balance : " + balance);
            }
        };

        Thread depositThread1 = new Thread(depositTask);
        depositThread1.setName("Deposit-1");
        Thread depositThread2 = new Thread(depositTask);
        depositThread2.setName("Deposit-2");
        Thread withdrawThread1 = new Thread(withdrawTask);
        withdrawThread1.setName("Withdrawal-1");
        Thread withdrawThread2 = new Thread(withdrawTask);
        withdrawThread2.setName("Withdrawal-2");
        Thread balanceThread = new Thread(balanceCheckTask);
        balanceThread.setName("Balance-Checker");

        depositThread1.start();
        depositThread1.join();
        depositThread2.start();
        depositThread2.join();
        withdrawThread1.start();
        withdrawThread1.join();
        withdrawThread2.start();
        withdrawThread2.join();
        balanceThread.start();
        balanceThread.join();

        System.out.println("\n Transaction Log:");
        while (!logQueue.isEmpty()) {
            System.out.println(logQueue.poll());
        }
    }
}