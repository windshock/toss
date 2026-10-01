package im.toss.core.widget;

import android.os.Handler;
import android.os.Message;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class SmoothProgressBar$$ExternalSyntheticLambda0 implements Handler.Callback {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ SmoothProgressBar f$0;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            SmoothProgressBar.onNavigationEvent(this.f$0, message);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zOnNavigationEvent = SmoothProgressBar.onNavigationEvent(this.f$0, message);
        int i3 = onNavigationEvent + 101;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return zOnNavigationEvent;
    }
}
