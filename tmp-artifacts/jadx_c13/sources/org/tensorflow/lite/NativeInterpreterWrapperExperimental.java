package org.tensorflow.lite;

import java.nio.ByteBuffer;
import org.tensorflow.lite.InterpreterImpl;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class NativeInterpreterWrapperExperimental extends NativeInterpreterWrapper {
    private static native void resetVariableTensors(long j, long j2);

    NativeInterpreterWrapperExperimental(String str, InterpreterImpl.Options options) {
        super(str, options);
    }

    NativeInterpreterWrapperExperimental(ByteBuffer byteBuffer, InterpreterImpl.Options options) {
        super(byteBuffer, options);
    }

    void resetVariableTensors() {
        resetVariableTensors(this.interpreterHandle, this.errorHandle);
    }
}
