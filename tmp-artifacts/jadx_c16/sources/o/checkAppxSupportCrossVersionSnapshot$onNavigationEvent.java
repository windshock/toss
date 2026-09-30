package o;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class checkAppxSupportCrossVersionSnapshot$onNavigationEvent {
    private static int IAuthTabCallback = 1;
    public static final /* synthetic */ int[] onExtraCallbackWithResult;
    private static int onNavigationEvent;

    static {
        int[] iArr = new int[checkAppxSupportCrossVersionSnapshot.values().length];
        try {
            iArr[checkAppxSupportCrossVersionSnapshot.SAVING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[checkAppxSupportCrossVersionSnapshot.LOAN.ordinal()] = 2;
            int i = onNavigationEvent + 81;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[checkAppxSupportCrossVersionSnapshot.INVESTING.ordinal()] = 3;
            int i4 = onNavigationEvent + 71;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[checkAppxSupportCrossVersionSnapshot.PENSION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[checkAppxSupportCrossVersionSnapshot.POINT.ordinal()] = 5;
            int i6 = 2 % 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[checkAppxSupportCrossVersionSnapshot.ETC.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[checkAppxSupportCrossVersionSnapshot.ALL.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[checkAppxSupportCrossVersionSnapshot.CONSUMPTION.ordinal()] = 8;
            int i7 = 2 % 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[checkAppxSupportCrossVersionSnapshot.INVESTMENT_PORTFOLIO.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[checkAppxSupportCrossVersionSnapshot.GROUP_SAVING.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[checkAppxSupportCrossVersionSnapshot.STORE.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        onExtraCallbackWithResult = iArr;
        int i8 = onNavigationEvent + 57;
        IAuthTabCallback = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
