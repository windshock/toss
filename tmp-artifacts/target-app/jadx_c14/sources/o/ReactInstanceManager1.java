package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ReactInstanceManager1 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("payStatus")
    private final ReactInstanceManager3 payStatus;

    /* JADX WARN: Illegal instructions before constructor call */
    public ReactInstanceManager1() {
        ReactInstanceManager3 reactInstanceManager3 = null;
        this(reactInstanceManager3, 1, reactInstanceManager3);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReactInstanceManager1) {
            return this.payStatus == ((ReactInstanceManager1) obj).payStatus;
        }
        int i2 = onWarmupCompleted;
        int i3 = i2 + 33;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 61;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        ReactInstanceManager3 reactInstanceManager3 = this.payStatus;
        if (reactInstanceManager3 == null) {
            int i5 = i3 + 91;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }
        int iHashCode = reactInstanceManager3.hashCode();
        int i7 = IAuthTabCallback + 117;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TmoneyChargingPayStatusResponse(payStatus=" + this.payStatus + ")";
        int i2 = IAuthTabCallback + 17;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public ReactInstanceManager1(@Nullable ReactInstanceManager3 reactInstanceManager3) {
        this.payStatus = reactInstanceManager3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ReactInstanceManager1(ReactInstanceManager3 reactInstanceManager3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 67;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 53;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            reactInstanceManager3 = null;
        }
        this(reactInstanceManager3);
    }

    public final ReactInstanceManager3 onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        ReactInstanceManager3 reactInstanceManager3 = this.payStatus;
        int i5 = i3 + 53;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return reactInstanceManager3;
    }
}
