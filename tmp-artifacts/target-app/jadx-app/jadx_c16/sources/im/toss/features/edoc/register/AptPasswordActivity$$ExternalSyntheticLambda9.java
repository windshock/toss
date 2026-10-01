package im.toss.features.edoc.register;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AptPasswordActivity$$ExternalSyntheticLambda9 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ AptPasswordActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            AptPasswordActivity.onExtraCallback(this.f$0, (View) obj);
            throw null;
        }
        Unit unitOnExtraCallback = AptPasswordActivity.onExtraCallback(this.f$0, (View) obj);
        int i3 = onExtraCallbackWithResult + 45;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }
}
