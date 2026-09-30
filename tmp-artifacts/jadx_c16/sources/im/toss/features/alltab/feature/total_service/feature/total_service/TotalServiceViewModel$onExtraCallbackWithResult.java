package im.toss.features.alltab.feature.total_service.feature.total_service;

import o.getLaunchParamsTag;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TotalServiceViewModel$onExtraCallbackWithResult {
    private static int IAuthTabCallback = 1;
    public static final /* synthetic */ int[] onExtraCallback;
    private static int onNavigationEvent;

    static {
        int[] iArr = new int[getLaunchParamsTag.values().length];
        try {
            iArr[getLaunchParamsTag.INVALID.ordinal()] = 1;
            int i = onNavigationEvent + 9;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[getLaunchParamsTag.UNCHANGED.ordinal()] = 2;
            int i4 = IAuthTabCallback + 91;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[getLaunchParamsTag.REGISTERED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        onExtraCallback = iArr;
    }
}
