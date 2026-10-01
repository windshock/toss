package o;

import com.google.gson.annotations.SerializedName;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.bouncycastle.i18n.ErrorBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class nextNativeAd extends getNativeAdLayoutApi {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    @SerializedName("balance")
    private final long _balance;

    @SerializedName("amount")
    private final long amount;

    @SerializedName("createdAt")
    private final String createdAt;

    @SerializedName("fee")
    private final long fee;

    @SerializedName("gtxNo")
    private final long gtxNo;

    @SerializedName("name")
    private final String name;

    @SerializedName(ErrorBundle.SUMMARY_ENTRY)
    private final String summary;

    @SerializedName("type")
    private final String type;

    @SerializedName("useCheckCard")
    private final String useCheckCard;

    public nextNativeAd() {
        this(0L, 0L, 0L, null, null, null, null, null, 0L, 511, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 89;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof nextNativeAd)) {
            int i4 = onExtraCallbackWithResult + 77;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        nextNativeAd nextnativead = (nextNativeAd) obj;
        if (this.amount != nextnativead.amount) {
            return false;
        }
        if (this._balance != nextnativead._balance) {
            int i6 = onExtraCallbackWithResult + 103;
            onExtraCallback = i6 % 128;
            return i6 % 2 == 0;
        }
        if (this.fee != nextnativead.fee) {
            return false;
        }
        if (!Intrinsics.areEqual(this.createdAt, nextnativead.createdAt)) {
            int i7 = onExtraCallbackWithResult + 79;
            onExtraCallback = i7 % 128;
            return i7 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.name, nextnativead.name)) {
            return false;
        }
        if (Intrinsics.areEqual(this.summary, nextnativead.summary)) {
            return Intrinsics.areEqual(this.useCheckCard, nextnativead.useCheckCard) && Intrinsics.areEqual(this.type, nextnativead.type) && this.gtxNo == nextnativead.gtxNo;
        }
        int i8 = onExtraCallback + 85;
        onExtraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((Long.hashCode(this.amount) * 31) + Long.hashCode(this._balance)) * 31) + Long.hashCode(this.fee)) * 31) + this.createdAt.hashCode()) * 31) + this.name.hashCode()) * 31) + this.summary.hashCode()) * 31) + this.useCheckCard.hashCode()) * 31) + this.type.hashCode()) * 31) + Long.hashCode(this.gtxNo);
        int i4 = onExtraCallbackWithResult + 125;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TossAccountTransaction(amount=" + this.amount + ", _balance=" + this._balance + ", fee=" + this.fee + ", createdAt=" + this.createdAt + ", name=" + this.name + ", summary=" + this.summary + ", useCheckCard=" + this.useCheckCard + ", type=" + this.type + ", gtxNo=" + this.gtxNo + ")";
        int i2 = onExtraCallback + 51;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public nextNativeAd(long j, long j2, long j3, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, long j4) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str3, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str4, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str5, BuildConfig.FLAVOR);
        this.amount = j;
        this._balance = j2;
        this.fee = j3;
        this.createdAt = str;
        this.name = str2;
        this.summary = str3;
        this.useCheckCard = str4;
        this.type = str5;
        this.gtxNo = j4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ nextNativeAd(long j, long j2, long j3, String str, String str2, String str3, String str4, String str5, long j4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long j5;
        long j6;
        String str6;
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 107;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            j5 = 0;
        } else {
            j5 = j;
        }
        if ((i & 2) != 0) {
            int i4 = onExtraCallbackWithResult + 49;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            j6 = 0;
        } else {
            j6 = j2;
        }
        long j7 = (i & 4) != 0 ? 0L : j3;
        int i6 = i & 8;
        String str7 = BuildConfig.FLAVOR;
        if (i6 != 0) {
            int i7 = onExtraCallback + 27;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 92 / 0;
            }
            int i9 = 2 % 2;
            str6 = BuildConfig.FLAVOR;
        } else {
            str6 = str;
        }
        this(j5, j6, j7, str6, (i & 16) != 0 ? BuildConfig.FLAVOR : str2, (i & 32) != 0 ? BuildConfig.FLAVOR : str3, (i & 64) != 0 ? BuildConfig.FLAVOR : str4, (i & 128) == 0 ? str5 : str7, (i & 256) == 0 ? j4 : 0L);
    }

    public String IAuthTabCallbackStub() {
        int i = 2 % 2;
        String str = this.createdAt + IAuthTabCallback() + this.amount;
        int i2 = onExtraCallbackWithResult + 59;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 47 / 0;
        }
        return str;
    }

    public long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this._balance;
        }
        int i3 = 69 / 0;
        return this._balance;
    }

    public long IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.amount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        try {
            Date date = CommonModule_closeView.onWarmupCompleted.getInterfaceDescriptor().parse(this.createdAt);
            Intrinsics.checkNotNull(date);
            long time = date.getTime();
            int i4 = onExtraCallbackWithResult + 89;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return time;
        } catch (Exception unused) {
            return 0L;
        }
    }

    public String asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.name;
        }
        throw null;
    }

    public String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.summary;
        int i5 = i3 + 71;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
