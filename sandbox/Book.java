package sandbox;

public enum Book {
    A("A", 1),
    B("B", 2),
    C("C", 3);

    private final String title;
    private final int nume;

    Book(String title, int nume) {
        this.title = title;
        this.nume = nume;
    }
    public String getTitle() {
        return title;
    }
    public int getNume() {
        return nume;
    }
}
