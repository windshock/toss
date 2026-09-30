package im.toss.features.main.ui;

import o.getPricingPhaseList;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MainActivity$IAuthTabCallback {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public static final /* synthetic */ int[] onExtraCallbackWithResult;
    public static final /* synthetic */ int[] onNavigationEvent;

    static {
        int[] iArr = new int[getPricingPhaseList.values().length];
        try {
            iArr[getPricingPhaseList.KR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[getPricingPhaseList.AU.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[getPricingPhaseList.EU.ordinal()] = 3;
            int i = IAuthTabCallback + 55;
            onExtraCallback = i % 128;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[getPricingPhaseList.JP.ordinal()] = 4;
            int i3 = onExtraCallback + 11;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 / 2;
            } else {
                int i5 = 2 % 2;
            }
        } catch (NoSuchFieldError unused4) {
        }
        onNavigationEvent = iArr;
        int[] iArr2 = new int[MainActivity$onNavigationEvent.values().length];
        try {
            iArr2[MainActivity$onNavigationEvent.UPDATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[MainActivity$onNavigationEvent.SKIP_UPDATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[MainActivity$onNavigationEvent.DISMISS.ordinal()] = 3;
            int i6 = 2 % 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[MainActivity$onNavigationEvent.NOT_SHOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        onExtraCallbackWithResult = iArr2;
    }
}
