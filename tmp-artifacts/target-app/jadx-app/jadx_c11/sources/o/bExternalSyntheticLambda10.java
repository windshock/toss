package o;

import android.graphics.Color;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class bExternalSyntheticLambda10 {
    private static final int IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 0;
    private static int asInterface = 1;
    public static final bExternalSyntheticLambda10 onExtraCallback = new bExternalSyntheticLambda10();
    private static final int onExtraCallbackWithResult;
    private static final int onNavigationEvent;
    private static int onTransact = 1;
    private static final int onWarmupCompleted;

    private bExternalSyntheticLambda10() {
    }

    static {
        charset charsetVar = charset.onExtraCallbackWithResult;
        IAuthTabCallback = charsetVar.setEngagementSignalsCallback().onExtraCallbackWithResult();
        onWarmupCompleted = Color.argb(244, 43, 43, 45);
        onNavigationEvent = Color.argb(0, 43, 43, 45);
        onExtraCallbackWithResult = charsetVar.ICustomTabsService().onExtraCallbackWithResult();
        int i = onTransact + 73;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 117;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallback;
        int i5 = i3 + 67;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 7;
        int i3 = i2 % 128;
        asInterface = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onWarmupCompleted;
        int i5 = i3 + 93;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        obj.hashCode();
        throw null;
    }

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 85;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        int i5 = onWarmupCompleted;
        int i6 = i2 + 7;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 21;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int i4 = onNavigationEvent;
        if (i3 == 0) {
            int i5 = 88 / 0;
        }
        return i4;
    }

    public final int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 103;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        int i5 = onExtraCallbackWithResult;
        int i6 = i3 + 9;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }
}
