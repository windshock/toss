package o;

import kotlin.collections.IndexedValue;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import o.toJSONObject$onNavigationEvent;
import o.tryUnparcel;
import org.jetbrains.annotations.NotNull;

@JvmInline
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class tryUnparcel$onNavigationEvent implements tryUnparcel {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private final Throwable onExtraCallbackWithResult;

    public static final /* synthetic */ tryUnparcel$onNavigationEvent IAuthTabCallback(Throwable th) {
        int i = 2 % 2;
        tryUnparcel$onNavigationEvent tryunparcel_onnavigationevent = new tryUnparcel$onNavigationEvent(th);
        int i2 = onWarmupCompleted + 69;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return tryunparcel_onnavigationevent;
    }

    public static String onExtraCallback(Throwable th) {
        int i = 2 % 2;
        String str = "Error(throwable=" + th + ")";
        int i2 = onExtraCallback + 103;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static Throwable onExtraCallbackWithResult(@NotNull Throwable th) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        if (i3 != 0) {
            int i4 = 47 / 0;
        }
        int i5 = onWarmupCompleted + 115;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 49 / 0;
        }
        return th;
    }

    public static int onNavigationEvent(Throwable th) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = th.hashCode();
        int i4 = onWarmupCompleted + 13;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public static boolean onWarmupCompleted(Throwable th, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        Object obj2 = null;
        if (obj instanceof tryUnparcel$onNavigationEvent) {
            if (!Intrinsics.areEqual(th, ((tryUnparcel$onNavigationEvent) obj).IAuthTabCallback())) {
                return false;
            }
            int i5 = onExtraCallback + 45;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return true;
            }
            obj2.hashCode();
            throw null;
        }
        int i6 = i3 + 31;
        int i7 = i6 % 128;
        onExtraCallback = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 21;
        onWarmupCompleted = i9 % 128;
        if (i9 % 2 != 0) {
            return false;
        }
        obj2.hashCode();
        throw null;
    }

    public final /* synthetic */ Throwable IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 101;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        Throwable th = this.onExtraCallbackWithResult;
        int i4 = i2 + 89;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return th;
        }
        throw null;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(this.onExtraCallbackWithResult, obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        boolean zOnWarmupCompleted = onWarmupCompleted(this.onExtraCallbackWithResult, obj);
        int i3 = onWarmupCompleted + 47;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 84 / 0;
        }
        return zOnWarmupCompleted;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(this.onExtraCallbackWithResult);
            throw null;
        }
        int iOnNavigationEvent = onNavigationEvent(this.onExtraCallbackWithResult);
        int i3 = onWarmupCompleted + 89;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return iOnNavigationEvent;
    }

    public String toString() {
        String strOnExtraCallback;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            strOnExtraCallback = onExtraCallback(this.onExtraCallbackWithResult);
            int i3 = 53 / 0;
        } else {
            strOnExtraCallback = onExtraCallback(this.onExtraCallbackWithResult);
        }
        int i4 = onWarmupCompleted + 33;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return strOnExtraCallback;
    }

    public /* bridge */ IndexedValue<toJSONObject$onNavigationEvent.onNavigationEvent> onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            super.onWarmupCompleted(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        IndexedValue<toJSONObject$onNavigationEvent.onNavigationEvent> indexedValueOnWarmupCompleted = super.onWarmupCompleted(str);
        int i3 = onWarmupCompleted + 105;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return indexedValueOnWarmupCompleted;
    }

    public /* bridge */ tryUnparcel.onExtraCallbackWithResult onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        tryUnparcel.onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted = super.onWarmupCompleted();
        int i4 = onExtraCallback + 83;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return onextracallbackwithresultOnWarmupCompleted;
    }

    private /* synthetic */ tryUnparcel$onNavigationEvent(Throwable th) {
        this.onExtraCallbackWithResult = th;
    }
}
