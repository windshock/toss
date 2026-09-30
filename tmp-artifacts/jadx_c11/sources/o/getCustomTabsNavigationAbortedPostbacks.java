package o;

import android.graphics.Color;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getCustomTabsNavigationAbortedPostbacks {
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private static int asInterface = 1;
    private static final int onExtraCallbackWithResult;
    private static final int onNavigationEvent;
    private static int onWarmupCompleted;
    public static final getCustomTabsNavigationAbortedPostbacks IAuthTabCallback = new getCustomTabsNavigationAbortedPostbacks();
    private static final int onExtraCallback = Color.argb(0, 242, 244, 246);

    private getCustomTabsNavigationAbortedPostbacks() {
    }

    static {
        charset charsetVar = charset.onExtraCallbackWithResult;
        onNavigationEvent = charsetVar.ICustomTabsService().IAuthTabCallback();
        onExtraCallbackWithResult = charsetVar.validateRelationship().IAuthTabCallback();
        int i = asBinder + 35;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 31 / 0;
        }
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 21;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = onExtraCallback;
        int i5 = i2 + 11;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 87;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = onNavigationEvent;
        int i5 = i3 + 125;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 89;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        int i5 = onExtraCallbackWithResult;
        int i6 = i3 + 1;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }
}
