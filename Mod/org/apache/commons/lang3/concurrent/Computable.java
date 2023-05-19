package org.apache.commons.lang3.concurrent;

public interface Computable<I, O> {
  O compute(I paramI) throws InterruptedException;
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\org\apache\commons\lang3\concurrent\Computable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */