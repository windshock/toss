package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class putInteger extends FbValidationUtils {
    public static final Parcelable.Creator<putInteger> CREATOR = new onExtraCallbackWithResult();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final String jobId;
    private final int monthsToScrap;
    private final Integer numberOfAccounts;
    private final String referrer;
    private final long timeoutInSeconds;
    private final String type;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<putInteger> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ putInteger createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 57;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            putInteger putintegerOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
            int i4 = onWarmupCompleted + 95;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return putintegerOnExtraCallbackWithResult;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ putInteger[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 117;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            putInteger[] putintegerArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            int i5 = onExtraCallbackWithResult + 13;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 51 / 0;
            }
            return putintegerArrOnExtraCallbackWithResult;
        }

        public final putInteger onExtraCallbackWithResult(Parcel parcel) {
            Integer numValueOf;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            long j = parcel.readLong();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i2 = onWarmupCompleted + 1;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            putInteger putinteger = new putInteger(string, j, string2, numValueOf, parcel.readInt(), parcel.readString());
            int i4 = onExtraCallbackWithResult + 21;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 / 0;
            }
            return putinteger;
        }

        public final putInteger[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted;
            int i4 = i3 + 49;
            onExtraCallbackWithResult = i4 % 128;
            putInteger[] putintegerArr = new putInteger[i];
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 91;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return putintegerArr;
        }
    }

    static {
        int i = onNavigationEvent + 51;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        parcel.writeLong(this.timeoutInSeconds);
        parcel.writeString(this.jobId);
        Integer num = this.numberOfAccounts;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
            int i3 = IAuthTabCallback + 71;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        parcel.writeInt(iIntValue);
        int i5 = IAuthTabCallback + 105;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        parcel.writeInt(this.monthsToScrap);
        parcel.writeString(this.referrer);
    }

    public putInteger(@NotNull String str, long j, @NotNull String str2, @Nullable Integer num, int i, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.type = str;
        this.timeoutInSeconds = j;
        this.jobId = str2;
        this.numberOfAccounts = num;
        this.monthsToScrap = i;
        this.referrer = str3;
    }

    @Override // o.FbValidationUtils
    public long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        long j = this.timeoutInSeconds;
        int i5 = i3 + 1;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    @Override // o.FbValidationUtils
    public String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.jobId;
        int i5 = i3 + 13;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 27;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Integer num = this.numberOfAccounts;
        int i4 = i2 + 83;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return num;
        }
        throw null;
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = this.monthsToScrap;
        int i6 = i3 + 33;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.referrer;
        int i5 = i3 + 23;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
