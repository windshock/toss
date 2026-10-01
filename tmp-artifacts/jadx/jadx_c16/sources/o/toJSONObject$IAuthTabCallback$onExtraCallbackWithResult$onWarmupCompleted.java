package o;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import o.toJSONObject;
import org.jetbrains.annotations.NotNull;

@JvmInline
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class toJSONObject$IAuthTabCallback$onExtraCallbackWithResult$onWarmupCompleted implements toJSONObject.IAuthTabCallback.onExtraCallbackWithResult {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    private final String onNavigationEvent;

    public static int IAuthTabCallback(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = str.hashCode();
        int i4 = onWarmupCompleted + 105;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static String onExtraCallback(String str) {
        int i = 2 % 2;
        String str2 = "Unknown(rawValue=" + str + ")";
        int i2 = onExtraCallback + 83;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 4 / 0;
        }
        return str2;
    }

    public static String onExtraCallbackWithResult(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (i3 != 0) {
            throw null;
        }
        int i4 = onExtraCallback + 85;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public static String onNavigationEvent(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 69;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 86 / 0;
        }
        return str;
    }

    public static boolean onNavigationEvent(String str, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 61;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            boolean z = obj instanceof toJSONObject$IAuthTabCallback$onExtraCallbackWithResult$onWarmupCompleted;
            throw null;
        }
        if (!(obj instanceof toJSONObject$IAuthTabCallback$onExtraCallbackWithResult$onWarmupCompleted)) {
            int i4 = i2 + 47;
            onExtraCallback = i4 % 128;
            return i4 % 2 == 0;
        }
        if (Intrinsics.areEqual(str, ((toJSONObject$IAuthTabCallback$onExtraCallbackWithResult$onWarmupCompleted) obj).onNavigationEvent())) {
            return true;
        }
        int i5 = onWarmupCompleted + 49;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public static final /* synthetic */ toJSONObject$IAuthTabCallback$onExtraCallbackWithResult$onWarmupCompleted onWarmupCompleted(String str) {
        int i = 2 % 2;
        toJSONObject$IAuthTabCallback$onExtraCallbackWithResult$onWarmupCompleted tojsonobject_iauthtabcallback_onextracallbackwithresult_onwarmupcompleted = new toJSONObject$IAuthTabCallback$onExtraCallbackWithResult$onWarmupCompleted(str);
        int i2 = onWarmupCompleted + 23;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return tojsonobject_iauthtabcallback_onextracallbackwithresult_onwarmupcompleted;
    }

    public boolean equals(Object obj) {
        boolean zOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            zOnNavigationEvent = onNavigationEvent(this.onNavigationEvent, obj);
            int i3 = 48 / 0;
        } else {
            zOnNavigationEvent = onNavigationEvent(this.onNavigationEvent, obj);
        }
        int i4 = onWarmupCompleted + 97;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnNavigationEvent;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = IAuthTabCallback(this.onNavigationEvent);
        int i4 = onWarmupCompleted + 53;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iIAuthTabCallback;
    }

    public final /* synthetic */ String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onNavigationEvent;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.onNavigationEvent;
        if (i3 != 0) {
            return onExtraCallback(str);
        }
        onExtraCallback(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private /* synthetic */ toJSONObject$IAuthTabCallback$onExtraCallbackWithResult$onWarmupCompleted(String str) {
        this.onNavigationEvent = str;
    }

    public String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(this.onNavigationEvent);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String strOnNavigationEvent = onNavigationEvent(this.onNavigationEvent);
        int i3 = onExtraCallback + 97;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 45 / 0;
        }
        return strOnNavigationEvent;
    }
}
