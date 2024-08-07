package org.example;

public class Hello {
    private String message;

    public Hello(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void sayHello(){
        System.out.println("Hello world Spring message is:"+ message);
    }

}
