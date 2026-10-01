package im.toss.core.widget.keyboard;

import android.view.inputmethod.InputConnection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.AppManagerImpl2;
import o.AppMsgReceiver;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class SecureQwertyKeyboardAdapterKt$$ExternalSyntheticLambda0 implements Function1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ InputConnection f$0;
    public final /* synthetic */ SecureQwertyKeyboard f$1;

    public /* synthetic */ SecureQwertyKeyboardAdapterKt$$ExternalSyntheticLambda0(InputConnection inputConnection, SecureQwertyKeyboard secureQwertyKeyboard) {
        this.f$0 = inputConnection;
        this.f$1 = secureQwertyKeyboard;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = AppMsgReceiver.onNavigationEvent(this.f$0, this.f$1, (AppManagerImpl2) obj);
        int i4 = onNavigationEvent + 111;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
