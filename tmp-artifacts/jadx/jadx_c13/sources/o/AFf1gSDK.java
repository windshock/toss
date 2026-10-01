package o;

import kotlin.jvm.internal.Intrinsics;
import o.AFf1jSDK;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFf1gSDK<T extends AFf1jSDK> {
    public static final int IAuthTabCallback = SurfaceProcessorNodeOut.onExtraCallbackWithResult;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder;
    private static int onTransact;
    private final Double onExtraCallback;
    private final T onExtraCallbackWithResult;
    private final float onNavigationEvent;
    private final SurfaceProcessorNodeOut onWarmupCompleted;

    static {
        int i = asBinder + 111;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallbackStub + 13;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof AFf1gSDK)) {
            return false;
        }
        AFf1gSDK aFf1gSDK = (AFf1gSDK) obj;
        if (Intrinsics.areEqual(this.onExtraCallbackWithResult, aFf1gSDK.onExtraCallbackWithResult)) {
            return !(Intrinsics.areEqual(this.onWarmupCompleted, aFf1gSDK.onWarmupCompleted) ^ true) && VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.onNavigationEvent, aFf1gSDK.onNavigationEvent) && Intrinsics.areEqual((Object) this.onExtraCallback, (Object) aFf1gSDK.onExtraCallback);
        }
        int i4 = IAuthTabCallbackStub + 9;
        onTransact = i4 % 128;
        return i4 % 2 != 0;
    }

    public int hashCode() {
        T t;
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = onTransact + 109;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int iHashCode3 = 0;
        if (i2 % 2 != 0 ? (t = this.onExtraCallbackWithResult) != null : (t = this.onExtraCallbackWithResult) != null) {
            iHashCode = t.hashCode();
        } else {
            int i4 = i3 + 55;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        }
        SurfaceProcessorNodeOut surfaceProcessorNodeOut = this.onWarmupCompleted;
        if (surfaceProcessorNodeOut == null) {
            int i6 = onTransact + 11;
            int i7 = i6 % 128;
            IAuthTabCallbackStub = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 113;
            onTransact = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 2 / 2;
            }
            iHashCode2 = 0;
        } else {
            iHashCode2 = surfaceProcessorNodeOut.hashCode();
        }
        int iOnWarmupCompleted = VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onNavigationEvent);
        Double d = this.onExtraCallback;
        if (d != null) {
            int i11 = onTransact + 27;
            IAuthTabCallbackStub = i11 % 128;
            if (i11 % 2 == 0) {
                d.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iHashCode3 = d.hashCode();
        }
        return (((((iHashCode * 31) + iHashCode2) * 31) + iOnWarmupCompleted) * 31) + iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Content(entry=" + this.onExtraCallbackWithResult + ", textLayoutResult=" + this.onWarmupCompleted + ", offsetY=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.onNavigationEvent) + ", price=" + this.onExtraCallback + ")";
        int i2 = IAuthTabCallbackStub + 31;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final T IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 49;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        T t = this.onExtraCallbackWithResult;
        int i5 = i2 + 45;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return t;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final SurfaceProcessorNodeOut onExtraCallbackWithResult() {
        SurfaceProcessorNodeOut surfaceProcessorNodeOut;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 49;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            surfaceProcessorNodeOut = this.onWarmupCompleted;
            int i4 = 52 / 0;
        } else {
            surfaceProcessorNodeOut = this.onWarmupCompleted;
        }
        int i5 = i2 + 7;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return surfaceProcessorNodeOut;
    }

    public final float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 69;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        float f = this.onNavigationEvent;
        int i5 = i2 + 51;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final Double onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact + 55;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        Double d = this.onExtraCallback;
        int i5 = i3 + 55;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return d;
    }
}
