package com.vikram.study.java11;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Java11FeaturesDemoTest {

    @Test
    public void stringAndPredicateFeaturesWork() {
        assertEquals("hello|java 11", Java11FeaturesDemo.normalizeLines("  hello\njava 11  "));
        assertEquals(Arrays.asList("alpha", "beta"), Java11FeaturesDemo.filterBlankLines(Arrays.asList("alpha", "", "beta", " ")));
    }

    @Test
    public void optionalAndLambdaFeaturesWork() {
        assertTrue(Java11FeaturesDemo.isValueMissing(Optional.empty()));
        assertFalse(Java11FeaturesDemo.isValueMissing(Optional.of("present")));
        assertEquals(12, Java11FeaturesDemo.sumWithVarLambda(Arrays.asList(3, 4, 5)));
    }

    @Test
    public void filesApiWorks() throws IOException {
        Path path = Files.createTempFile("java11-test", ".txt");
        assertEquals("Java 11 Files API", Java11FeaturesDemo.writeAndReadFile(path, "Java 11 Files API"));
    }
}

