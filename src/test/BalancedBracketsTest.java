package test;

import org.junit.Test;

import static org.junit.Assert.*;
import main.BalancedBrackets;

public class BalancedBracketsTest {
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void frontBracketOnlyReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void endBracketOnlyReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void emptyReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void wordReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("hello"));
    }

    @Test
    public void sameBracketFrontReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
    }

    @Test
    public void sameBracketBackReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]"));
    }

    @Test
    public void extraFrontBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }

    @Test
    public void extraEndBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]"));
    }

    @Test
    public void filledBracketReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[hello]"));
    }

    @Test
    public void extraMiddleBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[hel[lo]"));
    }

    @Test
    public void reverseBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void reverseBracketsWithTextReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]hello["));
    }

}
