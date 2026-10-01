package o;

import android.webkit.ConsoleMessage;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class setCircleColor$IAuthTabCallbackStub {
    public static final /* synthetic */ int[] onExtraCallback;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    static {
        int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
        try {
            iArr[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 1;
            int i = onExtraCallbackWithResult + 57;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        onExtraCallback = iArr;
        int i4 = onExtraCallbackWithResult + 107;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
