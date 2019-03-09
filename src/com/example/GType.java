package com.example;

public class GType {
    public GType(String charType) {
        switch (charType) {
            case "С":
                type = "Спиральная";
                break;
            case "Э":
                type = "Эллиптическая";
                break;
            case "Н":
                type = "Неправильная";
                break;
            case "Л":
                type = "Линзовидная";
                break;
            default:
                type = "неизвестно";
                break;
        }
    }

    public final String type;
}
