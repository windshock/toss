package im.toss.features.manualselfie.impl.controller;

import o.realEncodeBigData;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ManualSelfieVerifyResultSchemeActivity$onNavigationEvent {
    public static final /* synthetic */ int[] IAuthTabCallback;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    static {
        int[] iArr = new int[realEncodeBigData.values().length];
        try {
            iArr[realEncodeBigData.RETRY_BY_BLUR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[realEncodeBigData.RETRY_BY_FAKE.ordinal()] = 2;
            int i = onExtraCallback + 103;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[realEncodeBigData.SUCCEED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        IAuthTabCallback = iArr;
        int i3 = onNavigationEvent + 51;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }
}
