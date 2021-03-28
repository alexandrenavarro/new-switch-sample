package com.github.alexandrenavarro.newswitchsample;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import java.util.Arrays;

public class CurrencyUtilsTest {

    @Test
    public void test() {

//        Currency[] origValues = Currency.values();
//
//        MockedStatic<Currency> invalidValue = Mockito.mockStatic(Currency.class);
////        Currency.setInternalState(invalidValue, "name", "-");
////        Whitebox.setInternalState(invalidValue, "ordinal", origValues.length);
//        Currency[] newValues = Arrays.copyOf(origValues, origValues.length+1);
//        //newValues[newValues.length-1] = ;
//
//        invalidValue.when(Currency::values).thenReturn(newValues);


        // with powermock
        //https://mgrafl.wordpress.com/2016/10/18/testabilty-of-enum-switch-statements/
        // https://asolntsev.github.io/en/2020/07/11/mockito-static-methods/
        for (final Currency value : Currency.values()) {
            String currency = CurrencyUtils.getCurrency(value);
            Assertions.assertThat(currency).isNotNull();
        }
    }

}