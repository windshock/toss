package im.toss.core.webkit;

import kotlin.jvm.functions.Function2;
import o.drawTextBox;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MessageHandlerInterface$$ExternalSyntheticLambda0 implements Function2 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(drawTextBox.onExtraCallback((String) obj, (String) obj2));
        if (i3 != 0) {
            int i4 = 17 / 0;
        }
        int i5 = onWarmupCompleted + 79;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 21 / 0;
        }
        return boolValueOf;
    }
}
