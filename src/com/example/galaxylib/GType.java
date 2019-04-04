package com.example.galaxylib;

public class GType {
    @Override
    public String toString() {
        return type;
    }

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
