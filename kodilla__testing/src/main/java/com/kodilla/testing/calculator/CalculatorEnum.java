package com.kodilla.testing.calculator;

public enum CalculatorEnum{
    ADD{
        public int operations(int a, int b) { return a+b; }
    },
    SUBTRACT{
        public int operations(int a, int b) { return a-b; }
    };

    public abstract int operations(int a, int b);
}
