package im.toss.core.webkit.bridge;

import kotlin.jvm.functions.Function2;
import o.getFaceBitmapToByteArray;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HighlightV3Handler$$ExternalSyntheticLambda1 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(getFaceBitmapToByteArray.onNavigationEvent((String) obj, (String) obj2));
        int i4 = onExtraCallbackWithResult + 49;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return boolValueOf;
        }
        throw null;
    }
}
