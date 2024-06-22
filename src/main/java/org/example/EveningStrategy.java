package org.example;

public class EveningStrategy implements MessageStrategy{
    @Override
    public void sendMessage() {
        System.out.println("Evening message sending");
    }
}
