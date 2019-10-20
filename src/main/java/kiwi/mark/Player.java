package kiwi.mark;

public class Player {

    private int total;
    private String name;

    public Player(String name) {
        total = 0;
        this.name = name;
    }

    // Constructor which only lets you set the total, for testing only
    public Player(String name, int total) {
        this.name = name;
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    // Set total for testing purposes only
    public void setTotal(int total) {
        this.total = total;
    }

    public void add(int a, int b) {
        total += a + b;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
