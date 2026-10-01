package im.toss.features.kyc.eedd;

import im.toss.features.kyc.navigation.models.Status;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class KycEeddActivity$onNavigationEvent {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public static final /* synthetic */ int[] onNavigationEvent;

    static {
        int[] iArr = new int[Status.values().length];
        try {
            iArr[Status.KYC_FORCED.ordinal()] = 1;
            int i = onExtraCallback + 15;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Status.KYC_NEEDED.ordinal()] = 2;
            int i3 = onExtraCallback + 77;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Status.PENDING.ordinal()] = 3;
            int i6 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Status.REJECTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        onNavigationEvent = iArr;
    }
}
