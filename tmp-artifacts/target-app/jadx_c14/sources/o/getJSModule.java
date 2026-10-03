package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getJSModule {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    @SerializedName("design")
    private final getNativeModuleIteratorReactAndroid_release design;

    @SerializedName("hasUssCard")
    private final boolean hasUssCard;

    @SerializedName("isCvcVerifiable")
    private final boolean isCvcVerifiable;

    @SerializedName("isPasswordVerifiable")
    private final boolean isPasswordVerifiable;

    public getJSModule() {
        this(false, null, false, false, 15, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getJSModule)) {
            int i2 = IAuthTabCallback + 27;
            onExtraCallback = i2 % 128;
            return i2 % 2 == 0;
        }
        getJSModule getjsmodule = (getJSModule) obj;
        if (this.hasUssCard != getjsmodule.hasUssCard) {
            int i3 = onExtraCallback + 29;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (this.design != getjsmodule.design) {
            int i4 = onExtraCallback + 29;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.isPasswordVerifiable == getjsmodule.isPasswordVerifiable) {
            return this.isCvcVerifiable == getjsmodule.isCvcVerifiable;
        }
        int i6 = IAuthTabCallback + 57;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 73;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Boolean.hashCode(this.hasUssCard);
            throw null;
        }
        int iHashCode = Boolean.hashCode(this.hasUssCard);
        getNativeModuleIteratorReactAndroid_release getnativemoduleiteratorreactandroid_release = this.design;
        if (getnativemoduleiteratorreactandroid_release == null) {
            int i4 = onExtraCallback + 43;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            i = 0;
        } else {
            int iHashCode2 = getnativemoduleiteratorreactandroid_release.hashCode();
            int i6 = onExtraCallback + 59;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            i = iHashCode2;
        }
        return (((((iHashCode * 31) + i) * 31) + Boolean.hashCode(this.isPasswordVerifiable)) * 31) + Boolean.hashCode(this.isCvcVerifiable);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GuestUssCardInfoResponse(hasUssCard=" + this.hasUssCard + ", design=" + this.design + ", isPasswordVerifiable=" + this.isPasswordVerifiable + ", isCvcVerifiable=" + this.isCvcVerifiable + ")";
        int i2 = IAuthTabCallback + 41;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public getJSModule(boolean z, @Nullable getNativeModuleIteratorReactAndroid_release getnativemoduleiteratorreactandroid_release, boolean z2, boolean z3) {
        this.hasUssCard = z;
        this.design = getnativemoduleiteratorreactandroid_release;
        this.isPasswordVerifiable = z2;
        this.isCvcVerifiable = z3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getJSModule(boolean z, getNativeModuleIteratorReactAndroid_release getnativemoduleiteratorreactandroid_release, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 73;
            onExtraCallback = i2 % 128;
            z = i2 % 2 == 0;
        }
        getnativemoduleiteratorreactandroid_release = (i & 2) != 0 ? null : getnativemoduleiteratorreactandroid_release;
        if ((i & 4) != 0) {
            int i3 = IAuthTabCallback + 25;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            z2 = false;
        }
        if ((i & 8) != 0) {
            int i6 = onExtraCallback + 69;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            z3 = false;
        }
        this(z, getnativemoduleiteratorreactandroid_release, z2, z3);
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 41;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.hasUssCard;
        int i5 = i2 + 75;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.isPasswordVerifiable;
        }
        throw null;
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        boolean z = this.isCvcVerifiable;
        int i5 = i3 + 125;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }
}
