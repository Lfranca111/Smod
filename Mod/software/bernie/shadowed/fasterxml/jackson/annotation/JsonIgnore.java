package software.bernie.shadowed.fasterxml.jackson.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@JacksonAnnotation
public @interface JsonIgnore {
  boolean value() default true;
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.8.0.jar!\software\bernie\shadowed\fasterxml\jackson\annotation\JsonIgnore.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */