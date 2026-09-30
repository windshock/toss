package o;

import androidx.core.view.WindowInsetsCompat;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class forceInnerPermissionCheck {
    private static int IAuthTabCallback = 0;
    private static int asInterface = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public static final forceInnerPermissionCheck onExtraCallbackWithResult = new forceInnerPermissionCheck();
    private static final int onWarmupCompleted = (WindowInsetsCompat.onTransact.asBinder() | WindowInsetsCompat.onTransact.onExtraCallbackWithResult()) | WindowInsetsCompat.onTransact.IAuthTabCallback();

    private forceInnerPermissionCheck() {
    }

    public final int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 35;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = IAuthTabCallback + 95;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }
}
