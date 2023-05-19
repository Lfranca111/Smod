package software.bernie.shadowed.fasterxml.jackson.databind.type;

import java.lang.reflect.Type;
import software.bernie.shadowed.fasterxml.jackson.databind.JavaType;

public abstract class TypeModifier {
  public abstract JavaType modifyType(JavaType paramJavaType, Type paramType, TypeBindings paramTypeBindings, TypeFactory paramTypeFactory);
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\software\bernie\shadowed\fasterxml\jackson\databind\type\TypeModifier.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */