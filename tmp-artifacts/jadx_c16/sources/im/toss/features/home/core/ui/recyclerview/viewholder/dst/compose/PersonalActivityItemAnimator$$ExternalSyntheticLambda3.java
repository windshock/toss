package im.toss.features.home.core.ui.recyclerview.viewholder.dst.compose;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.isGetMethod;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class PersonalActivityItemAnimator$$ExternalSyntheticLambda3 implements Function0 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ isGetMethod f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            isGetMethod.onWarmupCompleted(this.f$0);
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = isGetMethod.onWarmupCompleted(this.f$0);
        int i3 = onExtraCallback + 51;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }
}
