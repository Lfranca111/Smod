package software.bernie.shadowed.fasterxml.jackson.databind.util;

import java.lang.annotation.Annotation;

public interface Annotations {
  <A extends Annotation> A get(Class<A> paramClass);
  
  boolean has(Class<?> paramClass);
  
  boolean hasOneOf(Class<? extends Annotation>[] paramArrayOfClass);
  
  int size();
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.8.0.jar!\software\bernie\shadowed\fasterxml\jackson\databin\\util\Annotations.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */