package org.example;

public class NullNotification implements Notification{
    @Override
    public void send() {
        System.out.println("No message type is defined");
    }

    @Override
    public void steMessageStrategy(MessageStrategy messageStrategy) {
        System.out.println("Message Strategy");
    }
}
