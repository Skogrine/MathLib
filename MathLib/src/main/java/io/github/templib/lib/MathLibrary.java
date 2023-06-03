package io.github.templib.lib;

import io.github.templib.FactorialFunction;
import io.github.templib.GCDFunction;
import io.github.templib.MathFunction;
import io.github.templib.PrimeChecker;

import java.util.ArrayList;
import java.util.List;

public class MathLibrary {
  public double calculate(MathFunction function, double[] inputs) {
    if (function == null) {
      throw new IllegalArgumentException("Invalid function");
    }

    return function.calculate(inputs);
  }
}