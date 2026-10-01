package im.toss.core.webkit;

import kotlin.jvm.functions.Function1;
import o.ALCCamera;
import o.deserializeIntNullableCollection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CustomTabsSessionManager$$ExternalSyntheticLambda1 implements deserializeIntNullableCollection {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Function1 f$0;

    public final Object apply(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolOnExtraCallback = ALCCamera.onExtraCallback(this.f$0, obj);
        int i4 = onExtraCallbackWithResult + 11;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return boolOnExtraCallback;
    }
}
