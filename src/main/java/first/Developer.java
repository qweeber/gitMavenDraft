package first;

public class Developer extends Person implements Work {
    private String position;

    public Developer(String firstName, String lastName, String position) {
        super(firstName, lastName);
        this.position = position;
    }

    public void working() {
        System.out.println("I'm writing java code!");
    }
}
