package org.apache.commons.lang3.function;

@FunctionalInterface
public interface FailableIntSupplier<E extends Throwable> {
  int getAsInt() throws E;
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.8.0.jar!\org\apache\commons\lang3\function\FailableIntSupplier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */