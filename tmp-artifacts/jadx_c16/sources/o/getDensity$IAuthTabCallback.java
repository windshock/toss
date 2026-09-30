package o;

import kotlin.collections.IndexedValue;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import o.getDensity;
import o.toJSONObject;
import org.jetbrains.annotations.NotNull;

@JvmInline
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getDensity$IAuthTabCallback implements getDensity {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final Throwable onExtraCallbackWithResult;

    public static int IAuthTabCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            th.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = th.hashCode();
        int i3 = onWarmupCompleted + 25;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public static final /* synthetic */ getDensity$IAuthTabCallback onExtraCallback(Throwable th) {
        int i = 2 % 2;
        getDensity$IAuthTabCallback getdensity_iauthtabcallback = new getDensity$IAuthTabCallback(th);
        int i2 = onWarmupCompleted + 35;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 45 / 0;
        }
        return getdensity_iauthtabcallback;
    }

    public static Throwable onExtraCallbackWithResult(@NotNull Throwable th) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        if (i3 != 0) {
            int i4 = 94 / 0;
        }
        int i5 = onWarmupCompleted + 115;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return th;
    }

    public static boolean onExtraCallbackWithResult(Throwable th, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 9;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (!(obj instanceof getDensity$IAuthTabCallback)) {
            int i5 = i2 + 109;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (Intrinsics.areEqual(th, ((getDensity$IAuthTabCallback) obj).onNavigationEvent())) {
            return true;
        }
        int i7 = onWarmupCompleted + 25;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public static String onWarmupCompleted(Throwable th) {
        int i = 2 % 2;
        String str = "Error(throwable=" + th + ")";
        int i2 = onNavigationEvent + 89;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(this.onExtraCallbackWithResult, obj);
            throw null;
        }
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(this.onExtraCallbackWithResult, obj);
        int i3 = onWarmupCompleted + 89;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return zOnExtraCallbackWithResult;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallback(this.onExtraCallbackWithResult);
            throw null;
        }
        int iIAuthTabCallback = IAuthTabCallback(this.onExtraCallbackWithResult);
        int i3 = onNavigationEvent + 85;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return iIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    public final /* synthetic */ Throwable onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Throwable th = this.onExtraCallbackWithResult;
        if (i3 == 0) {
            int i4 = 42 / 0;
        }
        return th;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String strOnWarmupCompleted = onWarmupCompleted(this.onExtraCallbackWithResult);
        int i4 = onNavigationEvent + 109;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return strOnWarmupCompleted;
        }
        throw null;
    }

    public /* bridge */ IndexedValue<toJSONObject.IAuthTabCallback> onNavigationEvent(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.onNavigationEvent(str);
            obj.hashCode();
            throw null;
        }
        IndexedValue<toJSONObject.IAuthTabCallback> indexedValueOnNavigationEvent = super.onNavigationEvent(str);
        int i3 = onWarmupCompleted + 97;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return indexedValueOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ getDensity.onNavigationEvent onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            super.onWarmupCompleted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getDensity.onNavigationEvent onnavigationeventOnWarmupCompleted = super.onWarmupCompleted();
        int i3 = onNavigationEvent + 69;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return onnavigationeventOnWarmupCompleted;
    }

    private /* synthetic */ getDensity$IAuthTabCallback(Throwable th) {
        this.onExtraCallbackWithResult = th;
    }
}
