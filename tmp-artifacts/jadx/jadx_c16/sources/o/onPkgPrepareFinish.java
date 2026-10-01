package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class onPkgPrepareFinish {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    private final String onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 29;
        onExtraCallbackWithResult = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (this != obj) {
            if (obj instanceof onPkgPrepareFinish) {
                return Intrinsics.areEqual(this.onWarmupCompleted, ((onPkgPrepareFinish) obj).onWarmupCompleted);
            }
            int i4 = i2 + 113;
            onExtraCallbackWithResult = i4 % 128;
            return i4 % 2 != 0;
        }
        int i5 = i2 + 39;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i2 + 121;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            return true;
        }
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            iHashCode = this.onWarmupCompleted.hashCode();
            int i3 = 90 / 0;
        } else {
            iHashCode = this.onWarmupCompleted.hashCode();
        }
        int i4 = onExtraCallbackWithResult + 39;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 19 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ConsumptionCategoryDeleteParameterDto(categoryNo=" + this.onWarmupCompleted + ")";
        int i2 = onExtraCallbackWithResult + 11;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public onPkgPrepareFinish(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onWarmupCompleted = str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 121;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onWarmupCompleted;
        int i5 = i2 + 13;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 77 / 0;
        }
        return str;
    }
}
