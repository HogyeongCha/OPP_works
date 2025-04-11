package sandbox;

public class box6 {
    public static void main(String[] args) {
        int count = 0;

        for (;;) {
            System.out.println("present num : " + count);

            if (count > 3) {
                break;
            }

            count++;
        }
    }
}
