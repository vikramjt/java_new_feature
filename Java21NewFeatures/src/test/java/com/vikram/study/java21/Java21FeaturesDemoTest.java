package com.vikram.study.java21;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Java21FeaturesDemoTest {

    @Test
    public void virtualThreadsAndSequencedCollectionsWork() throws Exception {
        List<String> output = Java21FeaturesDemo.runVirtualThreadTasks();
        assertTrue(output.get(0).contains("true"));
        assertEquals("start->last", Java21FeaturesDemo.sequencedCollectionDemo());
    }

    @Test
    public void sequencedMapAndSwitchPatternsWork() {
        assertEquals("java8|java21|java21", Java21FeaturesDemo.sequencedMapDemo());
        assertEquals("Diagonal point 4", Java21FeaturesDemo.describeWithSwitch(new Java21FeaturesDemo.Point(4, 4)));
    }
}

