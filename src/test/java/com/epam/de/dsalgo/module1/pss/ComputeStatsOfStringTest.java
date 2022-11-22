package com.epam.de.dsalgo.module1.pss;

import junit.framework.TestCase;

public class ComputeStatsOfStringTest extends TestCase {

    @Test
    public void testFindLongestWordForNull() {
        ComputeStatsOfString computeStatsOfString = new ComputeStatsOfString();
        String longestWord = computeStatsOfString.findLongestWord(null);
        assertNull(longestWord);
    }


    public void testFindWordHasGreatestNumberOfVowels() {
    }
}