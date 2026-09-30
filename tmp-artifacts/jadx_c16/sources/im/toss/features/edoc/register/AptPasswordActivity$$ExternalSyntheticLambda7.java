package im.toss.features.edoc.register;

import kotlin.jvm.functions.Function1;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AptPasswordActivity$$ExternalSyntheticLambda7 implements deserializeFloat {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        AptPasswordActivity.onTransact(this.f$0, obj);
        int i4 = onExtraCallbackWithResult + 39;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
