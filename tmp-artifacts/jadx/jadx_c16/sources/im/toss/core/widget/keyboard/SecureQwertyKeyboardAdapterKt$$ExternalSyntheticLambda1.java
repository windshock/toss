package im.toss.core.widget.keyboard;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.AppManagerImpl2;
import o.AppMsgReceiver;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class SecureQwertyKeyboardAdapterKt$$ExternalSyntheticLambda1 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onWarmupCompleted = i2 % 128;
        Object obj2 = null;
        AppManagerImpl2 appManagerImpl2 = (AppManagerImpl2) obj;
        if (i2 % 2 == 0) {
            AppMsgReceiver.onExtraCallbackWithResult(appManagerImpl2);
            obj2.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = AppMsgReceiver.onExtraCallbackWithResult(appManagerImpl2);
        int i3 = onWarmupCompleted + 81;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        obj2.hashCode();
        throw null;
    }
}
