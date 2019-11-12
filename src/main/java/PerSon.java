public class PerSon {
    private String name;


    public PerSon(String name) {
        this.name = name;
    }

    public String hello() {
        return "Hello" + name;
    }

    public String hello(String orher) {
        return "Hello" + orher;
    }
}