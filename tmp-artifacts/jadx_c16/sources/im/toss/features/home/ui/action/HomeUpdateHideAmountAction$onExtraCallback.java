package im.toss.features.home.ui.action;

import o.checkAppxSupportCrossVersionSnapshot;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeUpdateHideAmountAction$onExtraCallback {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public static final /* synthetic */ int[] onWarmupCompleted;

    static {
        int[] iArr = new int[checkAppxSupportCrossVersionSnapshot.values().length];
        try {
            iArr[checkAppxSupportCrossVersionSnapshot.ALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[checkAppxSupportCrossVersionSnapshot.INVESTING.ordinal()] = 2;
            int i = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[checkAppxSupportCrossVersionSnapshot.SAVING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[checkAppxSupportCrossVersionSnapshot.LOAN.ordinal()] = 4;
            int i2 = onExtraCallbackWithResult + 117;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[checkAppxSupportCrossVersionSnapshot.POINT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[checkAppxSupportCrossVersionSnapshot.PENSION.ordinal()] = 6;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[checkAppxSupportCrossVersionSnapshot.CONSUMPTION.ordinal()] = 7;
            int i5 = onExtraCallback + 93;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[checkAppxSupportCrossVersionSnapshot.INVESTMENT_PORTFOLIO.ordinal()] = 8;
            int i8 = onExtraCallbackWithResult + 5;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[checkAppxSupportCrossVersionSnapshot.GROUP_SAVING.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[checkAppxSupportCrossVersionSnapshot.ETC.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[checkAppxSupportCrossVersionSnapshot.STORE.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        onWarmupCompleted = iArr;
    }
}
