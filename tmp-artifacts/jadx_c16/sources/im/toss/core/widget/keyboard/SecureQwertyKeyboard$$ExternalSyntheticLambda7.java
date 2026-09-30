package im.toss.core.widget.keyboard;

import kotlin.jvm.functions.Function0;
import o.fillPrepareEventData;
import o.getPreRenderJob;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class SecureQwertyKeyboard$$ExternalSyntheticLambda7 implements Function0 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return (fillPrepareEventData) SecureQwertyKeyboard.onNavigationEvent(new Object[0], -1966984091, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 1966984094, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
