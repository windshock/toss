package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class Connection implements getORDER_BY_NAMEokhttp {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    private final float onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 31;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof Connection) {
            if (Float.compare(this.onNavigationEvent, ((Connection) obj).onNavigationEvent) == 0) {
                return true;
            }
            int i4 = IAuthTabCallback + 101;
            onWarmupCompleted = i4 % 128;
            return i4 % 2 == 0;
        }
        int i5 = onWarmupCompleted;
        int i6 = i5 + 79;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i5 + 39;
        IAuthTabCallback = i8 % 128;
        if (i8 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Float.hashCode(this.onNavigationEvent);
        int i4 = IAuthTabCallback + 15;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 18 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LinearFontScaleConverter(fontScale=" + this.onNavigationEvent + ")";
        int i2 = IAuthTabCallback + 93;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public Connection(float f) {
        this.onNavigationEvent = f;
    }

    @Override // o.getORDER_BY_NAMEokhttp
    public float onNavigationEvent(float f) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 31;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        float f2 = f * this.onNavigationEvent;
        int i5 = i2 + 109;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return f2;
        }
        throw null;
    }

    @Override // o.getORDER_BY_NAMEokhttp
    public float onExtraCallback(float f) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 29;
        IAuthTabCallback = i3 % 128;
        float f2 = i3 % 2 != 0 ? f % this.onNavigationEvent : f / this.onNavigationEvent;
        int i4 = i2 + 79;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return f2;
    }
}
