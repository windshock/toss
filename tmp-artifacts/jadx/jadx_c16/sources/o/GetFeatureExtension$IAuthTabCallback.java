package o;

import im.toss.core.tracker.RemoteProcessLogKind;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class GetFeatureExtension$IAuthTabCallback {
    public static final /* synthetic */ int[] onExtraCallback;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int[] iArr = new int[RemoteProcessLogKind.values().length];
        try {
            iArr[RemoteProcessLogKind.EVENT.ordinal()] = 1;
            int i = onWarmupCompleted + 111;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RemoteProcessLogKind.APP_LOG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        onExtraCallback = iArr;
        int i4 = onWarmupCompleted + 3;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }
}
