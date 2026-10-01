package o;

import kotlin.jvm.internal.ByteCompanionObject;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setDeepShakeValue {
    public static final setDeepShakeValue onExtraCallback;
    public static final char[] onExtraCallbackWithResult;
    public static final byte[] onWarmupCompleted;

    private setDeepShakeValue() {
    }

    static {
        setDeepShakeValue setdeepshakevalue = new setDeepShakeValue();
        onExtraCallback = setdeepshakevalue;
        onExtraCallbackWithResult = new char[Imgproc.COLOR_YUV2RGB_YVYU];
        onWarmupCompleted = new byte[126];
        setdeepshakevalue.onNavigationEvent();
        setdeepshakevalue.onWarmupCompleted();
    }

    private final void onNavigationEvent() {
        for (int i = 0; i < 32; i++) {
            IAuthTabCallback(i, 'u');
        }
        IAuthTabCallback(8, 'b');
        IAuthTabCallback(9, 't');
        IAuthTabCallback(10, 'n');
        IAuthTabCallback(12, 'f');
        IAuthTabCallback(13, 'r');
        onExtraCallback('/', '/');
        onExtraCallback('\"', '\"');
        onExtraCallback('\\', '\\');
    }

    private final void onWarmupCompleted() {
        for (int i = 0; i < 33; i++) {
            onExtraCallback(i, ByteCompanionObject.MAX_VALUE);
        }
        onExtraCallback(9, (byte) 3);
        onExtraCallback(10, (byte) 3);
        onExtraCallback(13, (byte) 3);
        onExtraCallback(32, (byte) 3);
        onExtraCallbackWithResult(',', (byte) 4);
        onExtraCallbackWithResult(':', (byte) 5);
        onExtraCallbackWithResult('{', (byte) 6);
        onExtraCallbackWithResult('}', (byte) 7);
        onExtraCallbackWithResult('[', (byte) 8);
        onExtraCallbackWithResult(']', (byte) 9);
        onExtraCallbackWithResult('\"', (byte) 1);
        onExtraCallbackWithResult('\\', (byte) 2);
    }

    private final void IAuthTabCallback(int i, char c) {
        if (c != 'u') {
            onExtraCallbackWithResult[c] = (char) i;
        }
    }

    private final void onExtraCallback(char c, char c2) {
        IAuthTabCallback(c, c2);
    }

    private final void onExtraCallback(int i, byte b) {
        onWarmupCompleted[i] = b;
    }

    private final void onExtraCallbackWithResult(char c, byte b) {
        onExtraCallback(c, b);
    }
}
