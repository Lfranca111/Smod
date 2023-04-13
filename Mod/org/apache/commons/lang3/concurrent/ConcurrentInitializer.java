package org.apache.commons.lang3.concurrent;

public interface ConcurrentInitializer<T> {
  T get() throws ConcurrentException;
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.8.0.jar!\org\apache\commons\lang3\concurrent\ConcurrentInitializer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */