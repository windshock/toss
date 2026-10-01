package o;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class Address {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    public static final Address onNavigationEvent = new Address();
    private static int onWarmupCompleted = 1;

    static {
        int i = onExtraCallbackWithResult + 113;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i4;
        int i8 = i7 | i6;
        int i9 = ~i8;
        int i10 = ~i;
        int i11 = i9 | (~(i10 | i6));
        int i12 = i8 | i10;
        int i13 = (~(i | i6)) | (~(i7 | (~i6)));
        int i14 = i6 + i4 + i2 + ((-1311665080) * i3) + (1761575915 * i5);
        int i15 = i14 * i14;
        int i16 = ((-2073022045) * i6) + 412680192 + (1917570655 * i4) + (i11 * (-1995296350)) + (1995296350 * i12) + ((-1995296350) * i13) + ((-77725696) * i2) + (175112192 * i3) + ((-649461760) * i5) + (1783169024 * i15);
        int i17 = ((i6 * 1226044109) - 1701849991) + (i4 * 1226043089) + (i11 * 510) + (i12 * (-510)) + (i13 * 510) + (i2 * 1226043599) + (i3 * (-858626504)) + (i5 * 1069087493) + (i15 * 1627848704);
        return i16 + ((i17 * i17) * 739704832) != 1 ? onNavigationEvent(objArr) : IAuthTabCallback(objArr);
    }

    private Address() {
    }

    public final Interpolator asInterface() {
        int i = 2 % 2;
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        int i2 = IAuthTabCallback + 43;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return linearInterpolator;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Interpolator IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Interpolator interpolator = (Interpolator) onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1041671130, new Object[]{this, Float.valueOf(0.4f), Float.valueOf(0.7f), Float.valueOf(0.0f), Float.valueOf(1.0f)}, nSetPosition.onExtraCallbackWithResult(), 1041671131);
        int i4 = onExtraCallback + 25;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return interpolator;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Interpolator onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Interpolator interpolator = (Interpolator) onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1041671130, new Object[]{this, Float.valueOf(0.6f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.6f)}, nSetPosition.onExtraCallbackWithResult(), 1041671131);
        int i4 = onExtraCallback + 15;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return interpolator;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Interpolator asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Interpolator interpolator = (Interpolator) onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1041671130, new Object[]{this, Float.valueOf(0.25f), Float.valueOf(0.1f), Float.valueOf(0.25f), Float.valueOf(1.0f)}, nSetPosition.onExtraCallbackWithResult(), 1041671131);
        int i4 = onExtraCallback + 63;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return interpolator;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Interpolator onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Interpolator interpolator = (Interpolator) onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1041671130, new Object[]{this, Float.valueOf(0.16f), Float.valueOf(1.0f), Float.valueOf(0.3f), Float.valueOf(1.0f)}, nSetPosition.onExtraCallbackWithResult(), 1041671131);
        int i4 = onExtraCallback + 97;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return interpolator;
        }
        throw null;
    }

    public final Interpolator IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Interpolator interpolator = (Interpolator) onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1041671130, new Object[]{this, Float.valueOf(0.34f), Float.valueOf(1.56f), Float.valueOf(0.64f), Float.valueOf(1.0f)}, nSetPosition.onExtraCallbackWithResult(), 1041671131);
        int i4 = IAuthTabCallback + 77;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
        return interpolator;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Address address = (Address) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Interpolator interpolator = (Interpolator) onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1041671130, new Object[]{address, Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.58f), Float.valueOf(1.0f)}, nSetPosition.onExtraCallbackWithResult(), 1041671131);
        int i4 = IAuthTabCallback + 55;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return interpolator;
    }

    public final Interpolator IAuthTabCallbackDefault() {
        Object objOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            objOnNavigationEvent = onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1041671130, new Object[]{this, Float.valueOf(0.1f), Float.valueOf(0.25f), Float.valueOf(1.0f), Float.valueOf(0.25f)}, nSetPosition.onExtraCallbackWithResult(), 1041671131);
        } else {
            objOnNavigationEvent = onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1041671130, new Object[]{this, Float.valueOf(0.1f), Float.valueOf(0.25f), Float.valueOf(1.0f), Float.valueOf(0.25f)}, nSetPosition.onExtraCallbackWithResult(), 1041671131);
        }
        return (Interpolator) objOnNavigationEvent;
    }

    public final Interpolator onNavigationEvent() {
        Object objOnNavigationEvent;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            objOnNavigationEvent = onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1041671130, new Object[]{this, Float.valueOf(2.0f), Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(0.58f)}, nSetPosition.onExtraCallbackWithResult(), 1041671131);
        } else {
            objOnNavigationEvent = onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1041671130, new Object[]{this, Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(0.58f)}, nSetPosition.onExtraCallbackWithResult(), 1041671131);
        }
        return (Interpolator) objOnNavigationEvent;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        float fFloatValue = ((Number) objArr[1]).floatValue();
        float fFloatValue2 = ((Number) objArr[2]).floatValue();
        float fFloatValue3 = ((Number) objArr[3]).floatValue();
        float fFloatValue4 = ((Number) objArr[4]).floatValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Interpolator interpolatorIAuthTabCallback = TransitionKtExternalSyntheticLambda2.IAuthTabCallback(fFloatValue, fFloatValue2, fFloatValue3, fFloatValue4);
        Intrinsics.checkNotNullExpressionValue(interpolatorIAuthTabCallback, "");
        int i4 = IAuthTabCallback + 55;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return interpolatorIAuthTabCallback;
    }

    public final Interpolator onExtraCallback() {
        return (Interpolator) onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 338196445, new Object[]{this}, nSetPosition.onExtraCallbackWithResult(), -338196445);
    }

    public final Interpolator onExtraCallbackWithResult(float f, float f2, float f3, float f4) {
        return (Interpolator) onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1041671130, new Object[]{this, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)}, nSetPosition.onExtraCallbackWithResult(), 1041671131);
    }
}
