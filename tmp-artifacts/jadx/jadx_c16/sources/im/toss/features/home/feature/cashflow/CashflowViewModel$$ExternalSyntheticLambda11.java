package im.toss.features.home.feature.cashflow;

import j$.time.LocalDate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.getTyroBlockTime;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CashflowViewModel$$ExternalSyntheticLambda11 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ LocalDate f$0;
    public final /* synthetic */ getTyroBlockTime.onNavigationEvent.IAuthTabCallback f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ CashflowViewModel$$ExternalSyntheticLambda11(LocalDate localDate, getTyroBlockTime.onNavigationEvent.IAuthTabCallback iAuthTabCallback, String str) {
        this.f$0 = localDate;
        this.f$1 = iAuthTabCallback;
        this.f$2 = str;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = CashflowViewModel.onExtraCallback(this.f$0, this.f$1, this.f$2, (SetDetectableSize) obj);
        int i4 = onExtraCallbackWithResult + 65;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 48 / 0;
        }
        return unitOnExtraCallback;
    }
}
