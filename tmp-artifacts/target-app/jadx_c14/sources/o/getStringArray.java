package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getStringArray implements RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1 {
    public static final Parcelable.Creator<getStringArray> CREATOR = new IAuthTabCallback();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final String accountBankCode;
    private final String accountNumber;
    private final Long verificationTime;
    private final long verifyId;

    public static final class IAuthTabCallback implements Parcelable.Creator<getStringArray> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ getStringArray createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 23;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            getStringArray getstringarrayOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
            int i4 = IAuthTabCallback + 71;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return getstringarrayOnExtraCallbackWithResult;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ getStringArray[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 113;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return onNavigationEvent(i);
            }
            onNavigationEvent(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final getStringArray onExtraCallbackWithResult(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 87;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Long lValueOf = null;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i3 != 0) {
                parcel.readString();
                parcel.readString();
                parcel.readLong();
                parcel.readInt();
                lValueOf.hashCode();
                throw null;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            long j = parcel.readLong();
            if (parcel.readInt() != 0) {
                lValueOf = Long.valueOf(parcel.readLong());
                int i4 = IAuthTabCallback + 25;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            }
            return new getStringArray(string, string2, j, lValueOf);
        }

        public final getStringArray[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 43;
            onExtraCallbackWithResult = i3 % 128;
            getStringArray[] getstringarrayArr = new getStringArray[i];
            if (i3 % 2 != 0) {
                int i4 = 61 / 0;
            }
            return getstringarrayArr;
        }
    }

    static {
        int i = onNavigationEvent + 13;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onWarmupCompleted = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getStringArray)) {
            return false;
        }
        getStringArray getstringarray = (getStringArray) obj;
        if (!Intrinsics.areEqual(this.accountBankCode, getstringarray.accountBankCode)) {
            int i2 = IAuthTabCallback + 99;
            onWarmupCompleted = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.accountNumber, getstringarray.accountNumber)) {
            int i3 = onWarmupCompleted + 97;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (this.verifyId != getstringarray.verifyId || !Intrinsics.areEqual(this.verificationTime, getstringarray.verificationTime)) {
            return false;
        }
        int i5 = onWarmupCompleted + 67;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.accountBankCode.hashCode();
        int iHashCode3 = this.accountNumber.hashCode();
        int iHashCode4 = Long.hashCode(this.verifyId);
        Long l = this.verificationTime;
        if (l == null) {
            iHashCode = 0;
        } else {
            iHashCode = l.hashCode();
            int i2 = onWarmupCompleted + 95;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
        int i5 = IAuthTabCallback + 99;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SingleWonAuthFormValue(accountBankCode=" + this.accountBankCode + ", accountNumber=" + this.accountNumber + ", verifyId=" + this.verifyId + ", verificationTime=" + this.verificationTime + ")";
        int i2 = IAuthTabCallback + 43;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.accountBankCode);
        parcel.writeString(this.accountNumber);
        parcel.writeLong(this.verifyId);
        Long l = this.verificationTime;
        if (l != null) {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
            return;
        }
        int i3 = onWarmupCompleted + 95;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        parcel.writeInt(0);
        int i5 = onWarmupCompleted + 27;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public getStringArray(@NotNull String str, @NotNull String str2, long j, @Nullable Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.accountBankCode = str;
        this.accountNumber = str2;
        this.verifyId = j;
        this.verificationTime = l;
    }
}
