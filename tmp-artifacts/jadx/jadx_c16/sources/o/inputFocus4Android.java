package o;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class inputFocus4Android {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private final Set<onExtraCallback> onExtraCallbackWithResult;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 37;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i3 + 63;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }
        if (!(obj instanceof inputFocus4Android)) {
            int i9 = i3 + 73;
            IAuthTabCallback = i9 % 128;
            return i9 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, ((inputFocus4Android) obj).onExtraCallbackWithResult)) {
            int i10 = onNavigationEvent + 15;
            IAuthTabCallback = i10 % 128;
            return i10 % 2 != 0;
        }
        int i11 = onNavigationEvent + 123;
        IAuthTabCallback = i11 % 128;
        int i12 = i11 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onExtraCallbackWithResult.hashCode();
        int i4 = onNavigationEvent + 125;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ExpenseMethodUpdateRequestDto(changed=" + this.onExtraCallbackWithResult + ")";
        int i2 = IAuthTabCallback + 125;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 9 / 0;
        }
        return str;
    }

    public inputFocus4Android(@NotNull Set<onExtraCallback> set) {
        Intrinsics.checkNotNullParameter(set, "");
        this.onExtraCallbackWithResult = set;
    }

    public final Set<onExtraCallback> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        Set<onExtraCallback> set = this.onExtraCallbackWithResult;
        int i5 = i3 + 89;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return set;
        }
        throw null;
    }
}
