package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class onNativeException {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    @SerializedName("birthday")
    private final String birthday;

    @SerializedName("gender")
    private final String gender;

    @SerializedName("name")
    private final String name;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent;
            int i3 = i2 + 23;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 69;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(!(obj instanceof onNativeException))) {
            if (!Intrinsics.areEqual(this.name, ((onNativeException) obj).name)) {
                int i7 = IAuthTabCallback + 111;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 != 0) {
                    return false;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (!(!Intrinsics.areEqual(this.birthday, r6.birthday)) && !(!Intrinsics.areEqual(this.gender, r6.gender))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.name.hashCode() * 31) + this.birthday.hashCode()) * 31) + this.gender.hashCode();
        int i4 = onNavigationEvent + 69;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LegalRepresentativeFamilyRelationsCertificateItem(name=" + this.name + ", birthday=" + this.birthday + ", gender=" + this.gender + ")";
        int i2 = IAuthTabCallback + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 33;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.name;
        int i5 = i2 + 121;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 115;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.birthday;
        int i5 = i2 + 101;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 85;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.gender;
        int i5 = i2 + 15;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
