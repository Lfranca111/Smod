package org.apache.commons.lang3.function;

@FunctionalInterface
public interface FailableIntBinaryOperator<E extends Throwable> {
  int applyAsInt(int paramInt1, int paramInt2) throws E;
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\org\apache\commons\lang3\function\FailableIntBinaryOperator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */