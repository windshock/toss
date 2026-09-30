package im.toss.features.home.core.remote.model.cashflow.analysis.section;

import im.toss.features.home.core.remote.model.cashflow.analysis.section.CashflowAnalysisSectionResponse;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CashflowAnalysisSectionResponse$onExtraCallbackWithResult$onExtraCallback {
    private static int IAuthTabCallback = 0;
    public static final /* synthetic */ int[] onExtraCallback;
    private static int onNavigationEvent = 1;

    static {
        int[] iArr = new int[CashflowAnalysisSectionResponse.onExtraCallbackWithResult.values().length];
        try {
            iArr[CashflowAnalysisSectionResponse.onExtraCallbackWithResult.CALENDAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CashflowAnalysisSectionResponse.onExtraCallbackWithResult.CATEGORY_REPORT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CashflowAnalysisSectionResponse.onExtraCallbackWithResult.ESTIMATED_REMAINING.ordinal()] = 3;
            int i = onNavigationEvent + 25;
            IAuthTabCallback = i % 128;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CashflowAnalysisSectionResponse.onExtraCallbackWithResult.EXPECTED_SPENDING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[CashflowAnalysisSectionResponse.onExtraCallbackWithResult.REGULAR_EXPENSE.ordinal()] = 5;
            int i3 = IAuthTabCallback + 9;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 % 2;
            }
        } catch (NoSuchFieldError unused5) {
        }
        onExtraCallback = iArr;
    }
}
