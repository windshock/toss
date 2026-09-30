package viva.republica.toss.cardrecommend.issuev2.ocr.intro;

import o.isIdent;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class CardIssueOcrIntroV2ViewModel$onWarmupCompleted$onExtraCallback {
    public static final /* synthetic */ int[] onWarmupCompleted;

    static {
        int[] iArr = new int[isIdent.values().length];
        try {
            iArr[isIdent.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[isIdent.STORAGE_ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        onWarmupCompleted = iArr;
    }
}
