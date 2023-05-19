package org.apache.commons.lang3.function;

@FunctionalInterface
public interface FailableRunnable<E extends Throwable> {
  void run() throws E;
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\org\apache\commons\lang3\function\FailableRunnable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */