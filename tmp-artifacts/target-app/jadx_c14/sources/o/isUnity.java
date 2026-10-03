package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class isUnity {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    @SerializedName("cardCode")
    private final Integer cardCode;

    @SerializedName("subscription")
    private final Boolean subscription;

    /* JADX WARN: Multi-variable type inference failed */
    public isUnity() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 53;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 5;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (obj instanceof isUnity) {
            isUnity isunity = (isUnity) obj;
            if (!Intrinsics.areEqual(this.cardCode, isunity.cardCode)) {
                return false;
            }
            if (Intrinsics.areEqual(this.subscription, isunity.subscription)) {
                return true;
            }
            int i7 = onExtraCallbackWithResult + 117;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = i2 + 15;
        int i10 = i9 % 128;
        onExtraCallbackWithResult = i10;
        boolean z = i9 % 2 != 0;
        int i11 = i10 + 59;
        onExtraCallback = i11 % 128;
        if (i11 % 2 != 0) {
            return z;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        Integer num = this.cardCode;
        if (num == null) {
            int i2 = onExtraCallback + 29;
            onExtraCallbackWithResult = i2 % 128;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = num.hashCode();
        }
        Boolean bool = this.subscription;
        int iHashCode2 = (iHashCode * 31) + (bool != null ? bool.hashCode() : 0);
        int i3 = onExtraCallbackWithResult + 37;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardNotificationSubscriptionSet(cardCode=" + this.cardCode + ", subscription=" + this.subscription + ")";
        int i2 = onExtraCallbackWithResult + 53;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 87 / 0;
        }
        return str;
    }

    public isUnity(@Nullable Integer num, @Nullable Boolean bool) {
        this.cardCode = num;
        this.subscription = bool;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ isUnity(Integer num, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            num = null;
        }
        if ((i & 2) != 0) {
            int i3 = onExtraCallback;
            int i4 = i3 + 53;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 119;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 % 2;
            }
            bool = null;
        }
        this(num, bool);
    }
}
