package com.vikram.study.java21;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.SequencedCollection;
import java.util.SequencedMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Java21FeaturesDemo {

    public record Point(int x, int y) {
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Java 21 Features Demo");
        System.out.println("Virtual threads output: " + runVirtualThreadTasks());
        System.out.println("Sequenced collection output: " + sequencedCollectionDemo());
        System.out.println("Sequenced map output: " + sequencedMapDemo());
        System.out.println("Record pattern switch output: " + describeWithSwitch(new Point(4, 4)));
    }

    public static List<String> runVirtualThreadTasks() throws ExecutionException, InterruptedException {
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            Future<String> first = executor.submit(() -> "task-1:" + Thread.currentThread().isVirtual());
            Future<String> second = executor.submit(() -> "task-2:" + Thread.currentThread().isVirtual());
            return List.of(first.get(), second.get());
        }
    }

    public static String sequencedCollectionDemo() {
        SequencedCollection<String> items = new LinkedList<>(List.of("middle", "end"));
        items.addFirst("start");
        items.addLast("last");
        return items.getFirst() + "->" + items.getLast();
    }

    public static String sequencedMapDemo() {
        SequencedMap<Integer, String> releases = new LinkedHashMap<>();
        releases.put(8, "java8");
        releases.put(11, "java11");
        releases.put(17, "java17");
        releases.put(21, "java21");
        return releases.firstEntry().getValue() + "|" + releases.lastEntry().getValue() + "|"
                + releases.reversed().firstEntry().getValue();
    }

    public static String describeWithSwitch(Object value) {
        return switch (value) {
            case Point(int x, int y) when x == y -> "Diagonal point " + x;
            case Point(int x, int y) -> "Point(" + x + "," + y + ")";
            case String s -> "String length=" + s.length();
            default -> "Unknown";
        };
    }
}

