package im.toss.core.webkit;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.ALCFaceBox;
import o.startRunning;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MessageCallbackProxyKt$$ExternalSyntheticLambda11 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ Long f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = ALCFaceBox.IAuthTabCallback(this.f$0, (startRunning) obj);
        int i4 = onExtraCallbackWithResult + 45;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
