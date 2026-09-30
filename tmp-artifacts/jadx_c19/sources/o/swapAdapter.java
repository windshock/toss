package o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class swapAdapter {
    public static final ByteBuffer onExtraCallback(int i2) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
        byteBufferOrder.limit(byteBufferOrder.capacity());
        Intrinsics.checkNotNullExpressionValue(byteBufferOrder, "");
        return byteBufferOrder;
    }

    public static final FloatBuffer onNavigationEvent(int i2) {
        FloatBuffer floatBufferAsFloatBuffer = onExtraCallback(i2 << 2).asFloatBuffer();
        Intrinsics.checkNotNullExpressionValue(floatBufferAsFloatBuffer, "");
        return floatBufferAsFloatBuffer;
    }
}
