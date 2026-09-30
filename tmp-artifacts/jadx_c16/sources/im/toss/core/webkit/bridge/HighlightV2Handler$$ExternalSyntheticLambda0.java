package im.toss.core.webkit.bridge;

import kotlin.jvm.functions.Function2;
import o.base64StringImage;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HighlightV2Handler$$ExternalSyntheticLambda0 implements Function2 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(base64StringImage.onNavigationEvent((String) obj, (String) obj2));
        int i4 = onWarmupCompleted + 91;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 35 / 0;
        }
        return boolValueOf;
    }
}
