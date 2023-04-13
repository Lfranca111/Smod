package software.bernie.shadowed.fasterxml.jackson.databind.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import software.bernie.shadowed.fasterxml.jackson.annotation.JacksonAnnotation;
import software.bernie.shadowed.fasterxml.jackson.databind.PropertyNamingStrategy;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@JacksonAnnotation
public @interface JsonNaming {
  Class<? extends PropertyNamingStrategy> value() default PropertyNamingStrategy.class;
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.8.0.jar!\software\bernie\shadowed\fasterxml\jackson\databind\annotation\JsonNaming.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */