package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class isAdaptiveAdViewFormat {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final getWrappingSdk IAuthTabCallback;
    private final long onExtraCallback;
    private final long onExtraCallbackWithResult;

    public /* synthetic */ isAdaptiveAdViewFormat(getWrappingSdk getwrappingsdk, long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(getwrappingsdk, j, j2);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 21;
            int i6 = i5 % 128;
            onNavigationEvent = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 75;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            return true;
        }
        if (!(obj instanceof isAdaptiveAdViewFormat)) {
            return false;
        }
        isAdaptiveAdViewFormat isadaptiveadviewformat = (isAdaptiveAdViewFormat) obj;
        if (this.IAuthTabCallback != isadaptiveadviewformat.IAuthTabCallback) {
            int i10 = i3 + 55;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!setUseCaseAttached.onWarmupCompleted(this.onExtraCallbackWithResult, isadaptiveadviewformat.onExtraCallbackWithResult)) {
            return false;
        }
        if (setUseCaseAttached.onWarmupCompleted(this.onExtraCallback, isadaptiveadviewformat.onExtraCallback)) {
            return true;
        }
        int i12 = onNavigationEvent + 3;
        onWarmupCompleted = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.IAuthTabCallback.hashCode();
        return i3 != 0 ? (((iHashCode >>> 9) << setUseCaseAttached.IAuthTabCallbackStub(this.onExtraCallbackWithResult)) << 77) >>> setUseCaseAttached.IAuthTabCallbackStub(this.onExtraCallback) : (((iHashCode * 31) + setUseCaseAttached.IAuthTabCallbackStub(this.onExtraCallbackWithResult)) * 31) + setUseCaseAttached.IAuthTabCallbackStub(this.onExtraCallback);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PressEvent(action=" + this.IAuthTabCallback + ", position=" + setUseCaseAttached.IAuthTabCallbackDefault(this.onExtraCallbackWithResult) + ", downPosition=" + setUseCaseAttached.IAuthTabCallbackDefault(this.onExtraCallback) + ")";
        int i2 = onNavigationEvent + 47;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private isAdaptiveAdViewFormat(getWrappingSdk getwrappingsdk, long j, long j2) {
        Intrinsics.checkNotNullParameter(getwrappingsdk, "");
        this.IAuthTabCallback = getwrappingsdk;
        this.onExtraCallbackWithResult = j;
        this.onExtraCallback = j2;
    }

    public final getWrappingSdk onExtraCallback() {
        getWrappingSdk getwrappingsdk;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            getwrappingsdk = this.IAuthTabCallback;
            int i4 = 62 / 0;
        } else {
            getwrappingsdk = this.IAuthTabCallback;
        }
        int i5 = i3 + 39;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return getwrappingsdk;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = this.onExtraCallbackWithResult;
        int i4 = i3 + 121;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
