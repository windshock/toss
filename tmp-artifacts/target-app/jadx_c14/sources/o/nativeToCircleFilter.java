package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.Date;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import o._string;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class nativeToCircleFilter implements KEKIdentifier, getOther, Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<nativeToCircleFilter> CREATOR = new onWarmupCompleted();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("amount")
    private final long amount;

    @SerializedName("approveTs")
    private final String approveTs;

    @SerializedName("canceled")
    private final boolean canceled;

    @SerializedName("discountAmount")
    private final long discountAmount;

    @SerializedName("discountCategory")
    private final String discountCategory;

    @SerializedName("id")
    private final long id;

    @SerializedName("originalAmount")
    private final long originalAmount;

    @SerializedName("paymentMethod")
    private final String paymentMethod;

    @SerializedName("paymentName")
    private final String paymentName;

    @SerializedName("prepaymentAmount")
    private final long prepaymentAmount;

    @SerializedName("summary")
    private final String summary;

    public static final class onWarmupCompleted implements Parcelable.Creator<nativeToCircleFilter> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ nativeToCircleFilter createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 93;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                onExtraCallback(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            nativeToCircleFilter nativetocirclefilterOnExtraCallback = onExtraCallback(parcel);
            int i3 = onWarmupCompleted + 19;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return nativetocirclefilterOnExtraCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ nativeToCircleFilter[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 67;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            nativeToCircleFilter[] nativetocirclefilterArrOnExtraCallback = onExtraCallback(i);
            int i5 = onWarmupCompleted + 7;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 34 / 0;
            }
            return nativetocirclefilterArrOnExtraCallback;
        }

        public final nativeToCircleFilter onExtraCallback(Parcel parcel) {
            boolean z;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            long j = parcel.readLong();
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                int i2 = onWarmupCompleted + 25;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                z = true;
            } else {
                z = false;
            }
            nativeToCircleFilter nativetocirclefilter = new nativeToCircleFilter(j, string, z, parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString());
            int i4 = onExtraCallback + 121;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return nativetocirclefilter;
        }

        public final nativeToCircleFilter[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted;
            int i4 = i3 + 91;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            nativeToCircleFilter[] nativetocirclefilterArr = new nativeToCircleFilter[i];
            int i6 = i3 + 59;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return nativetocirclefilterArr;
        }
    }

    static {
        int i = onWarmupCompleted + 113;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 25;
            onNavigationEvent = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof nativeToCircleFilter)) {
            int i3 = onExtraCallback;
            int i4 = i3 + 33;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 79;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 47 / 0;
            }
            return false;
        }
        nativeToCircleFilter nativetocirclefilter = (nativeToCircleFilter) obj;
        if (this.amount != nativetocirclefilter.amount || !Intrinsics.areEqual(this.approveTs, nativetocirclefilter.approveTs) || this.canceled != nativetocirclefilter.canceled) {
            return false;
        }
        if (this.discountAmount != nativetocirclefilter.discountAmount) {
            int i8 = onNavigationEvent + 105;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.discountCategory, nativetocirclefilter.discountCategory)) {
            return false;
        }
        if (this.id != nativetocirclefilter.id) {
            int i10 = onNavigationEvent + 105;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (this.originalAmount != nativetocirclefilter.originalAmount) {
            int i12 = onExtraCallback + 55;
            onNavigationEvent = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.paymentMethod, nativetocirclefilter.paymentMethod)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.paymentName, nativetocirclefilter.paymentName)) {
            int i14 = onExtraCallback + 5;
            onNavigationEvent = i14 % 128;
            int i15 = i14 % 2;
            return false;
        }
        if (this.prepaymentAmount != nativetocirclefilter.prepaymentAmount) {
            int i16 = onExtraCallback + 39;
            onNavigationEvent = i16 % 128;
            int i17 = i16 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.summary, nativetocirclefilter.summary))) {
            return true;
        }
        int i18 = onExtraCallback + 109;
        onNavigationEvent = i18 % 128;
        int i19 = i18 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((((((Long.hashCode(this.amount) * 31) + this.approveTs.hashCode()) * 31) + Boolean.hashCode(this.canceled)) * 31) + Long.hashCode(this.discountAmount)) * 31) + this.discountCategory.hashCode()) * 31) + Long.hashCode(this.id)) * 31) + Long.hashCode(this.originalAmount)) * 31) + this.paymentMethod.hashCode()) * 31) + this.paymentName.hashCode()) * 31) + Long.hashCode(this.prepaymentAmount)) * 31) + this.summary.hashCode();
        int i4 = onNavigationEvent + 91;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PlccCardBillTransaction(amount=" + this.amount + ", approveTs=" + this.approveTs + ", canceled=" + this.canceled + ", discountAmount=" + this.discountAmount + ", discountCategory=" + this.discountCategory + ", id=" + this.id + ", originalAmount=" + this.originalAmount + ", paymentMethod=" + this.paymentMethod + ", paymentName=" + this.paymentName + ", prepaymentAmount=" + this.prepaymentAmount + ", summary=" + this.summary + ")";
        int i2 = onExtraCallback + 39;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 123;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.amount);
        parcel.writeString(this.approveTs);
        parcel.writeInt(this.canceled ? 1 : 0);
        parcel.writeLong(this.discountAmount);
        parcel.writeString(this.discountCategory);
        parcel.writeLong(this.id);
        parcel.writeLong(this.originalAmount);
        parcel.writeString(this.paymentMethod);
        parcel.writeString(this.paymentName);
        parcel.writeLong(this.prepaymentAmount);
        parcel.writeString(this.summary);
        int i5 = onNavigationEvent + 73;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public nativeToCircleFilter(long j, @NotNull String str, boolean z, long j2, @NotNull String str2, long j3, long j4, @NotNull String str3, @NotNull String str4, long j5, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.amount = j;
        this.approveTs = str;
        this.canceled = z;
        this.discountAmount = j2;
        this.discountCategory = str2;
        this.id = j3;
        this.originalAmount = j4;
        this.paymentMethod = str3;
        this.paymentName = str4;
        this.prepaymentAmount = j5;
        this.summary = str5;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        boolean z = this.canceled;
        int i5 = i3 + 17;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final Date IAuthTabCallback() {
        Object date;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onExtraCallback = i2 % 128;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.Companion;
            date = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (i2 % 2 == 0) {
            Result.Companion companion2 = Result.Companion;
            Object[] objArr = {CommonModule_closeView.onWarmupCompleted};
            int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
            Result.constructor-impl(((IdGeneratorExternalSyntheticLambda1) CommonModule_closeView.onExtraCallbackWithResult(1967451170, _string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback, -1967451168, _string.onNavigationEvent.IAuthTabCallback(), objArr, _string.onNavigationEvent.IAuthTabCallback())).parse(this.approveTs));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Result.Companion companion3 = Result.Companion;
        Object[] objArr2 = {CommonModule_closeView.onWarmupCompleted};
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        date = Result.constructor-impl(((IdGeneratorExternalSyntheticLambda1) CommonModule_closeView.onExtraCallbackWithResult(1967451170, _string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback2, -1967451168, _string.onNavigationEvent.IAuthTabCallback(), objArr2, _string.onNavigationEvent.IAuthTabCallback())).parse(this.approveTs));
        if (Result.exceptionOrNull-impl(date) != null) {
            date = new Date();
            int i3 = onNavigationEvent + 35;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        return (Date) date;
    }

    @Override // o.getOther
    public toASN1EncodableVector onTransact() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        toASN1EncodableVector toasn1encodablevector = toASN1EncodableVector.PLCC_CARD_BILL_TRANSACTION;
        if (i3 != 0) {
            return toasn1encodablevector;
        }
        throw null;
    }

    public CharSequence asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 13;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.summary;
        int i5 = i2 + 29;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = getLongName.onNavigationEvent(this.amount, (ParamImpl) null, 1, (Object) null);
        int i4 = onNavigationEvent + 95;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 70 / 0;
        }
        return strOnNavigationEvent;
    }

    public String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.paymentName;
        int i5 = i3 + 59;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public String onNavigationEvent() {
        int i = 2 % 2;
        Long lValueOf = Long.valueOf(this.discountAmount + this.prepaymentAmount);
        if (lValueOf.longValue() <= 0) {
            int i2 = onNavigationEvent + 89;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            lValueOf = null;
        }
        if (lValueOf == null) {
            return " ";
        }
        int i4 = onExtraCallback + 29;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        String strOnNavigationEvent = getLongName.onNavigationEvent(-lValueOf.longValue(), (ParamImpl) null, 1, (Object) null);
        if (strOnNavigationEvent == null) {
            return " ";
        }
        int i6 = onNavigationEvent + 61;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return strOnNavigationEvent;
    }

    @Override // o.KEKIdentifier
    public String IAuthTabCallbackStub() {
        int i = 2 % 2;
        String str = new IdGeneratorExternalSyntheticLambda1("yyyyMMdd").format(IAuthTabCallback());
        Intrinsics.checkNotNullExpressionValue(str, "");
        int i2 = onExtraCallback + 113;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public String onExtraCallback() {
        int i = 2 % 2;
        String str = new IdGeneratorExternalSyntheticLambda1("M.d").format(IAuthTabCallback());
        Intrinsics.checkNotNullExpressionValue(str, "");
        int i2 = onExtraCallback + 43;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
