package o;

import kotlin.collections.IndexedValue;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import o.getFontSize;
import o.toJSONObject$onNavigationEvent;
import org.jetbrains.annotations.NotNull;

@JvmInline
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getFontSize$onNavigationEvent implements getFontSize {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final Throwable onWarmupCompleted;

    public static final /* synthetic */ getFontSize$onNavigationEvent onExtraCallback(Throwable th) {
        int i = 2 % 2;
        getFontSize$onNavigationEvent getfontsize_onnavigationevent = new getFontSize$onNavigationEvent(th);
        int i2 = IAuthTabCallback + 27;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return getfontsize_onnavigationevent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static boolean onExtraCallback(Throwable th, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        if (obj instanceof getFontSize$onNavigationEvent) {
            return Intrinsics.areEqual(th, ((getFontSize$onNavigationEvent) obj).onExtraCallback());
        }
        int i5 = i3 + 9;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public static String onExtraCallbackWithResult(Throwable th) {
        int i = 2 % 2;
        String str = "Error(throwable=" + th + ")";
        int i2 = onExtraCallbackWithResult + 75;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static int onNavigationEvent(Throwable th) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return th.hashCode();
        }
        th.hashCode();
        throw null;
    }

    public static Throwable onWarmupCompleted(@NotNull Throwable th) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallback + 25;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return th;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = onExtraCallback(this.onWarmupCompleted, obj);
        int i4 = onExtraCallbackWithResult + 77;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnExtraCallback;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = onNavigationEvent(this.onWarmupCompleted);
        int i4 = onExtraCallbackWithResult + 79;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iOnNavigationEvent;
    }

    public final /* synthetic */ Throwable onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 31;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Throwable th = this.onWarmupCompleted;
        int i5 = i2 + 5;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return th;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(this.onWarmupCompleted);
        int i4 = IAuthTabCallback + 3;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return strOnExtraCallbackWithResult;
    }

    public /* bridge */ IndexedValue<toJSONObject$onNavigationEvent.onExtraCallbackWithResult> onNavigationEvent(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return super.onNavigationEvent(str);
        }
        super.onNavigationEvent(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ getFontSize.IAuthTabCallback onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            super.onWarmupCompleted();
            throw null;
        }
        getFontSize.IAuthTabCallback iAuthTabCallbackOnWarmupCompleted = super.onWarmupCompleted();
        int i3 = onExtraCallbackWithResult + 51;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return iAuthTabCallbackOnWarmupCompleted;
        }
        throw null;
    }

    private /* synthetic */ getFontSize$onNavigationEvent(Throwable th) {
        this.onWarmupCompleted = th;
    }
}
