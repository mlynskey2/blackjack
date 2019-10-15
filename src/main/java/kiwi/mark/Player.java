package kiwi.mark;

public class Player {

    private int total;
    private String name;

    public Player(String name) {
        total = 0;
        this.name = name;
    }

    public int getTotal() {
        return total;
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
