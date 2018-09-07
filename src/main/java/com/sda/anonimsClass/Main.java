package com.sda.anonimsClass;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class Main {

    public interface Button{
        void click();
        //void mouseOn();
    }

    public static void action(){
        Button button = new Button() {
            @Override
            public void click() {
                System.out.println("Przycisk klikniety");
            }
            /*@Override
            public void mouseOn() {
                System.out.println("Mysza poruszona");
            }*/
        };
        button.click();
        //button.mouseOn();
    }

    public static void main(String[] args) {
        action();

        Button button = () -> System.out.println("Przycisk klikniety");
        button.click();

        Runnable t1 = new Runnable(){
            @Override
            public void run() {
                System.out.println("biegne");
            }
        };
        t1.run();

        Runnable r1 = () -> System.out.println("zapierdalam");
        r1.run();

        javafx.scene.control.Button btn = new javafx.scene.control.Button();
        btn.setText("alksdsajdk");
        btn.setOnAction(event -> System.out.println("Ja żem tylko kliknał"));

    }
}
