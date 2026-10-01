package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ListenableWorker {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final int onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        Object obj2 = null;
        if (this == obj) {
            int i2 = onExtraCallback + 75;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return true;
            }
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof ListenableWorker)) {
            int i3 = onExtraCallback + 77;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        ListenableWorker listenableWorker = (ListenableWorker) obj;
        if (this.onNavigationEvent != listenableWorker.onNavigationEvent) {
            int i5 = IAuthTabCallback + 35;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        if (this.onExtraCallbackWithResult == listenableWorker.onExtraCallbackWithResult) {
            return true;
        }
        int i6 = IAuthTabCallback + 107;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.onNavigationEvent);
        return i3 != 0 ? (iHashCode % 25) % Integer.hashCode(this.onExtraCallbackWithResult) : (iHashCode * 31) + Integer.hashCode(this.onExtraCallbackWithResult);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ScaleTransitionScreenBounds(width=" + this.onNavigationEvent + ", height=" + this.onExtraCallbackWithResult + ")";
        int i2 = onExtraCallback + 109;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public ListenableWorker(int i, int i2) {
        this.onNavigationEvent = i;
        this.onExtraCallbackWithResult = i2;
    }

    public final int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.onNavigationEvent;
        int i5 = i3 + 37;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 1 / 0;
        }
        return i4;
    }

    public final int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallbackWithResult;
        }
        throw null;
    }
}
