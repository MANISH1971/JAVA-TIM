package sample2;

public class Hello {
    private String name;

    public Hello(String name) {
        this.name = name;
    }

    public String greeting() {
        return "Hello " + this.name;
    }
}
