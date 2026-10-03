package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class loadScriptFromAssets {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    @SerializedName("legalRepresentative")
    private final onNativeException legalRepresentative;

    @SerializedName("under14")
    private final onNativeException under14;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 99;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof loadScriptFromAssets)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.legalRepresentative, ((loadScriptFromAssets) obj).legalRepresentative)) {
            int i4 = IAuthTabCallback + 29;
            onExtraCallbackWithResult = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!(!Intrinsics.areEqual(this.under14, r6.under14))) {
            return true;
        }
        int i5 = IAuthTabCallback + 57;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.legalRepresentative.hashCode();
        return i3 == 0 ? (iHashCode + 43) >>> this.under14.hashCode() : (iHashCode * 31) + this.under14.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LegalRepresentativeFamilyRelationsCertificate(legalRepresentative=" + this.legalRepresentative + ", under14=" + this.under14 + ")";
        int i2 = onExtraCallbackWithResult + 1;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final onNativeException onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.legalRepresentative;
        }
        throw null;
    }

    public final onNativeException IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        onNativeException onnativeexception = this.under14;
        int i5 = i3 + 55;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return onnativeexception;
    }
}
