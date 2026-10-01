package im.toss.features.home.ui.action;

import o.checkAppxSupportCrossVersionSnapshot;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeHideAmountAction$onExtraCallback {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public static final /* synthetic */ int[] onWarmupCompleted;

    static {
        int[] iArr = new int[checkAppxSupportCrossVersionSnapshot.values().length];
        try {
            iArr[checkAppxSupportCrossVersionSnapshot.ALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[checkAppxSupportCrossVersionSnapshot.INVESTING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[checkAppxSupportCrossVersionSnapshot.SAVING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[checkAppxSupportCrossVersionSnapshot.LOAN.ordinal()] = 4;
            int i = 2 % 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[checkAppxSupportCrossVersionSnapshot.POINT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[checkAppxSupportCrossVersionSnapshot.PENSION.ordinal()] = 6;
            int i2 = 2 % 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[checkAppxSupportCrossVersionSnapshot.CONSUMPTION.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[checkAppxSupportCrossVersionSnapshot.INVESTMENT_PORTFOLIO.ordinal()] = 8;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[checkAppxSupportCrossVersionSnapshot.GROUP_SAVING.ordinal()] = 9;
            int i4 = onNavigationEvent + 3;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[checkAppxSupportCrossVersionSnapshot.ETC.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[checkAppxSupportCrossVersionSnapshot.STORE.ordinal()] = 11;
            int i7 = onExtraCallbackWithResult + 121;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
        } catch (NoSuchFieldError unused11) {
        }
        onWarmupCompleted = iArr;
    }
}
