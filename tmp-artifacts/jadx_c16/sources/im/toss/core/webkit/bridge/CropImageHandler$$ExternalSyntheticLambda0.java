package im.toss.core.webkit.bridge;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.flippingBitmap;
import o.matches;
import o.startRunning;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CropImageHandler$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {(startRunning) obj};
        int iOnExtraCallback = matches.onExtraCallback();
        int iOnExtraCallback2 = matches.onExtraCallback();
        int iOnExtraCallback3 = matches.onExtraCallback();
        if (i3 == 0) {
            return (Unit) flippingBitmap.IAuthTabCallback(iOnExtraCallback2, matches.onExtraCallback(), 344810475, objArr, -344810474, iOnExtraCallback, iOnExtraCallback3);
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
