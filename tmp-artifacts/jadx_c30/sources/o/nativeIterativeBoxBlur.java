package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class nativeIterativeBoxBlur implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<nativeIterativeBoxBlur> CREATOR = new onExtraCallbackWithResult();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("accountNumber")
    private String accountNumber;

    @SerializedName("address")
    private String address;

    @SerializedName("addressDetail")
    private String addressDetail;

    @SerializedName("aplType")
    private buildSignature aplType;

    @SerializedName("bankCode")
    private String bankCode;

    @SerializedName("billAddressCode")
    private accessgetARGUMENT_EXTRACTOR_CALLBACKcp billAddressCode;

    @SerializedName("billAddressType")
    private calculateJSArgumentsNeeded billAddressType;

    @SerializedName("cardLoan")
    private boolean cardLoan;

    @SerializedName("dccAgreed")
    private Boolean dccAgreed;

    @SerializedName("jobCode")
    private getJSArgumentsNeeded jobCode;

    @SerializedName("limitAmount")
    private Long limitAmount;

    @SerializedName("officeAddress")
    private String officeAddress;

    @SerializedName("officeAddressDetail")
    private String officeAddressDetail;

    @SerializedName("officeName")
    private String officeName;

    @SerializedName("officeTelNumber")
    private String officeTelNumber;

    @SerializedName("officeZipCode")
    private String officeZipCode;

    @SerializedName("sttDate")
    private Integer sttDate;

    @SerializedName("zipCode")
    private String zipCode;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<nativeIterativeBoxBlur> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ nativeIterativeBoxBlur createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 113;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            nativeIterativeBoxBlur nativeiterativeboxblurOnNavigationEvent = onNavigationEvent(parcel);
            int i4 = onNavigationEvent + 5;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 80 / 0;
            }
            return nativeiterativeboxblurOnNavigationEvent;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ nativeIterativeBoxBlur[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 33;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            nativeIterativeBoxBlur[] nativeiterativeboxblurArrOnExtraCallback = onExtraCallback(i);
            int i5 = onExtraCallbackWithResult + 91;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return nativeiterativeboxblurArrOnExtraCallback;
        }

        public final nativeIterativeBoxBlur[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent;
            int i4 = i3 + 117;
            onExtraCallbackWithResult = i4 % 128;
            nativeIterativeBoxBlur[] nativeiterativeboxblurArr = new nativeIterativeBoxBlur[i];
            if (i4 % 2 == 0) {
                int i5 = 90 / 0;
            }
            int i6 = i3 + 107;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return nativeiterativeboxblurArr;
        }

        public final nativeIterativeBoxBlur onNavigationEvent(Parcel parcel) {
            accessgetARGUMENT_EXTRACTOR_CALLBACKcp accessgetargument_extractor_callbackcpValueOf;
            calculateJSArgumentsNeeded calculatejsargumentsneededValueOf;
            Long lValueOf;
            buildSignature buildsignatureValueOf;
            boolean z;
            Boolean boolValueOf;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Object obj = null;
            if (parcel.readInt() == 0) {
                int i2 = onNavigationEvent + 51;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                accessgetargument_extractor_callbackcpValueOf = null;
            } else {
                accessgetargument_extractor_callbackcpValueOf = accessgetARGUMENT_EXTRACTOR_CALLBACKcp.valueOf(parcel.readString());
            }
            if (parcel.readInt() == 0) {
                int i4 = onNavigationEvent + 9;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                calculatejsargumentsneededValueOf = null;
            } else {
                calculatejsargumentsneededValueOf = calculateJSArgumentsNeeded.valueOf(parcel.readString());
            }
            boolean z2 = parcel.readInt() != 0;
            getJSArgumentsNeeded getjsargumentsneededValueOf = parcel.readInt() == 0 ? null : getJSArgumentsNeeded.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
                int i6 = onNavigationEvent + 13;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
            }
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string10 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i8 = onExtraCallbackWithResult + 83;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                buildsignatureValueOf = null;
            } else {
                buildsignatureValueOf = buildSignature.valueOf(parcel.readString());
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() == 0) {
                    int i9 = onExtraCallbackWithResult + 75;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    z = false;
                } else {
                    z = true;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new nativeIterativeBoxBlur(string, string2, string3, string4, accessgetargument_extractor_callbackcpValueOf, calculatejsargumentsneededValueOf, z2, getjsargumentsneededValueOf, lValueOf, string5, string6, string7, string8, string9, numValueOf, string10, buildsignatureValueOf, boolValueOf);
        }
    }

    public static final /* synthetic */ class onNavigationEvent {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        static {
            int[] iArr = new int[buildSignature.values().length];
            try {
                iArr[buildSignature.NEW.ordinal()] = 1;
                int i = onNavigationEvent + 115;
                onExtraCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int i4 = onExtraCallback + 75;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onExtraCallback + 85;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public nativeIterativeBoxBlur() {
        this(null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onWarmupCompleted = i2 % 128;
        return i2 % 2 == 0 ? 1 : 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nativeIterativeBoxBlur)) {
            return false;
        }
        nativeIterativeBoxBlur nativeiterativeboxblur = (nativeIterativeBoxBlur) obj;
        if (!Intrinsics.areEqual(this.accountNumber, nativeiterativeboxblur.accountNumber)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.address, nativeiterativeboxblur.address)) {
            int i2 = IAuthTabCallback + 75;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.addressDetail, nativeiterativeboxblur.addressDetail) && Intrinsics.areEqual(this.bankCode, nativeiterativeboxblur.bankCode)) {
            if (this.billAddressCode != nativeiterativeboxblur.billAddressCode) {
                int i4 = onWarmupCompleted + 77;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (this.billAddressType != nativeiterativeboxblur.billAddressType || this.cardLoan != nativeiterativeboxblur.cardLoan) {
                return false;
            }
            if (this.jobCode != nativeiterativeboxblur.jobCode) {
                int i6 = onWarmupCompleted + 23;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.limitAmount, nativeiterativeboxblur.limitAmount) || !Intrinsics.areEqual(this.officeAddress, nativeiterativeboxblur.officeAddress) || !Intrinsics.areEqual(this.officeAddressDetail, nativeiterativeboxblur.officeAddressDetail)) {
                return false;
            }
            if (Intrinsics.areEqual(this.officeName, nativeiterativeboxblur.officeName)) {
                if (Intrinsics.areEqual(this.officeTelNumber, nativeiterativeboxblur.officeTelNumber)) {
                    return Intrinsics.areEqual(this.officeZipCode, nativeiterativeboxblur.officeZipCode) && Intrinsics.areEqual(this.sttDate, nativeiterativeboxblur.sttDate) && Intrinsics.areEqual(this.zipCode, nativeiterativeboxblur.zipCode) && this.aplType == nativeiterativeboxblur.aplType && Intrinsics.areEqual(this.dccAgreed, nativeiterativeboxblur.dccAgreed);
                }
                int i8 = onWarmupCompleted + 3;
                IAuthTabCallback = i8 % 128;
                return i8 % 2 != 0;
            }
            int i9 = IAuthTabCallback + 23;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
        }
        return false;
    }

    public int hashCode() {
        String str;
        int i;
        int i2;
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int i3;
        int iHashCode6;
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted;
        int i6 = i5 + 71;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            str = this.accountNumber;
            if (str == null) {
                i2 = 1;
                int i7 = i5 + 117;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                i = i2;
                iHashCode = 0;
            } else {
                i = 1;
                iHashCode = str.hashCode();
            }
        } else {
            str = this.accountNumber;
            if (str == null) {
                i2 = 0;
                int i72 = i5 + 117;
                IAuthTabCallback = i72 % 128;
                int i82 = i72 % 2;
                i = i2;
                iHashCode = 0;
            } else {
                i = 0;
                iHashCode = str.hashCode();
            }
        }
        String str2 = this.address;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.addressDetail;
        int iHashCode8 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.bankCode;
        int iHashCode9 = str4 == null ? 0 : str4.hashCode();
        accessgetARGUMENT_EXTRACTOR_CALLBACKcp accessgetargument_extractor_callbackcp = this.billAddressCode;
        int iHashCode10 = accessgetargument_extractor_callbackcp == null ? 0 : accessgetargument_extractor_callbackcp.hashCode();
        calculateJSArgumentsNeeded calculatejsargumentsneeded = this.billAddressType;
        int iHashCode11 = calculatejsargumentsneeded == null ? 0 : calculatejsargumentsneeded.hashCode();
        int iHashCode12 = Boolean.hashCode(this.cardLoan);
        getJSArgumentsNeeded getjsargumentsneeded = this.jobCode;
        if (getjsargumentsneeded == null) {
            int i9 = IAuthTabCallback + 39;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = getjsargumentsneeded.hashCode();
        }
        Long l = this.limitAmount;
        int iHashCode13 = l == null ? 0 : l.hashCode();
        String str5 = this.officeAddress;
        int iHashCode14 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.officeAddressDetail;
        int iHashCode15 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.officeName;
        if (str7 == null) {
            int i11 = onWarmupCompleted + 9;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str7.hashCode();
        }
        String str8 = this.officeTelNumber;
        if (str8 == null) {
            int i13 = IAuthTabCallback + 85;
            iHashCode4 = i;
            onWarmupCompleted = i13 % 128;
            int i14 = i13 % 2;
            iHashCode5 = 0;
        } else {
            iHashCode4 = i;
            iHashCode5 = str8.hashCode();
        }
        String str9 = this.officeZipCode;
        if (str9 == null) {
            int i15 = onWarmupCompleted + 45;
            i3 = iHashCode5;
            IAuthTabCallback = i15 % 128;
            iHashCode6 = i15 % 2 != 0 ? 1 : 0;
        } else {
            i3 = iHashCode5;
            iHashCode6 = str9.hashCode();
        }
        Integer num = this.sttDate;
        int iHashCode16 = num == null ? 0 : num.hashCode();
        String str10 = this.zipCode;
        int iHashCode17 = str10 == null ? 0 : str10.hashCode();
        buildSignature buildsignature = this.aplType;
        int iHashCode18 = buildsignature == null ? 0 : buildsignature.hashCode();
        Boolean bool = this.dccAgreed;
        if (bool != null) {
            iHashCode4 = bool.hashCode();
        }
        return (((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode2) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode3) * 31) + i3) * 31) + iHashCode6) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PlccAuditVerifyAccountReq(accountNumber=" + this.accountNumber + ", address=" + this.address + ", addressDetail=" + this.addressDetail + ", bankCode=" + this.bankCode + ", billAddressCode=" + this.billAddressCode + ", billAddressType=" + this.billAddressType + ", cardLoan=" + this.cardLoan + ", jobCode=" + this.jobCode + ", limitAmount=" + this.limitAmount + ", officeAddress=" + this.officeAddress + ", officeAddressDetail=" + this.officeAddressDetail + ", officeName=" + this.officeName + ", officeTelNumber=" + this.officeTelNumber + ", officeZipCode=" + this.officeZipCode + ", sttDate=" + this.sttDate + ", zipCode=" + this.zipCode + ", aplType=" + this.aplType + ", dccAgreed=" + this.dccAgreed + ")";
        int i2 = IAuthTabCallback + 13;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 5;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
        parcel.writeString(this.accountNumber);
        parcel.writeString(this.address);
        parcel.writeString(this.addressDetail);
        parcel.writeString(this.bankCode);
        accessgetARGUMENT_EXTRACTOR_CALLBACKcp accessgetargument_extractor_callbackcp = this.billAddressCode;
        if (accessgetargument_extractor_callbackcp == null) {
            int i5 = onWarmupCompleted + 1;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(0);
            }
        } else {
            parcel.writeInt(1);
            parcel.writeString(accessgetargument_extractor_callbackcp.name());
        }
        calculateJSArgumentsNeeded calculatejsargumentsneeded = this.billAddressType;
        if (calculatejsargumentsneeded == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(calculatejsargumentsneeded.name());
        }
        parcel.writeInt(this.cardLoan ? 1 : 0);
        getJSArgumentsNeeded getjsargumentsneeded = this.jobCode;
        if (getjsargumentsneeded == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(getjsargumentsneeded.name());
        }
        Long l = this.limitAmount;
        if (l == null) {
            int i6 = onWarmupCompleted + 93;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.officeAddress);
        parcel.writeString(this.officeAddressDetail);
        parcel.writeString(this.officeName);
        parcel.writeString(this.officeTelNumber);
        parcel.writeString(this.officeZipCode);
        Integer num = this.sttDate;
        if (num == null) {
            int i8 = IAuthTabCallback + 39;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.zipCode);
        buildSignature buildsignature = this.aplType;
        if (buildsignature == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(buildsignature.name());
        }
        Boolean bool = this.dccAgreed;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public nativeIterativeBoxBlur(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable accessgetARGUMENT_EXTRACTOR_CALLBACKcp accessgetargument_extractor_callbackcp, @Nullable calculateJSArgumentsNeeded calculatejsargumentsneeded, boolean z, @Nullable getJSArgumentsNeeded getjsargumentsneeded, @Nullable Long l, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable Integer num, @Nullable String str10, @Nullable buildSignature buildsignature, @Nullable Boolean bool) {
        this.accountNumber = str;
        this.address = str2;
        this.addressDetail = str3;
        this.bankCode = str4;
        this.billAddressCode = accessgetargument_extractor_callbackcp;
        this.billAddressType = calculatejsargumentsneeded;
        this.cardLoan = z;
        this.jobCode = getjsargumentsneeded;
        this.limitAmount = l;
        this.officeAddress = str5;
        this.officeAddressDetail = str6;
        this.officeName = str7;
        this.officeTelNumber = str8;
        this.officeZipCode = str9;
        this.sttDate = num;
        this.zipCode = str10;
        this.aplType = buildsignature;
        this.dccAgreed = bool;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ nativeIterativeBoxBlur(String str, String str2, String str3, String str4, accessgetARGUMENT_EXTRACTOR_CALLBACKcp accessgetargument_extractor_callbackcp, calculateJSArgumentsNeeded calculatejsargumentsneeded, boolean z, getJSArgumentsNeeded getjsargumentsneeded, Long l, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, buildSignature buildsignature, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str11;
        accessgetARGUMENT_EXTRACTOR_CALLBACKcp accessgetargument_extractor_callbackcp2;
        calculateJSArgumentsNeeded calculatejsargumentsneeded2;
        boolean z2;
        Long l2;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        Integer num2;
        int i2;
        buildSignature buildsignature2;
        Boolean bool2;
        Object obj = null;
        String str17 = (i & 1) != 0 ? null : str;
        String str18 = (i & 2) != 0 ? null : str2;
        String str19 = (i & 4) != 0 ? null : str3;
        if ((i & 8) != 0) {
            int i3 = onWarmupCompleted + 5;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 % 2;
            }
            str11 = null;
        } else {
            str11 = str4;
        }
        if ((i & 16) != 0) {
            int i5 = onWarmupCompleted + 73;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            accessgetargument_extractor_callbackcp2 = null;
        } else {
            accessgetargument_extractor_callbackcp2 = accessgetargument_extractor_callbackcp;
        }
        if ((i & 32) != 0) {
            int i7 = IAuthTabCallback + 125;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 2 / 3;
            } else {
                int i9 = 2 % 2;
            }
            calculatejsargumentsneeded2 = null;
        } else {
            calculatejsargumentsneeded2 = calculatejsargumentsneeded;
        }
        if ((i & 64) != 0) {
            int i10 = IAuthTabCallback + 97;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        getJSArgumentsNeeded getjsargumentsneeded2 = (i & 128) != 0 ? null : getjsargumentsneeded;
        if ((i & 256) != 0) {
            int i12 = IAuthTabCallback + 51;
            onWarmupCompleted = i12 % 128;
            if (i12 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            l2 = null;
        } else {
            l2 = l;
        }
        if ((i & 512) != 0) {
            int i13 = IAuthTabCallback + 1;
            onWarmupCompleted = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 2 % 2;
            }
            str12 = null;
        } else {
            str12 = str5;
        }
        if ((i & 1024) != 0) {
            int i15 = 2 % 2;
            str13 = null;
        } else {
            str13 = str6;
        }
        if ((i & 2048) != 0) {
            int i16 = onWarmupCompleted + 21;
            IAuthTabCallback = i16 % 128;
            int i17 = i16 % 2;
            str14 = null;
        } else {
            str14 = str7;
        }
        String str20 = (i & PKIFailureInfo.certConfirmed) != 0 ? null : str8;
        if ((i & PKIFailureInfo.certRevoked) != 0) {
            int i18 = onWarmupCompleted + 41;
            str15 = str20;
            IAuthTabCallback = i18 % 128;
            int i19 = i18 % 2;
            str16 = null;
        } else {
            str15 = str20;
            str16 = str9;
        }
        Integer num3 = (i & 16384) != 0 ? null : num;
        String str21 = (i & 32768) != 0 ? null : str10;
        if ((i & PKIFailureInfo.notAuthorized) != 0) {
            int i20 = IAuthTabCallback + 51;
            num2 = num3;
            onWarmupCompleted = i20 % 128;
            i2 = 2;
            int i21 = i20 % 2;
            buildsignature2 = null;
        } else {
            num2 = num3;
            i2 = 2;
            buildsignature2 = buildsignature;
        }
        if ((i & PKIFailureInfo.unsupportedVersion) != 0) {
            int i22 = i2 % i2;
            bool2 = null;
        } else {
            bool2 = bool;
        }
        this(str17, str18, str19, str11, accessgetargument_extractor_callbackcp2, calculatejsargumentsneeded2, z2, getjsargumentsneeded2, l2, str12, str13, str14, str15, str16, num2, str21, buildsignature2, bool2);
    }
}
