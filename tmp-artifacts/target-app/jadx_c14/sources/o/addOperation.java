package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class addOperation implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<addOperation> CREATOR = new onExtraCallback();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    @SerializedName("bankAccountNo")
    private final String bankAccountNo;

    @SerializedName("bankCode")
    private final String bankCode;

    @SerializedName("complete")
    private boolean complete;

    @SerializedName("createTime")
    private final String createTime;

    @SerializedName("expired")
    private boolean expired;

    @SerializedName("id")
    private final String id;

    @SerializedName("owner")
    private final boolean owner;

    @SerializedName("ownerUserNo")
    private final long ownerUserNo;

    @SerializedName("payments")
    private final List<accesssetEnqueuedAnimationOnFramep> payments;

    @SerializedName("shareMessage")
    private final String shareMessage;

    @SerializedName("targetAmount")
    private final long targetAmount;

    @SerializedName("title")
    private final String title;

    @SerializedName("transactions")
    private List<addUnbatchedOperation> transactions;

    public static final class onExtraCallback implements Parcelable.Creator<addOperation> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public final addOperation IAuthTabCallback(Parcel parcel) {
            boolean z;
            ArrayList arrayList;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() != 0) {
                int i2 = onWarmupCompleted + 77;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                z = true;
            } else {
                z = false;
            }
            int i4 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i4);
            int i5 = onNavigationEvent + 59;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            for (int i7 = 0; i7 != i4; i7++) {
                arrayList2.add(parcel.readParcelable(addOperation.class.getClassLoader()));
            }
            boolean z2 = parcel.readInt() != 0;
            String string = parcel.readString();
            String string2 = parcel.readString();
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            boolean z3 = parcel.readInt() != 0;
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i8 = onWarmupCompleted + 71;
                int i9 = i8 % 128;
                onNavigationEvent = i9;
                if (i8 % 2 != 0) {
                    int i10 = 36 / 0;
                }
                int i11 = i9 + 13;
                onWarmupCompleted = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 5 % 5;
                }
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList3.add(accesssetEnqueuedAnimationOnFramep.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList3;
            }
            return new addOperation(z, arrayList2, z2, string, string2, j, j2, string3, string4, string5, z3, string6, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ addOperation createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 43;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return IAuthTabCallback(parcel);
            }
            IAuthTabCallback(parcel);
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ addOperation[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 91;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            addOperation[] addoperationArrOnNavigationEvent = onNavigationEvent(i);
            int i5 = onWarmupCompleted + 77;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return addoperationArrOnNavigationEvent;
        }

        public final addOperation[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 63;
            onNavigationEvent = i3 % 128;
            addOperation[] addoperationArr = new addOperation[i];
            if (i3 % 2 != 0) {
                int i4 = 88 / 0;
            }
            return addoperationArr;
        }
    }

    static {
        int i = onNavigationEvent + 67;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public addOperation() {
        this(false, null, false, null, null, 0L, 0L, null, null, null, false, null, null, 8191, null);
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i5;
        int i8 = i7 | i2;
        int i9 = ~(i8 | i3);
        int i10 = (~i3) | (~((~i2) | i5));
        int i11 = (~(i3 | i2)) | (~(i7 | i3)) | (~i8);
        int i12 = i5 + i2 + i6 + ((-953487067) * i4) + ((-1992133889) * i);
        int i13 = i12 * i12;
        int i14 = (1737059190 * i5) + 1765277696 + (1051104396 * i2) + (i9 * (-342977397)) + (342977397 * i10) + ((-342977397) * i11) + (1394081792 * i6) + ((-1703411712) * i4) + (1961361408 * i) + (907935744 * i13);
        int i15 = ((i5 * 272661978) - 2115615402) + (i2 * 272662804) + (i9 * 413) + (i10 * (-413)) + (i11 * 413) + (i6 * 272662391) + (i4 * 2077717299) + (i * 1957688713) + (i13 * 166854656);
        int i16 = i14 + (i15 * i15 * (-213778432));
        if (i16 == 1) {
            int i17 = 2 % 2;
            int i18 = onExtraCallbackWithResult + 19;
            onExtraCallback = i18 % 128;
            int i19 = i18 % 2;
            return 0;
        }
        if (i16 != 2) {
            return onExtraCallbackWithResult(objArr);
        }
        addOperation addoperation = (addOperation) objArr[0];
        int i20 = 2 % 2;
        int i21 = onExtraCallback + 17;
        int i22 = i21 % 128;
        onExtraCallbackWithResult = i22;
        int i23 = i21 % 2;
        long j = addoperation.targetAmount;
        int i24 = i22 + 101;
        onExtraCallback = i24 % 128;
        int i25 = i24 % 2;
        return Long.valueOf(j);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        addOperation addoperation = (addOperation) objArr[0];
        Parcel parcel = (Parcel) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(addoperation.complete ? 1 : 0);
        List<addUnbatchedOperation> list = addoperation.transactions;
        parcel.writeInt(list.size());
        Iterator<addUnbatchedOperation> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), iIntValue);
        }
        parcel.writeInt(addoperation.expired ? 1 : 0);
        parcel.writeString(addoperation.id);
        parcel.writeString(addoperation.shareMessage);
        parcel.writeLong(addoperation.ownerUserNo);
        parcel.writeLong(addoperation.targetAmount);
        parcel.writeString(addoperation.title);
        parcel.writeString(addoperation.bankCode);
        parcel.writeString(addoperation.bankAccountNo);
        parcel.writeInt(addoperation.owner ? 1 : 0);
        parcel.writeString(addoperation.createTime);
        List<accesssetEnqueuedAnimationOnFramep> list2 = addoperation.payments;
        if (list2 == null) {
            int i4 = onExtraCallback + 103;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                parcel.writeInt(1);
            } else {
                parcel.writeInt(0);
            }
            return null;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        Iterator<accesssetEnqueuedAnimationOnFramep> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, iIntValue);
        }
        return null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof addOperation)) {
            int i2 = onExtraCallback + 123;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        addOperation addoperation = (addOperation) obj;
        if (this.complete != addoperation.complete || !Intrinsics.areEqual(this.transactions, addoperation.transactions) || this.expired != addoperation.expired) {
            return false;
        }
        if (!Intrinsics.areEqual(this.id, addoperation.id)) {
            int i4 = onExtraCallback + 25;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.shareMessage, addoperation.shareMessage)) {
            int i6 = onExtraCallbackWithResult + 15;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.ownerUserNo != addoperation.ownerUserNo || this.targetAmount != addoperation.targetAmount || !Intrinsics.areEqual(this.title, addoperation.title) || !Intrinsics.areEqual(this.bankCode, addoperation.bankCode) || !Intrinsics.areEqual(this.bankAccountNo, addoperation.bankAccountNo) || this.owner != addoperation.owner) {
            return false;
        }
        if (Intrinsics.areEqual(this.createTime, addoperation.createTime)) {
            return Intrinsics.areEqual(this.payments, addoperation.payments);
        }
        int i8 = onExtraCallbackWithResult + 109;
        onExtraCallback = i8 % 128;
        return i8 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = Boolean.hashCode(this.complete);
        int iHashCode3 = this.transactions.hashCode();
        int iHashCode4 = Boolean.hashCode(this.expired);
        int iHashCode5 = this.id.hashCode();
        int iHashCode6 = this.shareMessage.hashCode();
        int iHashCode7 = Long.hashCode(this.ownerUserNo);
        int iHashCode8 = Long.hashCode(this.targetAmount);
        int iHashCode9 = this.title.hashCode();
        int iHashCode10 = this.bankCode.hashCode();
        int iHashCode11 = this.bankAccountNo.hashCode();
        int iHashCode12 = Boolean.hashCode(this.owner);
        int iHashCode13 = this.createTime.hashCode();
        List<accesssetEnqueuedAnimationOnFramep> list = this.payments;
        if (list == null) {
            int i2 = onExtraCallbackWithResult + 109;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = list.hashCode();
        }
        int i4 = (((((((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode;
        int i5 = onExtraCallback + 11;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DutchPay(complete=" + this.complete + ", transactions=" + this.transactions + ", expired=" + this.expired + ", id=" + this.id + ", shareMessage=" + this.shareMessage + ", ownerUserNo=" + this.ownerUserNo + ", targetAmount=" + this.targetAmount + ", title=" + this.title + ", bankCode=" + this.bankCode + ", bankAccountNo=" + this.bankAccountNo + ", owner=" + this.owner + ", createTime=" + this.createTime + ", payments=" + this.payments + ")";
        int i2 = onExtraCallback + 85;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public addOperation(boolean z, @NotNull List<addUnbatchedOperation> list, boolean z2, @NotNull String str, @NotNull String str2, long j, long j2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z3, @NotNull String str6, @Nullable List<accesssetEnqueuedAnimationOnFramep> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.complete = z;
        this.transactions = list;
        this.expired = z2;
        this.id = str;
        this.shareMessage = str2;
        this.ownerUserNo = j;
        this.targetAmount = j2;
        this.title = str3;
        this.bankCode = str4;
        this.bankAccountNo = str5;
        this.owner = z3;
        this.createTime = str6;
        this.payments = list2;
    }

    public final void onExtraCallback(boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        this.complete = z;
        if (i4 != 0) {
            int i5 = 63 / 0;
        }
        int i6 = i3 + 77;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        boolean z = this.complete;
        int i5 = i3 + 5;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ addOperation(boolean z, List list, boolean z2, String str, String str2, long j, long j2, String str3, String str4, String str5, boolean z3, String str6, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z4;
        String str7;
        long j3;
        String str8;
        List list3;
        int i2;
        String str9;
        boolean z5 = (i & 1) != 0 ? false : z;
        List listEmptyList = (i & 2) != 0 ? CollectionsKt.emptyList() : list;
        if ((i & 4) != 0) {
            int i3 = onExtraCallback + 71;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            z4 = false;
        } else {
            z4 = z2;
        }
        Object obj = null;
        if ((i & 8) != 0) {
            int i6 = onExtraCallbackWithResult + 81;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str7 = "";
        } else {
            str7 = str;
        }
        String str10 = (i & 16) != 0 ? "" : str2;
        long j4 = (i & 32) != 0 ? -1L : j;
        if ((i & 64) != 0) {
            int i7 = onExtraCallback;
            int i8 = i7 + 1;
            onExtraCallbackWithResult = i8 % 128;
            j3 = i8 % 2 == 0 ? 1L : 0L;
            int i9 = i7 + 95;
            onExtraCallbackWithResult = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 2 % 2;
            }
        } else {
            j3 = j2;
        }
        String str11 = (i & 128) != 0 ? "" : str3;
        String str12 = (i & 256) != 0 ? "" : str4;
        if ((i & 512) != 0) {
            int i11 = 2 % 2;
            str8 = "";
        } else {
            str8 = str5;
        }
        boolean z6 = (i & 1024) != 0 ? false : z3;
        if ((i & 2048) != 0) {
            int i12 = onExtraCallbackWithResult + 13;
            onExtraCallback = i12 % 128;
            i2 = 2;
            if (i12 % 2 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i13 = 2 % 2;
            str9 = "";
            list3 = null;
        } else {
            list3 = null;
            i2 = 2;
            str9 = str6;
        }
        if ((i & 4096) != 0) {
            int i14 = i2 % i2;
        } else {
            list3 = list2;
        }
        this(z5, listEmptyList, z4, str7, str10, j4, j3, str11, str12, str8, z6, str9, list3);
    }

    public final List<addUnbatchedOperation> IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 105;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        List<addUnbatchedOperation> list = this.transactions;
        int i5 = i2 + 5;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final void onExtraCallbackWithResult(@NotNull List<addUnbatchedOperation> list) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        this.transactions = list;
        int i4 = onExtraCallback + 95;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 77;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        this.expired = z;
        if (i4 != 0) {
            int i5 = 39 / 0;
        }
        int i6 = i2 + 69;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.expired;
        int i4 = i3 + 99;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 119;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.id;
        int i4 = i2 + 13;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 89 / 0;
        }
        return str;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.shareMessage;
        }
        throw null;
    }

    public final long IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ownerUserNo;
        }
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.bankCode;
        int i5 = i3 + 55;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.bankAccountNo;
        int i5 = i3 + 103;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 89 / 0;
        }
        return str;
    }

    public final boolean onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.owner;
        if (i3 == 0) {
            int i4 = 26 / 0;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        if (r2 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        if (r2 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007b, code lost:
    
        if (((java.lang.Boolean) o.addUnbatchedOperation.IAuthTabCallback(new java.lang.Object[]{r2}, -1207947754, 1207947754, im.toss.features.teens.cvscash.CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), im.toss.features.teens.cvscash.CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), im.toss.features.teens.cvscash.CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), im.toss.features.teens.cvscash.CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted())).booleanValue() == true) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
    
        if (r2 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        if (r2.asInterface() != true) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0085, code lost:
    
        r1 = o.addOperation.onExtraCallbackWithResult + 67;
        o.addOperation.onExtraCallback = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008e, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean access100() {
        /*
            r12 = this;
            r0 = 2
            int r1 = r0 % r0
            java.util.List<o.addUnbatchedOperation> r1 = r12.transactions
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            int r2 = o.addOperation.onExtraCallback
            int r2 = r2 + 33
            int r3 = r2 % 128
            o.addOperation.onExtraCallbackWithResult = r3
            int r2 = r2 % r0
        L14:
            boolean r2 = r1.hasNext()
            r3 = 1
            if (r2 == 0) goto L3c
            int r2 = o.addOperation.onExtraCallback
            int r2 = r2 + r3
            int r4 = r2 % 128
            o.addOperation.onExtraCallbackWithResult = r4
            int r2 = r2 % 2
            java.lang.Object r2 = r1.next()
            r4 = r2
            o.addUnbatchedOperation r4 = (o.addUnbatchedOperation) r4
            long r4 = r4.IAuthTabCallback()
            java.lang.String r6 = o.PlayerErrorCode.onMinimized()
            long r6 = java.lang.Long.parseLong(r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L14
            goto L3d
        L3c:
            r2 = 0
        L3d:
            o.addUnbatchedOperation r2 = (o.addUnbatchedOperation) r2
            boolean r1 = r12.owner
            r4 = 0
            if (r1 != 0) goto L8f
            int r1 = o.addOperation.onExtraCallbackWithResult
            int r1 = r1 + 15
            int r5 = r1 % 128
            o.addOperation.onExtraCallback = r5
            int r1 = r1 % r0
            if (r1 == 0) goto L55
            r1 = 28
            int r1 = r1 / r4
            if (r2 == 0) goto L7d
            goto L57
        L55:
            if (r2 == 0) goto L7d
        L57:
            java.lang.Object[] r5 = new java.lang.Object[]{r2}
            int r8 = im.toss.features.teens.cvscash.CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted()
            int r9 = im.toss.features.teens.cvscash.CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted()
            int r11 = im.toss.features.teens.cvscash.CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted()
            int r10 = im.toss.features.teens.cvscash.CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted()
            r6 = -1207947754(0xffffffffb8002e16, float:-3.05605E-5)
            r7 = 1207947754(0x47ffd1ea, float:130979.83)
            java.lang.Object r1 = o.addUnbatchedOperation.IAuthTabCallback(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == r3) goto L85
        L7d:
            if (r2 == 0) goto L8f
            boolean r1 = r2.asInterface()
            if (r1 != r3) goto L8f
        L85:
            int r1 = o.addOperation.onExtraCallbackWithResult
            int r1 = r1 + 67
            int r2 = r1 % 128
            o.addOperation.onExtraCallback = r2
            int r1 = r1 % r0
            return r3
        L8f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.addOperation.access100():boolean");
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Date date = CommonModule_closeView.onWarmupCompleted.getInterfaceDescriptor().parse(this.createTime);
        if (date == null) {
            date = new Date();
        }
        long time = date.getTime();
        int i4 = onExtraCallbackWithResult + 37;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return time;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        return ((Integer) onExtraCallbackWithResult(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1068278044, iOnNavigationEvent, iOnNavigationEvent3, -1068278043, iOnNavigationEvent2, new Object[]{this})).intValue();
    }

    public final long asBinder() {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        return ((Long) onExtraCallbackWithResult(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1011950485, iOnNavigationEvent, iOnNavigationEvent3, 1011950487, iOnNavigationEvent2, new Object[]{this})).longValue();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Object[] objArr = {this, parcel, Integer.valueOf(i)};
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        onExtraCallbackWithResult(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1999904778, iOnNavigationEvent, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1999904778, iOnNavigationEvent2, objArr);
    }
}
