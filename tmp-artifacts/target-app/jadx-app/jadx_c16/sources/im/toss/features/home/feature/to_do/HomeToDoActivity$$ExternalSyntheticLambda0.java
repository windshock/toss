package im.toss.features.home.feature.to_do;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeToDoActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ HomeToDoActivity f$0;

    public final Object invoke(Object obj) {
        Unit unitIAuthTabCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            unitIAuthTabCallback = HomeToDoActivity.IAuthTabCallback(this.f$0, ((Float) obj).floatValue());
            int i3 = 85 / 0;
        } else {
            unitIAuthTabCallback = HomeToDoActivity.IAuthTabCallback(this.f$0, ((Float) obj).floatValue());
        }
        int i4 = IAuthTabCallback + 49;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
