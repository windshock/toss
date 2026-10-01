package o;

import android.graphics.Typeface;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getReadTimeoutokhttp {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    private final Integer onExtraCallbackWithResult;
    private final Typeface onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 97;
            onExtraCallback = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof getReadTimeoutokhttp)) {
            int i3 = onExtraCallback + 63;
            onWarmupCompleted = i3 % 128;
            return i3 % 2 != 0;
        }
        getReadTimeoutokhttp getreadtimeoutokhttp = (getReadTimeoutokhttp) obj;
        if (Intrinsics.areEqual(this.onExtraCallbackWithResult, getreadtimeoutokhttp.onExtraCallbackWithResult)) {
            return Intrinsics.areEqual(this.onNavigationEvent, getreadtimeoutokhttp.onNavigationEvent);
        }
        int i4 = onWarmupCompleted + 23;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        Integer num = this.onExtraCallbackWithResult;
        int iHashCode2 = 0;
        if (num == null) {
            int i2 = onWarmupCompleted + 35;
            onExtraCallback = i2 % 128;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = num.hashCode();
            int i3 = onWarmupCompleted + 21;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        Typeface typeface = this.onNavigationEvent;
        if (typeface != null) {
            int i5 = onWarmupCompleted + 1;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                typeface.hashCode();
                throw null;
            }
            iHashCode2 = typeface.hashCode();
        }
        return (iHashCode * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AnimateTextSpan(color=" + this.onExtraCallbackWithResult + ", typeface=" + this.onNavigationEvent + ")";
        int i2 = onExtraCallback + 29;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 35 / 0;
        }
        return str;
    }

    public getReadTimeoutokhttp(@Nullable Integer num, @Nullable Typeface typeface) {
        this.onExtraCallbackWithResult = num;
        this.onNavigationEvent = typeface;
    }

    public final Integer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        Integer num = this.onExtraCallbackWithResult;
        int i5 = i3 + 69;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        throw null;
    }

    public final Typeface IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Typeface typeface = this.onNavigationEvent;
        int i4 = i3 + 61;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 29 / 0;
        }
        return typeface;
    }
}
