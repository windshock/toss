package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class closeAllSocket {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    private final boolean onExtraCallback;
    private final boolean onExtraCallbackWithResult;
    private final int onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof closeAllSocket)) {
            int i2 = onWarmupCompleted + 119;
            IAuthTabCallback = i2 % 128;
            return !(i2 % 2 == 0);
        }
        closeAllSocket closeallsocket = (closeAllSocket) obj;
        if (this.onNavigationEvent == closeallsocket.onNavigationEvent) {
            return this.onExtraCallback == closeallsocket.onExtraCallback && this.onExtraCallbackWithResult == closeallsocket.onExtraCallbackWithResult;
        }
        int i3 = onWarmupCompleted + 23;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onWarmupCompleted = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (((Integer.hashCode(this.onNavigationEvent) + 46) / Boolean.hashCode(this.onExtraCallback)) + 76) >> Boolean.hashCode(this.onExtraCallbackWithResult) : (((Integer.hashCode(this.onNavigationEvent) * 31) + Boolean.hashCode(this.onExtraCallback)) * 31) + Boolean.hashCode(this.onExtraCallbackWithResult);
        int i3 = IAuthTabCallback + 113;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MainTabIdEvent(tabId=" + this.onNavigationEvent + ", scrollToTop=" + this.onExtraCallback + ", forceNewInstance=" + this.onExtraCallbackWithResult + ")";
        int i2 = IAuthTabCallback + 89;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public closeAllSocket(int i, boolean z, boolean z2) {
        this.onNavigationEvent = i;
        this.onExtraCallback = z;
        this.onExtraCallbackWithResult = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ closeAllSocket(int i, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 4) != 0) {
            int i3 = IAuthTabCallback + 47;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            z2 = false;
        }
        this(i, z, z2);
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        boolean z = this.onExtraCallback;
        int i5 = i3 + 51;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = this.onNavigationEvent;
        int i6 = i3 + 49;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 74 / 0;
        }
        return i5;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 113;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        boolean z = this.onExtraCallbackWithResult;
        int i4 = i2 + 25;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }
}
