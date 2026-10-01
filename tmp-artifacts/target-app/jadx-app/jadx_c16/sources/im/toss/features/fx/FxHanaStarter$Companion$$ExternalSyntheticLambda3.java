package im.toss.features.fx;

import kotlin.jvm.functions.Function1;
import o.deserializeFloat;
import o.generateLegacyNativeId;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FxHanaStarter$Companion$$ExternalSyntheticLambda3 implements deserializeFloat {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        generateLegacyNativeId.IAuthTabCallback.onWarmupCompleted(this.f$0, obj);
        int i4 = onExtraCallback + 45;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 31 / 0;
        }
    }
}
