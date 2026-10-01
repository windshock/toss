package im.toss.features.fds.impl;

import o.getRenderId;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class SirenBottomSheetActivity$onExtraCallback {
    private static int IAuthTabCallback = 1;
    public static final /* synthetic */ int[] onExtraCallback;
    private static int onNavigationEvent;

    static {
        int[] iArr = new int[getRenderId.onWarmupCompleted.values().length];
        try {
            iArr[getRenderId.onWarmupCompleted.SEND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[getRenderId.onWarmupCompleted.CANCEL_SEND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[getRenderId.onWarmupCompleted.CLOSE.ordinal()] = 3;
            int i = onNavigationEvent + 107;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        onExtraCallback = iArr;
        int i4 = IAuthTabCallback + 121;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }
}
