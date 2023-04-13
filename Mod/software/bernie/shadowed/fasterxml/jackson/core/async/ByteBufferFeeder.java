package software.bernie.shadowed.fasterxml.jackson.core.async;

import java.io.IOException;
import java.nio.ByteBuffer;

public interface ByteBufferFeeder extends NonBlockingInputFeeder {
  void feedInput(ByteBuffer paramByteBuffer) throws IOException;
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.8.0.jar!\software\bernie\shadowed\fasterxml\jackson\core\async\ByteBufferFeeder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */