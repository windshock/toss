package im.toss.features.fx;

import im.toss.base.BaseActivity;
import kotlin.jvm.functions.Function1;
import o.generateLegacyNativeId;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FxHanaStarter$Companion$$ExternalSyntheticLambda2 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ BaseActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        BaseActivity baseActivity = this.f$0;
        Throwable th = (Throwable) obj;
        if (i3 == 0) {
            return generateLegacyNativeId.IAuthTabCallback.onWarmupCompleted(baseActivity, th);
        }
        generateLegacyNativeId.IAuthTabCallback.onWarmupCompleted(baseActivity, th);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
