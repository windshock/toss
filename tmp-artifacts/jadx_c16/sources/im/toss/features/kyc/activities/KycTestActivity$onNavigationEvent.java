package im.toss.features.kyc.activities;

import o.setExtraJsT2MapStr;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class KycTestActivity$onNavigationEvent {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public static final /* synthetic */ int[] onNavigationEvent;

    static {
        int[] iArr = new int[setExtraJsT2MapStr.values().length];
        try {
            iArr[setExtraJsT2MapStr.NOT_KYC_TARGET.ordinal()] = 1;
            int i = onExtraCallback + 121;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[setExtraJsT2MapStr.CDD_CANCELED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[setExtraJsT2MapStr.CDD_FAILURE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[setExtraJsT2MapStr.CDD_DONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[setExtraJsT2MapStr.EDD_DONE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[setExtraJsT2MapStr.EDD_CANCELED.ordinal()] = 6;
            int i4 = IAuthTabCallback + 43;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 3;
            } else {
                int i6 = 2 % 2;
            }
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[setExtraJsT2MapStr.EDD_FAILURE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[setExtraJsT2MapStr.PIN_CANCELED.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[setExtraJsT2MapStr.BLOCKED_USER.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[setExtraJsT2MapStr.GRC_PENDING.ordinal()] = 10;
            int i7 = 2 % 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[setExtraJsT2MapStr.EEDD_CANCELED.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        onNavigationEvent = iArr;
    }
}
