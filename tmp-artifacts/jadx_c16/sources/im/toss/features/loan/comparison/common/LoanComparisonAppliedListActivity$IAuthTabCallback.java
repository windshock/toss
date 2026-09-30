package im.toss.features.loan.comparison.common;

import o.ImagePipelineExperimentsBuilderExternalSyntheticLambda17;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonAppliedListActivity$IAuthTabCallback {
    private static int IAuthTabCallback = 0;
    public static final /* synthetic */ int[] onExtraCallbackWithResult;
    private static int onWarmupCompleted = 1;

    static {
        int[] iArr = new int[ImagePipelineExperimentsBuilderExternalSyntheticLambda17.values().length];
        try {
            iArr[ImagePipelineExperimentsBuilderExternalSyntheticLambda17.CREDIT.ordinal()] = 1;
            int i = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ImagePipelineExperimentsBuilderExternalSyntheticLambda17.REFINANCING.ordinal()] = 2;
            int i2 = onWarmupCompleted + 33;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 5 % 4;
            } else {
                int i4 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ImagePipelineExperimentsBuilderExternalSyntheticLambda17.BUSINESS_REFINANCING.ordinal()] = 3;
            int i5 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        onExtraCallbackWithResult = iArr;
        int i6 = IAuthTabCallback + 97;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }
}
