package im.toss.core.webkit;

import kotlin.jvm.functions.Function1;
import o.deserializeIntNullableCollection;
import o.setBackgroundAlpha;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossDownloadListener$$ExternalSyntheticLambda9 implements deserializeIntNullableCollection {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ Function1 f$0;

    public final Object apply(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Function1 function1 = this.f$0;
        if (i3 != 0) {
            return setBackgroundAlpha.onNavigationEvent(function1, obj);
        }
        setBackgroundAlpha.onNavigationEvent(function1, obj);
        throw null;
    }
}
