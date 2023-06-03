package io.github.templib.runnable;

public class LoopRunnable implements Runnable {
  private final Calculation calculation;
  private final int interval;

  public LoopRunnable(Calculation calculation, int interval) {
    this.calculation = calculation;
    this.interval = interval;
  }

  @Override
  public void run() {
    boolean isCorrect = false;
    while (!isCorrect) {
      // Perform the calculation
      isCorrect = calculation.calculate();

      // Sleep for the specified interval
      try {
        Thread.sleep(interval * 1000);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
        return;
      }
    }
  }
}