package o;

import android.os.Parcel;
import android.os.Parcelable;
import im.toss.features.verify.teensmanualselfie.impl.idcardupload.nav.TeensManualSelfieNavGraphKt$;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AdvertisingId implements Parcelable {
    public static final Parcelable.Creator<AdvertisingId> CREATOR = new onExtraCallback();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;
    private final String disclaimer;
    private final Boolean editable;
    private final getAdvertisingIdInfoDirectly imageUploadConfig;
    private final boolean isOcrAuthRequired;
    private final String manualInputDisclaimer;
    private final boolean manualInputEnabled;
    private final Integer maxAttemptsUntilManualInput;
    private final Integer maxOcrAuthAttemptsUntilManualInput;
    private final boolean skipOcrIntro;
    private final onWarmupCompleted type;

    public static final class onExtraCallback implements Parcelable.Creator<AdvertisingId> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ AdvertisingId createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 53;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                onNavigationEvent(parcel);
                throw null;
            }
            AdvertisingId advertisingIdOnNavigationEvent = onNavigationEvent(parcel);
            int i3 = onExtraCallback + 71;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return advertisingIdOnNavigationEvent;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ AdvertisingId[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 107;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            AdvertisingId[] advertisingIdArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            int i5 = onNavigationEvent + 105;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return advertisingIdArrOnExtraCallbackWithResult;
        }

        public final AdvertisingId[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent;
            int i4 = i3 + 91;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            AdvertisingId[] advertisingIdArr = new AdvertisingId[i];
            int i6 = i3 + 69;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                return advertisingIdArr;
            }
            throw null;
        }

        public final AdvertisingId onNavigationEvent(Parcel parcel) {
            Integer num;
            boolean z;
            Boolean boolValueOf;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            onWarmupCompleted onwarmupcompletedValueOf = onWarmupCompleted.valueOf(parcel.readString());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                num = null;
            } else {
                Integer numValueOf2 = Integer.valueOf(parcel.readInt());
                int i2 = onExtraCallback + 53;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                num = numValueOf2;
            }
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                int i4 = onNavigationEvent + 59;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            } else {
                z = false;
            }
            getAdvertisingIdInfoDirectly getadvertisingidinfodirectlyCreateFromParcel = parcel.readInt() == 0 ? null : getAdvertisingIdInfoDirectly.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i6 = onExtraCallback + 115;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AdvertisingId(onwarmupcompletedValueOf, numValueOf, num, z2, z, getadvertisingidinfodirectlyCreateFromParcel, string, string2, boolValueOf, parcel.readInt() != 0);
        }
    }

    static {
        int i = IAuthTabCallback + 53;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public AdvertisingId() {
        this(null, null, null, false, false, null, null, null, null, false, 1023, null);
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i5;
        int i8 = (~(i7 | i3)) | i6;
        int i9 = i3 | i6 | i7;
        int i10 = i6 + i5 + i4 + (1159740906 * i2) + ((-617157175) * i);
        int i11 = i10 * i10;
        int i12 = ((i6 * 934236018) - 2089811968) + (934236018 * i5) + (i8 * (-953110385)) + ((-953110385) * i9) + (953110385 * i7) + ((-18874368) * i4) + (1488977920 * i2) + (2111832064 * i) + (2070937600 * i11);
        int i13 = (i6 * (-824977050)) + 1921657099 + (i5 * (-824977050)) + (i8 * (-923)) + (i9 * (-923)) + (i7 * 923) + (i4 * (-824977973)) + (i2 * (-135083378)) + (i * 1125239651) + (i11 * 298844160);
        if (i12 + (i13 * i13 * 2098200576) == 1) {
            return onNavigationEvent(objArr);
        }
        AdvertisingId advertisingId = (AdvertisingId) objArr[0];
        int i14 = 2 % 2;
        int i15 = onExtraCallback;
        int i16 = i15 + 73;
        onExtraCallbackWithResult = i16 % 128;
        int i17 = i16 % 2;
        Boolean bool = advertisingId.editable;
        int i18 = i15 + 101;
        onExtraCallbackWithResult = i18 % 128;
        int i19 = i18 % 2;
        return bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 91;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 53;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i2 + 75;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(obj instanceof AdvertisingId)) {
            return false;
        }
        AdvertisingId advertisingId = (AdvertisingId) obj;
        if (this.type != advertisingId.type) {
            int i8 = i4 + 33;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.maxAttemptsUntilManualInput, advertisingId.maxAttemptsUntilManualInput)) {
            int i10 = onExtraCallback + 87;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.maxOcrAuthAttemptsUntilManualInput, advertisingId.maxOcrAuthAttemptsUntilManualInput) || this.isOcrAuthRequired != advertisingId.isOcrAuthRequired || this.manualInputEnabled != advertisingId.manualInputEnabled || (!Intrinsics.areEqual(this.imageUploadConfig, advertisingId.imageUploadConfig)) || !Intrinsics.areEqual(this.disclaimer, advertisingId.disclaimer) || !Intrinsics.areEqual(this.manualInputDisclaimer, advertisingId.manualInputDisclaimer) || !Intrinsics.areEqual(this.editable, advertisingId.editable)) {
            return false;
        }
        if (this.skipOcrIntro == advertisingId.skipOcrIntro) {
            return true;
        }
        int i12 = onExtraCallbackWithResult + 125;
        onExtraCallback = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int iHashCode4 = this.type.hashCode();
        Integer num = this.maxAttemptsUntilManualInput;
        int iHashCode5 = 0;
        if (num == null) {
            int i2 = onExtraCallbackWithResult + 91;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = num.hashCode();
        }
        Integer num2 = this.maxOcrAuthAttemptsUntilManualInput;
        int iHashCode6 = num2 == null ? 0 : num2.hashCode();
        int iHashCode7 = Boolean.hashCode(this.isOcrAuthRequired);
        int iHashCode8 = Boolean.hashCode(this.manualInputEnabled);
        getAdvertisingIdInfoDirectly getadvertisingidinfodirectly = this.imageUploadConfig;
        if (getadvertisingidinfodirectly == null) {
            int i4 = onExtraCallback + 53;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = getadvertisingidinfodirectly.hashCode();
        }
        String str = this.disclaimer;
        int iHashCode9 = str == null ? 0 : str.hashCode();
        String str2 = this.manualInputDisclaimer;
        if (str2 == null) {
            int i6 = onExtraCallback + 35;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str2.hashCode();
        }
        Boolean bool = this.editable;
        if (bool != null) {
            int i8 = onExtraCallbackWithResult + 75;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            iHashCode5 = bool.hashCode();
        }
        return (((((((((((((((((iHashCode4 * 31) + iHashCode) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode2) * 31) + iHashCode9) * 31) + iHashCode3) * 31) + iHashCode5) * 31) + Boolean.hashCode(this.skipOcrIntro);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "IdVerificationInputTypeModel(type=" + this.type + ", maxAttemptsUntilManualInput=" + this.maxAttemptsUntilManualInput + ", maxOcrAuthAttemptsUntilManualInput=" + this.maxOcrAuthAttemptsUntilManualInput + ", isOcrAuthRequired=" + this.isOcrAuthRequired + ", manualInputEnabled=" + this.manualInputEnabled + ", imageUploadConfig=" + this.imageUploadConfig + ", disclaimer=" + this.disclaimer + ", manualInputDisclaimer=" + this.manualInputDisclaimer + ", editable=" + this.editable + ", skipOcrIntro=" + this.skipOcrIntro + ")";
        int i2 = onExtraCallback + 21;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type.name());
        Integer num = this.maxAttemptsUntilManualInput;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.maxOcrAuthAttemptsUntilManualInput;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeInt(this.isOcrAuthRequired ? 1 : 0);
        parcel.writeInt(this.manualInputEnabled ? 1 : 0);
        getAdvertisingIdInfoDirectly getadvertisingidinfodirectly = this.imageUploadConfig;
        if (getadvertisingidinfodirectly == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            getadvertisingidinfodirectly.writeToParcel(parcel, i);
        }
        parcel.writeString(this.disclaimer);
        parcel.writeString(this.manualInputDisclaimer);
        Boolean bool = this.editable;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
            int i3 = onExtraCallbackWithResult + 9;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        parcel.writeInt(this.skipOcrIntro ? 1 : 0);
        int i5 = onExtraCallback + 9;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 37 / 0;
        }
    }

    public AdvertisingId(@NotNull onWarmupCompleted onwarmupcompleted, @Nullable Integer num, @Nullable Integer num2, boolean z, boolean z2, @Nullable getAdvertisingIdInfoDirectly getadvertisingidinfodirectly, @Nullable String str, @Nullable String str2, @Nullable Boolean bool, boolean z3) {
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        this.type = onwarmupcompleted;
        this.maxAttemptsUntilManualInput = num;
        this.maxOcrAuthAttemptsUntilManualInput = num2;
        this.isOcrAuthRequired = z;
        this.manualInputEnabled = z2;
        this.imageUploadConfig = getadvertisingidinfodirectly;
        this.disclaimer = str;
        this.manualInputDisclaimer = str2;
        this.editable = bool;
        this.skipOcrIntro = z3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertisingId(onWarmupCompleted onwarmupcompleted, Integer num, Integer num2, boolean z, boolean z2, getAdvertisingIdInfoDirectly getadvertisingidinfodirectly, String str, String str2, Boolean bool, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        onWarmupCompleted onwarmupcompleted2;
        Integer num3;
        getAdvertisingIdInfoDirectly getadvertisingidinfodirectly2;
        String str3;
        boolean z4;
        if ((i & 1) != 0) {
            onwarmupcompleted2 = onWarmupCompleted.MANUAL;
            int i2 = 2 % 2;
        } else {
            onwarmupcompleted2 = onwarmupcompleted;
        }
        String str4 = null;
        Integer num4 = (i & 2) != 0 ? null : num;
        if ((i & 4) != 0) {
            int i3 = 2 % 2;
            num3 = null;
        } else {
            num3 = num2;
        }
        boolean z5 = (i & 8) != 0 ? false : z;
        boolean z6 = (i & 16) != 0 ? false : z2;
        if ((i & 32) != 0) {
            int i4 = onExtraCallbackWithResult + 9;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            getadvertisingidinfodirectly2 = null;
        } else {
            getadvertisingidinfodirectly2 = getadvertisingidinfodirectly;
        }
        if ((i & 64) != 0) {
            int i7 = 2 % 2;
            str3 = null;
        } else {
            str3 = str;
        }
        if ((i & 128) != 0) {
            int i8 = onExtraCallback + 99;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 77 / 0;
            }
        } else {
            str4 = str2;
        }
        Boolean bool2 = (i & 256) != 0 ? Boolean.TRUE : bool;
        if ((i & 512) != 0) {
            int i10 = onExtraCallbackWithResult + 31;
            onExtraCallback = i10 % 128;
            z4 = i10 % 2 != 0;
            int i11 = 2 % 2;
        } else {
            z4 = z3;
        }
        this(onwarmupcompleted2, num4, num3, z5, z6, getadvertisingidinfodirectly2, str3, str4, bool2, z4);
    }

    public final onWarmupCompleted asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 125;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        onWarmupCompleted onwarmupcompleted = this.type;
        int i5 = i2 + 11;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return onwarmupcompleted;
    }

    public final Integer onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.maxAttemptsUntilManualInput;
        if (i3 == 0) {
            int i4 = 13 / 0;
        }
        return num;
    }

    public final Integer IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.maxOcrAuthAttemptsUntilManualInput;
        }
        throw null;
    }

    public final boolean asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.isOcrAuthRequired;
        int i4 = i3 + 69;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.manualInputEnabled;
        if (i3 == 0) {
            int i4 = 94 / 0;
        }
        return z;
    }

    public final getAdvertisingIdInfoDirectly onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 1;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        getAdvertisingIdInfoDirectly getadvertisingidinfodirectly = this.imageUploadConfig;
        int i5 = i2 + 17;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return getadvertisingidinfodirectly;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        AdvertisingId advertisingId = (AdvertisingId) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 115;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = advertisingId.disclaimer;
        int i5 = i2 + 15;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.manualInputDisclaimer;
        int i5 = i3 + 125;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        boolean z = this.skipOcrIntro;
        int i5 = i3 + 19;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onWarmupCompleted {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
        private static int IAuthTabCallback = 0;
        public static final onWarmupCompleted MANUAL = new onWarmupCompleted("MANUAL", 0);
        public static final onWarmupCompleted OCR = new onWarmupCompleted("OCR", 1);
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;

        private static final /* synthetic */ onWarmupCompleted[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 21;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = MANUAL;
            if (i3 != 0) {
                return new onWarmupCompleted[]{onwarmupcompleted, OCR};
            }
            onWarmupCompleted onwarmupcompleted2 = OCR;
            onWarmupCompleted[] onwarmupcompletedArr = new onWarmupCompleted[4];
            onwarmupcompletedArr[0] = onwarmupcompleted;
            onwarmupcompletedArr[0] = onwarmupcompleted2;
            return onwarmupcompletedArr;
        }

        public static EnumEntries<onWarmupCompleted> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 113;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            EnumEntries<onWarmupCompleted> enumEntries = $ENTRIES;
            int i5 = i3 + 73;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return enumEntries;
            }
            throw null;
        }

        public static onWarmupCompleted valueOf(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 53;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
            if (i3 != 0) {
                int i4 = 39 / 0;
            }
            return onwarmupcompleted;
        }

        public static onWarmupCompleted[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 13;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
            int i4 = onNavigationEvent + 79;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return onwarmupcompletedArr;
            }
            throw null;
        }

        static {
            onWarmupCompleted[] onwarmupcompletedArr$values = $values();
            $VALUES = onwarmupcompletedArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
            int i = IAuthTabCallback + 45;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        private onWarmupCompleted(String str, int i) {
        }
    }

    public final String IAuthTabCallback() {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (String) onExtraCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2, -359673906, new Object[]{this}, 359673907);
    }

    public final Boolean onExtraCallbackWithResult() {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Boolean) onExtraCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2, -1513169442, new Object[]{this}, 1513169442);
    }
}
