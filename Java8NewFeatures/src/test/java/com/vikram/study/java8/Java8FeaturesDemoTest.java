package com.vikram.study.java8;

import org.junit.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Java8FeaturesDemoTest {

    @Test
    public void streamAndLambdaDemoWorks() {
        List<String> result = Java8FeaturesDemo.uppercaseAndSort(Arrays.asList("pear", "apple", "banana"));
        assertEquals(Arrays.asList("APPLE", "BANANA", "PEAR"), result);
    }

    @Test
    public void optionalAndDateApisWork() {
        assertEquals("DEFAULT-VALUE", Java8FeaturesDemo.optionalWithFallback(" "));
        assertEquals("2026-06-14", Java8FeaturesDemo.formatDate(LocalDate.of(2026, 6, 14)));
    }

    @Test
    public void asyncAndBase64ExamplesWork() {
        assertEquals(144, Java8FeaturesDemo.asyncSquare(12));
        assertEquals("amF2YTg=", Java8FeaturesDemo.base64Encode("java8"));
        assertTrue(Java8FeaturesDemo.DiscountService.vatRate() > 0);
    }
}

