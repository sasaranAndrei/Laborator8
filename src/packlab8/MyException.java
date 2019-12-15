package packlab8;

public class MyException extends Exception {
    private String reference;

    public MyException(String message) {
        super(message);
        this.reference = message;
    }

    public void printString (){
        System.out.println(this.reference);
    }
}
