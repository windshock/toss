package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFf1nSDK<T> implements AFf1fSDK<AFf1mSDK<T>> {
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallbackWithResult;
    private final float IAuthTabCallback;
    private final AFf1mSDK<T> onExtraCallback;
    private final long onNavigationEvent;
    private final float onWarmupCompleted;

    public /* synthetic */ AFf1nSDK(AFf1mSDK aFf1mSDK, long j, float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFf1mSDK, j, f, f2);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallbackStub + 103;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof AFf1nSDK)) {
            return false;
        }
        AFf1nSDK aFf1nSDK = (AFf1nSDK) obj;
        if (!Intrinsics.areEqual(this.onExtraCallback, aFf1nSDK.onExtraCallback)) {
            int i4 = onExtraCallbackWithResult + 63;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!setUseCaseAttached.onWarmupCompleted(this.onNavigationEvent, aFf1nSDK.onNavigationEvent)) {
            return false;
        }
        if (Float.compare(this.IAuthTabCallback, aFf1nSDK.IAuthTabCallback) == 0) {
            return Float.compare(this.onWarmupCompleted, aFf1nSDK.onWarmupCompleted) == 0;
        }
        int i6 = onExtraCallbackWithResult + 43;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 79;
        onExtraCallbackWithResult = i2 % 128;
        return i2 % 2 != 0 ? (((((r0 >> 59) >> setUseCaseAttached.IAuthTabCallbackStub(this.onNavigationEvent)) - 98) / Float.hashCode(this.IAuthTabCallback)) >>> 51) - Float.hashCode(this.onWarmupCompleted) : (((((this.onExtraCallback.hashCode() * 31) + setUseCaseAttached.IAuthTabCallbackStub(this.onNavigationEvent)) * 31) + Float.hashCode(this.IAuthTabCallback)) * 31) + Float.hashCode(this.onWarmupCompleted);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LineEntryDrawState(entry=" + this.onExtraCallback + ", offset=" + setUseCaseAttached.IAuthTabCallbackDefault(this.onNavigationEvent) + ", highOffsetY=" + this.IAuthTabCallback + ", lowOffsetY=" + this.onWarmupCompleted + ")";
        int i2 = IAuthTabCallbackStub + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private AFf1nSDK(AFf1mSDK<T> aFf1mSDK, long j, float f, float f2) {
        Intrinsics.checkNotNullParameter(aFf1mSDK, "");
        this.onExtraCallback = aFf1mSDK;
        this.onNavigationEvent = j;
        this.IAuthTabCallback = f;
        this.onWarmupCompleted = f2;
    }

    @Override // o.AFf1fSDK
    public /* synthetic */ AFf1jSDK onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        AFf1mSDK<T> aFf1mSDKOnExtraCallback = onExtraCallback();
        int i4 = onExtraCallbackWithResult + 25;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return aFf1mSDKOnExtraCallback;
    }

    public AFf1mSDK<T> onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + Imgproc.COLOR_YUV2RGB_YVYU;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        AFf1mSDK<T> aFf1mSDK = this.onExtraCallback;
        int i5 = i3 + 3;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return aFf1mSDK;
    }

    @Override // o.AFf1fSDK
    public long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 1;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onNavigationEvent;
        }
        throw null;
    }

    public final float onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        float f = this.IAuthTabCallback;
        int i4 = i3 + Imgproc.COLOR_YUV2RGB_YVYU;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return f;
        }
        obj.hashCode();
        throw null;
    }

    public final float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 51;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
