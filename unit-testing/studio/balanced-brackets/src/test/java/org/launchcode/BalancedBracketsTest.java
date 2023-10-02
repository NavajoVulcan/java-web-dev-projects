package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void isBalancedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(str:"[]"));
    }

    @Test
    public void isBalancedWithTwoBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(str:"[][]"));

    }
    @Test
    public void isBalancedIfMultiBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(str:"[[]]"));
    }

    @Test
    public void isBalancedIfInterMultiBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(str:"[[[]]]"));
    }

    @Test
    public void isBalancedIfSuperInterMultiBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(str:"[[[[]]]]"));
    }

    @Test
    public void isBalancedIfDoubleInterMultiBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(str:"[[[[][]]]]"));
    }

    @Test
    public void bracketWithLaunchcode() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(str:"[Launchcode]"));
    }

    @Test
    public void failsIfNotBalanced() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(str:"[]]"));
    }

    @Test
    public void failsIfBracketsBackwards(){
        assertFalse(BalancedBrackets.hasBalancedBrackets(str:"][" ));
    }

    @Test
    public void failsIfOnlyOpenBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(str:"["));
    }

    @Test
    public void failsIfOnlyClosedBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(str:"]"));
    }

    @Test
    public void failsIfNotBalancedLaunchCode() {
        assertFalse(BalancedBrackets.hasBalancedBrackets((str:"Launch]code["));
    }
    }