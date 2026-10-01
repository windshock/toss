package o;

import android.content.Context;
import im.toss.di.SecurityModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class generatePageId implements captureStartValues<Object> {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final createAnimators<Context> onExtraCallback;
    private final SecurityModule onExtraCallbackWithResult;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent$293635e4();
        }
        onNavigationEvent$293635e4();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Object onNavigationEvent$293635e4() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        SecurityModule securityModule = this.onExtraCallbackWithResult;
        if (i3 == 0) {
            return onExtraCallback$69f38128(securityModule, (Context) this.onExtraCallback.get());
        }
        onExtraCallback$69f38128(securityModule, (Context) this.onExtraCallback.get());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static Object onExtraCallback$69f38128(SecurityModule securityModule, Context context) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = createAnimator.onNavigationEvent(securityModule.onNavigationEvent$64b92fa2(context));
        int i4 = onNavigationEvent + 1;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return objOnNavigationEvent;
        }
        throw null;
    }
}
