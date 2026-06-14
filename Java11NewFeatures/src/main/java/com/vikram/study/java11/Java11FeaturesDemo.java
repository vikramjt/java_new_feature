package com.vikram.study.java11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java11FeaturesDemo {

    public static void main(String[] args) throws IOException {
        System.out.println("Java 11 Features Demo");
        System.out.println("String API: " + normalizeLines("  hello\njava 11  "));
        System.out.println("HTTP client request: " + buildRequest("https://example.com").uri());

        Path tempFile = Files.createTempFile("java11", ".txt");
        writeAndReadFile(tempFile, "Java 11 Files API");
        System.out.println("Files API content: " + Files.readString(tempFile));

        System.out.println("Optional isEmpty: " + isValueMissing(Optional.empty()));
        System.out.println("Predicate.not filter: " + filterBlankLines(Arrays.asList("alpha", "", "beta", " ")));
        System.out.println("var in lambda sum: " + sumWithVarLambda(Arrays.asList(3, 4, 5)));
    }

    public static String normalizeLines(String value) {
        return value.strip().lines().map(String::strip).collect(Collectors.joining("|"));
    }

    public static HttpRequest buildRequest(String url) {
        HttpClient.newHttpClient();
        return HttpRequest.newBuilder(URI.create(url)).GET().build();
    }

    public static String writeAndReadFile(Path path, String content) throws IOException {
        Files.writeString(path, content);
        return Files.readString(path);
    }

    public static boolean isValueMissing(Optional<String> value) {
        return value.isEmpty();
    }

    public static List<String> filterBlankLines(List<String> values) {
        return values.stream().filter(Predicate.not(String::isBlank)).collect(Collectors.toList());
    }

    public static int sumWithVarLambda(List<Integer> numbers) {
        return numbers.stream().reduce(0, (var left, var right) -> left + right);
    }
}

