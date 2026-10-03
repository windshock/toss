package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class unregisterFromInspector {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("birthday")
    private final String birthday;

    @SerializedName("gender")
    private final String gender;

    @SerializedName("name")
    private final String name;

    @SerializedName("relationship")
    private final String relationship;

    @SerializedName("status")
    private final String status;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 33;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof unregisterFromInspector)) {
            int i5 = i2 + 39;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        unregisterFromInspector unregisterfrominspector = (unregisterFromInspector) obj;
        if (!Intrinsics.areEqual(this.name, unregisterfrominspector.name)) {
            int i7 = onWarmupCompleted + 109;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.status, unregisterfrominspector.status)) {
            if (!Intrinsics.areEqual(this.relationship, unregisterfrominspector.relationship)) {
                return false;
            }
            if (Intrinsics.areEqual(this.birthday, unregisterfrominspector.birthday)) {
                return Intrinsics.areEqual(this.gender, unregisterfrominspector.gender);
            }
            int i9 = onWarmupCompleted + 35;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        int i11 = onExtraCallback;
        int i12 = i11 + 71;
        onWarmupCompleted = i12 % 128;
        int i13 = i12 % 2;
        int i14 = i11 + 45;
        onWarmupCompleted = i14 % 128;
        if (i14 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.name.hashCode() * 31) + this.status.hashCode()) * 31) + this.relationship.hashCode()) * 31) + this.birthday.hashCode()) * 31) + this.gender.hashCode();
        int i4 = onExtraCallback + 15;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LegalRepresentativeHouseholdRegisterItem(name=" + this.name + ", status=" + this.status + ", relationship=" + this.relationship + ", birthday=" + this.birthday + ", gender=" + this.gender + ")";
        int i2 = onExtraCallback + 59;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.name;
        int i5 = i3 + 23;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 59;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.birthday;
        int i5 = i2 + 43;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 40 / 0;
        }
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.gender;
        int i5 = i3 + 19;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 59 / 0;
        }
        return str;
    }

    public final lambdadestroy0 onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            if (Intrinsics.areEqual(this.relationship, "본인")) {
                return lambdadestroy0.SELF;
            }
            if (!Intrinsics.areEqual(this.relationship, "배우자")) {
                if (!StringsKt.contains$default(this.relationship, "자녀", false, 2, (Object) null)) {
                    return lambdadestroy0.ETC;
                }
                lambdadestroy0 lambdadestroy0Var = lambdadestroy0.CHILDREN;
                int i3 = onWarmupCompleted + 29;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    return lambdadestroy0Var;
                }
                obj.hashCode();
                throw null;
            }
            lambdadestroy0 lambdadestroy0Var2 = lambdadestroy0.SPOUSE;
            int i4 = onExtraCallback + 71;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return lambdadestroy0Var2;
        }
        Intrinsics.areEqual(this.relationship, "본인");
        throw null;
    }
}
