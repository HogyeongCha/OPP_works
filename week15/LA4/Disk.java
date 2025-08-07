package week15.LA4;

public class Disk<T> {
    private T size;

    public Disk(T size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return String.valueOf(size);
    }
}