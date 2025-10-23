public class HelloWorld {

    private int id = 0;
    private static int counter = 0;

    private String message;

    public HelloWorld() {
        this.id = ++counter;
    }
    public String getMessage() {
        return message;
    }
 
    public void setMessage(String message) {
        this.message = message;
    }

    public int getId() {
        return this.id;
    }
     
}