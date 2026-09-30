package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class drawAll {
    private static int IAuthTabCallback = 0;
    private static int asBinder = 1;
    private final boolean onExtraCallback;
    private final setupReverse onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final String onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = asBinder + 95;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof drawAll)) {
            int i4 = asBinder + 11;
            IAuthTabCallback = i4 % 128;
            return i4 % 2 != 0;
        }
        drawAll drawall = (drawAll) obj;
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, drawall.onExtraCallbackWithResult)) {
            int i5 = IAuthTabCallback + 73;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (this.onExtraCallback != drawall.onExtraCallback) {
            return false;
        }
        if (Intrinsics.areEqual(this.onNavigationEvent, drawall.onNavigationEvent)) {
            return Intrinsics.areEqual(this.onWarmupCompleted, drawall.onWarmupCompleted);
        }
        int i7 = asBinder + 37;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = asBinder + 109;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.onExtraCallbackWithResult.hashCode();
        int iHashCode3 = Boolean.hashCode(this.onExtraCallback);
        String str = this.onNavigationEvent;
        if (str == null) {
            int i4 = IAuthTabCallback + 51;
            asBinder = i4 % 128;
            iHashCode = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.onWarmupCompleted;
        int iHashCode4 = (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0);
        int i5 = asBinder + 29;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode4;
    }

    public drawAll(@NotNull setupReverse setupreverse, boolean z, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(setupreverse, "");
        this.onExtraCallbackWithResult = setupreverse;
        this.onExtraCallback = z;
        this.onNavigationEvent = str;
        this.onWarmupCompleted = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ drawAll(setupReverse setupreverse, boolean z, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 8) != 0) {
            int i2 = IAuthTabCallback + 85;
            int i3 = i2 % 128;
            asBinder = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 47;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str2 = null;
        }
        this(setupreverse, z, str, str2);
    }

    public String toString() {
        int i = 2 % 2;
        Object obj = null;
        String str = "CacheKey(cipher=" + this.onExtraCallbackWithResult + ", encode=" + this.onExtraCallback + ", extraKey=" + this.onWarmupCompleted + ", message=" + getLayoutWidth.onExtraCallbackWithResult(this.onNavigationEvent, 48, null, 2, null) + "})";
        int i2 = asBinder + 75;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }
}
