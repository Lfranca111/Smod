package software.bernie.shadowed.fasterxml.jackson.databind.deser;

import software.bernie.shadowed.fasterxml.jackson.databind.BeanProperty;
import software.bernie.shadowed.fasterxml.jackson.databind.DeserializationContext;
import software.bernie.shadowed.fasterxml.jackson.databind.JsonMappingException;
import software.bernie.shadowed.fasterxml.jackson.databind.KeyDeserializer;

public interface ContextualKeyDeserializer {
  KeyDeserializer createContextual(DeserializationContext paramDeserializationContext, BeanProperty paramBeanProperty) throws JsonMappingException;
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\software\bernie\shadowed\fasterxml\jackson\databind\deser\ContextualKeyDeserializer.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */