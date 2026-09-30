package viva.republica.toss.verify.unblock.point;

import im.toss.define.TossAffiliate;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class UnblockSessionIntroFragment$onExtraCallback {
    public static final /* synthetic */ int[] IAuthTabCallback;

    static {
        int[] iArr = new int[TossAffiliate.values().length];
        try {
            iArr[TossAffiliate.CORE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TossAffiliate.BANK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        IAuthTabCallback = iArr;
    }
}
