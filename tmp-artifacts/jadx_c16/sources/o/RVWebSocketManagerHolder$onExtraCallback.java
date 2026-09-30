package o;

import kotlin.jvm.JvmInline;

@JvmInline
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RVWebSocketManagerHolder$onExtraCallback implements RVWebSocketManagerHolder {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final int onWarmupCompleted;

    public static final /* synthetic */ RVWebSocketManagerHolder$onExtraCallback IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        RVWebSocketManagerHolder$onExtraCallback rVWebSocketManagerHolder$onExtraCallback = new RVWebSocketManagerHolder$onExtraCallback(i);
        int i3 = onExtraCallback + 103;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return rVWebSocketManagerHolder$onExtraCallback;
        }
        throw null;
    }

    public static int onExtraCallback(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 99;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 61;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return i;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static boolean onExtraCallback(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 89;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            boolean z = obj instanceof RVWebSocketManagerHolder$onExtraCallback;
            throw null;
        }
        if (!(obj instanceof RVWebSocketManagerHolder$onExtraCallback)) {
            return false;
        }
        if (i == ((RVWebSocketManagerHolder$onExtraCallback) obj).onExtraCallbackWithResult()) {
            return true;
        }
        int i4 = onExtraCallback + 79;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public static String onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        String str = "PageScrollToTopEvent(tabId=" + i + ")";
        int i3 = onExtraCallback + 99;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 74 / 0;
        }
        return str;
    }

    public static int onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 1;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = Integer.hashCode(i);
        int i5 = onExtraCallback + 5;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(this.onWarmupCompleted, obj);
            throw null;
        }
        boolean zOnExtraCallback = onExtraCallback(this.onWarmupCompleted, obj);
        int i3 = onExtraCallback + 55;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return zOnExtraCallback;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(this.onWarmupCompleted);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnWarmupCompleted = onWarmupCompleted(this.onWarmupCompleted);
        int i3 = onExtraCallbackWithResult + 105;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return iOnWarmupCompleted;
    }

    public final /* synthetic */ int onExtraCallbackWithResult() {
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 7;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        if (i3 % 2 == 0) {
            i = this.onWarmupCompleted;
            int i5 = 93 / 0;
        } else {
            i = this.onWarmupCompleted;
        }
        int i6 = i4 + 115;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return i;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        String strOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            strOnExtraCallbackWithResult = onExtraCallbackWithResult(this.onWarmupCompleted);
            int i3 = 85 / 0;
        } else {
            strOnExtraCallbackWithResult = onExtraCallbackWithResult(this.onWarmupCompleted);
        }
        int i4 = onExtraCallback + 99;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return strOnExtraCallbackWithResult;
    }

    public /* bridge */ boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            super.IAuthTabCallback();
            throw null;
        }
        boolean zIAuthTabCallback = super.IAuthTabCallback();
        int i3 = onExtraCallback + 87;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return zIAuthTabCallback;
    }

    public /* bridge */ boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return super.onExtraCallback();
        }
        super.onExtraCallback();
        throw null;
    }

    private /* synthetic */ RVWebSocketManagerHolder$onExtraCallback(int i) {
        this.onWarmupCompleted = i;
    }

    public int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.onWarmupCompleted;
        if (i3 == 0) {
            int i5 = 81 / 0;
        }
        return i4;
    }
}
