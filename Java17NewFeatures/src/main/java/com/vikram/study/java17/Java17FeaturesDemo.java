package com.vikram.study.java17;

import java.util.HexFormat;
import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class Java17FeaturesDemo {

    public record Person(String name, int age) {
    }

    public sealed interface Shape permits Circle, Rectangle {
        double area();
    }

    public static final class Circle implements Shape {
        private final double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double area() {
            return Math.PI * radius * radius;
        }
    }

    public static final class Rectangle implements Shape {
        private final double width;
        private final double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public double area() {
            return width * height;
        }
    }

    public static void main(String[] args) {
        Person person = new Person("Vikram", 30);
        Shape shape = new Rectangle(4, 5);

        System.out.println("Java 17 Features Demo");
        System.out.println("Record output: " + person.name() + " - " + person.age());
        System.out.println("Sealed class output: " + shape.area());
        System.out.println("Pattern matching output: " + describeObject(person));
        System.out.println("Hex format output: " + toHex(new byte[]{1, 15, 31}));
        System.out.println("Random generator output: " + nextBoundedRandomInt(100));
    }

    public static String describeObject(Object value) {
        if (value instanceof Person person) {
            return person.name() + " is " + person.age();
        }
        if (value instanceof Shape shape) {
            return "shape-area=" + shape.area();
        }
        return "unknown";
    }

    public static String toHex(byte[] bytes) {
        return HexFormat.ofDelimiter(":").formatHex(bytes);
    }

    public static int nextBoundedRandomInt(int bound) {
        RandomGenerator generator = RandomGeneratorFactory.of("L64X128MixRandom").create();
        return generator.nextInt(bound);
    }
}

