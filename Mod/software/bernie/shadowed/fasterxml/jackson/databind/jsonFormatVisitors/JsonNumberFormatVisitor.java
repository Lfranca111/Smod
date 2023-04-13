package software.bernie.shadowed.fasterxml.jackson.databind.jsonFormatVisitors;

import software.bernie.shadowed.fasterxml.jackson.core.JsonParser;

public interface JsonNumberFormatVisitor extends JsonValueFormatVisitor {
  void numberType(JsonParser.NumberType paramNumberType);
  
  public static class Base extends JsonValueFormatVisitor.Base implements JsonNumberFormatVisitor {
    public void numberType(JsonParser.NumberType type) {}
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.8.0.jar!\software\bernie\shadowed\fasterxml\jackson\databind\jsonFormatVisitors\JsonNumberFormatVisitor.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */