package o;

import android.os.SystemClock;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
final class extractAntispoofingFaceQuality {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final long IAuthTabCallback;
    private final downloadZip onWarmupCompleted;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if ((r9 instanceof o.extractAntispoofingFaceQuality) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        r2 = r2 + 51;
        o.extractAntispoofingFaceQuality.onNavigationEvent = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if ((r2 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        r9 = (o.extractAntispoofingFaceQuality) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r8.onWarmupCompleted, r9.onWarmupCompleted)) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        if (r8.IAuthTabCallback == r9.IAuthTabCallback) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r8 == r9) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (r8 == r9) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        r2 = r2 + 117;
        o.extractAntispoofingFaceQuality.onNavigationEvent = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        if ((r2 % 2) != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            int i4 = 75 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onWarmupCompleted.hashCode();
        return i3 == 0 ? (iHashCode * 117) % Long.hashCode(this.IAuthTabCallback) : (iHashCode * 31) + Long.hashCode(this.IAuthTabCallback);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TimestampedTrack(trackable=" + this.onWarmupCompleted + ", enqueuedElapsedTime=" + this.IAuthTabCallback + ")";
        int i2 = onNavigationEvent + 81;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 52 / 0;
        }
        return str;
    }

    public extractAntispoofingFaceQuality(@NotNull downloadZip downloadzip, long j) {
        Intrinsics.checkNotNullParameter(downloadzip, "");
        this.onWarmupCompleted = downloadzip;
        this.IAuthTabCallback = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ extractAntispoofingFaceQuality(downloadZip downloadzip, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = onExtraCallbackWithResult + 121;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            j = SystemClock.elapsedRealtime();
            int i4 = onNavigationEvent + 83;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        }
        this(downloadzip, j);
    }

    public final downloadZip onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        downloadZip downloadzip = this.onWarmupCompleted;
        int i5 = i3 + 47;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return downloadzip;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = this.IAuthTabCallback;
        int i4 = i3 + 51;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 11 / 0;
        }
        return j;
    }
}
