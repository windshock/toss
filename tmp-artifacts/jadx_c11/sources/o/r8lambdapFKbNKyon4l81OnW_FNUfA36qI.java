package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdapFKbNKyon4l81OnW_FNUfA36qI {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private final float IAuthTabCallback;
    private final float onExtraCallbackWithResult;
    private final float onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambdapFKbNKyon4l81OnW_FNUfA36qI)) {
            int i2 = onWarmupCompleted + 9;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        r8lambdapFKbNKyon4l81OnW_FNUfA36qI r8lambdapfkbnkyon4l81onw_fnufa36qi = (r8lambdapFKbNKyon4l81OnW_FNUfA36qI) obj;
        if (Float.compare(this.onNavigationEvent, r8lambdapfkbnkyon4l81onw_fnufa36qi.onNavigationEvent) != 0) {
            int i4 = onWarmupCompleted + 105;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Float.compare(this.IAuthTabCallback, r8lambdapfkbnkyon4l81onw_fnufa36qi.IAuthTabCallback) != 0) {
            return false;
        }
        if (Float.compare(this.onExtraCallbackWithResult, r8lambdapfkbnkyon4l81onw_fnufa36qi.onExtraCallbackWithResult) == 0) {
            return true;
        }
        int i6 = onWarmupCompleted + 5;
        onExtraCallback = i6 % 128;
        return i6 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((Float.hashCode(this.onNavigationEvent) * 31) + Float.hashCode(this.IAuthTabCallback)) * 31) + Float.hashCode(this.onExtraCallbackWithResult);
        int i4 = onWarmupCompleted + 19;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ImpressionBounds(targetTop=" + this.onNavigationEvent + ", targetBottom=" + this.IAuthTabCallback + ", viewportHeight=" + this.onExtraCallbackWithResult + ")";
        int i2 = onWarmupCompleted + 7;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public r8lambdapFKbNKyon4l81OnW_FNUfA36qI(float f, float f2, float f3) {
        this.onNavigationEvent = f;
        this.IAuthTabCallback = f2;
        this.onExtraCallbackWithResult = f3;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            boolean zOnExtraCallbackWithResult = o8a.onWarmupCompleted.onExtraCallbackWithResult(this.onNavigationEvent, this.IAuthTabCallback, this.onExtraCallbackWithResult);
            int i3 = onWarmupCompleted + 121;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return zOnExtraCallbackWithResult;
            }
            throw null;
        }
        o8a.onWarmupCompleted.onExtraCallbackWithResult(this.onNavigationEvent, this.IAuthTabCallback, this.onExtraCallbackWithResult);
        throw null;
    }

    public final boolean onNavigationEvent() {
        boolean zOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            zOnNavigationEvent = o8a.onWarmupCompleted.onNavigationEvent(this.onNavigationEvent, this.IAuthTabCallback, this.onExtraCallbackWithResult);
            int i3 = 94 / 0;
        } else {
            zOnNavigationEvent = o8a.onWarmupCompleted.onNavigationEvent(this.onNavigationEvent, this.IAuthTabCallback, this.onExtraCallbackWithResult);
        }
        int i4 = onWarmupCompleted + 13;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnNavigationEvent;
        }
        throw null;
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        o8a o8aVar = o8a.onWarmupCompleted;
        if (i3 != 0) {
            return o8aVar.IAuthTabCallback(this.onNavigationEvent, this.IAuthTabCallback, this.onExtraCallbackWithResult);
        }
        o8aVar.IAuthTabCallback(this.onNavigationEvent, this.IAuthTabCallback, this.onExtraCallbackWithResult);
        throw null;
    }
}
