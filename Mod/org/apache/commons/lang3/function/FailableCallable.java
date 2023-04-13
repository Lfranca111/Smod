package org.apache.commons.lang3.function;

@FunctionalInterface
public interface FailableCallable<R, E extends Throwable> {
  R call() throws E;
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.8.0.jar!\org\apache\commons\lang3\function\FailableCallable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */