package o;

import com.google.gson.annotations.SerializedName;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class extractFaceQuality {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    @SerializedName("startDate")
    private final long IAuthTabCallback;

    @SerializedName("leftCount")
    private final int onExtraCallbackWithResult;

    @SerializedName("endDate")
    private final long onWarmupCompleted;

    public static /* synthetic */ extractFaceQuality onExtraCallback(extractFaceQuality extractfacequality, long j, long j2, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 121;
        int i5 = i4 % 128;
        onExtraCallback = i5;
        if (i4 % 2 != 0 ? (i2 & 1) != 0 : (i2 & 1) != 0) {
            int i6 = i5 + 11;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            j = extractfacequality.IAuthTabCallback;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            int i8 = i5 + 121;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 != 0) {
                long j4 = extractfacequality.onWarmupCompleted;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            j2 = extractfacequality.onWarmupCompleted;
        }
        long j5 = j2;
        if ((i2 & 4) != 0) {
            i = extractfacequality.onExtraCallbackWithResult;
        }
        return extractfacequality.onExtraCallbackWithResult(j3, j5, i);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 3;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof extractFaceQuality)) {
            return false;
        }
        extractFaceQuality extractfacequality = (extractFaceQuality) obj;
        if (this.IAuthTabCallback != extractfacequality.IAuthTabCallback) {
            return false;
        }
        if (this.onWarmupCompleted != extractfacequality.onWarmupCompleted) {
            int i4 = onNavigationEvent + 55;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.onExtraCallbackWithResult == extractfacequality.onExtraCallbackWithResult) {
            return true;
        }
        int i6 = onExtraCallback + 115;
        onNavigationEvent = i6 % 128;
        return i6 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((Long.hashCode(this.IAuthTabCallback) * 31) + Long.hashCode(this.onWarmupCompleted)) * 31) + Integer.hashCode(this.onExtraCallbackWithResult);
        int i4 = onNavigationEvent + 45;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final extractFaceQuality onExtraCallbackWithResult(long j, long j2, int i) {
        int i2 = 2 % 2;
        extractFaceQuality extractfacequality = new extractFaceQuality(j, j2, i);
        int i3 = onExtraCallback + 77;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return extractfacequality;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PeriodLimit(startDate=" + this.IAuthTabCallback + ", endDate=" + this.onWarmupCompleted + ", leftCount=" + this.onExtraCallbackWithResult + ")";
        int i2 = onExtraCallback + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public extractFaceQuality(long j, long j2, int i) {
        this.IAuthTabCallback = j;
        this.onWarmupCompleted = j2;
        this.onExtraCallbackWithResult = i;
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 27;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.onExtraCallbackWithResult;
        int i5 = i2 + 11;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final boolean onExtraCallbackWithResult(@NotNull Date date) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(date, "");
        long j = this.IAuthTabCallback;
        long j2 = this.onWarmupCompleted;
        long time = date.getTime();
        if (j > time || time >= j2) {
            return false;
        }
        int i2 = onNavigationEvent + 49;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 71;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public final extractFaceQuality onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = this.onExtraCallbackWithResult;
        if (i2 <= 0) {
            return this;
        }
        int i3 = onExtraCallback + 121;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        extractFaceQuality extractfacequalityOnExtraCallback = onExtraCallback(this, 0L, 0L, i2 - 1, 3, null);
        int i5 = onNavigationEvent + 115;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return extractfacequalityOnExtraCallback;
    }
}
