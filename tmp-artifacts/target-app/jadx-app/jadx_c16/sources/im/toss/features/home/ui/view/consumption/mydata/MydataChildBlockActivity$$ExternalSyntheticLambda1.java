package im.toss.features.home.ui.view.consumption.mydata;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MydataChildBlockActivity$$ExternalSyntheticLambda1 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ MydataChildBlockActivity$$ExternalSyntheticLambda1(String str, String str2) {
        this.f$0 = str;
        this.f$1 = str2;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.f$0;
        if (i3 != 0) {
            return MydataChildBlockActivity.onExtraCallbackWithResult(str, this.f$1, (SetDetectableSize) obj);
        }
        Unit unitOnExtraCallbackWithResult = MydataChildBlockActivity.onExtraCallbackWithResult(str, this.f$1, (SetDetectableSize) obj);
        int i4 = 29 / 0;
        return unitOnExtraCallbackWithResult;
    }
}
