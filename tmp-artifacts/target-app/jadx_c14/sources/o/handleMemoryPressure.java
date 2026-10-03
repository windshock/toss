package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class handleMemoryPressure {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("issuer")
    private final jniExtendNativeModules issuer;

    @SerializedName("residents")
    private final List<unregisterFromInspector> residents;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof handleMemoryPressure)) {
            return false;
        }
        handleMemoryPressure handlememorypressure = (handleMemoryPressure) obj;
        if (!Intrinsics.areEqual(this.issuer, handlememorypressure.issuer)) {
            int i2 = onWarmupCompleted + 19;
            onExtraCallback = i2 % 128;
            return i2 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.residents, handlememorypressure.residents)) {
            return true;
        }
        int i3 = onWarmupCompleted + 67;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.issuer.hashCode() * 31) + this.residents.hashCode();
        int i4 = onWarmupCompleted + 5;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 67 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LegalRepresentativeHouseholdRegister(issuer=" + this.issuer + ", residents=" + this.residents + ")";
        int i2 = onExtraCallback + 3;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final List<unregisterFromInspector> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.residents;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
