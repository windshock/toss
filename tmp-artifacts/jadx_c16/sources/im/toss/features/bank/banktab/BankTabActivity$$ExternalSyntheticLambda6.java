package im.toss.features.bank.banktab;

import im.toss.global.features.kyc.eu.main.cdd.ui.identity_confirm.GlobalKycEuIdentityConfirmViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BankTabActivity$$ExternalSyntheticLambda6 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ Ref.IntRef f$0;
    public final /* synthetic */ List f$1;

    public /* synthetic */ BankTabActivity$$ExternalSyntheticLambda6(Ref.IntRef intRef, List list) {
        this.f$0 = intRef;
        this.f$1 = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, this.f$1, Integer.valueOf(((Integer) obj).intValue()), Integer.valueOf(((Integer) obj2).intValue())};
        Unit unit = (Unit) BankTabActivity.onExtraCallback(GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 252347092, -252347089, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), objArr, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted());
        int i4 = IAuthTabCallback + 15;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
