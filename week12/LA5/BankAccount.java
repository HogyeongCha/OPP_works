package week12.LA5;

import java.util.concurrent.*;
import java.util.concurrent.locks.*;

class BankAccount {
    private double balance = 0.0;
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition sufficientFunds = lock.newCondition();
    private final BlockingQueue<String> logQueue;

    public BankAccount(BlockingQueue<String> logQueue) {
        this.logQueue = logQueue;
    }

    public void deposit(double amount) {
        lock.lock();
        try {
            balance += amount;
            logQueue.offer(Thread.currentThread().getName() + " Deposit: " + amount);
            sufficientFunds.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void withdraw(double amount) {
        lock.lock();
        try {
            while (balance < amount) {
                sufficientFunds.await();
            }
            balance -= amount;
            logQueue.offer(Thread.currentThread().getName() + " Withdrawal: " + amount);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock();
        }
    }

    public double getBalance() {
        lock.lock();
        try {
            return balance;
        } finally {
            lock.unlock();
        }
    }
}