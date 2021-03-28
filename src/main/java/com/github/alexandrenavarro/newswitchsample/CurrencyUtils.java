package com.github.alexandrenavarro.newswitchsample;

public class CurrencyUtils {

    public static String getCurrency(Currency currency) {
        final String s = switch (currency) {
            case USD -> "Dollar";
            case EUR  -> "Euro";
            default -> "";
        };
        return s;
    }
}
