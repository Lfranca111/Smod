package software.bernie.shadowed.fasterxml.jackson.databind.jsonFormatVisitors;

import software.bernie.shadowed.fasterxml.jackson.databind.SerializerProvider;

public interface JsonFormatVisitorWithSerializerProvider {
  SerializerProvider getProvider();
  
  void setProvider(SerializerProvider paramSerializerProvider);
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\software\bernie\shadowed\fasterxml\jackson\databind\jsonFormatVisitors\JsonFormatVisitorWithSerializerProvider.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */