package week15.LA4;

import java.util.Stack;

public class Tower<T> {
    private Stack<Disk<T>> disks;
    private String name;

    public Tower(String name) {
        this.disks = new Stack<>();
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void push(Disk<T> disk) {
        disks.push(disk);
    }

    public Disk<T> pop() {
        return disks.pop();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(": [");
        for (int i = disks.size() - 1; i >= 0; i--) {
            sb.append(disks.get(i));
            if (i > 0) {
                sb.append(", ");
            }
        }

        sb.append("]");
        return sb.toString();
    }
}