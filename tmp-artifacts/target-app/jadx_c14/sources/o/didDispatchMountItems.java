package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class didDispatchMountItems {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    @SerializedName("document")
    private final String document;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 35;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i3 + 101;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 85 / 0;
            }
            return true;
        }
        if (!(obj instanceof didDispatchMountItems)) {
            int i9 = i3 + 1;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.document, ((didDispatchMountItems) obj).document)) {
            return true;
        }
        int i11 = IAuthTabCallback + 11;
        onExtraCallbackWithResult = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.document.hashCode();
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.document.hashCode();
        int i3 = IAuthTabCallback + 53;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ExternalSignDoc(document=" + this.document + ")";
        int i2 = onExtraCallbackWithResult + 47;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 69;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.document;
        int i4 = i2 + 23;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
