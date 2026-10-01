package o;

import android.content.res.Configuration;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getCurrentReduceMotionState {
    public static final int $stable = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    @SerializedName("backgroundColor")
    private final String backgroundColor;

    @SerializedName("color")
    private final String color;

    @SerializedName("paddingLeft")
    private final Long paddingLeft;

    @SerializedName("paddingRight")
    private final Long paddingRight;

    @SerializedName("paddingTop")
    private final Long paddingTop;

    @SerializedName("repeatLastItemCount")
    private final Integer repeatLastItemCount;

    @SerializedName("type")
    private final String type;

    public getCurrentReduceMotionState() {
        this(null, null, null, null, null, null, null, CertificateBody.profileType, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCurrentReduceMotionState)) {
            int i2 = onExtraCallbackWithResult + 83;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        getCurrentReduceMotionState getcurrentreducemotionstate = (getCurrentReduceMotionState) obj;
        if (!Intrinsics.areEqual(this.type, getcurrentreducemotionstate.type) || !Intrinsics.areEqual(this.repeatLastItemCount, getcurrentreducemotionstate.repeatLastItemCount)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.paddingTop, getcurrentreducemotionstate.paddingTop)) {
            int i4 = onExtraCallback + 37;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if ((!Intrinsics.areEqual(this.paddingLeft, getcurrentreducemotionstate.paddingLeft)) || !Intrinsics.areEqual(this.paddingRight, getcurrentreducemotionstate.paddingRight)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.color, getcurrentreducemotionstate.color)) {
            int i6 = onExtraCallbackWithResult + 37;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.backgroundColor, getcurrentreducemotionstate.backgroundColor)) {
            return true;
        }
        int i8 = onExtraCallbackWithResult + 33;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        String str;
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 19;
        onExtraCallbackWithResult = i3 % 128;
        int iHashCode4 = 0;
        if (i3 % 2 != 0 ? (str = this.type) != null : (str = this.type) != null) {
            iHashCode = str.hashCode();
        } else {
            int i4 = i2 + 61;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i2 + 121;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 / 5;
            }
            iHashCode = 0;
        }
        Integer num = this.repeatLastItemCount;
        if (num == null) {
            int i8 = onExtraCallbackWithResult + 85;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = num.hashCode();
        }
        Long l = this.paddingTop;
        int iHashCode5 = l == null ? 0 : l.hashCode();
        Long l2 = this.paddingLeft;
        if (l2 == null) {
            int i10 = onExtraCallback + 33;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = l2.hashCode();
        }
        Long l3 = this.paddingRight;
        int iHashCode6 = l3 == null ? 0 : l3.hashCode();
        String str2 = this.color;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.backgroundColor;
        if (str3 != null) {
            int i12 = onExtraCallbackWithResult + 25;
            onExtraCallback = i12 % 128;
            int i13 = i12 % 2;
            iHashCode4 = str3.hashCode();
        }
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode5) * 31) + iHashCode3) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SkeletonData(type=" + this.type + ", repeatLastItemCount=" + this.repeatLastItemCount + ", paddingTop=" + this.paddingTop + ", paddingLeft=" + this.paddingLeft + ", paddingRight=" + this.paddingRight + ", color=" + this.color + ", backgroundColor=" + this.backgroundColor + ")";
        int i2 = onExtraCallback + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public getCurrentReduceMotionState(@Nullable String str, @Nullable Integer num, @Nullable Long l, @Nullable Long l2, @Nullable Long l3, @Nullable String str2, @Nullable String str3) {
        this.type = str;
        this.repeatLastItemCount = num;
        this.paddingTop = l;
        this.paddingLeft = l2;
        this.paddingRight = l3;
        this.color = str2;
        this.backgroundColor = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getCurrentReduceMotionState(String str, Integer num, Long l, Long l2, Long l3, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Long l4;
        Long l5;
        Long l6;
        String str4;
        String str5 = (i & 1) != 0 ? null : str;
        Integer num2 = (i & 2) != 0 ? null : num;
        if ((i & 4) != 0) {
            int i2 = onExtraCallback + 3;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            l4 = null;
        } else {
            l4 = l;
        }
        if ((i & 8) != 0) {
            int i4 = onExtraCallbackWithResult;
            int i5 = i4 + 21;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 43;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            l5 = null;
        } else {
            l5 = l2;
        }
        if ((i & 16) != 0) {
            int i10 = onExtraCallback + 45;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 2 % 2;
            l6 = null;
        } else {
            l6 = l3;
        }
        if ((i & 32) != 0) {
            int i13 = onExtraCallback + 25;
            onExtraCallbackWithResult = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 27 / 0;
            }
            str4 = null;
        } else {
            str4 = str2;
        }
        this(str5, num2, l4, l5, l6, str4, (i & 64) != 0 ? null : str3);
    }

    public static final class IAuthTabCallback implements getAdService {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration $this_colorScheme;

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.$this_colorScheme)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = onNavigationEvent + 23;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = onExtraCallback + 111;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 86 / 0;
            }
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ Configuration $this_colorScheme;

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 29;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.$this_colorScheme)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onExtraCallback + 113;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            if (i5 != 0) {
                int i6 = 40 / 0;
            }
            return getspecialfeatureoptinstatus;
        }
    }
}
