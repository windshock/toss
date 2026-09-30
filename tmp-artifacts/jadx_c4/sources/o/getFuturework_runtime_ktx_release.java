package o;

import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getFuturework_runtime_ktx_release {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final String IAuthTabCallback;
    private final ImageView.ScaleType onExtraCallback;
    private final float onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 109;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof getFuturework_runtime_ktx_release)) {
            int i4 = onWarmupCompleted + 71;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        getFuturework_runtime_ktx_release getfuturework_runtime_ktx_release = (getFuturework_runtime_ktx_release) obj;
        if (!Intrinsics.areEqual(this.IAuthTabCallback, getfuturework_runtime_ktx_release.IAuthTabCallback)) {
            int i6 = onExtraCallbackWithResult + 87;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.onExtraCallback == getfuturework_runtime_ktx_release.onExtraCallback) {
            return Float.compare(this.onNavigationEvent, getfuturework_runtime_ktx_release.onNavigationEvent) == 0;
        }
        int i8 = onExtraCallbackWithResult;
        int i9 = i8 + 77;
        onWarmupCompleted = i9 % 128;
        int i10 = i9 % 2;
        int i11 = i8 + 3;
        onWarmupCompleted = i11 % 128;
        if (i11 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.IAuthTabCallback.hashCode();
        return i3 != 0 ? (((iHashCode / 75) * this.onExtraCallback.hashCode()) >>> 114) % Float.hashCode(this.onNavigationEvent) : (((iHashCode * 31) + this.onExtraCallback.hashCode()) * 31) + Float.hashCode(this.onNavigationEvent);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ScaleTransitionImageTarget(url=" + this.IAuthTabCallback + ", scaleType=" + this.onExtraCallback + ", contentScale=" + this.onNavigationEvent + ")";
        int i2 = onExtraCallbackWithResult + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public getFuturework_runtime_ktx_release(@NotNull String str, @NotNull ImageView.ScaleType scaleType, float f) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(scaleType, "");
        this.IAuthTabCallback = str;
        this.onExtraCallback = scaleType;
        this.onNavigationEvent = f;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 49;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.IAuthTabCallback;
        int i5 = i2 + 49;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final ImageView.ScaleType onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 103;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        ImageView.ScaleType scaleType = this.onExtraCallback;
        int i5 = i2 + 107;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return scaleType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float IAuthTabCallback() {
        float f;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 67;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            f = this.onNavigationEvent;
            int i4 = 34 / 0;
        } else {
            f = this.onNavigationEvent;
        }
        int i5 = i2 + 79;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }
}
