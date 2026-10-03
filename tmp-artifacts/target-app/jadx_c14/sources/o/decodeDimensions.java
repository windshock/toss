package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class decodeDimensions {
    public static final int $stable = 8;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    @SerializedName("no")
    private String accountId;

    @SerializedName("balance")
    private long balance;

    @SerializedName("name")
    private String name;

    @SerializedName("savingBox")
    private BitmapUtilWhenMappings savingBox;

    @SerializedName("status")
    private String status;

    @SerializedName("type")
    private String type;

    public decodeDimensions() {
        this(null, null, 0L, null, null, null, 63, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 93;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof decodeDimensions)) {
            int i4 = IAuthTabCallback + 17;
            onExtraCallback = i4 % 128;
            return i4 % 2 != 0;
        }
        decodeDimensions decodedimensions = (decodeDimensions) obj;
        if (!Intrinsics.areEqual(this.accountId, decodedimensions.accountId)) {
            int i5 = IAuthTabCallback + 19;
            onExtraCallback = i5 % 128;
            return i5 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.name, decodedimensions.name)) {
            return this.balance == decodedimensions.balance && Intrinsics.areEqual(this.status, decodedimensions.status) && Intrinsics.areEqual(this.type, decodedimensions.type) && Intrinsics.areEqual(this.savingBox, decodedimensions.savingBox);
        }
        int i6 = IAuthTabCallback + 31;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            this.accountId.hashCode();
            this.name.hashCode();
            Long.hashCode(this.balance);
            this.status.hashCode();
            this.type.hashCode();
            throw null;
        }
        int iHashCode2 = this.accountId.hashCode();
        int iHashCode3 = this.name.hashCode();
        int iHashCode4 = Long.hashCode(this.balance);
        int iHashCode5 = this.status.hashCode();
        int iHashCode6 = this.type.hashCode();
        BitmapUtilWhenMappings bitmapUtilWhenMappings = this.savingBox;
        if (bitmapUtilWhenMappings == null) {
            iHashCode = 0;
        } else {
            iHashCode = bitmapUtilWhenMappings.hashCode();
            int i3 = onExtraCallback + 3;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = (((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode;
        int i6 = onExtraCallback + 5;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SavingBoxGet(accountId=" + this.accountId + ", name=" + this.name + ", balance=" + this.balance + ", status=" + this.status + ", type=" + this.type + ", savingBox=" + this.savingBox + ")";
        int i2 = IAuthTabCallback + 97;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public decodeDimensions(@NotNull String str, @NotNull String str2, long j, @NotNull String str3, @NotNull String str4, @Nullable BitmapUtilWhenMappings bitmapUtilWhenMappings) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.accountId = str;
        this.name = str2;
        this.balance = j;
        this.status = str3;
        this.type = str4;
        this.savingBox = bitmapUtilWhenMappings;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ decodeDimensions(String str, String str2, long j, String str3, String str4, BitmapUtilWhenMappings bitmapUtilWhenMappings, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        String str6;
        String str7 = "";
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 25;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i4 = onExtraCallback + 123;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str5 = "";
        } else {
            str5 = str2;
        }
        if ((i & 4) != 0) {
            int i7 = onExtraCallback + 47;
            IAuthTabCallback = i7 % 128;
            j = i7 % 2 == 0 ? 1L : 0L;
            int i8 = 2 % 2;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            int i9 = IAuthTabCallback + 123;
            onExtraCallback = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 98 / 0;
            }
            int i11 = 2 % 2;
            str6 = "";
        } else {
            str6 = str3;
        }
        if ((i & 16) != 0) {
            int i12 = IAuthTabCallback + 33;
            onExtraCallback = i12 % 128;
            int i13 = i12 % 2;
            int i14 = 2 % 2;
        } else {
            str7 = str4;
        }
        if ((i & 32) != 0) {
            int i15 = onExtraCallback + 105;
            IAuthTabCallback = i15 % 128;
            int i16 = i15 % 2;
            int i17 = 2 % 2;
            bitmapUtilWhenMappings = null;
        }
        this(str, str5, j2, str6, str7, bitmapUtilWhenMappings);
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 115;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.name;
        int i4 = i2 + 25;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final BitmapUtilWhenMappings onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        BitmapUtilWhenMappings bitmapUtilWhenMappings = this.savingBox;
        int i4 = i3 + 61;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return bitmapUtilWhenMappings;
        }
        obj.hashCode();
        throw null;
    }
}
