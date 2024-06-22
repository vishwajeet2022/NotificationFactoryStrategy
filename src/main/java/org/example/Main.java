package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Notification email=NotificationFactory.createNotification("Email","vishwajeet1234@gmail.com","Hello");
        MessageStrategy messageStrategy=new EveningStrategy();
        email.steMessageStrategy(messageStrategy);
        email.send();
    }
}