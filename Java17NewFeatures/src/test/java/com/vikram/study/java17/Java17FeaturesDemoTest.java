package com.vikram.study.java17;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Java17FeaturesDemoTest {

    @Test
    public void recordAndPatternMatchingWork() {
        Java17FeaturesDemo.Person person = new Java17FeaturesDemo.Person("Vikram", 30);
        assertEquals("Vikram is 30", Java17FeaturesDemo.describeObject(person));
    }

    @Test
    public void sealedTypesWork() {
        Java17FeaturesDemo.Shape shape = new Java17FeaturesDemo.Rectangle(4, 5);
        assertEquals("shape-area=20.0", Java17FeaturesDemo.describeObject(shape));
    }

    @Test
    public void hexAndRandomApiWork() {
        assertEquals("01:0f:1f", Java17FeaturesDemo.toHex(new byte[]{1, 15, 31}));
        int random = Java17FeaturesDemo.nextBoundedRandomInt(100);
        assertTrue(random >= 0 && random < 100);
    }
}

