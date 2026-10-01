package im.toss.features.home.feature.cashflow;

import j$.time.YearMonth;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CashflowViewModel$$ExternalSyntheticLambda13 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ YearMonth f$1;

    public /* synthetic */ CashflowViewModel$$ExternalSyntheticLambda13(String str, YearMonth yearMonth) {
        this.f$0 = str;
        this.f$1 = yearMonth;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = CashflowViewModel.onNavigationEvent(this.f$0, this.f$1, (SetDetectableSize) obj);
        int i4 = onNavigationEvent + 109;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 18 / 0;
        }
        return unitOnNavigationEvent;
    }
}
