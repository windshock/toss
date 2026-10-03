package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class dumpSampledTraceToFile {
    public static final int $stable = 8;
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    @SerializedName("cta")
    private final NativeVibrationSpec cta;

    @SerializedName("notice")
    private final HermesSamplingProfiler notice;

    /* JADX WARN: Multi-variable type inference failed */
    public dumpSampledTraceToFile() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 71;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof dumpSampledTraceToFile)) {
            int i4 = onNavigationEvent + 65;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        dumpSampledTraceToFile dumpsampledtracetofile = (dumpSampledTraceToFile) obj;
        if (!Intrinsics.areEqual(this.cta, dumpsampledtracetofile.cta)) {
            return false;
        }
        if (Intrinsics.areEqual(this.notice, dumpsampledtracetofile.notice)) {
            return true;
        }
        int i6 = IAuthTabCallback + 33;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        NativeVibrationSpec nativeVibrationSpec;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onNavigationEvent = i2 % 128;
        int iHashCode = 0;
        int iHashCode2 = (i2 % 2 != 0 ? (nativeVibrationSpec = this.cta) != null : (nativeVibrationSpec = this.cta) != null) ? nativeVibrationSpec.hashCode() : 0;
        HermesSamplingProfiler hermesSamplingProfiler = this.notice;
        if (hermesSamplingProfiler != null) {
            int i3 = IAuthTabCallback + 115;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = hermesSamplingProfiler.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TossMoneyUpgradeGuide(cta=" + this.cta + ", notice=" + this.notice + ")";
        int i2 = onNavigationEvent + 95;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public dumpSampledTraceToFile(@Nullable NativeVibrationSpec nativeVibrationSpec, @Nullable HermesSamplingProfiler hermesSamplingProfiler) {
        this.cta = nativeVibrationSpec;
        this.notice = hermesSamplingProfiler;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ dumpSampledTraceToFile(NativeVibrationSpec nativeVibrationSpec, HermesSamplingProfiler hermesSamplingProfiler, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 5;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            nativeVibrationSpec = null;
        }
        if ((i & 2) != 0) {
            int i4 = IAuthTabCallback;
            int i5 = i4 + 87;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 99;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            hermesSamplingProfiler = null;
        }
        this(nativeVibrationSpec, hermesSamplingProfiler);
    }

    public final NativeVibrationSpec onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 7;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        NativeVibrationSpec nativeVibrationSpec = this.cta;
        int i5 = i2 + 21;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 5 / 0;
        }
        return nativeVibrationSpec;
    }

    public final HermesSamplingProfiler onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        HermesSamplingProfiler hermesSamplingProfiler = this.notice;
        int i5 = i3 + 85;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return hermesSamplingProfiler;
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 5;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if (this.cta == null) {
            return false;
        }
        int i5 = i2 + 97;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }
}
