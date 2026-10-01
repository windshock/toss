package o;

import o.NativeDevSettingsSpec;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FileBridgeExtension3$onExtraCallback {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public static final /* synthetic */ int[] onNavigationEvent;

    static {
        int[] iArr = new int[NativeDevSettingsSpec.onWarmupCompleted.values().length];
        try {
            iArr[NativeDevSettingsSpec.onWarmupCompleted.BUILDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NativeDevSettingsSpec.onWarmupCompleted.NONE.ordinal()] = 2;
            int i = onExtraCallback + 63;
            IAuthTabCallback = i % 128;
            if (i % 2 == 0) {
                int i2 = 3 % 4;
            } else {
                int i3 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        onNavigationEvent = iArr;
        int i4 = IAuthTabCallback + 115;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 79 / 0;
        }
    }
}
