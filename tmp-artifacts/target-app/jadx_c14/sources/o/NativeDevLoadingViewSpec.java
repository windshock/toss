package o;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NativeDevLoadingViewSpec {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    @SerializedName("gov24JoinRequired")
    private final boolean gov24JoinRequired;

    @SerializedName("nameMismatch")
    private final boolean nameMismatch;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 47;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NativeDevLoadingViewSpec)) {
            return false;
        }
        NativeDevLoadingViewSpec nativeDevLoadingViewSpec = (NativeDevLoadingViewSpec) obj;
        if (this.gov24JoinRequired != nativeDevLoadingViewSpec.gov24JoinRequired) {
            int i6 = i2 + 37;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 32 / 0;
            }
            return false;
        }
        if (this.nameMismatch == nativeDevLoadingViewSpec.nameMismatch) {
            return true;
        }
        int i8 = i4 + 51;
        onExtraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (Boolean.hashCode(this.gov24JoinRequired) * 31) + Boolean.hashCode(this.nameMismatch);
        int i4 = onExtraCallback + 111;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DocumentWalletGetApplyQualificationResp(gov24JoinRequired=" + this.gov24JoinRequired + ", nameMismatch=" + this.nameMismatch + ")";
        int i2 = onExtraCallbackWithResult + 59;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.gov24JoinRequired;
        if (i3 != 0) {
            int i4 = 29 / 0;
        }
        return z;
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.nameMismatch;
        int i4 = i3 + 51;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }
}
