package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.DateFormatTextWatcher$;
import com.google.gson.annotations.SerializedName;
import j$.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class swapLeftAndRightInRTL implements Parcelable {
    public static final Parcelable.Creator<swapLeftAndRightInRTL> CREATOR = new onNavigationEvent();
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    @SerializedName("accountId")
    private final long accountId;

    @SerializedName("balance")
    private final long balance;

    @SerializedName("color")
    private final String color;

    @SerializedName("completedAt")
    private final String completedAt;

    @SerializedName("completedOrder")
    private final Long completedOrder;

    @SerializedName("emoji")
    private final String emoji;

    @SerializedName("goalAmount")
    private final long goalAmount;

    @SerializedName("groupId")
    private final Long groupId;
    private String groupImageUrl;
    private String groupName;

    @SerializedName("henemBoxId")
    private final long henemBoxId;

    @SerializedName("iconUrl")
    private final String iconUrl;

    @SerializedName("isCompleted")
    private final boolean isCompleted;
    private boolean isTroll;

    @SerializedName("memo")
    private final String memo;
    private int newMessageCount;

    @SerializedName("ownerUserName")
    private final String ownerUserName;

    @SerializedName("ownerUserNo")
    private final long ownerUserNo;
    private LocalDate restrictionChatEndDate;

    @SerializedName("savingTogether")
    private final boolean savingTogether;

    @SerializedName("name")
    private final String title;

    public static final class onNavigationEvent implements Parcelable.Creator<swapLeftAndRightInRTL> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ swapLeftAndRightInRTL createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 97;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                onWarmupCompleted(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            swapLeftAndRightInRTL swapleftandrightinrtlOnWarmupCompleted = onWarmupCompleted(parcel);
            int i3 = onExtraCallbackWithResult + 107;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return swapleftandrightinrtlOnWarmupCompleted;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ swapLeftAndRightInRTL[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 13;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            swapLeftAndRightInRTL[] swapleftandrightinrtlArrOnExtraCallback = onExtraCallback(i);
            int i5 = onExtraCallbackWithResult + 61;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return swapleftandrightinrtlArrOnExtraCallback;
        }

        public final swapLeftAndRightInRTL[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 43;
            onExtraCallback = i4 % 128;
            swapLeftAndRightInRTL[] swapleftandrightinrtlArr = new swapLeftAndRightInRTL[i];
            if (i4 % 2 != 0) {
                throw null;
            }
            int i5 = i3 + 43;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return swapleftandrightinrtlArr;
            }
            throw null;
        }

        public final swapLeftAndRightInRTL onWarmupCompleted(Parcel parcel) {
            Long lValueOf;
            int i = 2 % 2;
            int i2 = onExtraCallback + 49;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            Long lValueOf2 = null;
            if (parcel.readInt() == 0) {
                int i4 = onExtraCallback + 109;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() != 0) {
                int i6 = onExtraCallback + 93;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                lValueOf2 = Long.valueOf(parcel.readLong());
                int i8 = onExtraCallback + 99;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 2 / 2;
                }
            }
            return new swapLeftAndRightInRTL(j, j2, string, string2, lValueOf, lValueOf2, parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readInt() != 0);
        }
    }

    static {
        int i = onWarmupCompleted + 15;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i;
        int i9 = i7 | i5;
        int i10 = (~(i7 | i8)) | (~i9) | (~(i8 | i5));
        int i11 = (~(i | i5)) | (~(i7 | i));
        int i12 = i9 | i8;
        int i13 = i5 + i4 + i2 + (988256597 * i6) + ((-695401848) * i3);
        int i14 = i13 * i13;
        int i15 = (((-880163897) * i5) - 1270611968) + ((-1462879173) * i4) + (i10 * 291357638) + (291357638 * i11) + ((-291357638) * i12) + ((-1171521536) * i2) + (479985664 * i6) + (1063256064 * i3) + (1273561088 * i14);
        int i16 = (i5 * (-1367684995)) + 376186498 + (i4 * (-1367684423)) + (i10 * (-286)) + (i11 * (-286)) + (i12 * 286) + (i2 * (-1367684709)) + (i6 * 1512018807) + (i3 * 1127043160) + (i14 * (-418185216));
        int i17 = i15 + (i16 * i16 * 1903099904);
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? i17 != 5 ? onExtraCallbackWithResult(objArr) : onTransact(objArr) : onWarmupCompleted(objArr) : IAuthTabCallback(objArr) : onExtraCallback(objArr) : onNavigationEvent(objArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 101;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 63 / 0;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r10 instanceof o.swapLeftAndRightInRTL) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r10 = (o.swapLeftAndRightInRTL) r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (r9.accountId == r10.accountId) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        r2 = r2 + 1;
        o.swapLeftAndRightInRTL.onNavigationEvent = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if (r9.balance == r10.balance) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        r2 = r2 + 21;
        o.swapLeftAndRightInRTL.onNavigationEvent = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r9.color, r10.color) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r9.completedAt, r10.completedAt) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r9.completedOrder, r10.completedOrder) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r9.groupId, r10.groupId) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        r10 = o.swapLeftAndRightInRTL.onExtraCallbackWithResult + 49;
        o.swapLeftAndRightInRTL.onNavigationEvent = r10 % 128;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r9.emoji, r10.emoji) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
    
        r10 = o.swapLeftAndRightInRTL.onExtraCallbackWithResult + 75;
        o.swapLeftAndRightInRTL.onNavigationEvent = r10 % 128;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0087, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0090, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r9.iconUrl, r10.iconUrl) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0092, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0099, code lost:
    
        if (r9.goalAmount == r10.goalAmount) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009b, code lost:
    
        r10 = o.swapLeftAndRightInRTL.onNavigationEvent + 99;
        o.swapLeftAndRightInRTL.onExtraCallbackWithResult = r10 % 128;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a4, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ab, code lost:
    
        if (r9.henemBoxId == r10.henemBoxId) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ad, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b2, code lost:
    
        if (r9.isCompleted == r10.isCompleted) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b4, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bd, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r9.memo, r10.memo) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bf, code lost:
    
        r10 = o.swapLeftAndRightInRTL.onNavigationEvent + 7;
        o.swapLeftAndRightInRTL.onExtraCallbackWithResult = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c8, code lost:
    
        if ((r10 % 2) == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ca, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00cb, code lost:
    
        r10 = null;
        r10.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00cf, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d8, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r9.title, r10.title) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00da, code lost:
    
        r10 = o.swapLeftAndRightInRTL.onExtraCallbackWithResult + 55;
        o.swapLeftAndRightInRTL.onNavigationEvent = r10 % 128;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r9 == r10) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e3, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ea, code lost:
    
        if (r9.ownerUserNo == r10.ownerUserNo) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ec, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f5, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r9.ownerUserName, r10.ownerUserName) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f7, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00fc, code lost:
    
        if (r9.savingTogether == r10.savingTogether) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00fe, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ff, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r9 == r10) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.swapLeftAndRightInRTL.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = Long.hashCode(this.accountId);
        int iHashCode4 = Long.hashCode(this.balance);
        String str = this.color;
        if (str == null) {
            int i2 = onExtraCallbackWithResult + 87;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.completedAt;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        Long l = this.completedOrder;
        int iHashCode6 = l == null ? 0 : l.hashCode();
        Long l2 = this.groupId;
        if (l2 == null) {
            int i4 = onExtraCallbackWithResult + 81;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = l2.hashCode();
        }
        String str3 = this.emoji;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.iconUrl;
        int iHashCode8 = str4 == null ? 0 : str4.hashCode();
        int iHashCode9 = Long.hashCode(this.goalAmount);
        int iHashCode10 = Long.hashCode(this.henemBoxId);
        int iHashCode11 = Boolean.hashCode(this.isCompleted);
        String str5 = this.memo;
        return (((((((((((((((((((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode2) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str5 != null ? str5.hashCode() : 0)) * 31) + this.title.hashCode()) * 31) + Long.hashCode(this.ownerUserNo)) * 31) + this.ownerUserName.hashCode()) * 31) + Boolean.hashCode(this.savingTogether);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "HenemBox(accountId=" + this.accountId + ", balance=" + this.balance + ", color=" + this.color + ", completedAt=" + this.completedAt + ", completedOrder=" + this.completedOrder + ", groupId=" + this.groupId + ", emoji=" + this.emoji + ", iconUrl=" + this.iconUrl + ", goalAmount=" + this.goalAmount + ", henemBoxId=" + this.henemBoxId + ", isCompleted=" + this.isCompleted + ", memo=" + this.memo + ", title=" + this.title + ", ownerUserNo=" + this.ownerUserNo + ", ownerUserName=" + this.ownerUserName + ", savingTogether=" + this.savingTogether + ")";
        int i2 = onNavigationEvent + 81;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.accountId);
        parcel.writeLong(this.balance);
        parcel.writeString(this.color);
        parcel.writeString(this.completedAt);
        Long l = this.completedOrder;
        if (l == null) {
            int i5 = onExtraCallbackWithResult + 43;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
            int i7 = onExtraCallbackWithResult + 123;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
        }
        Long l2 = this.groupId;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.emoji);
        parcel.writeString(this.iconUrl);
        parcel.writeLong(this.goalAmount);
        parcel.writeLong(this.henemBoxId);
        parcel.writeInt(this.isCompleted ? 1 : 0);
        parcel.writeString(this.memo);
        parcel.writeString(this.title);
        parcel.writeLong(this.ownerUserNo);
        parcel.writeString(this.ownerUserName);
        parcel.writeInt(this.savingTogether ? 1 : 0);
    }

    public swapLeftAndRightInRTL(long j, long j2, @Nullable String str, @Nullable String str2, @Nullable Long l, @Nullable Long l2, @Nullable String str3, @Nullable String str4, long j3, long j4, boolean z, @Nullable String str5, @NotNull String str6, long j5, @NotNull String str7, boolean z2) {
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.accountId = j;
        this.balance = j2;
        this.color = str;
        this.completedAt = str2;
        this.completedOrder = l;
        this.groupId = l2;
        this.emoji = str3;
        this.iconUrl = str4;
        this.goalAmount = j3;
        this.henemBoxId = j4;
        this.isCompleted = z;
        this.memo = str5;
        this.title = str6;
        this.ownerUserNo = j5;
        this.ownerUserName = str7;
        this.savingTogether = z2;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        swapLeftAndRightInRTL swapleftandrightinrtl = (swapLeftAndRightInRTL) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return Long.valueOf(swapleftandrightinrtl.accountId);
        }
        long j = swapleftandrightinrtl.accountId;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long IAuthTabCallback() {
        long j;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 125;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            j = this.balance;
            int i4 = 34 / 0;
        } else {
            j = this.balance;
        }
        int i5 = i2 + 111;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 121;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.color;
        int i5 = i2 + 33;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.completedAt;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Long l = this.completedOrder;
        int i4 = i3 + 33;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return l;
    }

    public final Long onTransact() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 93;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Long l = this.groupId;
        int i5 = i2 + 109;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return l;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.emoji;
        int i4 = i3 + 45;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.iconUrl;
        if (i3 == 0) {
            int i4 = 14 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        long j;
        swapLeftAndRightInRTL swapleftandrightinrtl = (swapLeftAndRightInRTL) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            j = swapleftandrightinrtl.goalAmount;
            int i3 = 18 / 0;
        } else {
            j = swapleftandrightinrtl.goalAmount;
        }
        return Long.valueOf(j);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        swapLeftAndRightInRTL swapleftandrightinrtl = (swapLeftAndRightInRTL) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 19;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        long j = swapleftandrightinrtl.henemBoxId;
        int i5 = i2 + 87;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return Long.valueOf(j);
    }

    public final boolean onMinimized() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        boolean z = this.isCompleted;
        int i5 = i3 + 41;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String access100() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 95;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.memo;
        int i5 = i2 + 113;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onPostMessage() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 85;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 9;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final long readTypedObject() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        long j = this.ownerUserNo;
        int i5 = i3 + 31;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 59 / 0;
        }
        return j;
    }

    public final String IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.ownerUserName;
        int i5 = i3 + 47;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        boolean z = this.savingTogether;
        int i5 = i3 + 101;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 39 / 0;
        }
        return z;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = this.groupImageUrl;
        if (i3 != 0) {
            int i4 = 32 / 0;
        }
        return str;
    }

    public final void onNavigationEvent(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 1;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        this.groupImageUrl = str;
        if (i4 == 0) {
            int i5 = 88 / 0;
        }
        int i6 = i2 + 63;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void IAuthTabCallback(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 27;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        this.groupName = str;
        int i5 = i2 + 113;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.groupName;
        int i4 = i3 + 13;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final void IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 61;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        this.newMessageCount = i;
        if (i5 != 0) {
            throw null;
        }
        int i6 = i4 + 107;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 14 / 0;
        }
    }

    public final int IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 17;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.newMessageCount;
        int i6 = i2 + 73;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 85 / 0;
        }
        return i5;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        swapLeftAndRightInRTL swapleftandrightinrtl = (swapLeftAndRightInRTL) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        boolean z = swapleftandrightinrtl.isTroll;
        int i5 = i3 + 103;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return Boolean.valueOf(z);
        }
        int i6 = 36 / 0;
        return Boolean.valueOf(z);
    }

    public final void onNavigationEvent(boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        this.isTroll = z;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 105;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        swapLeftAndRightInRTL swapleftandrightinrtl = (swapLeftAndRightInRTL) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        LocalDate localDate = swapleftandrightinrtl.restrictionChatEndDate;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 67;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return localDate;
    }

    public final void onWarmupCompleted(@Nullable LocalDate localDate) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        this.restrictionChatEndDate = localDate;
        if (i3 != 0) {
            int i4 = 32 / 0;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        swapLeftAndRightInRTL swapleftandrightinrtl = (swapLeftAndRightInRTL) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        Long l = swapleftandrightinrtl.groupId;
        if (i4 != 0) {
            throw null;
        }
        if (l != null) {
            return true;
        }
        int i5 = i3 + 81;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 13 / 0;
        }
        return false;
    }

    public final boolean onActivityLayout() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 17;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if (this.groupId == null) {
            int i5 = i2 + 61;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        int i7 = i2 + 113;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onMessageChannelReady() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.swapLeftAndRightInRTL.onExtraCallbackWithResult
            int r1 = r1 + 45
            int r2 = r1 % 128
            o.swapLeftAndRightInRTL.onNavigationEvent = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L19
            boolean r1 = r4.onActivityLayout()
            r3 = 56
            int r3 = r3 / r2
            if (r1 == 0) goto L26
            goto L1f
        L19:
            boolean r1 = r4.onActivityLayout()
            if (r1 == 0) goto L26
        L1f:
            boolean r1 = r4.savingTogether
            r3 = 1
            r1 = r1 ^ r3
            if (r1 == r3) goto L26
            return r3
        L26:
            int r1 = o.swapLeftAndRightInRTL.onNavigationEvent
            int r1 = r1 + 53
            int r3 = r1 % 128
            o.swapLeftAndRightInRTL.onExtraCallbackWithResult = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L32
            return r2
        L32:
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.swapLeftAndRightInRTL.onMessageChannelReady():boolean");
    }

    public final String extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 87 / 0;
            if (!(!((Boolean) onNavigationEvent(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1336129391, -1336129387, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent())).booleanValue())) {
                return "FANGIRL_SAVING";
            }
        } else {
            if (!(!((Boolean) onNavigationEvent(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1336129391, -1336129387, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent())).booleanValue())) {
                return "FANGIRL_SAVING";
            }
        }
        if (onMessageChannelReady()) {
            int i4 = onNavigationEvent + 11;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            return "HENEM_TOGETHER_SAVING";
        }
        return "HENEM_SAVING";
    }

    public final int writeTypedObject() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 49;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (!this.isCompleted) {
            return (int) ((this.balance / this.goalAmount) * 100.0d);
        }
        int i4 = i2 + 11;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return 100;
    }

    public final long onExtraCallback() {
        return ((Long) onNavigationEvent(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1901841640, -1901841638, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent())).longValue();
    }

    public final long IAuthTabCallbackStub() {
        return ((Long) onNavigationEvent(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -197983790, 197983795, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent())).longValue();
    }

    public final long access000() {
        return ((Long) onNavigationEvent(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 252394631, -252394628, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent())).longValue();
    }

    public final LocalDate extraCallback() {
        return (LocalDate) onNavigationEvent(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1856743745, -1856743745, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    public final boolean onActivityResized() {
        return ((Boolean) onNavigationEvent(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1336129391, -1336129387, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent())).booleanValue();
    }

    public final boolean ICustomTabsCallbackDefault() {
        return ((Boolean) onNavigationEvent(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1975306050, -1975306049, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent())).booleanValue();
    }
}
