package viva.republica.toss.network.model.cardsales.funnel.formvalue;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access15300;
import o.liq;
import o.updateRenderInfoForVideo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.cardsales.funnel.formvalue.IdVerificationFormValue;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class IdVerificationFormValue implements RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1 {
    public static final Parcelable.Creator<IdVerificationFormValue> CREATOR = new onExtraCallbackWithResult();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final String driverLicenseIssuer;
    private final String driverLicenseNo;
    private final String driverLicenseSerial;
    private final String residentLicenseYmd;
    private final IdType type;
    private final boolean verified;
    private final String verifyOrg;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<IdVerificationFormValue> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ IdVerificationFormValue createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 37;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            IdVerificationFormValue idVerificationFormValueOnWarmupCompleted = onWarmupCompleted(parcel);
            int i4 = onExtraCallback + 27;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return idVerificationFormValueOnWarmupCompleted;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ IdVerificationFormValue[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 73;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            IdVerificationFormValue[] idVerificationFormValueArrOnNavigationEvent = onNavigationEvent(i);
            int i5 = onWarmupCompleted + 39;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return idVerificationFormValueArrOnNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final IdVerificationFormValue[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 33;
            onWarmupCompleted = i3 % 128;
            IdVerificationFormValue[] idVerificationFormValueArr = new IdVerificationFormValue[i];
            if (i3 % 2 != 0) {
                return idVerificationFormValueArr;
            }
            throw null;
        }

        public final IdVerificationFormValue onWarmupCompleted(Parcel parcel) {
            boolean z;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 121;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            IdType idTypeValueOf = IdType.valueOf(parcel.readString());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i4 = onExtraCallback + 15;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            } else {
                z = false;
            }
            return new IdVerificationFormValue(idTypeValueOf, string, string2, string3, string4, z, parcel.readString());
        }
    }

    static {
        int i = onExtraCallbackWithResult + 25;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 79;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdVerificationFormValue)) {
            return false;
        }
        IdVerificationFormValue idVerificationFormValue = (IdVerificationFormValue) obj;
        if (this.type != idVerificationFormValue.type) {
            int i2 = onExtraCallback;
            int i3 = i2 + 91;
            IAuthTabCallback = i3 % 128;
            boolean z = true ^ (i3 % 2 != 0);
            int i4 = i2 + 17;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return z;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.driverLicenseNo, idVerificationFormValue.driverLicenseNo) || !Intrinsics.areEqual(this.driverLicenseIssuer, idVerificationFormValue.driverLicenseIssuer) || !Intrinsics.areEqual(this.driverLicenseSerial, idVerificationFormValue.driverLicenseSerial)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.residentLicenseYmd, idVerificationFormValue.residentLicenseYmd)) {
            int i5 = onExtraCallback + 7;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 48 / 0;
            }
            return false;
        }
        if (this.verified != idVerificationFormValue.verified) {
            return false;
        }
        if (Intrinsics.areEqual(this.verifyOrg, idVerificationFormValue.verifyOrg)) {
            return true;
        }
        int i7 = onExtraCallback + 69;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int iHashCode4 = this.type.hashCode();
        String str = this.driverLicenseNo;
        if (str == null) {
            int i2 = IAuthTabCallback + 9;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.driverLicenseIssuer;
        if (str2 == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
            int i4 = IAuthTabCallback + 67;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        String str3 = this.driverLicenseSerial;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.residentLicenseYmd;
        if (str4 == null) {
            int i6 = onExtraCallback + 121;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str4.hashCode();
            int i8 = onExtraCallback + 11;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
        }
        int iHashCode6 = Boolean.hashCode(this.verified);
        String str5 = this.verifyOrg;
        return (((((((((((iHashCode4 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode5) * 31) + iHashCode3) * 31) + iHashCode6) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "IdVerificationFormValue(type=" + this.type + ", driverLicenseNo=" + this.driverLicenseNo + ", driverLicenseIssuer=" + this.driverLicenseIssuer + ", driverLicenseSerial=" + this.driverLicenseSerial + ", residentLicenseYmd=" + this.residentLicenseYmd + ", verified=" + this.verified + ", verifyOrg=" + this.verifyOrg + ")";
        int i2 = IAuthTabCallback + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 95;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type.name());
        parcel.writeString(this.driverLicenseNo);
        parcel.writeString(this.driverLicenseIssuer);
        parcel.writeString(this.driverLicenseSerial);
        parcel.writeString(this.residentLicenseYmd);
        parcel.writeInt(this.verified ? 1 : 0);
        parcel.writeString(this.verifyOrg);
        int i5 = onExtraCallback + 63;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public IdVerificationFormValue(@NotNull IdType idType, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, boolean z, @Nullable String str5) {
        Intrinsics.checkNotNullParameter(idType, "");
        this.type = idType;
        this.driverLicenseNo = str;
        this.driverLicenseIssuer = str2;
        this.driverLicenseSerial = str3;
        this.residentLicenseYmd = str4;
        this.verified = z;
        this.verifyOrg = str5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ IdVerificationFormValue(IdType idType, String str, String str2, String str3, String str4, boolean z, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str6;
        String str7;
        String str8;
        if ((i & 2) != 0) {
            int i2 = onExtraCallback + 15;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 47;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str6 = null;
        } else {
            str6 = str;
        }
        String str9 = (i & 4) != 0 ? null : str2;
        if ((i & 8) != 0) {
            int i8 = onExtraCallback + 61;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 == 0) {
                throw null;
            }
            int i9 = 2 % 2;
            str7 = null;
        } else {
            str7 = str3;
        }
        String str10 = (i & 16) != 0 ? null : str4;
        if ((i & 64) != 0) {
            int i10 = onExtraCallback + 95;
            IAuthTabCallback = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
            int i11 = 2 % 2;
            str8 = null;
        } else {
            str8 = str5;
        }
        this(idType, str6, str9, str7, str10, z, str8);
    }

    public final IdType IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        IdType idType = this.type;
        int i5 = i3 + 57;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return idType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @liq
    public static final class IdType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IdType[] $VALUES;
        private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
        public static final Companion Companion;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final String logName;
        public static final IdType DRIVER = new IdType("DRIVER", 0, "license");
        public static final IdType RESIDENT = new IdType("RESIDENT", 1, "registration");

        /* renamed from: $r8$lambda$P-zCy9buho9UXkLUaE1obpCcOkQ, reason: not valid java name */
        public static /* synthetic */ KSerializer m10$r8$lambda$PzCy9buho9UXkLUaE1obpCcOkQ() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 43;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializer_init_$_anonymous_ = _init_$_anonymous_();
            int i4 = onNavigationEvent + 75;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 54 / 0;
            }
            return kSerializer_init_$_anonymous_;
        }

        private static final /* synthetic */ IdType[] $values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 117;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            IdType[] idTypeArr = {DRIVER, RESIDENT};
            int i5 = i3 + 79;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return idTypeArr;
        }

        public static EnumEntries<IdType> getEntries() {
            EnumEntries<IdType> enumEntries;
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 57;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                enumEntries = $ENTRIES;
                int i4 = 85 / 0;
            } else {
                enumEntries = $ENTRIES;
            }
            int i5 = i2 + 123;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 87 / 0;
            }
            return enumEntries;
        }

        public static IdType valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 45;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            IdType idType = (IdType) Enum.valueOf(IdType.class, str);
            int i4 = onNavigationEvent + 113;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return idType;
        }

        public static IdType[] values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 105;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            IdType[] idTypeArr = (IdType[]) $VALUES.clone();
            int i4 = onWarmupCompleted + 67;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return idTypeArr;
            }
            throw null;
        }

        public static final class Companion {
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            private final /* synthetic */ KSerializer onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 33;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializer = (KSerializer) IdType.access$get$cachedSerializer$delegate$cp().getValue();
                if (i3 == 0) {
                    return kSerializer;
                }
                throw null;
            }

            public final KSerializer<IdType> serializer() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 1;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer<IdType> kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
                if (i3 == 0) {
                    int i4 = 14 / 0;
                }
                return kSerializerOnExtraCallbackWithResult;
            }
        }

        private IdType(String str, int i, String str2) {
            this.logName = str2;
        }

        private static final /* synthetic */ KSerializer _init_$_anonymous_() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 63;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.cardsales.funnel.formvalue.IdVerificationFormValue.IdType", values());
            }
            updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.cardsales.funnel.formvalue.IdVerificationFormValue.IdType", values());
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 9;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            Lazy<KSerializer<Object>> lazy = $cachedSerializer$delegate;
            int i5 = i3 + 41;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 48 / 0;
            }
            return lazy;
        }

        public final String getLogName() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            String str = this.logName;
            if (i3 == 0) {
                int i4 = 43 / 0;
            }
            return str;
        }

        static {
            IdType[] idTypeArr$values = $values();
            $VALUES = idTypeArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(idTypeArr$values);
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new Companion(defaultConstructorMarker);
            $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.cardsales.funnel.formvalue.IdVerificationFormValue$IdType$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 37;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    KSerializer kSerializerM10$r8$lambda$PzCy9buho9UXkLUaE1obpCcOkQ = IdVerificationFormValue.IdType.m10$r8$lambda$PzCy9buho9UXkLUaE1obpCcOkQ();
                    int i4 = onNavigationEvent + 17;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        return kSerializerM10$r8$lambda$PzCy9buho9UXkLUaE1obpCcOkQ;
                    }
                    throw null;
                }
            });
            int i = IAuthTabCallback + 99;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 != 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }
    }
}
