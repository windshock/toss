package o;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
final class getScaleX$onExtraCallback {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    private final List<String> onExtraCallback;
    private final boolean onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getScaleX$onExtraCallback)) {
            int i5 = i3 + 99;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        getScaleX$onExtraCallback getscalex_onextracallback = (getScaleX$onExtraCallback) obj;
        if (this.onWarmupCompleted != getscalex_onextracallback.onWarmupCompleted) {
            int i7 = i3 + 77;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallback, getscalex_onextracallback.onExtraCallback)) {
            return true;
        }
        int i9 = onExtraCallbackWithResult + 105;
        IAuthTabCallback = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        IAuthTabCallback = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (Boolean.hashCode(this.onWarmupCompleted) * 25) % this.onExtraCallback.hashCode() : (Boolean.hashCode(this.onWarmupCompleted) * 31) + this.onExtraCallback.hashCode();
        int i3 = onExtraCallbackWithResult + 117;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FilterDecision(shouldFilter=" + this.onWarmupCompleted + ", filterReasons=" + this.onExtraCallback + ")";
        int i2 = onExtraCallbackWithResult + 91;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public getScaleX$onExtraCallback(boolean z, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.onWarmupCompleted = z;
        this.onExtraCallback = list;
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 15;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        boolean z = this.onWarmupCompleted;
        int i4 = i2 + 83;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    public final List<String> onExtraCallback() {
        List<String> list;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            list = this.onExtraCallback;
            int i4 = 43 / 0;
        } else {
            list = this.onExtraCallback;
        }
        int i5 = i3 + 5;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }
}
