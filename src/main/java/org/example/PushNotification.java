package org.example;

public class PushNotification implements Notification{
    private final String receverId;
    private  final String message;

    PushNotification(String receiverId, String message) {
        this.receverId = receiverId;
        this.message = message;
    }

    @Override
    public void send() {
        System.out.println("Sending message using pushNotification : "+this.message);
    }

    @Override
    public void steMessageStrategy(MessageStrategy messageStrategy) {
        System.out.println("Sending message");
    }
}
