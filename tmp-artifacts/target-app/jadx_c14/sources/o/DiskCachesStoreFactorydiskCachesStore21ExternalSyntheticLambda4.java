package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda4 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("available")
    private final boolean available;

    public DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda4() {
        this(false, 1, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 57;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda4)) {
            return false;
        }
        if (this.available == ((DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda4) obj).available) {
            return true;
        }
        int i4 = onWarmupCompleted + 89;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            iHashCode = Boolean.hashCode(this.available);
            int i3 = 84 / 0;
        } else {
            iHashCode = Boolean.hashCode(this.available);
        }
        int i4 = IAuthTabCallback + 107;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 68 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanAutomobileScrapeCheckResponse(available=" + this.available + ")";
        int i2 = onWarmupCompleted + 119;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda4(boolean z) {
        this.available = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda4(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 115;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 91;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            z = false;
        }
        this(z);
    }
}
