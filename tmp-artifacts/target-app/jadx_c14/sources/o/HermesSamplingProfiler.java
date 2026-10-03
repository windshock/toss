package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class HermesSamplingProfiler {
    public static final int $stable = 8;
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    @SerializedName("description")
    private final String description;

    @SerializedName("link")
    private final NativeVibrationSpec link;

    /* JADX WARN: Multi-variable type inference failed */
    public HermesSamplingProfiler() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 37;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof HermesSamplingProfiler)) {
            return false;
        }
        HermesSamplingProfiler hermesSamplingProfiler = (HermesSamplingProfiler) obj;
        if (!Intrinsics.areEqual(this.description, hermesSamplingProfiler.description)) {
            int i4 = IAuthTabCallback + 103;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.link, hermesSamplingProfiler.link)) {
            return true;
        }
        int i6 = IAuthTabCallback + 1;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.description;
        if (str == null) {
            int i2 = onNavigationEvent + 89;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        NativeVibrationSpec nativeVibrationSpec = this.link;
        if (nativeVibrationSpec != null) {
            int i4 = onNavigationEvent + 45;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = nativeVibrationSpec.hashCode();
        } else {
            iHashCode2 = 0;
        }
        int i6 = (iHashCode * 31) + iHashCode2;
        int i7 = onNavigationEvent + 117;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 32 / 0;
        }
        return i6;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TossMoneyNotice(description=" + this.description + ", link=" + this.link + ")";
        int i2 = onNavigationEvent + 97;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public HermesSamplingProfiler(@Nullable String str, @Nullable NativeVibrationSpec nativeVibrationSpec) {
        this.description = str;
        this.link = nativeVibrationSpec;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ HermesSamplingProfiler(String str, NativeVibrationSpec nativeVibrationSpec, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 11;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 73 / 0;
            }
            int i4 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i5 = onNavigationEvent + 117;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 50 / 0;
            }
            int i7 = 2 % 2;
            nativeVibrationSpec = null;
        }
        this(str, nativeVibrationSpec);
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 41;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.description;
        int i4 = i2 + 37;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final NativeVibrationSpec IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.link;
        }
        throw null;
    }
}
