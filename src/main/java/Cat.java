public class Cat {
    private static int counter = 0;
    private int id = 0;

    public Cat() {
        this.id = ++counter;
    }

    public int getId() {
        return this.id;
    }
}
