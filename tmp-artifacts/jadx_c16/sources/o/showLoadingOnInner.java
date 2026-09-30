package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class showLoadingOnInner {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final String IAuthTabCallback;
    private final String onExtraCallback;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 115;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 93;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (obj instanceof showLoadingOnInner) {
            showLoadingOnInner showloadingoninner = (showLoadingOnInner) obj;
            return Intrinsics.areEqual(this.IAuthTabCallback, showloadingoninner.IAuthTabCallback) && !(Intrinsics.areEqual(this.onExtraCallback, showloadingoninner.onExtraCallback) ^ true);
        }
        int i8 = i2 + 75;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        onNavigationEvent = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (this.IAuthTabCallback.hashCode() >>> 107) >>> this.onExtraCallback.hashCode() : (this.IAuthTabCallback.hashCode() * 31) + this.onExtraCallback.hashCode();
        int i3 = onExtraCallbackWithResult + 93;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ConsumptionCategoryAddParameterDto(categoryName=" + this.IAuthTabCallback + ", categoryIconNo=" + this.onExtraCallback + ")";
        int i2 = onExtraCallbackWithResult + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public showLoadingOnInner(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.IAuthTabCallback = str;
        this.onExtraCallback = str2;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 23;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.IAuthTabCallback;
        int i5 = i2 + 37;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 73;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.onExtraCallback;
        int i4 = i2 + 107;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }
}
