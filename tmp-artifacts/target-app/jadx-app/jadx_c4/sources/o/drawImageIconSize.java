package o;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class drawImageIconSize {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final int IAuthTabCallback;
    private final Intent onExtraCallbackWithResult;
    private final int onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 21;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof drawImageIconSize)) {
            return false;
        }
        drawImageIconSize drawimageiconsize = (drawImageIconSize) obj;
        if (this.IAuthTabCallback != drawimageiconsize.IAuthTabCallback) {
            int i6 = i3 + 1;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.onWarmupCompleted != drawimageiconsize.onWarmupCompleted) {
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallbackWithResult, drawimageiconsize.onExtraCallbackWithResult)) {
            return true;
        }
        int i8 = onExtraCallback + 27;
        onNavigationEvent = i8 % 128;
        return i8 % 2 != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003d A[PHI: r1 r3 r4
      0x003d: PHI (r1v12 int) = (r1v5 int), (r1v14 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
      0x003d: PHI (r3v4 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
      0x003d: PHI (r4v4 android.content.Intent) = (r4v0 android.content.Intent), (r4v5 android.content.Intent) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033 A[PHI: r1 r3
      0x0033: PHI (r1v6 int) = (r1v5 int), (r1v14 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
      0x0033: PHI (r3v2 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        Intent intent;
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        onNavigationEvent = i2 % 128;
        int iHashCode3 = 0;
        if (i2 % 2 != 0) {
            iHashCode = Integer.hashCode(this.IAuthTabCallback);
            iHashCode2 = Integer.hashCode(this.onWarmupCompleted);
            intent = this.onExtraCallbackWithResult;
            int i3 = 77 / 0;
            if (intent == null) {
                int i4 = onNavigationEvent + 47;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
            } else {
                iHashCode3 = intent.hashCode();
            }
        } else {
            iHashCode = Integer.hashCode(this.IAuthTabCallback);
            iHashCode2 = Integer.hashCode(this.onWarmupCompleted);
            intent = this.onExtraCallbackWithResult;
            if (intent == null) {
            }
        }
        return (((iHashCode * 31) + iHashCode2) * 31) + iHashCode3;
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.IAuthTabCallback;
        if (i3 != 0) {
            int i5 = 41 / 0;
        }
        return i4;
    }

    public final int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        int i5 = this.onWarmupCompleted;
        int i6 = i3 + 35;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final Intent onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 53;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intent intent = this.onExtraCallbackWithResult;
        int i5 = i2 + 121;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return intent;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ActivityResultEvent(requestCode=" + this.IAuthTabCallback + ", resultCode=" + this.onWarmupCompleted + ", data=" + this.onExtraCallbackWithResult + ")";
        int i2 = onNavigationEvent + 33;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public drawImageIconSize(int i, int i2, @Nullable Intent intent) {
        this.IAuthTabCallback = i;
        this.onWarmupCompleted = i2;
        this.onExtraCallbackWithResult = intent;
    }
}
