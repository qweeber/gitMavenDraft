package first;

public class Soldier extends Person implements Work {
    private String range;

    public Soldier(String firstName, String lastName, String range){
        super(firstName, lastName);
        this.range = range;
    }


    public void working() {
        System.out.println("I'm take care my duties!");
    }
}
