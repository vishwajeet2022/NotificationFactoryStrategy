package org.example;

public class EmailNotification implements Notification{
    private final String email;
    private final String message;

    private MessageStrategy messageStrategy;

    EmailNotification(String email, String message){
        this.message=message;
        this.email=email;
    }
    @Override
    public void send() {
        System.out.println("Sending SMS using Email : "+this.message);
        messageStrategy.sendMessage();
    }

    @Override
    public void steMessageStrategy(MessageStrategy messageStrategy) {
        this.messageStrategy=messageStrategy;
    }
}
