package org.example;

public class NotificationFactory {
    public static Notification createNotification(String type,String reciever,String message){
        switch (type){
            case "Email" :
                return new EmailNotification(reciever,message);
            case "Push" :
                return  new PushNotification(reciever,message);
            case "SMS" :
                return new SMSNotification(reciever,message);
            default:
                return new NullNotification();
        }
    }
}
