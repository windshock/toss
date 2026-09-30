package im.toss.features.home.feature.cashflow;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.ProcessUtils;
import o.contextGetScreenOrientation;
import o.matches;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CashflowSelectCategoryViewModel$$ExternalSyntheticLambda2 implements Function0 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ CashflowSelectCategoryViewModel f$0;
    public final /* synthetic */ ProcessUtils.IAuthTabCallback f$1;
    public final /* synthetic */ contextGetScreenOrientation.onNavigationEvent f$2;

    public /* synthetic */ CashflowSelectCategoryViewModel$$ExternalSyntheticLambda2(CashflowSelectCategoryViewModel cashflowSelectCategoryViewModel, ProcessUtils.IAuthTabCallback iAuthTabCallback, contextGetScreenOrientation.onNavigationEvent onnavigationevent) {
        this.f$0 = cashflowSelectCategoryViewModel;
        this.f$1 = iAuthTabCallback;
        this.f$2 = onnavigationevent;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, this.f$1, this.f$2};
        int iOnExtraCallback = matches.onExtraCallback();
        int iOnExtraCallback2 = matches.onExtraCallback();
        Unit unit = (Unit) CashflowSelectCategoryViewModel.IAuthTabCallback(matches.onExtraCallback(), iOnExtraCallback, objArr, matches.onExtraCallback(), -1528574409, iOnExtraCallback2, 1528574412);
        int i4 = onExtraCallback + 107;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
