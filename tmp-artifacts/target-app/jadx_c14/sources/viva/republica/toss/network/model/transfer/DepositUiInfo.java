package viva.republica.toss.network.model.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.UtilsKtExternalSyntheticLambda17$onBackPressed;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DepositUiInfo implements Parcelable {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String changedDescription;
    private final String confirmPageDescription;
    private final String description;
    private final DepositUiAnimationType descriptionAnimationType;
    private final String name;
    private final String namePostfix;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DepositUiInfo> CREATOR = new IAuthTabCallback();
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.DepositUiInfo$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 85;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallback = DepositUiInfo.onExtraCallback();
            if (i3 != 0) {
                int i4 = 36 / 0;
            }
            return kSerializerOnExtraCallback;
        }
    }), null, null, null};

    public static final class IAuthTabCallback implements Parcelable.Creator<DepositUiInfo> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ DepositUiInfo createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 25;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return onWarmupCompleted(parcel);
            }
            onWarmupCompleted(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ DepositUiInfo[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 93;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                onNavigationEvent(i);
                throw null;
            }
            DepositUiInfo[] depositUiInfoArrOnNavigationEvent = onNavigationEvent(i);
            int i4 = onExtraCallback + 5;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return depositUiInfoArrOnNavigationEvent;
            }
            throw null;
        }

        public final DepositUiInfo[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 11;
            onNavigationEvent = i3 % 128;
            DepositUiInfo[] depositUiInfoArr = new DepositUiInfo[i];
            if (i3 % 2 != 0) {
                int i4 = 77 / 0;
            }
            return depositUiInfoArr;
        }

        public final DepositUiInfo onWarmupCompleted(Parcel parcel) {
            DepositUiAnimationType depositUiAnimationTypeCreateFromParcel;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i2 = onNavigationEvent + 15;
                onExtraCallback = i2 % 128;
                depositUiAnimationTypeCreateFromParcel = null;
                if (i2 % 2 == 0) {
                    depositUiAnimationTypeCreateFromParcel.hashCode();
                    throw null;
                }
            } else {
                depositUiAnimationTypeCreateFromParcel = DepositUiAnimationType.CREATOR.createFromParcel(parcel);
                int i3 = onExtraCallback + 113;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
            }
            DepositUiInfo depositUiInfo = new DepositUiInfo(string, string2, depositUiAnimationTypeCreateFromParcel, parcel.readString(), parcel.readString(), parcel.readString());
            int i5 = onExtraCallback + 65;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return depositUiInfo;
        }
    }

    public DepositUiInfo() {
        this((String) null, (String) null, (DepositUiAnimationType) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    private static final /* synthetic */ KSerializer asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<DepositUiAnimationType> kSerializerSerializer = DepositUiAnimationType.Companion.serializer();
        int i4 = onExtraCallbackWithResult + 109;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
        return kSerializerSerializer;
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        KSerializer kSerializerAsBinder;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerAsBinder = asBinder();
            int i3 = 1 / 0;
        } else {
            kSerializerAsBinder = asBinder();
        }
        int i4 = onExtraCallbackWithResult + 85;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerAsBinder;
        }
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i;
        int i9 = ~(i7 | i8);
        int i10 = i2 | i9;
        int i11 = (~(i7 | i2)) | i9 | (~(i8 | i2));
        int i12 = ~((~i2) | i6 | i);
        int i13 = i6 + i + i4 + ((-2027816600) * i5) + ((-1234684791) * i3);
        int i14 = i13 * i13;
        int i15 = (i6 * (-132237830)) + 1711013888 + ((-132237830) * i) + (i10 * 228444679) + (228444679 * i11) + ((-228444679) * i12) + (96206848 * i4) + (811597824 * i5) + (1100742656 * i3) + (1751056384 * i14);
        int i16 = ((i6 * 572746074) - 905264446) + (i * 572746074) + (i10 * (-489)) + (i11 * (-489)) + (i12 * 489) + (i4 * 572745585) + (i5 * 982511336) + (i3 * (-774025351)) + (i14 * 1257177088);
        if (i15 + (i16 * i16 * 1874919424) == 1) {
            return IAuthTabCallback(objArr);
        }
        DepositUiInfo depositUiInfo = (DepositUiInfo) objArr[0];
        int i17 = 2 % 2;
        int i18 = onNavigationEvent;
        int i19 = i18 + 105;
        onExtraCallbackWithResult = i19 % 128;
        int i20 = i19 % 2;
        String str = depositUiInfo.name;
        int i21 = i18 + 91;
        onExtraCallbackWithResult = i21 % 128;
        int i22 = i21 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 57;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 61;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositUiInfo)) {
            return false;
        }
        DepositUiInfo depositUiInfo = (DepositUiInfo) obj;
        if (!Intrinsics.areEqual(this.description, depositUiInfo.description)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.changedDescription, depositUiInfo.changedDescription)) {
            int i3 = onNavigationEvent + 49;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (this.descriptionAnimationType != depositUiInfo.descriptionAnimationType) {
            int i5 = onNavigationEvent + 61;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.confirmPageDescription, depositUiInfo.confirmPageDescription)) {
            return false;
        }
        if (Intrinsics.areEqual(this.name, depositUiInfo.name)) {
            return Intrinsics.areEqual(this.namePostfix, depositUiInfo.namePostfix);
        }
        int i7 = onExtraCallbackWithResult + 63;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.description;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.changedDescription;
        if (str2 == null) {
            int i2 = onNavigationEvent + 13;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        DepositUiAnimationType depositUiAnimationType = this.descriptionAnimationType;
        if (depositUiAnimationType == null) {
            int i4 = onExtraCallbackWithResult + 69;
            onNavigationEvent = i4 % 128;
            iHashCode2 = i4 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode2 = depositUiAnimationType.hashCode();
        }
        String str3 = this.confirmPageDescription;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.name;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.namePostfix;
        return (((((((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DepositUiInfo(description=" + this.description + ", changedDescription=" + this.changedDescription + ", descriptionAnimationType=" + this.descriptionAnimationType + ", confirmPageDescription=" + this.confirmPageDescription + ", name=" + this.name + ", namePostfix=" + this.namePostfix + ")";
        int i2 = onNavigationEvent + 87;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 16 / 0;
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.description);
        parcel.writeString(this.changedDescription);
        DepositUiAnimationType depositUiAnimationType = this.descriptionAnimationType;
        if (depositUiAnimationType == null) {
            int i3 = onNavigationEvent + 103;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            depositUiAnimationType.writeToParcel(parcel, i);
        }
        parcel.writeString(this.confirmPageDescription);
        parcel.writeString(this.name);
        parcel.writeString(this.namePostfix);
        int i5 = onExtraCallbackWithResult + 107;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DepositUiInfo> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 73;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            DepositUiInfo$$serializer depositUiInfo$$serializer = DepositUiInfo$$serializer.INSTANCE;
            int i4 = onNavigationEvent + 111;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return depositUiInfo$$serializer;
        }
    }

    static {
        int i = onWarmupCompleted + 75;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 20 / 0;
        }
    }

    public /* synthetic */ DepositUiInfo(int i, String str, String str2, DepositUiAnimationType depositUiAnimationType, String str3, String str4, String str5, okycx okycxVar) {
        Object obj = null;
        if ((i & 1) == 0) {
            this.description = null;
            int i2 = 2 % 2;
        } else {
            this.description = str;
        }
        if ((i & 2) == 0) {
            this.changedDescription = null;
            int i3 = onExtraCallbackWithResult + 91;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        } else {
            this.changedDescription = str2;
        }
        if ((i & 4) == 0) {
            int i6 = onNavigationEvent + 125;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            this.descriptionAnimationType = null;
        } else {
            this.descriptionAnimationType = depositUiAnimationType;
        }
        if ((i & 8) == 0) {
            int i8 = onExtraCallbackWithResult + 93;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            this.confirmPageDescription = null;
        } else {
            this.confirmPageDescription = str3;
        }
        if ((i & 16) == 0) {
            this.name = null;
        } else {
            this.name = str4;
        }
        if ((i & 32) == 0) {
            this.namePostfix = null;
            int i10 = onNavigationEvent + 3;
            onExtraCallbackWithResult = i10 % 128;
            if (i10 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        this.namePostfix = str5;
        int i11 = onNavigationEvent + 57;
        onExtraCallbackWithResult = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 25 / 0;
        }
    }

    public DepositUiInfo(@Nullable String str, @Nullable String str2, @Nullable DepositUiAnimationType depositUiAnimationType, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.description = str;
        this.changedDescription = str2;
        this.descriptionAnimationType = depositUiAnimationType;
        this.confirmPageDescription = str3;
        this.name = str4;
        this.namePostfix = str5;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(DepositUiInfo depositUiInfo, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || depositUiInfo.description != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, depositUiInfo.description);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || depositUiInfo.changedDescription != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, depositUiInfo.changedDescription);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || depositUiInfo.descriptionAnimationType != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, (py) lazyArr[2].getValue(), depositUiInfo.descriptionAnimationType);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || depositUiInfo.confirmPageDescription != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, depositUiInfo.confirmPageDescription);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 4) || depositUiInfo.name != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, depositUiInfo.name);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 5)) {
            int i4 = onNavigationEvent + 81;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                String str = depositUiInfo.namePostfix;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (depositUiInfo.namePostfix == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, depositUiInfo.namePostfix);
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 121;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 73;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DepositUiInfo(String str, String str2, DepositUiAnimationType depositUiAnimationType, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str6;
        DepositUiAnimationType depositUiAnimationType2;
        String str7;
        String str8;
        String str9 = null;
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 61;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i5 = 2 % 2;
            str6 = null;
        } else {
            str6 = str2;
        }
        if ((i & 4) != 0) {
            int i6 = onExtraCallbackWithResult + 13;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 77 / 0;
            }
            depositUiAnimationType2 = null;
        } else {
            depositUiAnimationType2 = depositUiAnimationType;
        }
        if ((i & 8) != 0) {
            int i8 = onExtraCallbackWithResult + 85;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 2 % 2;
            }
            str7 = null;
        } else {
            str7 = str3;
        }
        if ((i & 16) != 0) {
            int i10 = onExtraCallbackWithResult + 7;
            onNavigationEvent = i10 % 128;
            if (i10 % 2 != 0) {
                str9.hashCode();
                throw null;
            }
            int i11 = 2 % 2;
            str8 = null;
        } else {
            str8 = str4;
        }
        if ((i & 32) != 0) {
            int i12 = onExtraCallbackWithResult + 47;
            onNavigationEvent = i12 % 128;
            int i13 = i12 % 2;
        } else {
            str9 = str5;
        }
        this(str, str6, depositUiAnimationType2, str7, str8, str9);
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.description;
        int i5 = i3 + 83;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.changedDescription;
        int i5 = i3 + 37;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final DepositUiAnimationType asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        DepositUiAnimationType depositUiAnimationType = this.descriptionAnimationType;
        int i5 = i3 + 111;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return depositUiAnimationType;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = this.confirmPageDescription;
        if (i3 != 0) {
            int i4 = 37 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        DepositUiInfo depositUiInfo = (DepositUiInfo) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = depositUiInfo.namePostfix;
        if (i3 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallbackDefault() {
        return (String) onExtraCallbackWithResult(-772475874, new Object[]{this}, UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), 772475874);
    }

    public final String onTransact() {
        return (String) onExtraCallbackWithResult(-1019616664, new Object[]{this}, UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), 1019616665);
    }
}
