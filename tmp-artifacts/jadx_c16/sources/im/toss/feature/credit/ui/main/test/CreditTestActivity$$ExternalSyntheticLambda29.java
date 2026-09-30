package im.toss.feature.credit.ui.main.test;

import im.toss.compose.v0.ComposableSingletons$TdsTopV1Kt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditTestActivity$$ExternalSyntheticLambda29 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ CreditTestActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = {this.f$0};
            int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
            throw null;
        }
        Object[] objArr2 = {this.f$0};
        int iOnExtraCallback3 = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback4 = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        Unit unit = (Unit) CreditTestActivity.onWarmupCompleted(-460647099, iOnExtraCallback3, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 460647118, objArr2, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback4);
        int i3 = IAuthTabCallback + 69;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }
}
