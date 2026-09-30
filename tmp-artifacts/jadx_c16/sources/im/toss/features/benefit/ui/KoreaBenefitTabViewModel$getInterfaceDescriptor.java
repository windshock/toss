package im.toss.features.benefit.ui;

import im.toss.features.benefit.dto.MissionRewardResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class KoreaBenefitTabViewModel$getInterfaceDescriptor {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public static final /* synthetic */ int[] onWarmupCompleted;

    static {
        int[] iArr = new int[MissionRewardResult.onNavigationEvent.values().length];
        try {
            iArr[MissionRewardResult.onNavigationEvent.OVERLAY.ordinal()] = 1;
            int i = onExtraCallback + 93;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MissionRewardResult.onNavigationEvent.FULL_SCREEN.ordinal()] = 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MissionRewardResult.onNavigationEvent.EXECUTE_URL.ordinal()] = 3;
            int i4 = onNavigationEvent + 71;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MissionRewardResult.onNavigationEvent.NONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        onWarmupCompleted = iArr;
    }
}
