package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class initFileds$onNavigationEvent extends initFileds {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private final Throwable onExtraCallbackWithResult;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 97;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 73 / 0;
            }
            return true;
        }
        if (!(obj instanceof initFileds$onNavigationEvent)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallbackWithResult, ((initFileds$onNavigationEvent) obj).onExtraCallbackWithResult)) {
            return true;
        }
        int i4 = IAuthTabCallback + 81;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            iHashCode = this.onExtraCallbackWithResult.hashCode();
            int i3 = 98 / 0;
        } else {
            iHashCode = this.onExtraCallbackWithResult.hashCode();
        }
        int i4 = IAuthTabCallback + 43;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 14 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Error(error=" + this.onExtraCallbackWithResult + ")";
        int i2 = IAuthTabCallback + 11;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 6 / 0;
        }
        return str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public initFileds$onNavigationEvent(@NotNull Throwable th) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(th, "");
        this.onExtraCallbackWithResult = th;
    }

    public final Throwable IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Throwable th = this.onExtraCallbackWithResult;
        if (i3 != 0) {
            int i4 = 17 / 0;
        }
        return th;
    }
}
