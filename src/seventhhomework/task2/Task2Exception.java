package seventhhomework.task2;

public class Task2Exception extends Exception {
    private String reference;

    public Task2Exception (String argument){
        setReference(argument);
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public void print () throws Task2Exception {
        System.out.println(reference);
    }
}
