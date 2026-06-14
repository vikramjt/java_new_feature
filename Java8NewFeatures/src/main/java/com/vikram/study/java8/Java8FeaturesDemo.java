package com.vikram.study.java8;

import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class Java8FeaturesDemo {

    @FunctionalInterface
    interface PriceCalculator {
        double apply(double amount);
    }

    public static void main(String[] args) {
        System.out.println("Java 8 Features Demo");
        System.out.println("Lambdas + Streams: " + uppercaseAndSort(Arrays.asList("pear", "apple", "banana")));
        System.out.println("Method reference total: " + sumNumbers(Arrays.asList(5, 10, 15)));
        System.out.println("Optional fallback: " + optionalWithFallback("  "));
        System.out.println("Date API output: " + formatDate(LocalDate.of(2026, 6, 14)));
        System.out.println("CompletableFuture output: " + asyncSquare(12));
        System.out.println("Base64 output: " + base64Encode("java8"));
        System.out.println("Default method output: " + new BasicDiscountService().discountLabel());
    }

    public static List<String> uppercaseAndSort(List<String> input) {
        return input.stream()
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
    }

    public static int sumNumbers(List<Integer> input) {
        return input.stream().reduce(0, Integer::sum);
    }

    public static String optionalWithFallback(String value) {
        return Optional.ofNullable(value)
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .orElse("DEFAULT-VALUE");
    }

    public static String formatDate(LocalDate date) {
        return date.format(DateTimeFormatter.ISO_DATE);
    }

    public static int asyncSquare(int number) {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> number * number);
        return future.join();
    }

    public static String base64Encode(String value) {
        return Base64.getEncoder().encodeToString(value.getBytes(StandardCharsets.UTF_8));
    }

    interface DiscountService {
        default String discountLabel() {
            return "Standard Discount";
        }

        static double vatRate() {
            return 0.18d;
        }
    }

    static class BasicDiscountService implements DiscountService {
    }
}

