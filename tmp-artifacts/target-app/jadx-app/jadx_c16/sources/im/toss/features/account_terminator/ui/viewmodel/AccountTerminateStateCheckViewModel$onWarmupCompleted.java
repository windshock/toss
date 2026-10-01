package im.toss.features.account_terminator.ui.viewmodel;

import im.toss.features.account_terminator.core.model.AccountTerminateStateCheckPollingResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AccountTerminateStateCheckViewModel$onWarmupCompleted {
    private static int onExtraCallback = 0;
    public static final /* synthetic */ int[] onExtraCallbackWithResult;
    private static int onWarmupCompleted = 1;

    static {
        int[] iArr = new int[AccountTerminateStateCheckPollingResult.LastStep.values().length];
        try {
            iArr[AccountTerminateStateCheckPollingResult.LastStep.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AccountTerminateStateCheckPollingResult.LastStep.ELIGIBILITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AccountTerminateStateCheckPollingResult.LastStep.RECIPIENT.ordinal()] = 3;
            int i = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AccountTerminateStateCheckPollingResult.LastStep.ESTIMATE.ordinal()] = 4;
            int i2 = onExtraCallback + 59;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[AccountTerminateStateCheckPollingResult.LastStep.TERMINATE.ordinal()] = 5;
            int i5 = onWarmupCompleted + 97;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 / 5;
            } else {
                int i7 = 2 % 2;
            }
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[AccountTerminateStateCheckPollingResult.LastStep.ERROR.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        onExtraCallbackWithResult = iArr;
    }
}
