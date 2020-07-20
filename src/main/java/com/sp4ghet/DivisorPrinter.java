package com.sp4ghet;

public final class DivisorPrinter {

    private final int number;

    public DivisorPrinter(final int number) {
        this.number = number;
    }

    public void print() {
        for (int i = 1; i <= number; ++i) {
            /* If i is a divisor of number */
            if (number % i == 0) {
                System.out.print(i);
                if (i != number) {
                    System.out.print(", "); // Append a comma if there are more divisors to come
                }
            }
        }
    }

}