package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class tryToStringObjectMap {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    private final Integer IAuthTabCallback;
    private final Object onExtraCallbackWithResult;
    private final Integer onNavigationEvent;

    public static /* synthetic */ tryToStringObjectMap onWarmupCompleted(tryToStringObjectMap trytostringobjectmap, Object obj, Integer num, Integer num2, int i, Object obj2) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 119;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            obj = trytostringobjectmap.onExtraCallbackWithResult;
            int i5 = i4 + 97;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 / 3;
            }
        }
        if ((i & 2) != 0) {
            num = trytostringobjectmap.onNavigationEvent;
        }
        if ((i & 4) != 0) {
            num2 = trytostringobjectmap.IAuthTabCallback;
        }
        return trytostringobjectmap.onExtraCallbackWithResult(obj, num, num2);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 125;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof tryToStringObjectMap)) {
            int i6 = i3 + 3;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i3 + 67;
            onExtraCallback = i8 % 128;
            if (i8 % 2 != 0) {
                return false;
            }
            throw null;
        }
        tryToStringObjectMap trytostringobjectmap = (tryToStringObjectMap) obj;
        if ((!Intrinsics.areEqual(this.onExtraCallbackWithResult, trytostringobjectmap.onExtraCallbackWithResult)) || !Intrinsics.areEqual(this.onNavigationEvent, trytostringobjectmap.onNavigationEvent)) {
            return false;
        }
        if (Intrinsics.areEqual(this.IAuthTabCallback, trytostringobjectmap.IAuthTabCallback)) {
            return true;
        }
        int i9 = onWarmupCompleted + 87;
        onExtraCallback = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.onExtraCallbackWithResult.hashCode();
        Integer num = this.onNavigationEvent;
        int iHashCode3 = 0;
        if (num == null) {
            int i2 = onWarmupCompleted + 79;
            onExtraCallback = i2 % 128;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = num.hashCode();
        }
        Integer num2 = this.IAuthTabCallback;
        if (num2 != null) {
            iHashCode3 = num2.hashCode();
            int i3 = onExtraCallback + 121;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        }
        return (((iHashCode2 * 31) + iHashCode) * 31) + iHashCode3;
    }

    public final tryToStringObjectMap onExtraCallbackWithResult(@NotNull Object obj, @Nullable Integer num, @Nullable Integer num2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        tryToStringObjectMap trytostringobjectmap = new tryToStringObjectMap(obj, num, num2);
        int i2 = onWarmupCompleted + 7;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 43 / 0;
        }
        return trytostringobjectmap;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ElementHeightState(id=" + this.onExtraCallbackWithResult + ", initHeight=" + this.onNavigationEvent + ", targetHeight=" + this.IAuthTabCallback + ")";
        int i2 = onWarmupCompleted + 27;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 46 / 0;
        }
        return str;
    }

    public tryToStringObjectMap(@NotNull Object obj, @Nullable Integer num, @Nullable Integer num2) {
        Intrinsics.checkNotNullParameter(obj, "");
        this.onExtraCallbackWithResult = obj;
        this.onNavigationEvent = num;
        this.IAuthTabCallback = num2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ tryToStringObjectMap(Object obj, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = onWarmupCompleted + 83;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 4;
            } else {
                int i4 = 2 % 2;
            }
            num = null;
        }
        if ((i & 4) != 0) {
            int i5 = onWarmupCompleted + 21;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            num2 = null;
        }
        this(obj, num, num2);
    }

    public final Object onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 21;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Object obj = this.onExtraCallbackWithResult;
        int i5 = i2 + 13;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return obj;
    }

    public final Integer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 59;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer num = this.onNavigationEvent;
        int i4 = i2 + 49;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    public final Integer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
