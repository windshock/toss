package o;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@JvmInline
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class deprecated_cache {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private static final float IAuthTabCallback = onExtraCallbackWithResult(-1.0f);
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onTransact = 1;
    private static int onWarmupCompleted;
    private final float onNavigationEvent;

    public static int onExtraCallback(float f) {
        int i = 2 % 2;
        int i2 = onTransact + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Float.hashCode(f);
        int i4 = onWarmupCompleted + 93;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public static boolean onExtraCallback(float f, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 47;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        if (obj instanceof deprecated_cache) {
            if (Float.compare(f, ((deprecated_cache) obj).onWarmupCompleted()) != 0) {
                return false;
            }
            int i5 = onWarmupCompleted + 43;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        int i7 = i2 + 123;
        onTransact = i7 % 128;
        if (i7 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static float onExtraCallbackWithResult(float f) {
        int i = 2 % 2;
        int i2 = onTransact + 63;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = i3 + 107;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return f;
    }

    public static String onNavigationEvent(float f) {
        int i = 2 % 2;
        String str = "NetworkResourceScale(value=" + f + ")";
        int i2 = onWarmupCompleted + 115;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final boolean onNavigationEvent(float f, float f2) {
        int i = 2 % 2;
        int i2 = onTransact + 115;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Float.compare(f, f2);
            throw null;
        }
        if (Float.compare(f, f2) != 0) {
            return false;
        }
        int i3 = onTransact + 85;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 21;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 81;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(this.onNavigationEvent, obj);
            throw null;
        }
        boolean zOnExtraCallback = onExtraCallback(this.onNavigationEvent, obj);
        int i3 = onWarmupCompleted + 77;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return zOnExtraCallback;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = onExtraCallback(this.onNavigationEvent);
        int i4 = onWarmupCompleted + 109;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return iOnExtraCallback;
    }

    public final /* synthetic */ float onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 105;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        float f = this.onNavigationEvent;
        int i5 = i2 + 69;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onTransact + 95;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onNavigationEvent(this.onNavigationEvent);
            throw null;
        }
        String strOnNavigationEvent = onNavigationEvent(this.onNavigationEvent);
        int i3 = onTransact + 105;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return strOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ float onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 45;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        float f = IAuthTabCallback;
        int i5 = i3 + 9;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public static float onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 43;
        onTransact = i3 % 128;
        float f = i;
        if (i3 % 2 != 0) {
            return onExtraCallbackWithResult(f);
        }
        onExtraCallbackWithResult(f);
        throw null;
    }

    public static final class onExtraCallback {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final float IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 77;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            float fOnExtraCallback = deprecated_cache.onExtraCallback();
            int i4 = onWarmupCompleted + 97;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return fOnExtraCallback;
        }
    }

    static {
        int i = onExtraCallback + 61;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }
}
