package software.bernie.shadowed.fasterxml.jackson.databind.cfg;

public interface ConfigFeature {
  boolean enabledByDefault();
  
  int getMask();
  
  boolean enabledIn(int paramInt);
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\software\bernie\shadowed\fasterxml\jackson\databind\cfg\ConfigFeature.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */