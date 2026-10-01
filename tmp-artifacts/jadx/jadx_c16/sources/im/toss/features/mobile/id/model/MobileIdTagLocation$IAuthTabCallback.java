package im.toss.features.mobile.id.model;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdTagLocation$IAuthTabCallback {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public static final /* synthetic */ int[] onWarmupCompleted;

    static {
        int[] iArr = new int[MobileIdTagLocation.values().length];
        try {
            int iOrdinal = MobileIdTagLocation.TOP.ordinal();
            int i = onExtraCallbackWithResult + 107;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
            iArr[iOrdinal] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MobileIdTagLocation.MIDDLE.ordinal()] = 2;
            int i3 = onExtraCallbackWithResult + 89;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MobileIdTagLocation.BOTTOM.ordinal()] = 3;
            int i6 = IAuthTabCallback + 119;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        onWarmupCompleted = iArr;
        int i9 = IAuthTabCallback + 31;
        onExtraCallbackWithResult = i9 % 128;
        int i10 = i9 % 2;
    }
}
