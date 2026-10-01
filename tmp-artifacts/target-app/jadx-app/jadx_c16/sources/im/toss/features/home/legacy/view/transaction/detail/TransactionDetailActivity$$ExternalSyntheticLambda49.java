package im.toss.features.home.legacy.view.transaction.detail;

import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getSkeleonSymbol24;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TransactionDetailActivity$$ExternalSyntheticLambda49 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ TransactionDetailActivity f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ getSkeleonSymbol24 f$3;
    public final /* synthetic */ Function1 f$4;
    public final /* synthetic */ String f$5;
    public final /* synthetic */ boolean f$6;

    public /* synthetic */ TransactionDetailActivity$$ExternalSyntheticLambda49(boolean z, TransactionDetailActivity transactionDetailActivity, int i, getSkeleonSymbol24 getskeleonsymbol24, Function1 function1, String str, boolean z2) {
        this.f$0 = z;
        this.f$1 = transactionDetailActivity;
        this.f$2 = i;
        this.f$3 = getskeleonsymbol24;
        this.f$4 = function1;
        this.f$5 = str;
        this.f$6 = z2;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.f$0;
        TransactionDetailActivity transactionDetailActivity = this.f$1;
        if (i3 == 0) {
            int i4 = this.f$2;
            Object[] objArr = {Boolean.valueOf(z), transactionDetailActivity, Integer.valueOf(i4), this.f$3, this.f$4, this.f$5, Boolean.valueOf(this.f$6), Boolean.valueOf(((Boolean) obj).booleanValue())};
            return (Unit) TransactionDetailActivity.onNavigationEvent(2085199680, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -2085199645, objArr, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
        }
        int i5 = this.f$2;
        Object[] objArr2 = {Boolean.valueOf(z), transactionDetailActivity, Integer.valueOf(i5), this.f$3, this.f$4, this.f$5, Boolean.valueOf(this.f$6), Boolean.valueOf(((Boolean) obj).booleanValue())};
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
