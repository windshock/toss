package o;

import android.content.Context;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class convertErrorInternalbugsnag_android_core_release {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    public static final /* synthetic */ boolean onNavigationEvent(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(context);
        }
        onExtraCallbackWithResult(context);
        throw null;
    }

    private static final boolean onExtraCallbackWithResult(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            int i4 = IAuthTabCallback + 39;
            onExtraCallback = i4 % 128;
            return i4 % 2 == 0;
        }
        int i5 = IAuthTabCallback + 37;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }
}
