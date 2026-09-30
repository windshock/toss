package im.toss.features.home.legacy.view.transaction.detail;

import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.AuthorizationStorageProxy;
import o.getSkeleonSymbol24;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TransactionDetailActivity$$ExternalSyntheticLambda48 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ getSkeleonSymbol24 f$0;
    public final /* synthetic */ TransactionDetailActivity f$1;
    public final /* synthetic */ AuthorizationStorageProxy.onExtraCallbackWithResult f$2;

    public /* synthetic */ TransactionDetailActivity$$ExternalSyntheticLambda48(getSkeleonSymbol24 getskeleonsymbol24, TransactionDetailActivity transactionDetailActivity, AuthorizationStorageProxy.onExtraCallbackWithResult onextracallbackwithresult) {
        this.f$0 = getskeleonsymbol24;
        this.f$1 = transactionDetailActivity;
        this.f$2 = onextracallbackwithresult;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) TransactionDetailActivity.onNavigationEvent(243464899, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -243464887, new Object[]{this.f$0, this.f$1, this.f$2, Boolean.valueOf(((Boolean) obj).booleanValue())}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
        int i4 = IAuthTabCallback + 103;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
