package io.github.templib;

public enum MathFunction {
  FACTORIAL {
    @Override
    public double calculate(double[] inputs) {
      if (inputs.length != 1) {
        throw new IllegalArgumentException("Factorial function expects exactly one input.");
      }

      int n = (int) inputs[0];
      if (n < 0) {
        throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
      }

      double result = 1;
      for (int i = 1; i <= n; i++) {
        result *= i;
      }
      return result;
    }
  },
  PRIME_CHECKER {
    @Override
    public double calculate(double[] inputs) {
      if (inputs.length != 1) {
        throw new IllegalArgumentException("Prime checker function expects exactly one input.");
      }

      int number = (int) inputs[0];
      if (number <= 1) {
        return 0;
      }

      for (int i = 2; i <= Math.sqrt(number); i++) {
        if (number % i == 0) {
          return 0;
        }
      }
      return 1;
    }
  },
  GCD {
    @Override
    public double calculate(double[] inputs) {
      if (inputs.length != 2) {
        throw new IllegalArgumentException("GCD function expects exactly two inputs.");
      }

      int a = (int) inputs[0];
      int b = (int) inputs[1];
      if (b == 0) {
        return a;
      }
      return calculate(new double[]{b, a % b});
    }
  };

  public abstract double calculate(double[] inputs);
}