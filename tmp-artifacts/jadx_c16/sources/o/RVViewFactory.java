package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RVViewFactory {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    @SerializedName("amount")
    private final long amount;

    @SerializedName("date")
    private final String date;

    @SerializedName("doc")
    private final String doc;

    @SerializedName("eventId")
    private final long eventId;

    @SerializedName("fromAccountNo")
    private final String fromAccountNo;

    @SerializedName("fromAccountType")
    private final String fromAccountType;

    @SerializedName("signature")
    private final String signature;

    @SerializedName("lv0Cert")
    private final boolean useLv0Cert;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 73;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RVViewFactory)) {
            return false;
        }
        RVViewFactory rVViewFactory = (RVViewFactory) obj;
        if (this.eventId != rVViewFactory.eventId) {
            int i5 = i4 + 47;
            IAuthTabCallback = i5 % 128;
            return i5 % 2 != 0;
        }
        if (this.amount != rVViewFactory.amount) {
            int i6 = i2 + 105;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.fromAccountNo, rVViewFactory.fromAccountNo)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.fromAccountType, rVViewFactory.fromAccountType)) {
            int i8 = onExtraCallback + 71;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.doc, rVViewFactory.doc)) {
            int i10 = IAuthTabCallback + 43;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.signature, rVViewFactory.signature)) {
            int i12 = onExtraCallback + 41;
            IAuthTabCallback = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.date, rVViewFactory.date)) {
            int i14 = IAuthTabCallback + 109;
            onExtraCallback = i14 % 128;
            return i14 % 2 == 0;
        }
        if (this.useLv0Cert == rVViewFactory.useLv0Cert) {
            return true;
        }
        int i15 = IAuthTabCallback + 105;
        onExtraCallback = i15 % 128;
        return i15 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((Long.hashCode(this.eventId) * 31) + Long.hashCode(this.amount)) * 31) + this.fromAccountNo.hashCode()) * 31) + this.fromAccountType.hashCode()) * 31) + this.doc.hashCode()) * 31) + this.signature.hashCode()) * 31) + this.date.hashCode()) * 31) + Boolean.hashCode(this.useLv0Cert);
        int i4 = onExtraCallback + 43;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SendGroupEventDuesReqDto(eventId=" + this.eventId + ", amount=" + this.amount + ", fromAccountNo=" + this.fromAccountNo + ", fromAccountType=" + this.fromAccountType + ", doc=" + this.doc + ", signature=" + this.signature + ", date=" + this.date + ", useLv0Cert=" + this.useLv0Cert + ")";
        int i2 = onExtraCallback + 17;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public RVViewFactory(long j, long j2, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.eventId = j;
        this.amount = j2;
        this.fromAccountNo = str;
        this.fromAccountType = str2;
        this.doc = str3;
        this.signature = str4;
        this.date = str5;
        this.useLv0Cert = z;
    }
}
