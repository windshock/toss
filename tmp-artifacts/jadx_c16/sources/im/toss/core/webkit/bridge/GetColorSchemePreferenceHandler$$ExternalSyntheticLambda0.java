package im.toss.core.webkit.bridge;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.changeBitmapContrastBrightness;
import o.startRunning;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class GetColorSchemePreferenceHandler$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ Context f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onExtraCallback = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            changeBitmapContrastBrightness.onExtraCallbackWithResult(this.f$0, (startRunning) obj);
            obj2.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = changeBitmapContrastBrightness.onExtraCallbackWithResult(this.f$0, (startRunning) obj);
        int i3 = onExtraCallbackWithResult + 47;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }
}
