package im.toss.core.webkit;

import android.content.DialogInterface;
import android.webkit.JsResult;
import kotlin.jvm.functions.Function1;
import o.setCircleColor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossWebChromeClient$$ExternalSyntheticLambda22 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ JsResult f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        JsResult jsResult = this.f$0;
        DialogInterface dialogInterface = (DialogInterface) obj;
        if (i3 != 0) {
            return setCircleColor.onWarmupCompleted(jsResult, dialogInterface);
        }
        setCircleColor.onWarmupCompleted(jsResult, dialogInterface);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
