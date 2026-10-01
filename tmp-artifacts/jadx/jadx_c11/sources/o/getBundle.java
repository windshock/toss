package o;

import kotlin.jvm.JvmInline;

@JvmInline
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getBundle {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final long onNavigationEvent;

    public static int onExtraCallback(long j) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Long.hashCode(j);
        int i4 = IAuthTabCallback + 119;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public static boolean onExtraCallback(long j, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        if (obj instanceof getBundle) {
            return j == ((getBundle) obj).onExtraCallbackWithResult();
        }
        int i5 = i3 + 63;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public static final /* synthetic */ getBundle onExtraCallbackWithResult(long j) {
        int i = 2 % 2;
        getBundle getbundle = new getBundle(j);
        int i2 = onExtraCallbackWithResult + 105;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return getbundle;
        }
        throw null;
    }

    public static String onNavigationEvent(long j) {
        int i = 2 % 2;
        String str = "SlotEntryId(value=" + j + ")";
        int i2 = IAuthTabCallback + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static long onWarmupCompleted(long j) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 19;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 13;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public static final boolean onWarmupCompleted(long j, long j2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 39;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        if (j == j2) {
            int i6 = i2 + 33;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        int i8 = i4 + 19;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = onExtraCallback(this.onNavigationEvent, obj);
        int i4 = onExtraCallbackWithResult + 47;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallback;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(this.onNavigationEvent);
        }
        onExtraCallback(this.onNavigationEvent);
        throw null;
    }

    public final /* synthetic */ long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 95;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        long j = this.onNavigationEvent;
        int i5 = i2 + 47;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = onNavigationEvent(this.onNavigationEvent);
        int i4 = onExtraCallbackWithResult + 111;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return strOnNavigationEvent;
    }

    private /* synthetic */ getBundle(long j) {
        this.onNavigationEvent = j;
    }
}
