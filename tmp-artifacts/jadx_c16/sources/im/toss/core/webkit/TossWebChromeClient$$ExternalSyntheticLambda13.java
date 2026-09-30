package im.toss.core.webkit;

import kotlin.jvm.functions.Function1;
import o.deserializeFloat;
import o.setCircleColor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossWebChromeClient$$ExternalSyntheticLambda13 implements deserializeFloat {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onExtraCallbackWithResult = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            setCircleColor.onNavigationEvent(this.f$0, obj);
            throw null;
        }
        setCircleColor.onNavigationEvent(this.f$0, obj);
        int i3 = onExtraCallbackWithResult + 99;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }
}
