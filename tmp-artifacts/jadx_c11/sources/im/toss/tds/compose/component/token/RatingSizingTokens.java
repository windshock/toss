package im.toss.tds.compose.component.token;

import o.VirtualCameraControlExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RatingSizingTokens {
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 1;
    private static int asInterface;
    public static final RatingSizingTokens onExtraCallback = new RatingSizingTokens();
    private static final float onWarmupCompleted = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f);
    private static final float onNavigationEvent = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f);
    private static final float IAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f);
    private static final float onExtraCallbackWithResult = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(40.0f);
    private static final float onTransact = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f);

    private RatingSizingTokens() {
    }

    public final float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 95;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted;
        }
        throw null;
    }

    public final float onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 113;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float f = onNavigationEvent;
        int i4 = i3 + 55;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 33 / 0;
        }
        return f;
    }

    public final float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 79;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        float f = IAuthTabCallback;
        int i5 = i3 + 15;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return f;
        }
        throw null;
    }

    public final float onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 17;
        IAuthTabCallbackDefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        float f = onExtraCallbackWithResult;
        int i4 = i2 + 87;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return f;
        }
        throw null;
    }

    public final float onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 71;
        IAuthTabCallbackStub = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        float f = onTransact;
        int i4 = i2 + 95;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return f;
        }
        throw null;
    }

    static {
        int i = asInterface + 63;
        asBinder = i % 128;
        int i2 = i % 2;
    }
}
