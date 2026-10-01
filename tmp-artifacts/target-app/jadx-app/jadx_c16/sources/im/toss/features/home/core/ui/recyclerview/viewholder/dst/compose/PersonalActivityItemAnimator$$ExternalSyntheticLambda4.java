package im.toss.features.home.core.ui.recyclerview.viewholder.dst.compose;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.isGetMethod;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class PersonalActivityItemAnimator$$ExternalSyntheticLambda4 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ isGetMethod f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = isGetMethod.onWarmupCompleted(this.f$0, ((Float) obj).floatValue());
        int i4 = onWarmupCompleted + 43;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
