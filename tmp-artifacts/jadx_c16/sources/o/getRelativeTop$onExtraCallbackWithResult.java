package o;

import kotlin.collections.IndexedValue;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import o.getRelativeTop;
import org.jetbrains.annotations.NotNull;

@JvmInline
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getRelativeTop$onExtraCallbackWithResult implements getRelativeTop {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    private final Throwable onNavigationEvent;

    public static final /* synthetic */ getRelativeTop$onExtraCallbackWithResult IAuthTabCallback(Throwable th) {
        int i = 2 % 2;
        getRelativeTop$onExtraCallbackWithResult getrelativetop_onextracallbackwithresult = new getRelativeTop$onExtraCallbackWithResult(th);
        int i2 = onWarmupCompleted + 125;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 73 / 0;
        }
        return getrelativetop_onextracallbackwithresult;
    }

    public static boolean IAuthTabCallback(Throwable th, Object obj) {
        int i = 2 % 2;
        if (!(obj instanceof getRelativeTop$onExtraCallbackWithResult)) {
            int i2 = onWarmupCompleted + 125;
            IAuthTabCallback = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!Intrinsics.areEqual(th, ((getRelativeTop$onExtraCallbackWithResult) obj).onWarmupCompleted())) {
            return false;
        }
        int i3 = IAuthTabCallback + 99;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static int onExtraCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return th.hashCode();
        }
        th.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static Throwable onExtraCallbackWithResult(@NotNull Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        int i4 = onWarmupCompleted + 87;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return th;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static String onNavigationEvent(Throwable th) {
        int i = 2 % 2;
        String str = "Error(throwable=" + th + ")";
        int i2 = IAuthTabCallback + 45;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 57 / 0;
        }
        return str;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = IAuthTabCallback(this.onNavigationEvent, obj);
        if (i3 != 0) {
            int i4 = 18 / 0;
        }
        return zIAuthTabCallback;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = onExtraCallback(this.onNavigationEvent);
        int i4 = IAuthTabCallback + 75;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return iOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final /* synthetic */ Throwable onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 117;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Throwable th = this.onNavigationEvent;
        int i5 = i2 + 119;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 7 / 0;
        }
        return th;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = onNavigationEvent(this.onNavigationEvent);
        int i4 = IAuthTabCallback + 27;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return strOnNavigationEvent;
        }
        throw null;
    }

    public /* bridge */ IndexedValue<toJSONObject$onWarmupCompleted> IAuthTabCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        IndexedValue<toJSONObject$onWarmupCompleted> indexedValueIAuthTabCallback = super.IAuthTabCallback(str);
        int i4 = onWarmupCompleted + 19;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return indexedValueIAuthTabCallback;
        }
        throw null;
    }

    public /* bridge */ getRelativeTop.onWarmupCompleted IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getRelativeTop.onWarmupCompleted onwarmupcompletedIAuthTabCallback = super.IAuthTabCallback();
        int i4 = IAuthTabCallback + 109;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 25 / 0;
        }
        return onwarmupcompletedIAuthTabCallback;
    }

    private /* synthetic */ getRelativeTop$onExtraCallbackWithResult(Throwable th) {
        this.onNavigationEvent = th;
    }
}
