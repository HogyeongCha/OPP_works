package week15.LA4;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GenericHanoiTower {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of disks: "); // 사용자 편의를 위해 프롬프트 추가
        int n = s.nextInt();

        Tower<Integer> source = new Tower<>("Source");
        Tower<Integer> auxiliary = new Tower<>("Auxiliary");
        Tower<Integer> target = new Tower<>("Target");

        for (int i = n; i >= 1; i--) {
            source.push(new Disk<>(i));
        }
        List<Tower<Integer>> towers = Arrays.asList(source, auxiliary, target);
        System.out.println("Initial state:");
        for (Tower<Integer> tower : towers) {
            System.out.println(tower);
        }
        solveHanoi(n, source, target, auxiliary);
        for (Tower<Integer> tower : towers) {
            System.out.println(tower);
        }
        s.close();
    }

    public static <T> void solveHanoi(int n, Tower<T> source, Tower<T> target, Tower<T> auxiliary) {
        if (n == 1) {
            Disk<T> disk = source.pop();
            target.push(disk);
            System.out.println("Move disk " + disk + " from " + source.getName() + " to " + target.getName());
            return;
        }
        solveHanoi(n - 1, source, auxiliary, target);
        Disk<T> disk = source.pop();
        target.push(disk);
        System.out.println("Move disk " + disk + " from " + source.getName() + " to " + target.getName());
        solveHanoi(n - 1, auxiliary, target, source);
    }
}