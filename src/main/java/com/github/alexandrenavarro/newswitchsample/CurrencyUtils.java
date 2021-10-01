package com.github.alexandrenavarro.newswitchsample;

public class CurrencyUtils {

    public static String getCurrency(Currency currency) {
//        final String s = switch (currency) {
//            case USD -> "Dollar";
//            case EUR  -> "Euro";
//            default -> "";
//        };
        switch (currency) {
            case USD : return "Dollar";
            case EUR  : return "Euro";
            default : return  "";
        }
    }
}
