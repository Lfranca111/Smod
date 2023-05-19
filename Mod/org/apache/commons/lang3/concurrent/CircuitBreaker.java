package org.apache.commons.lang3.concurrent;

public interface CircuitBreaker<T> {
  boolean isOpen();
  
  boolean isClosed();
  
  boolean checkState();
  
  void close();
  
  void open();
  
  boolean incrementAndCheckState(T paramT);
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\org\apache\commons\lang3\concurrent\CircuitBreaker.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */