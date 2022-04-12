package com.ing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BracketsTest {

    @Test
    public void whenInputIsEmptyThenIsBalanced() {
        boolean isBalanced = Brackets.isBalanced("");

        assertTrue(isBalanced);
    }


    @Test
    public void whenInputHasJustOpenParenthesisThenIsNotBalanced() {
        boolean isBalanced = Brackets.isBalanced("(");

        assertFalse(isBalanced);
    }

    @Test
    public void whenInputHasJustClosedParenthesisThenIsNotBalanced() {
        boolean isBalanced = Brackets.isBalanced(")");

        assertFalse(isBalanced);
    }

    @Test
    public void whenInputHasOpenAndClosedParenthesisThenIsBalanced() {
        boolean isBalanced = Brackets.isBalanced("()");

        assertTrue(isBalanced);
    }

    @Test
    public void whenInputIsUnbalancedParenthesisThenIsNotBalanced() {
        boolean isBalanced = Brackets.isBalanced("()(()");

        assertFalse(isBalanced);
    }
}