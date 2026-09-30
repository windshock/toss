package o;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class makeJpegBase64 implements Serializable {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    @SerializedName("elapsedMs")
    private long elapsedMs;

    @SerializedName("label")
    private String label;

    @SerializedName("startMs")
    private long startMs;

    public makeJpegBase64() {
        this(0L, null, 0L, 7, null);
    }

    public static /* synthetic */ makeJpegBase64 IAuthTabCallback(makeJpegBase64 makejpegbase64, long j, String str, long j2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 37;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            j = makejpegbase64.startMs;
            int i5 = i3 + 17;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            int i7 = IAuthTabCallback + 71;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            str = makejpegbase64.label;
            if (i8 != 0) {
                int i9 = 72 / 0;
            }
        }
        String str2 = str;
        if ((i & 4) != 0) {
            int i10 = onNavigationEvent + 99;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            j2 = makejpegbase64.elapsedMs;
        }
        return makejpegbase64.onExtraCallback(j3, str2, j2);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof makeJpegBase64)) {
            int i2 = IAuthTabCallback + 71;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        makeJpegBase64 makejpegbase64 = (makeJpegBase64) obj;
        if (this.startMs != makejpegbase64.startMs) {
            int i4 = IAuthTabCallback + 31;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.label, makejpegbase64.label)) {
            int i6 = IAuthTabCallback + 25;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 98 / 0;
            }
            return false;
        }
        if (this.elapsedMs == makejpegbase64.elapsedMs) {
            return true;
        }
        int i8 = IAuthTabCallback + 93;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((Long.hashCode(this.startMs) * 31) + this.label.hashCode()) * 31) + Long.hashCode(this.elapsedMs);
        int i4 = onNavigationEvent + 5;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final makeJpegBase64 onExtraCallback(long j, @NotNull String str, long j2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        makeJpegBase64 makejpegbase64 = new makeJpegBase64(j, str, j2);
        int i2 = onNavigationEvent + 9;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return makejpegbase64;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Measure(startMs=" + this.startMs + ", label=" + this.label + ", elapsedMs=" + this.elapsedMs + ")";
        int i2 = IAuthTabCallback + 81;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public makeJpegBase64(long j, @NotNull String str, long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.startMs = j;
        this.label = str;
        this.elapsedMs = j2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ makeJpegBase64(long j, String str, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long j3;
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 39;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            j3 = 0;
        } else {
            j3 = j;
        }
        if ((i & 2) != 0) {
            int i5 = onNavigationEvent + 103;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            str = "";
        }
        this(j3, str, (i & 4) != 0 ? 0L : j2);
    }

    public final void onNavigationEvent(long j) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 9;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        this.startMs = j;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 59;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallbackWithResult(@NotNull String str, long j) {
        long j2;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            j2 = j / this.startMs;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            j2 = j - this.startMs;
        }
        this.elapsedMs = j2;
        this.label = str;
        int i3 = onNavigationEvent + 3;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.label;
        int i4 = i3 + 77;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        long j = this.elapsedMs;
        int i5 = i3 + 29;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
