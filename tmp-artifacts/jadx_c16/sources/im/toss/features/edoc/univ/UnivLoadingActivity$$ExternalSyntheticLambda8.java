package im.toss.features.edoc.univ;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.GeckoHubImp;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class UnivLoadingActivity$$ExternalSyntheticLambda8 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ UnivLoadingActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, (Throwable) obj};
        Unit unit = (Unit) UnivLoadingActivity.onExtraCallbackWithResult(-1396231693, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1396231698, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), objArr);
        int i4 = onExtraCallback + 107;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
