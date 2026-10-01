package o;

import im.toss.observability.instrumentation.rn.RnBundleInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambda4jipudH4a44aIGrlvbWbk0rzTp4 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    private final String onExtraCallbackWithResult;
    private final RnBundleInfo onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 77;
            IAuthTabCallback = i4 % 128;
            return i4 % 2 != 0;
        }
        if (!(!(obj instanceof r8lambda4jipudH4a44aIGrlvbWbk0rzTp4))) {
            r8lambda4jipudH4a44aIGrlvbWbk0rzTp4 r8lambda4jipudh4a44aigrlvbwbk0rztp4 = (r8lambda4jipudH4a44aIGrlvbWbk0rzTp4) obj;
            if (!(!Intrinsics.areEqual(this.onWarmupCompleted, r8lambda4jipudh4a44aigrlvbwbk0rztp4.onWarmupCompleted))) {
                if (Intrinsics.areEqual(this.onExtraCallbackWithResult, r8lambda4jipudh4a44aigrlvbwbk0rztp4.onExtraCallbackWithResult)) {
                    return true;
                }
                int i5 = IAuthTabCallback + 71;
                int i6 = i5 % 128;
                onNavigationEvent = i6;
                int i7 = i5 % 2;
                int i8 = i6 + 11;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = this.onWarmupCompleted.hashCode();
        String str = this.onExtraCallbackWithResult;
        if (str == null) {
            int i3 = IAuthTabCallback + 59;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            i = 0;
        } else {
            int iHashCode2 = str.hashCode();
            int i5 = onNavigationEvent + 103;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 5;
            }
            i = iHashCode2;
        }
        return (iHashCode * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BundleFetchOutcome(bundle=" + this.onWarmupCompleted + ", errorType=" + this.onExtraCallbackWithResult + ")";
        int i2 = onNavigationEvent + 75;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public r8lambda4jipudH4a44aIGrlvbWbk0rzTp4(@NotNull RnBundleInfo rnBundleInfo, @Nullable String str) {
        Intrinsics.checkNotNullParameter(rnBundleInfo, "");
        this.onWarmupCompleted = rnBundleInfo;
        this.onExtraCallbackWithResult = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ r8lambda4jipudH4a44aIGrlvbWbk0rzTp4(RnBundleInfo rnBundleInfo, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = onNavigationEvent;
            int i3 = i2 + 87;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i4 = i2 + 13;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 / 2;
            } else {
                int i6 = 2 % 2;
            }
            str = null;
        }
        this(rnBundleInfo, str);
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.onExtraCallbackWithResult;
        if (i3 == 0) {
            int i4 = 67 / 0;
        }
        return str;
    }

    public final RnBundleInfo onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 77;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        RnBundleInfo rnBundleInfo = this.onWarmupCompleted;
        int i5 = i2 + 49;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return rnBundleInfo;
    }
}
