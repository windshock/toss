package im.toss.core.webkit;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.setBackgroundAlpha;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossDownloadListener$$ExternalSyntheticLambda4 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Context f$0;
    public final /* synthetic */ setBackgroundAlpha f$1;

    public /* synthetic */ TossDownloadListener$$ExternalSyntheticLambda4(Context context, setBackgroundAlpha setbackgroundalpha) {
        this.f$0 = context;
        this.f$1 = setbackgroundalpha;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = setBackgroundAlpha.onExtraCallback(this.f$0, this.f$1, (String) obj);
        int i4 = onWarmupCompleted + 111;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
