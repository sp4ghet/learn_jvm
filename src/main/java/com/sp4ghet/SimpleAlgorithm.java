package com.sp4ghet;

import com.sp4ghet.DivisorPrinter;

public final class SimpleAlgorithm {
  public static void main(String[] args) {
    String input;
    /* If arguments were provided, assign them, else exit the program */
    if (args.length > 0) {
      input = args[0];
    } else {
      System.exit(1);
      return;
    }
    int number = Integer.parseInt(input);
    DivisorPrinter printer = new DivisorPrinter(number);
    printer.print();
  }

}