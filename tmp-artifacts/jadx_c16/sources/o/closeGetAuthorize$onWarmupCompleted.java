package o;

import o.Interruptable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class closeGetAuthorize$onWarmupCompleted {
    public static final /* synthetic */ int[] onExtraCallback;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    static {
        int[] iArr = new int[Interruptable.onNavigationEvent.values().length];
        try {
            iArr[Interruptable.onNavigationEvent.AUTOMATIC.ordinal()] = 1;
            int i = onExtraCallbackWithResult + 7;
            onNavigationEvent = i % 128;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Interruptable.onNavigationEvent.MANUAL.ordinal()] = 2;
            int i3 = onExtraCallbackWithResult + 51;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        onExtraCallback = iArr;
        int i6 = onExtraCallbackWithResult + 25;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }
}
