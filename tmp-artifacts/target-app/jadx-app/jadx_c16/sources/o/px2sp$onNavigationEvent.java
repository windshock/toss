package o;

import kotlin.collections.IndexedValue;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import o.px2sp;
import o.toJSONObject$onNavigationEvent;
import org.jetbrains.annotations.NotNull;

@JvmInline
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class px2sp$onNavigationEvent implements px2sp {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    private final Throwable onNavigationEvent;

    public static String IAuthTabCallback(Throwable th) {
        int i = 2 % 2;
        String str = "Error(throwable=" + th + ")";
        int i2 = IAuthTabCallback + 31;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static int onExtraCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = th.hashCode();
        int i4 = IAuthTabCallback + 77;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public static Throwable onExtraCallbackWithResult(@NotNull Throwable th) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        int i4 = onWarmupCompleted + 39;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return th;
    }

    public static final /* synthetic */ px2sp$onNavigationEvent onWarmupCompleted(Throwable th) {
        int i = 2 % 2;
        px2sp$onNavigationEvent px2sp_onnavigationevent = new px2sp$onNavigationEvent(th);
        int i2 = IAuthTabCallback + 63;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return px2sp_onnavigationevent;
    }

    public static boolean onWarmupCompleted(Throwable th, Object obj) {
        int i = 2 % 2;
        if (!(obj instanceof px2sp$onNavigationEvent)) {
            int i2 = IAuthTabCallback + 45;
            onWarmupCompleted = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!Intrinsics.areEqual(th, ((px2sp$onNavigationEvent) obj).onExtraCallback())) {
            int i3 = IAuthTabCallback + 77;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = onWarmupCompleted + 107;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 53 / 0;
        }
        return true;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = onWarmupCompleted(this.onNavigationEvent, obj);
        int i4 = IAuthTabCallback + 111;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 7 / 0;
        }
        return zOnWarmupCompleted;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(this.onNavigationEvent);
            throw null;
        }
        int iOnExtraCallback = onExtraCallback(this.onNavigationEvent);
        int i3 = IAuthTabCallback + 21;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return iOnExtraCallback;
    }

    public final /* synthetic */ Throwable onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 91;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        Throwable th = this.onNavigationEvent;
        int i4 = i2 + 19;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 23 / 0;
        }
        return th;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(this.onNavigationEvent);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String strIAuthTabCallback = IAuthTabCallback(this.onNavigationEvent);
        int i3 = onWarmupCompleted + 57;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return strIAuthTabCallback;
    }

    public /* bridge */ px2sp.onExtraCallback IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            super.IAuthTabCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        px2sp.onExtraCallback onextracallbackIAuthTabCallback = super.IAuthTabCallback();
        int i3 = IAuthTabCallback + 83;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 69 / 0;
        }
        return onextracallbackIAuthTabCallback;
    }

    public /* bridge */ IndexedValue<toJSONObject$onNavigationEvent.onWarmupCompleted> onNavigationEvent(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        IndexedValue<toJSONObject$onNavigationEvent.onWarmupCompleted> indexedValueOnNavigationEvent = super.onNavigationEvent(str);
        int i4 = onWarmupCompleted + 61;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return indexedValueOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private /* synthetic */ px2sp$onNavigationEvent(Throwable th) {
        this.onNavigationEvent = th;
    }
}
