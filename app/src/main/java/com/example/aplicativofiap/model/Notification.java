package com.example.aplicativofiap.model;

public class Notification {

    private String notification;

    private String notificationDate;

    public Notification() {

    }

    public Notification(String notification, String notificationDate) {
        this.notification = notification;
        this.notificationDate = notificationDate;
    }


    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

    public String getNotificationDate() {
        return notificationDate;
    }

    public void setNotificationDate(String notificationDate) {
        this.notificationDate = notificationDate;
    }



}

