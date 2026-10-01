package o;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class bytes2Int$onExtraCallback {
    public static final /* synthetic */ int[] onExtraCallbackWithResult;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int[] iArr = new int[getPricingPhaseList.values().length];
        try {
            iArr[getPricingPhaseList.EU.ordinal()] = 1;
            int i = onWarmupCompleted + 85;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[getPricingPhaseList.AU.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[getPricingPhaseList.KR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[getPricingPhaseList.JP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        onExtraCallbackWithResult = iArr;
        int i4 = onNavigationEvent + 105;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }
}
