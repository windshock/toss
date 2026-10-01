package im.toss.features.foreigner.home.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ForeignerHomeSwitchActivity$$ExternalSyntheticLambda2 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ ForeignerHomeSwitchActivity f$1;

    public /* synthetic */ ForeignerHomeSwitchActivity$$ExternalSyntheticLambda2(boolean z, ForeignerHomeSwitchActivity foreignerHomeSwitchActivity) {
        this.f$0 = z;
        this.f$1 = foreignerHomeSwitchActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = ForeignerHomeSwitchActivity.onWarmupCompleted(this.f$0, this.f$1, (SetDetectableSize) obj);
        int i4 = IAuthTabCallback + 79;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }
}
