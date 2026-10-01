package o;

import im.toss.core.biometric.data.ResultStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class drawIconBackgroundColor<T> {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final ResultStatus IAuthTabCallback;
    private final T onExtraCallback;
    private final boolean onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 57;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof drawIconBackgroundColor)) {
            int i7 = i3 + 75;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        drawIconBackgroundColor drawiconbackgroundcolor = (drawIconBackgroundColor) obj;
        if (this.IAuthTabCallback != drawiconbackgroundcolor.IAuthTabCallback) {
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallback, drawiconbackgroundcolor.onExtraCallback)) {
            return true;
        }
        int i9 = onExtraCallbackWithResult + 115;
        onNavigationEvent = i9 % 128;
        return i9 % 2 == 0;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 3;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            this.IAuthTabCallback.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.IAuthTabCallback.hashCode();
        T t = this.onExtraCallback;
        if (t == null) {
            i = 0;
        } else {
            int iHashCode2 = t.hashCode();
            int i4 = onExtraCallbackWithResult + 51;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 % 2;
            }
            i = iHashCode2;
        }
        return (iHashCode * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AuthenticationResult(resultStatus=" + this.IAuthTabCallback + ", resultData=" + this.onExtraCallback + ")";
        int i2 = onNavigationEvent + 17;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public drawIconBackgroundColor(@NotNull ResultStatus resultStatus, @Nullable T t) {
        boolean z;
        Intrinsics.checkNotNullParameter(resultStatus, "");
        this.IAuthTabCallback = resultStatus;
        this.onExtraCallback = t;
        if (resultStatus == ResultStatus.SUCCEEDED) {
            int i = onExtraCallbackWithResult + 33;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
            z = true;
        } else {
            z = false;
        }
        this.onWarmupCompleted = z;
        int i4 = onNavigationEvent + 119;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ drawIconBackgroundColor(ResultStatus resultStatus, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = onNavigationEvent + 123;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 33;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            obj = null;
        }
        this(resultStatus, obj);
    }

    public final T IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 41;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        T t = this.onExtraCallback;
        int i5 = i2 + 21;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 22 / 0;
        }
        return t;
    }

    public final ResultStatus onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        ResultStatus resultStatus = this.IAuthTabCallback;
        int i4 = i3 + 87;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return resultStatus;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        boolean z = this.onWarmupCompleted;
        int i5 = i3 + 21;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 7 / 0;
        }
        return z;
    }
}
