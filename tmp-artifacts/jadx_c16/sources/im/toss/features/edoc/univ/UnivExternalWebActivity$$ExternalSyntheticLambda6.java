package im.toss.features.edoc.univ;

import kotlin.jvm.functions.Function1;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class UnivExternalWebActivity$$ExternalSyntheticLambda6 implements deserializeFloat {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            UnivExternalWebActivity.onWarmupCompleted(this.f$0, obj);
            int i3 = 86 / 0;
        } else {
            UnivExternalWebActivity.onWarmupCompleted(this.f$0, obj);
        }
        int i4 = onNavigationEvent + 7;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 80 / 0;
        }
    }
}
