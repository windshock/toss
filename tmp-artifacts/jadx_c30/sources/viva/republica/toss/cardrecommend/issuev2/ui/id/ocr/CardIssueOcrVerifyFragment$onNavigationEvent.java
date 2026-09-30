package viva.republica.toss.cardrecommend.issuev2.ui.id.ocr;

import o.JavaBeanInfo;
import o.getAlgorithmHash;
import viva.republica.toss.network.model.cardsales.funnel.formvalue.IdVerificationFormValue;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class CardIssueOcrVerifyFragment$onNavigationEvent {
    public static final /* synthetic */ int[] onExtraCallbackWithResult;
    public static final /* synthetic */ int[] onNavigationEvent;
    public static final /* synthetic */ int[] onWarmupCompleted;

    static {
        int[] iArr = new int[JavaBeanInfo.values().length];
        try {
            iArr[JavaBeanInfo.RESIDENCE_CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[JavaBeanInfo.DRIVERS_LICENSE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        onExtraCallbackWithResult = iArr;
        int[] iArr2 = new int[IdVerificationFormValue.IdType.values().length];
        try {
            iArr2[IdVerificationFormValue.IdType.RESIDENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[IdVerificationFormValue.IdType.DRIVER.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        onWarmupCompleted = iArr2;
        int[] iArr3 = new int[getAlgorithmHash.values().length];
        try {
            iArr3[getAlgorithmHash.RETRY.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[getAlgorithmHash.MOVE_TO_FAILURE_SCREEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[getAlgorithmHash.MOVE_TO_FAILURE_SCREEN_WITH_IMAGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        onNavigationEvent = iArr3;
    }
}
