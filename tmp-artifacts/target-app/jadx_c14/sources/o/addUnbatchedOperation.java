package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import im.toss.features.teens.cvscash.CvsCashTransactionActivity$;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class addUnbatchedOperation implements Parcelable {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    @SerializedName("amount")
    private long amount;

    @SerializedName("id")
    private final long id;

    @SerializedName("name")
    private final String name;

    @SerializedName("phone")
    private final String phone;

    @SerializedName("status")
    private String status;

    @SerializedName("userNo")
    private final long userNo;
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    public static final Parcelable.Creator<addUnbatchedOperation> CREATOR = new onExtraCallback();

    public static final class onExtraCallback implements Parcelable.Creator<addUnbatchedOperation> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ addUnbatchedOperation createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 39;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return onExtraCallbackWithResult(parcel);
            }
            onExtraCallbackWithResult(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ addUnbatchedOperation[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 9;
            onWarmupCompleted = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                onNavigationEvent(i);
                obj.hashCode();
                throw null;
            }
            addUnbatchedOperation[] addunbatchedoperationArrOnNavigationEvent = onNavigationEvent(i);
            int i4 = IAuthTabCallback + 107;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return addunbatchedoperationArrOnNavigationEvent;
            }
            throw null;
        }

        public final addUnbatchedOperation onExtraCallbackWithResult(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            addUnbatchedOperation addunbatchedoperation = new addUnbatchedOperation(parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readString());
            int i2 = IAuthTabCallback + 47;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return addunbatchedoperation;
            }
            throw null;
        }

        public final addUnbatchedOperation[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 33;
            IAuthTabCallback = i3 % 128;
            addUnbatchedOperation[] addunbatchedoperationArr = new addUnbatchedOperation[i];
            if (i3 % 2 != 0) {
                int i4 = 6 / 0;
            }
            return addunbatchedoperationArr;
        }
    }

    static {
        int i = onWarmupCompleted + 41;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public addUnbatchedOperation() {
        this(null, 0L, 0L, null, 0L, null, 63, null);
    }

    public static /* synthetic */ Object IAuthTabCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i2;
        int i9 = ~(i7 | i8);
        int i10 = i3 | i9;
        int i11 = (~(i7 | i3)) | i9 | (~(i8 | i3));
        int i12 = ~((~i3) | i | i2);
        int i13 = i + i2 + i4 + ((-2027816600) * i6) + ((-1234684791) * i5);
        int i14 = i13 * i13;
        int i15 = (i * (-132237830)) + 1711013888 + ((-132237830) * i2) + (i10 * 228444679) + (228444679 * i11) + ((-228444679) * i12) + (96206848 * i4) + (811597824 * i6) + (1100742656 * i5) + (1751056384 * i14);
        int i16 = ((i * 572746074) - 905264446) + (i2 * 572746074) + (i10 * (-489)) + (i11 * (-489)) + (i12 * 489) + (i4 * 572745585) + (i6 * 982511336) + (i5 * (-774025351)) + (i14 * 1257177088);
        return i15 + ((i16 * i16) * 1874919424) != 1 ? onNavigationEvent(objArr) : IAuthTabCallback(objArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof addUnbatchedOperation)) {
            return false;
        }
        addUnbatchedOperation addunbatchedoperation = (addUnbatchedOperation) obj;
        if (!Intrinsics.areEqual(this.name, addunbatchedoperation.name)) {
            int i2 = onExtraCallbackWithResult + 103;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (this.amount != addunbatchedoperation.amount) {
            int i4 = IAuthTabCallback + 79;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.id != addunbatchedoperation.id) {
            return false;
        }
        if (!Intrinsics.areEqual(this.status, addunbatchedoperation.status)) {
            int i6 = onExtraCallbackWithResult + 23;
            IAuthTabCallback = i6 % 128;
            return i6 % 2 != 0;
        }
        if (this.userNo != addunbatchedoperation.userNo) {
            return false;
        }
        if (Intrinsics.areEqual(this.phone, addunbatchedoperation.phone)) {
            return true;
        }
        int i7 = onExtraCallbackWithResult + 11;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.name.hashCode();
        int iHashCode3 = Long.hashCode(this.amount);
        int iHashCode4 = Long.hashCode(this.id);
        int iHashCode5 = this.status.hashCode();
        int iHashCode6 = Long.hashCode(this.userNo);
        String str = this.phone;
        if (str == null) {
            int i4 = IAuthTabCallback + 31;
            onExtraCallbackWithResult = i4 % 128;
            iHashCode = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        return (((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DutchPayMember(name=" + this.name + ", amount=" + this.amount + ", id=" + this.id + ", status=" + this.status + ", userNo=" + this.userNo + ", phone=" + this.phone + ")";
        int i2 = IAuthTabCallback + 85;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 62 / 0;
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 39;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.name);
        parcel.writeLong(this.amount);
        parcel.writeLong(this.id);
        parcel.writeString(this.status);
        parcel.writeLong(this.userNo);
        parcel.writeString(this.phone);
        int i5 = IAuthTabCallback + 31;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public addUnbatchedOperation(@NotNull String str, long j, long j2, @NotNull String str2, long j3, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.name = str;
        this.amount = j;
        this.id = j2;
        this.status = str2;
        this.userNo = j3;
        this.phone = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ addUnbatchedOperation(String str, long j, long j2, String str2, long j3, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str4;
        long j4;
        long j5;
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 83;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str4 = "";
        } else {
            str4 = str;
        }
        long j6 = -1;
        String str5 = null;
        if ((i & 2) != 0) {
            int i5 = onExtraCallbackWithResult + 63;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                str5.hashCode();
                throw null;
            }
            int i6 = 2 % 2;
            j4 = -1;
        } else {
            j4 = j;
        }
        if ((i & 4) != 0) {
            int i7 = onExtraCallbackWithResult + 79;
            int i8 = i7 % 128;
            IAuthTabCallback = i8;
            if (i7 % 2 != 0) {
                str5.hashCode();
                throw null;
            }
            int i9 = i8 + 7;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            j5 = -1;
        } else {
            j5 = j2;
        }
        String str6 = (i & 8) == 0 ? str2 : "";
        if ((i & 16) != 0) {
            int i12 = 2 % 2;
        } else {
            j6 = j3;
        }
        if ((i & 32) != 0) {
            int i13 = IAuthTabCallback + 89;
            onExtraCallbackWithResult = i13 % 128;
            int i14 = i13 % 2;
        } else {
            str5 = str3;
        }
        this(str4, j4, j5, str6, j6, str5);
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.name;
        }
        throw null;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 7;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        long j = this.amount;
        int i5 = i2 + 43;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 19 / 0;
        }
        return j;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        long j = this.userNo;
        int i5 = i3 + 83;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 85;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.phone;
        int i4 = i2 + 81;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public static final class onExtraCallbackWithResult {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final addUnbatchedOperation onNavigationEvent(@NotNull String str, long j, @Nullable String str2) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            addUnbatchedOperation addunbatchedoperation = new addUnbatchedOperation(str, j, -1L, "", -1L, str2);
            int i2 = onExtraCallback + 5;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return addunbatchedoperation;
        }
    }

    public final void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        this.status = "RECEIVED";
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onNavigationEvent(java.lang.Object[] r10) {
        /*
            r0 = 0
            r10 = r10[r0]
            o.addUnbatchedOperation r10 = (o.addUnbatchedOperation) r10
            r1 = 2
            int r2 = r1 % r1
            int r2 = o.addUnbatchedOperation.onExtraCallbackWithResult
            int r2 = r2 + 119
            int r3 = r2 % 128
            o.addUnbatchedOperation.IAuthTabCallback = r3
            int r2 = r2 % r1
            java.lang.String r3 = "RECEIVED"
            if (r2 == 0) goto L21
            java.lang.String r2 = r10.status
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            r3 = 63
            int r3 = r3 / r0
            if (r2 == 0) goto L29
            goto L5e
        L21:
            java.lang.String r2 = r10.status
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 != 0) goto L5e
        L29:
            java.lang.Object[] r3 = new java.lang.Object[]{r10}
            int r6 = im.toss.features.teens.cvscash.CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted()
            int r7 = im.toss.features.teens.cvscash.CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted()
            int r9 = im.toss.features.teens.cvscash.CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted()
            int r8 = im.toss.features.teens.cvscash.CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted()
            r4 = -1260277224(0xffffffffb4e1b218, float:-4.2039096E-7)
            r5 = 1260277225(0x4b1e4de9, float:1.0374633E7)
            java.lang.Object r10 = IAuthTabCallback(r3, r4, r5, r6, r7, r8, r9)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L50
            goto L5e
        L50:
            int r10 = o.addUnbatchedOperation.onExtraCallbackWithResult
            int r10 = r10 + 119
            int r2 = r10 % 128
            o.addUnbatchedOperation.IAuthTabCallback = r2
            int r10 = r10 % r1
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r0)
            return r10
        L5e:
            r10 = 1
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.addUnbatchedOperation.onNavigationEvent(java.lang.Object[]):java.lang.Object");
    }

    public final boolean asInterface() {
        boolean zAreEqual;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            zAreEqual = Intrinsics.areEqual(this.status, "WAIT");
            int i3 = 39 / 0;
        } else {
            zAreEqual = Intrinsics.areEqual(this.status, "WAIT");
        }
        int i4 = IAuthTabCallback + 47;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return zAreEqual;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        addUnbatchedOperation addunbatchedoperation = (addUnbatchedOperation) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zAreEqual = Intrinsics.areEqual(addunbatchedoperation.status, "OWNER");
        int i4 = onExtraCallbackWithResult + 59;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return Boolean.valueOf(zAreEqual);
        }
        throw null;
    }

    public final boolean onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        long j = this.userNo;
        if (i4 == 0) {
            if (j <= 0) {
                return false;
            }
        } else if (j <= 0) {
            return false;
        }
        int i5 = i3 + 15;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public final boolean onExtraCallbackWithResult() {
        return ((Boolean) IAuthTabCallback(new Object[]{this}, -1260277224, 1260277225, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted())).booleanValue();
    }

    public final boolean asBinder() {
        return ((Boolean) IAuthTabCallback(new Object[]{this}, -1207947754, 1207947754, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted())).booleanValue();
    }
}
