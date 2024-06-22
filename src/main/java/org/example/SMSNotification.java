package org.example;

public class SMSNotification implements Notification{
    private final String mobleNo;
    private final String message;

    SMSNotification(String mobleNo,String message){
        this.mobleNo=mobleNo;
        this.message=message;
    }
    @Override
    public void send() {
        System.out.println("sending message using SMS : "+this.message);
    }

    @Override
    public void steMessageStrategy(MessageStrategy messageStrategy) {
        System.out.println("Sending message");
    }
}
