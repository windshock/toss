package viva.republica.toss.network.model.loan;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import net.sf.scuba.smartcards.BuildConfig;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.oty1;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class LoanUserInput implements Parcelable {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String automobileNumber;
    private final String corporateName;
    private final String corporateNumber;
    private final String healthPayerType;
    private final String householderType;
    private final String jobType;
    private final String joinDate;
    private final String openDate;
    private final Long salary;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LoanUserInput> CREATOR = new onExtraCallbackWithResult();

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<LoanUserInput> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public final LoanUserInput[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 53;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            LoanUserInput[] loanUserInputArr = new LoanUserInput[i];
            int i6 = i3 + 43;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                return loanUserInputArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ LoanUserInput createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 19;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult(parcel);
            }
            onExtraCallbackWithResult(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ LoanUserInput[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 23;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                IAuthTabCallback(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            LoanUserInput[] loanUserInputArrIAuthTabCallback = IAuthTabCallback(i);
            int i4 = onExtraCallbackWithResult + 13;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return loanUserInputArrIAuthTabCallback;
        }

        public final LoanUserInput onExtraCallbackWithResult(Parcel parcel) {
            Long lValueOf;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 109;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i4 = onExtraCallbackWithResult + 73;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            return new LoanUserInput(string, string2, string3, string4, string5, string6, string7, string8, lValueOf);
        }
    }

    static {
        int i = onWarmupCompleted + 115;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 36 / 0;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 57;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 7;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 51;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i2 + 57;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(obj instanceof LoanUserInput)) {
            int i8 = i4 + 87;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        LoanUserInput loanUserInput = (LoanUserInput) obj;
        if (!Intrinsics.areEqual(this.jobType, loanUserInput.jobType)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.householderType, loanUserInput.householderType)) {
            int i10 = onExtraCallbackWithResult + 103;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.healthPayerType, loanUserInput.healthPayerType)) {
            int i12 = onExtraCallbackWithResult;
            int i13 = i12 + 125;
            onNavigationEvent = i13 % 128;
            int i14 = i13 % 2;
            int i15 = i12 + 63;
            onNavigationEvent = i15 % 128;
            int i16 = i15 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.automobileNumber, loanUserInput.automobileNumber)) {
            return false;
        }
        if (Intrinsics.areEqual(this.corporateNumber, loanUserInput.corporateNumber)) {
            return Intrinsics.areEqual(this.corporateName, loanUserInput.corporateName) && Intrinsics.areEqual(this.joinDate, loanUserInput.joinDate) && Intrinsics.areEqual(this.openDate, loanUserInput.openDate) && Intrinsics.areEqual(this.salary, loanUserInput.salary);
        }
        int i17 = onNavigationEvent + 109;
        onExtraCallbackWithResult = i17 % 128;
        int i18 = i17 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = this.jobType.hashCode();
        String str = this.householderType;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i2 = onNavigationEvent + 29;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
        }
        String str2 = this.healthPayerType;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.automobileNumber;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.corporateNumber;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.corporateName;
        if (str5 == null) {
            int i4 = onNavigationEvent + 119;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str5.hashCode();
        }
        String str6 = this.joinDate;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.openDate;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        Long l = this.salary;
        return (((((((((((((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode2) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanUserInput(jobType=" + this.jobType + ", householderType=" + this.householderType + ", healthPayerType=" + this.healthPayerType + ", automobileNumber=" + this.automobileNumber + ", corporateNumber=" + this.corporateNumber + ", corporateName=" + this.corporateName + ", joinDate=" + this.joinDate + ", openDate=" + this.openDate + ", salary=" + this.salary + ")";
        int i2 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 121;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
        parcel.writeString(this.jobType);
        parcel.writeString(this.householderType);
        parcel.writeString(this.healthPayerType);
        parcel.writeString(this.automobileNumber);
        parcel.writeString(this.corporateNumber);
        parcel.writeString(this.corporateName);
        parcel.writeString(this.joinDate);
        parcel.writeString(this.openDate);
        Long l = this.salary;
        if (l != null) {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
            return;
        }
        int i5 = onExtraCallbackWithResult + 69;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        parcel.writeInt(0);
        int i7 = onExtraCallbackWithResult + 17;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LoanUserInput> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 15;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                LoanUserInput$$serializer loanUserInput$$serializer = LoanUserInput$$serializer.INSTANCE;
                throw null;
            }
            LoanUserInput$$serializer loanUserInput$$serializer2 = LoanUserInput$$serializer.INSTANCE;
            int i3 = IAuthTabCallback + 113;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return loanUserInput$$serializer2;
        }
    }

    public /* synthetic */ LoanUserInput(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 511;
        if (511 != (i & 511)) {
            int i3 = onExtraCallbackWithResult + 73;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                descriptor = LoanUserInput$$serializer.INSTANCE.getDescriptor();
                i2 = 19009;
            } else {
                descriptor = LoanUserInput$$serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = onNavigationEvent + 85;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.jobType = str;
        this.householderType = str2;
        this.healthPayerType = str3;
        this.automobileNumber = str4;
        this.corporateNumber = str5;
        this.corporateName = str6;
        this.joinDate = str7;
        this.openDate = str8;
        this.salary = l;
    }

    public LoanUserInput(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Long l) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        this.jobType = str;
        this.householderType = str2;
        this.healthPayerType = str3;
        this.automobileNumber = str4;
        this.corporateNumber = str5;
        this.corporateName = str6;
        this.joinDate = str7;
        this.openDate = str8;
        this.salary = l;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(LoanUserInput loanUserInput, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, loanUserInput.jobType);
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, loanUserInput.householderType);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, loanUserInput.healthPayerType);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, loanUserInput.automobileNumber);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 4, getwrigglelayout, loanUserInput.corporateNumber);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 5, getwrigglelayout, loanUserInput.corporateName);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 6, getwrigglelayout, loanUserInput.joinDate);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 7, getwrigglelayout, loanUserInput.openDate);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 8, oty1.onExtraCallback, loanUserInput.salary);
        int i4 = onExtraCallbackWithResult + 37;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 24 / 0;
        }
    }
}
