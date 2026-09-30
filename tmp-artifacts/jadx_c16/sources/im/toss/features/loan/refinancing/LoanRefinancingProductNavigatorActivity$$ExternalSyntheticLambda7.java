package im.toss.features.loan.refinancing;

import gatewayprotocol.v1.AdResponseKtKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanRefinancingProductNavigatorActivity$$ExternalSyntheticLambda7 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ LoanRefinancingProductNavigatorActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onExtraCallbackWithResult = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            Object[] objArr = {this.f$0, (Throwable) obj};
            throw null;
        }
        Object[] objArr2 = {this.f$0, (Throwable) obj};
        Unit unit = (Unit) LoanRefinancingProductNavigatorActivity.onExtraCallback(-1458047835, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), 1458047836, AdResponseKtKt.IAuthTabCallback(), objArr2, AdResponseKtKt.IAuthTabCallback());
        int i3 = onExtraCallbackWithResult + 29;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        obj2.hashCode();
        throw null;
    }
}
