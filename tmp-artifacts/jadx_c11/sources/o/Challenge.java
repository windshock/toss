package o;

import o.javaName;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class Challenge {
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int asInterface = 1;
    public static final Challenge IAuthTabCallback = new Challenge();
    private static final javaName onWarmupCompleted = new javaName.onWarmupCompleted(2.0f);
    private static final javaName onExtraCallbackWithResult = new javaName.onWarmupCompleted(1.0f);
    private static final javaName onExtraCallback = new javaName.onWarmupCompleted(0.66f);
    private static final javaName onNavigationEvent = new javaName.IAuthTabCallback(1);

    private Challenge() {
    }

    static {
        int i = asInterface + 121;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final javaName onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 45;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        javaName javaname = onExtraCallbackWithResult;
        int i5 = i2 + 115;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 55 / 0;
        }
        return javaname;
    }

    public final javaName onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 15;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        javaName javaname = onNavigationEvent;
        int i5 = i2 + 111;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return javaname;
        }
        throw null;
    }
}
