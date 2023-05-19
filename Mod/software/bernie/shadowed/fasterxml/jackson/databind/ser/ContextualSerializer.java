package software.bernie.shadowed.fasterxml.jackson.databind.ser;

import software.bernie.shadowed.fasterxml.jackson.databind.BeanProperty;
import software.bernie.shadowed.fasterxml.jackson.databind.JsonMappingException;
import software.bernie.shadowed.fasterxml.jackson.databind.JsonSerializer;
import software.bernie.shadowed.fasterxml.jackson.databind.SerializerProvider;

public interface ContextualSerializer {
  JsonSerializer<?> createContextual(SerializerProvider paramSerializerProvider, BeanProperty paramBeanProperty) throws JsonMappingException;
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\software\bernie\shadowed\fasterxml\jackson\databind\ser\ContextualSerializer.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */