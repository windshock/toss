package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getTurboModuleRegistry {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    @SerializedName("isTossUser")
    private final Boolean isTossUser;

    /* JADX WARN: Illegal instructions before constructor call */
    public getTurboModuleRegistry() {
        Boolean bool = null;
        this(bool, 1, bool);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getTurboModuleRegistry)) {
            return false;
        }
        if (Intrinsics.areEqual(this.isTossUser, ((getTurboModuleRegistry) obj).isTossUser)) {
            return true;
        }
        int i3 = onExtraCallbackWithResult + 41;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        Boolean bool = this.isTossUser;
        if (bool == null) {
            int i2 = onExtraCallback + 107;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return 0;
        }
        int iHashCode = bool.hashCode();
        int i4 = onExtraCallback + 121;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GuardianSignUpAgreementLinkResponse(isTossUser=" + this.isTossUser + ")";
        int i2 = onExtraCallback + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public getTurboModuleRegistry(@Nullable Boolean bool) {
        this.isTossUser = bool;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getTurboModuleRegistry(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 115;
            onExtraCallbackWithResult = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i3 = 2 % 2;
            bool = null;
        }
        this(bool);
    }

    public final Boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 3;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.isTossUser;
        int i5 = i2 + 33;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 8 / 0;
        }
        return bool;
    }
}
