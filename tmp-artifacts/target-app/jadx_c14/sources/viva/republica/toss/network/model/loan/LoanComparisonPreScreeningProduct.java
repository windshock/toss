package viva.republica.toss.network.model.loan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.liq;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.LoanComparisonPreScreeningProduct$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LoanComparisonPreScreeningProduct implements Parcelable {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;

    @SerializedName("loanProductId")
    private final String loanProductId;

    @SerializedName("loanReqNo")
    private final String loanReqNo;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LoanComparisonPreScreeningProduct> CREATOR = new IAuthTabCallback();

    public static final class IAuthTabCallback implements Parcelable.Creator<LoanComparisonPreScreeningProduct> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public final LoanComparisonPreScreeningProduct IAuthTabCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            LoanComparisonPreScreeningProduct loanComparisonPreScreeningProduct = new LoanComparisonPreScreeningProduct(parcel.readString(), parcel.readString());
            int i2 = onWarmupCompleted + 71;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return loanComparisonPreScreeningProduct;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ LoanComparisonPreScreeningProduct createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 69;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return IAuthTabCallback(parcel);
            }
            IAuthTabCallback(parcel);
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ LoanComparisonPreScreeningProduct[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 119;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return onExtraCallback(i);
            }
            onExtraCallback(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final LoanComparisonPreScreeningProduct[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent;
            int i4 = i3 + 117;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            LoanComparisonPreScreeningProduct[] loanComparisonPreScreeningProductArr = new LoanComparisonPreScreeningProduct[i];
            int i6 = i3 + 109;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return loanComparisonPreScreeningProductArr;
        }
    }

    static {
        int i = IAuthTabCallback + 67;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LoanComparisonPreScreeningProduct() {
        String str = null;
        this(str, str, 3, (DefaultConstructorMarker) str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 91;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2 == 0 ? 1 : 0;
        int i5 = i2 + 63;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 59;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoanComparisonPreScreeningProduct)) {
            int i4 = i2 + 109;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.loanProductId, ((LoanComparisonPreScreeningProduct) obj).loanProductId)) {
            int i6 = onExtraCallback + 17;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.loanReqNo, r6.loanReqNo))) {
            return true;
        }
        int i8 = onExtraCallbackWithResult + 95;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        onExtraCallback = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (this.loanProductId.hashCode() / 125) % this.loanReqNo.hashCode() : (this.loanProductId.hashCode() * 31) + this.loanReqNo.hashCode();
        int i3 = onExtraCallbackWithResult + 85;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanComparisonPreScreeningProduct(loanProductId=" + this.loanProductId + ", loanReqNo=" + this.loanReqNo + ")";
        int i2 = onExtraCallback + 85;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 42 / 0;
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 31;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        String str = this.loanProductId;
        if (i4 == 0) {
            parcel.writeString(str);
            parcel.writeString(this.loanReqNo);
        } else {
            parcel.writeString(str);
            parcel.writeString(this.loanReqNo);
            throw null;
        }
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LoanComparisonPreScreeningProduct> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 119;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            LoanComparisonPreScreeningProduct$.serializer serializerVar = LoanComparisonPreScreeningProduct$.serializer.INSTANCE;
            int i4 = onWarmupCompleted + 79;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ LoanComparisonPreScreeningProduct(int r3, java.lang.String r4, java.lang.String r5, o.okycx r6) {
        /*
            r2 = this;
            r2.<init>()
            r6 = r3 & 1
            java.lang.String r0 = ""
            r1 = 2
            if (r6 != 0) goto Lf
            r2.loanProductId = r0
        Lc:
            int r4 = r1 % r1
            goto L1c
        Lf:
            r2.loanProductId = r4
            int r4 = viva.republica.toss.network.model.loan.LoanComparisonPreScreeningProduct.onExtraCallback
            int r4 = r4 + 69
            int r6 = r4 % 128
            viva.republica.toss.network.model.loan.LoanComparisonPreScreeningProduct.onExtraCallbackWithResult = r6
            int r4 = r4 % r1
            if (r4 != 0) goto Lc
        L1c:
            r3 = r3 & r1
            if (r3 != 0) goto L31
            int r3 = viva.republica.toss.network.model.loan.LoanComparisonPreScreeningProduct.onExtraCallbackWithResult
            int r3 = r3 + 107
            int r4 = r3 % 128
            viva.republica.toss.network.model.loan.LoanComparisonPreScreeningProduct.onExtraCallback = r4
            int r3 = r3 % r1
            r2.loanReqNo = r0
            if (r3 == 0) goto L30
            r3 = 13
            int r3 = r3 / 0
        L30:
            return
        L31:
            r2.loanReqNo = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanComparisonPreScreeningProduct.<init>(int, java.lang.String, java.lang.String, o.okycx):void");
    }

    public LoanComparisonPreScreeningProduct(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.loanProductId = str;
        this.loanReqNo = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallback(viva.republica.toss.network.model.loan.LoanComparisonPreScreeningProduct r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.loan.LoanComparisonPreScreeningProduct.onExtraCallbackWithResult
            int r1 = r1 + 77
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.LoanComparisonPreScreeningProduct.onExtraCallback = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            r3 = 0
            if (r1 == 0) goto L18
            boolean r1 = r6.onWarmupCompleted(r7, r3)
            if (r1 != 0) goto L26
            goto L1e
        L18:
            boolean r1 = r6.onWarmupCompleted(r7, r3)
            if (r1 != 0) goto L26
        L1e:
            java.lang.String r1 = r5.loanProductId
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L34
        L26:
            java.lang.String r1 = r5.loanProductId
            r6.onExtraCallback(r7, r3, r1)
            int r1 = viva.republica.toss.network.model.loan.LoanComparisonPreScreeningProduct.onExtraCallbackWithResult
            int r1 = r1 + 51
            int r3 = r1 % 128
            viva.republica.toss.network.model.loan.LoanComparisonPreScreeningProduct.onExtraCallback = r3
            int r1 = r1 % r0
        L34:
            r1 = 1
            boolean r3 = r6.onWarmupCompleted(r7, r1)
            if (r3 != 0) goto L56
            int r3 = viva.republica.toss.network.model.loan.LoanComparisonPreScreeningProduct.onExtraCallbackWithResult
            int r3 = r3 + 123
            int r4 = r3 % 128
            viva.republica.toss.network.model.loan.LoanComparisonPreScreeningProduct.onExtraCallback = r4
            int r3 = r3 % r0
            if (r3 != 0) goto L4f
            java.lang.String r0 = r5.loanReqNo
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r0 != 0) goto L5b
            goto L56
        L4f:
            java.lang.String r5 = r5.loanReqNo
            kotlin.jvm.internal.Intrinsics.areEqual(r5, r2)
            r5 = 0
            throw r5
        L56:
            java.lang.String r5 = r5.loanReqNo
            r6.onExtraCallback(r7, r1, r5)
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanComparisonPreScreeningProduct.onExtraCallback(viva.republica.toss.network.model.loan.LoanComparisonPreScreeningProduct, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoanComparisonPreScreeningProduct(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 7;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i5 = onExtraCallbackWithResult + 29;
            int i6 = i5 % 128;
            onExtraCallback = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 27;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            str2 = "";
        }
        this(str, str2);
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.loanProductId;
        int i5 = i3 + 111;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 72 / 0;
        }
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.loanReqNo;
        int i5 = i3 + 73;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
