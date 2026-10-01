package o;

import kotlin.jvm.internal.Intrinsics;
import o.QuirksExternalSyntheticBackport0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class AFg1kSDK extends SupportedOutputSizesSorterLegacy<AFg1nSDK> {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final Object onExtraCallback;
    private final AFg1oSDK onNavigationEvent;
    private final AFg1qSDK onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 65;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof AFg1kSDK)) {
            int i4 = onExtraCallbackWithResult + 79;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        AFg1kSDK aFg1kSDK = (AFg1kSDK) obj;
        if (!Intrinsics.areEqual(this.onWarmupCompleted, aFg1kSDK.onWarmupCompleted)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallback, aFg1kSDK.onExtraCallback)) {
            if (this.onNavigationEvent != aFg1kSDK.onNavigationEvent) {
                return false;
            }
            int i6 = onExtraCallbackWithResult + 33;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        int i8 = IAuthTabCallback + Imgproc.COLOR_YUV2RGB_YVYU;
        int i9 = i8 % 128;
        onExtraCallbackWithResult = i9;
        int i10 = i8 % 2;
        int i11 = i9 + 71;
        IAuthTabCallback = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onWarmupCompleted.hashCode();
        return i3 != 0 ? (((iHashCode / 77) >>> this.onExtraCallback.hashCode()) << 3) * this.onNavigationEvent.hashCode() : (((iHashCode * 31) + this.onExtraCallback.hashCode()) * 31) + this.onNavigationEvent.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BoundsTrackingElement(state=" + this.onWarmupCompleted + ", key=" + this.onExtraCallback + ", kind=" + this.onNavigationEvent + ")";
        int i2 = IAuthTabCallback + 91;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public AFg1kSDK(@NotNull AFg1qSDK aFg1qSDK, @NotNull Object obj, @NotNull AFg1oSDK aFg1oSDK) {
        Intrinsics.checkNotNullParameter(aFg1qSDK, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(aFg1oSDK, "");
        this.onWarmupCompleted = aFg1qSDK;
        this.onExtraCallback = obj;
        this.onNavigationEvent = aFg1oSDK;
    }

    public /* synthetic */ QuirksExternalSyntheticBackport0.onWarmupCompleted onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        AFg1nSDK aFg1nSDKOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = IAuthTabCallback + 73;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return aFg1nSDKOnExtraCallbackWithResult;
        }
        throw null;
    }

    public /* bridge */ /* synthetic */ void onNavigationEvent(QuirksExternalSyntheticBackport0.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent((AFg1nSDK) onwarmupcompleted);
        int i4 = onExtraCallbackWithResult + 83;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 46 / 0;
        }
    }

    public AFg1nSDK onExtraCallbackWithResult() {
        int i = 2 % 2;
        AFg1nSDK aFg1nSDK = new AFg1nSDK(this.onWarmupCompleted, this.onExtraCallback, this.onNavigationEvent);
        int i2 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return aFg1nSDK;
    }

    public void onNavigationEvent(@NotNull AFg1nSDK aFg1nSDK) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(aFg1nSDK, "");
            aFg1nSDK.onNavigationEvent(this.onWarmupCompleted, this.onExtraCallback, this.onNavigationEvent);
        } else {
            Intrinsics.checkNotNullParameter(aFg1nSDK, "");
            aFg1nSDK.onNavigationEvent(this.onWarmupCompleted, this.onExtraCallback, this.onNavigationEvent);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
