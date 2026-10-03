package viva.republica.toss.network.model.transfer.periodic;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import im.toss.features.verify.teensmanualselfie.impl.idcardupload.nav.TeensManualSelfieNavGraphKt$;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.DERConstructedSet;
import o.EncryptedContentInfoParser;
import o.KeyBoardVisiblePoint;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkNavigationBarByWindowManagerService;
import o.fromArray;
import o.fromBundle;
import o.liq;
import o.okycx;
import o.onDisclaimerClick;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.send.periodic.view.PeriodicTransferPicker;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PeriodicTransferModel implements Parcelable {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final int alarmDays;
    private final long amount;
    private final String depositAccountHolderName;
    private final String depositAccountNo;
    private final int depositBankCode;
    private String depositDisplayName;
    private String depositDisplayPhone;
    private final String depositName;
    private final String depositPhone;
    private final fromBundle depositType;
    private final String description;
    private final String descriptionTdsColor;
    private final fromArray dueDateType;
    private final boolean enableAlarm;

    @SerializedName("invalidFields")
    private final InvalidFields invalidFields;
    private final boolean isExpired;
    private final boolean isLastDayForDueDate;
    private final boolean isRepeat;
    private final String status;
    private final String title;
    private final String transferDueDate;
    private final String transferDueDay;
    private final String transferEndDate;
    private final String type;
    private final String uniqueId;
    private final String userMemo;
    private final String withdrawAccountNo;
    private final int withdrawBankCode;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<PeriodicTransferModel> CREATOR = new onWarmupCompleted();

    public static final /* synthetic */ class onExtraCallback {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int[] iArr = new int[fromArray.values().length];
            try {
                iArr[fromArray.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fromArray.DAY_OF_WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fromArray.DAILY.ordinal()] = 3;
                int i = onNavigationEvent + 125;
                onWarmupCompleted = i % 128;
                if (i % 2 != 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[fromArray.ONE_TIME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[fromArray.DELAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[fromArray.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PeriodicTransferPicker.IAuthTabCallback.values().length];
            try {
                iArr2[PeriodicTransferPicker.IAuthTabCallback.MONTHLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[PeriodicTransferPicker.IAuthTabCallback.WEEKLY.ordinal()] = 2;
                int i3 = onNavigationEvent + 23;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[PeriodicTransferPicker.IAuthTabCallback.ONE_TIME.ordinal()] = 3;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[PeriodicTransferPicker.IAuthTabCallback.DAILY.ordinal()] = 4;
                int i7 = onNavigationEvent + 43;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 2 % 2;
                }
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final class onWarmupCompleted implements Parcelable.Creator<PeriodicTransferModel> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ PeriodicTransferModel createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 115;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            PeriodicTransferModel periodicTransferModelOnNavigationEvent = onNavigationEvent(parcel);
            int i4 = onWarmupCompleted + 27;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return periodicTransferModelOnNavigationEvent;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ PeriodicTransferModel[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 99;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            PeriodicTransferModel[] periodicTransferModelArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            if (i4 != 0) {
                int i5 = 70 / 0;
            }
            return periodicTransferModelArrOnExtraCallbackWithResult;
        }

        public final PeriodicTransferModel[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 65;
            onWarmupCompleted = i3 % 128;
            PeriodicTransferModel[] periodicTransferModelArr = new PeriodicTransferModel[i];
            if (i3 % 2 == 0) {
                return periodicTransferModelArr;
            }
            throw null;
        }

        public final PeriodicTransferModel onNavigationEvent(Parcel parcel) {
            fromBundle frombundle;
            fromArray fromarrayValueOf;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i2 = parcel.readInt();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i3 = IAuthTabCallback + 73;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                frombundle = null;
            } else {
                fromBundle frombundleValueOf = fromBundle.valueOf(parcel.readString());
                int i5 = IAuthTabCallback + 27;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                frombundle = frombundleValueOf;
            }
            int i7 = parcel.readInt();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            long j = parcel.readLong();
            if (parcel.readInt() == 0) {
                int i8 = onWarmupCompleted + 97;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                fromarrayValueOf = null;
            } else {
                fromarrayValueOf = fromArray.valueOf(parcel.readString());
            }
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i9 = onWarmupCompleted + 75;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                z = true;
            } else {
                z = false;
            }
            String string15 = parcel.readString();
            int i11 = parcel.readInt();
            if (parcel.readInt() != 0) {
                int i12 = onWarmupCompleted + 11;
                z2 = z;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
                z3 = true;
            } else {
                z2 = z;
                z3 = false;
            }
            boolean z6 = parcel.readInt() != 0;
            String string16 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i14 = IAuthTabCallback + 35;
                z4 = z3;
                onWarmupCompleted = i14 % 128;
                int i15 = i14 % 2;
                z5 = true;
            } else {
                z4 = z3;
                z5 = false;
            }
            return new PeriodicTransferModel(string, string2, string3, string4, string5, i2, string6, frombundle, i7, string7, string8, string9, string10, string11, string12, j, fromarrayValueOf, string13, string14, z2, string15, i11, z4, z6, string16, z5, parcel.readString(), parcel.readInt() == 0 ? null : InvalidFields.CREATOR.createFromParcel(parcel));
        }
    }

    public PeriodicTransferModel() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (fromBundle) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0L, (fromArray) null, (String) null, (String) null, false, (String) null, 0, false, false, (String) null, false, (String) null, (InvalidFields) null, 268435455, (DefaultConstructorMarker) null);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerICustomTabsService = ICustomTabsService();
        if (i3 == 0) {
            int i4 = 89 / 0;
        }
        return kSerializerICustomTabsService;
    }

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIsEngagementSignalsApiAvailable = isEngagementSignalsApiAvailable();
        if (i3 != 0) {
            int i4 = 43 / 0;
        }
        return kSerializerIsEngagementSignalsApiAvailable;
    }

    private static final /* synthetic */ KSerializer ICustomTabsService() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.periodic.DueDateType", fromArray.values());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.periodic.DueDateType", fromArray.values());
        int i3 = onWarmupCompleted + 27;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }

    private static final /* synthetic */ KSerializer isEngagementSignalsApiAvailable() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.periodic.DepositType", fromBundle.values());
        int i4 = onWarmupCompleted + 89;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 88 / 0;
        }
        return kSerializerOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i3;
        int i9 = ~(i7 | i8);
        int i10 = i2 | i9;
        int i11 = (~(i7 | i2)) | i9 | (~(i8 | i2));
        int i12 = ~((~i2) | i5 | i3);
        int i13 = i5 + i3 + i4 + ((-2027816600) * i6) + ((-1234684791) * i);
        int i14 = i13 * i13;
        int i15 = (i5 * (-132237830)) + 1711013888 + ((-132237830) * i3) + (i10 * 228444679) + (228444679 * i11) + ((-228444679) * i12) + (96206848 * i4) + (811597824 * i6) + (1100742656 * i) + (1751056384 * i14);
        int i16 = ((i5 * 572746074) - 905264446) + (i3 * 572746074) + (i10 * (-489)) + (i11 * (-489)) + (i12 * 489) + (i4 * 572745585) + (i6 * 982511336) + (i * (-774025351)) + (i14 * 1257177088);
        switch (i15 + (i16 * i16 * 1874919424)) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return onNavigationEvent(objArr);
            case 6:
                PeriodicTransferModel periodicTransferModel = (PeriodicTransferModel) objArr[0];
                int i17 = 2 % 2;
                int i18 = onWarmupCompleted + 57;
                int i19 = i18 % 128;
                IAuthTabCallback = i19;
                int i20 = i18 % 2;
                String str = periodicTransferModel.type;
                int i21 = i19 + 49;
                onWarmupCompleted = i21 % 128;
                int i22 = i21 % 2;
                return str;
            default:
                PeriodicTransferModel periodicTransferModel2 = (PeriodicTransferModel) objArr[0];
                int i23 = 2 % 2;
                int i24 = IAuthTabCallback + 17;
                int i25 = i24 % 128;
                onWarmupCompleted = i25;
                int i26 = i24 % 2;
                fromBundle frombundle = periodicTransferModel2.depositType;
                int i27 = i25 + 69;
                IAuthTabCallback = i27 % 128;
                int i28 = i27 % 2;
                return frombundle;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        PeriodicTransferModel periodicTransferModel = (PeriodicTransferModel) objArr[0];
        Parcel parcel = (Parcel) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(periodicTransferModel.uniqueId);
        parcel.writeString(periodicTransferModel.type);
        parcel.writeString(periodicTransferModel.title);
        parcel.writeString(periodicTransferModel.description);
        parcel.writeString(periodicTransferModel.descriptionTdsColor);
        parcel.writeInt(periodicTransferModel.withdrawBankCode);
        parcel.writeString(periodicTransferModel.withdrawAccountNo);
        fromBundle frombundle = periodicTransferModel.depositType;
        if (frombundle == null) {
            int i2 = onWarmupCompleted + 123;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(0);
            }
        } else {
            parcel.writeInt(1);
            parcel.writeString(frombundle.name());
            int i3 = onWarmupCompleted + 45;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        parcel.writeInt(periodicTransferModel.depositBankCode);
        parcel.writeString(periodicTransferModel.depositAccountNo);
        parcel.writeString(periodicTransferModel.depositAccountHolderName);
        parcel.writeString(periodicTransferModel.depositName);
        parcel.writeString(periodicTransferModel.depositDisplayName);
        parcel.writeString(periodicTransferModel.depositPhone);
        parcel.writeString(periodicTransferModel.depositDisplayPhone);
        parcel.writeLong(periodicTransferModel.amount);
        fromArray fromarray = periodicTransferModel.dueDateType;
        if (fromarray == null) {
            int i5 = IAuthTabCallback + 121;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(0);
            }
        } else {
            parcel.writeInt(1);
            parcel.writeString(fromarray.name());
        }
        parcel.writeString(periodicTransferModel.userMemo);
        parcel.writeString(periodicTransferModel.transferDueDate);
        parcel.writeInt(periodicTransferModel.isLastDayForDueDate ? 1 : 0);
        parcel.writeString(periodicTransferModel.transferEndDate);
        parcel.writeInt(periodicTransferModel.alarmDays);
        parcel.writeInt(periodicTransferModel.isRepeat ? 1 : 0);
        parcel.writeInt(periodicTransferModel.enableAlarm ? 1 : 0);
        parcel.writeString(periodicTransferModel.status);
        parcel.writeInt(periodicTransferModel.isExpired ? 1 : 0);
        parcel.writeString(periodicTransferModel.transferDueDay);
        InvalidFields invalidFields = periodicTransferModel.invalidFields;
        Object obj = null;
        if (invalidFields == null) {
            parcel.writeInt(0);
            int i6 = IAuthTabCallback + 63;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        parcel.writeInt(1);
        invalidFields.writeToParcel(parcel, iIntValue);
        int i7 = IAuthTabCallback + 109;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 125;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PeriodicTransferModel)) {
            int i2 = IAuthTabCallback + 33;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        PeriodicTransferModel periodicTransferModel = (PeriodicTransferModel) obj;
        if (!Intrinsics.areEqual(this.uniqueId, periodicTransferModel.uniqueId)) {
            int i4 = onWarmupCompleted + 17;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.type, periodicTransferModel.type)) {
            int i6 = IAuthTabCallback + 99;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.title, periodicTransferModel.title) || !Intrinsics.areEqual(this.description, periodicTransferModel.description) || !Intrinsics.areEqual(this.descriptionTdsColor, periodicTransferModel.descriptionTdsColor) || this.withdrawBankCode != periodicTransferModel.withdrawBankCode || !Intrinsics.areEqual(this.withdrawAccountNo, periodicTransferModel.withdrawAccountNo)) {
            return false;
        }
        if (this.depositType != periodicTransferModel.depositType) {
            int i8 = onWarmupCompleted + 33;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (this.depositBankCode != periodicTransferModel.depositBankCode) {
            int i10 = onWarmupCompleted + 83;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.depositAccountNo, periodicTransferModel.depositAccountNo) || (!Intrinsics.areEqual(this.depositAccountHolderName, periodicTransferModel.depositAccountHolderName)) || !Intrinsics.areEqual(this.depositName, periodicTransferModel.depositName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.depositDisplayName, periodicTransferModel.depositDisplayName)) {
            int i12 = IAuthTabCallback + 63;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.depositPhone, periodicTransferModel.depositPhone)) {
            int i14 = IAuthTabCallback + 27;
            onWarmupCompleted = i14 % 128;
            int i15 = i14 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.depositDisplayPhone, periodicTransferModel.depositDisplayPhone)) {
            int i16 = onWarmupCompleted + 93;
            IAuthTabCallback = i16 % 128;
            int i17 = i16 % 2;
            return false;
        }
        if (this.amount != periodicTransferModel.amount || this.dueDateType != periodicTransferModel.dueDateType || !Intrinsics.areEqual(this.userMemo, periodicTransferModel.userMemo) || !Intrinsics.areEqual(this.transferDueDate, periodicTransferModel.transferDueDate)) {
            return false;
        }
        if (this.isLastDayForDueDate != periodicTransferModel.isLastDayForDueDate) {
            int i18 = IAuthTabCallback + 71;
            onWarmupCompleted = i18 % 128;
            int i19 = i18 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.transferEndDate, periodicTransferModel.transferEndDate) || this.alarmDays != periodicTransferModel.alarmDays || this.isRepeat != periodicTransferModel.isRepeat || this.enableAlarm != periodicTransferModel.enableAlarm || !Intrinsics.areEqual(this.status, periodicTransferModel.status) || this.isExpired != periodicTransferModel.isExpired) {
            return false;
        }
        if (Intrinsics.areEqual(this.transferDueDay, periodicTransferModel.transferDueDay)) {
            return !(Intrinsics.areEqual(this.invalidFields, periodicTransferModel.invalidFields) ^ true);
        }
        int i20 = IAuthTabCallback + 99;
        onWarmupCompleted = i20 % 128;
        return i20 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i;
        int i2;
        int i3 = 2 % 2;
        int iHashCode4 = this.uniqueId.hashCode();
        String str = this.type;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        int iHashCode6 = this.title.hashCode();
        String str2 = this.description;
        if (str2 == null) {
            int i4 = onWarmupCompleted + 73;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.descriptionTdsColor;
        if (str3 == null) {
            int i6 = IAuthTabCallback + 101;
            onWarmupCompleted = i6 % 128;
            iHashCode2 = i6 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode2 = str3.hashCode();
        }
        int iHashCode7 = Integer.hashCode(this.withdrawBankCode);
        int iHashCode8 = this.withdrawAccountNo.hashCode();
        fromBundle frombundle = this.depositType;
        if (frombundle == null) {
            int i7 = IAuthTabCallback + 63;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = frombundle.hashCode();
        }
        int iHashCode9 = Integer.hashCode(this.depositBankCode);
        int iHashCode10 = this.depositAccountNo.hashCode();
        int iHashCode11 = this.depositAccountHolderName.hashCode();
        int iHashCode12 = this.depositName.hashCode();
        int iHashCode13 = this.depositDisplayName.hashCode();
        int iHashCode14 = this.depositPhone.hashCode();
        int iHashCode15 = this.depositDisplayPhone.hashCode();
        int iHashCode16 = Long.hashCode(this.amount);
        fromArray fromarray = this.dueDateType;
        if (fromarray == null) {
            i = iHashCode16;
            i2 = 0;
        } else {
            int iHashCode17 = fromarray.hashCode();
            int i9 = IAuthTabCallback + 111;
            i = iHashCode16;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            i2 = iHashCode17;
        }
        int iHashCode18 = this.userMemo.hashCode();
        int iHashCode19 = this.transferDueDate.hashCode();
        int iHashCode20 = Boolean.hashCode(this.isLastDayForDueDate);
        int iHashCode21 = this.transferEndDate.hashCode();
        int iHashCode22 = Integer.hashCode(this.alarmDays);
        int iHashCode23 = Boolean.hashCode(this.isRepeat);
        int iHashCode24 = Boolean.hashCode(this.enableAlarm);
        int iHashCode25 = this.status.hashCode();
        int iHashCode26 = Boolean.hashCode(this.isExpired);
        int iHashCode27 = this.transferDueDay.hashCode();
        InvalidFields invalidFields = this.invalidFields;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode4 * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode3) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + i) * 31) + i2) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + (invalidFields != null ? invalidFields.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PeriodicTransferModel(uniqueId=" + this.uniqueId + ", type=" + this.type + ", title=" + this.title + ", description=" + this.description + ", descriptionTdsColor=" + this.descriptionTdsColor + ", withdrawBankCode=" + this.withdrawBankCode + ", withdrawAccountNo=" + this.withdrawAccountNo + ", depositType=" + this.depositType + ", depositBankCode=" + this.depositBankCode + ", depositAccountNo=" + this.depositAccountNo + ", depositAccountHolderName=" + this.depositAccountHolderName + ", depositName=" + this.depositName + ", depositDisplayName=" + this.depositDisplayName + ", depositPhone=" + this.depositPhone + ", depositDisplayPhone=" + this.depositDisplayPhone + ", amount=" + this.amount + ", dueDateType=" + this.dueDateType + ", userMemo=" + this.userMemo + ", transferDueDate=" + this.transferDueDate + ", isLastDayForDueDate=" + this.isLastDayForDueDate + ", transferEndDate=" + this.transferEndDate + ", alarmDays=" + this.alarmDays + ", isRepeat=" + this.isRepeat + ", enableAlarm=" + this.enableAlarm + ", status=" + this.status + ", isExpired=" + this.isExpired + ", transferDueDay=" + this.transferDueDay + ", invalidFields=" + this.invalidFields + ")";
        int i2 = IAuthTabCallback + 7;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PeriodicTransferModel> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 103;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            PeriodicTransferModel$$serializer periodicTransferModel$$serializer = PeriodicTransferModel$$serializer.INSTANCE;
            if (i3 == 0) {
                return periodicTransferModel$$serializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{null, null, null, null, null, null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 11;
                IAuthTabCallback = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    PeriodicTransferModel.IAuthTabCallback();
                    obj.hashCode();
                    throw null;
                }
                KSerializer kSerializerIAuthTabCallback = PeriodicTransferModel.IAuthTabCallback();
                int i3 = IAuthTabCallback + 123;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    return kSerializerIAuthTabCallback;
                }
                throw null;
            }
        }), null, null, null, null, null, null, null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 35;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
                int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
                int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
                KSerializer kSerializer = (KSerializer) PeriodicTransferModel.onExtraCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, -1077710073, new Object[0], iIAuthTabCallback2, 1077710077, iIAuthTabCallback3);
                int i4 = onExtraCallback + 35;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return kSerializer;
                }
                throw null;
            }
        }), null, null, null, null, null, null, null, null, null, null, null};
        int i = onExtraCallback + 89;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            int i2 = 2 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ PeriodicTransferModel(int r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, int r16, java.lang.String r17, o.fromBundle r18, int r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, long r26, o.fromArray r28, java.lang.String r29, java.lang.String r30, boolean r31, java.lang.String r32, int r33, boolean r34, boolean r35, java.lang.String r36, boolean r37, java.lang.String r38, viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel.InvalidFields r39, o.okycx r40) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, o.fromBundle, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, o.fromArray, java.lang.String, java.lang.String, boolean, java.lang.String, int, boolean, boolean, java.lang.String, boolean, java.lang.String, viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel$InvalidFields, o.okycx):void");
    }

    public PeriodicTransferModel(@NotNull String str, @Nullable String str2, @NotNull String str3, @Nullable String str4, @Nullable String str5, int i, @NotNull String str6, @Nullable fromBundle frombundle, int i2, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, long j, @Nullable fromArray fromarray, @NotNull String str13, @NotNull String str14, boolean z, @NotNull String str15, int i3, boolean z2, boolean z3, @NotNull String str16, boolean z4, @NotNull String str17, @Nullable InvalidFields invalidFields) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        this.uniqueId = str;
        this.type = str2;
        this.title = str3;
        this.description = str4;
        this.descriptionTdsColor = str5;
        this.withdrawBankCode = i;
        this.withdrawAccountNo = str6;
        this.depositType = frombundle;
        this.depositBankCode = i2;
        this.depositAccountNo = str7;
        this.depositAccountHolderName = str8;
        this.depositName = str9;
        this.depositDisplayName = str10;
        this.depositPhone = str11;
        this.depositDisplayPhone = str12;
        this.amount = j;
        this.dueDateType = fromarray;
        this.userMemo = str13;
        this.transferDueDate = str14;
        this.isLastDayForDueDate = z;
        this.transferEndDate = str15;
        this.alarmDays = i3;
        this.isRepeat = z2;
        this.enableAlarm = z3;
        this.status = str16;
        this.isExpired = z4;
        this.transferDueDay = str17;
        this.invalidFields = invalidFields;
    }

    public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 111;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ba  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onWarmupCompleted(viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel r11, o.vyl r12, kotlinx.serialization.descriptors.SerialDescriptor r13) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel.onWarmupCompleted(viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PeriodicTransferModel(String str, String str2, String str3, String str4, String str5, int i, String str6, fromBundle frombundle, int i2, String str7, String str8, String str9, String str10, String str11, String str12, long j, fromArray fromarray, String str13, String str14, boolean z, String str15, int i3, boolean z2, boolean z3, String str16, boolean z4, String str17, InvalidFields invalidFields, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        fromArray fromarray2;
        String str27;
        String str28;
        boolean z5;
        boolean z6;
        String str29;
        boolean z7;
        boolean z8;
        boolean z9;
        String str30;
        InvalidFields invalidFields2;
        if ((i4 & 1) != 0) {
            int i5 = 2 % 2;
            str18 = "";
        } else {
            str18 = str;
        }
        Object obj = null;
        String str31 = (i4 & 2) != 0 ? null : str2;
        if ((i4 & 4) != 0) {
            int i6 = onWarmupCompleted + 117;
            int i7 = i6 % 128;
            IAuthTabCallback = i7;
            if (i6 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i8 = i7 + 51;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 2 % 2;
            }
            str19 = "";
        } else {
            str19 = str3;
        }
        String str32 = (i4 & 8) != 0 ? null : str4;
        if ((i4 & 16) != 0) {
            int i10 = 2 % 2;
            str20 = null;
        } else {
            str20 = str5;
        }
        int i11 = (i4 & 32) != 0 ? -1 : i;
        String str33 = (i4 & 64) != 0 ? "" : str6;
        fromBundle frombundle2 = (i4 & 128) != 0 ? null : frombundle;
        int i12 = (i4 & 256) == 0 ? i2 : -1;
        String str34 = (i4 & 512) != 0 ? "" : str7;
        if ((i4 & 1024) != 0) {
            int i13 = 2 % 2;
            str21 = "";
        } else {
            str21 = str8;
        }
        if ((i4 & 2048) != 0) {
            int i14 = IAuthTabCallback + 107;
            onWarmupCompleted = i14 % 128;
            if (i14 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str22 = "";
        } else {
            str22 = str9;
        }
        String str35 = (i4 & 4096) != 0 ? "" : str10;
        if ((i4 & 8192) != 0) {
            int i15 = 2 % 2;
            str23 = "";
        } else {
            str23 = str11;
        }
        if ((i4 & 16384) != 0) {
            int i16 = IAuthTabCallback + 69;
            str24 = str23;
            onWarmupCompleted = i16 % 128;
            int i17 = i16 % 2;
            str25 = "";
        } else {
            str24 = str23;
            str25 = str12;
        }
        long j2 = (32768 & i4) != 0 ? 0L : j;
        fromArray fromarray3 = (65536 & i4) != 0 ? null : fromarray;
        String str36 = (i4 & 131072) != 0 ? "" : str13;
        if ((i4 & 262144) != 0) {
            fromarray2 = fromarray3;
            int i18 = onWarmupCompleted + 15;
            str26 = str25;
            IAuthTabCallback = i18 % 128;
            if (i18 % 2 != 0) {
                throw null;
            }
            str27 = "";
        } else {
            str26 = str25;
            fromarray2 = fromarray3;
            str27 = str14;
        }
        if ((524288 & i4) != 0) {
            int i19 = onWarmupCompleted + 73;
            str28 = str27;
            IAuthTabCallback = i19 % 128;
            int i20 = i19 % 2;
            z5 = false;
        } else {
            str28 = str27;
            z5 = z;
        }
        String str37 = (1048576 & i4) != 0 ? "" : str15;
        int i21 = (i4 & 2097152) != 0 ? 0 : i3;
        if ((i4 & 4194304) != 0) {
            str29 = str37;
            int i22 = onWarmupCompleted + 107;
            z6 = z5;
            IAuthTabCallback = i22 % 128;
            int i23 = i22 % 2;
            z7 = false;
        } else {
            z6 = z5;
            str29 = str37;
            z7 = z2;
        }
        if ((8388608 & i4) != 0) {
            int i24 = onWarmupCompleted + 121;
            z8 = z7;
            IAuthTabCallback = i24 % 128;
            int i25 = i24 % 2;
            z9 = false;
        } else {
            z8 = z7;
            z9 = z3;
        }
        String str38 = (16777216 & i4) != 0 ? "" : str16;
        boolean z10 = (i4 & 33554432) == 0 ? z4 : false;
        String str39 = (i4 & 67108864) != 0 ? "" : str17;
        if ((i4 & 134217728) != 0) {
            int i26 = IAuthTabCallback + 29;
            str30 = str38;
            onWarmupCompleted = i26 % 128;
            if (i26 % 2 == 0) {
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            invalidFields2 = null;
        } else {
            str30 = str38;
            invalidFields2 = invalidFields;
        }
        this(str18, str31, str19, str32, str20, i11, str33, frombundle2, i12, str34, str21, str22, str35, str24, str26, j2, fromarray2, str36, str28, z6, str29, i21, z8, z9, str30, z10, str39, invalidFields2);
    }

    public final String onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.uniqueId;
        int i5 = i3 + 41;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String writeTypedObject() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.title;
        }
        throw null;
    }

    public final String IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 111;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.description;
        int i5 = i2 + 75;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String access100() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.descriptionTdsColor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = this.withdrawBankCode;
        int i5 = i3 + 93;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final String onRelationshipValidationResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.withdrawAccountNo;
        }
        throw null;
    }

    public final int IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 87;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.depositBankCode;
        int i5 = i2 + 59;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 54 / 0;
        }
        return i4;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.depositAccountNo;
        }
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 3;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.depositAccountHolderName;
        int i5 = i2 + 93;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        PeriodicTransferModel periodicTransferModel = (PeriodicTransferModel) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = periodicTransferModel.depositName;
        if (i3 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void IAuthTabCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.depositDisplayName = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.depositDisplayName = str;
        int i3 = onWarmupCompleted + 41;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.depositDisplayName;
        }
        throw null;
    }

    public final String IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 119;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.depositPhone;
        int i4 = i2 + 107;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.depositDisplayPhone;
        int i5 = i3 + 71;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.depositDisplayPhone = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.depositDisplayPhone = str;
            int i3 = 44 / 0;
        }
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        long j = this.amount;
        int i5 = i3 + 1;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final fromArray readTypedObject() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 11;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        fromArray fromarray = this.dueDateType;
        int i4 = i2 + 23;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return fromarray;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        PeriodicTransferModel periodicTransferModel = (PeriodicTransferModel) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = periodicTransferModel.userMemo;
        if (i3 != 0) {
            int i4 = 97 / 0;
        }
        return str;
    }

    public final String extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.transferDueDate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onActivityResized() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.transferEndDate;
        }
        throw null;
    }

    public final boolean extraCommand() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        boolean z = this.isRepeat;
        int i5 = i3 + 31;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        PeriodicTransferModel periodicTransferModel = (PeriodicTransferModel) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        boolean z = periodicTransferModel.enableAlarm;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 119;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return Boolean.valueOf(z);
    }

    public final boolean onUnminimized() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 61;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.isExpired;
        int i5 = i2 + 43;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 26 / 0;
        }
        return z;
    }

    public final String onActivityLayout() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.transferDueDay;
        }
        throw null;
    }

    public final InvalidFields extraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 99;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        InvalidFields invalidFields = this.invalidFields;
        int i5 = i2 + 117;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return invalidFields;
    }

    public final boolean ICustomTabsCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zAreEqual = Intrinsics.areEqual(this.status, "ENABLE");
        int i4 = IAuthTabCallback + 79;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return zAreEqual;
    }

    public final boolean ICustomTabsCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            fromArray fromarray = fromArray.DELAY;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.dueDateType == fromArray.DELAY) {
            return true;
        }
        int i3 = onWarmupCompleted + 9;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String access000() throws kotlin.NoWhenBranchMatchedException {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel.IAuthTabCallback
            int r2 = r1 + 37
            int r3 = r2 % 128
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel.onWarmupCompleted = r3
            int r2 = r2 % r0
            o.fromArray r2 = r5.dueDateType
            if (r2 != 0) goto L19
            int r1 = r1 + 77
            int r2 = r1 % 128
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel.onWarmupCompleted = r2
            int r1 = r1 % r0
            r1 = -1
            goto L21
        L19:
            int[] r1 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel.onExtraCallback.$EnumSwitchMapping$0
            int r2 = r2.ordinal()
            r1 = r1[r2]
        L21:
            switch(r1) {
                case -1: goto L3f;
                case 0: goto L24;
                case 1: goto L33;
                case 2: goto L30;
                case 3: goto L2d;
                case 4: goto L2a;
                case 5: goto L3f;
                case 6: goto L3f;
                default: goto L24;
            }
        L24:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L2a:
            viva.republica.toss.send.periodic.view.PeriodicTransferPicker$IAuthTabCallback r1 = viva.republica.toss.send.periodic.view.PeriodicTransferPicker.IAuthTabCallback.ONE_TIME
            goto L41
        L2d:
            viva.republica.toss.send.periodic.view.PeriodicTransferPicker$IAuthTabCallback r1 = viva.republica.toss.send.periodic.view.PeriodicTransferPicker.IAuthTabCallback.DAILY
            goto L41
        L30:
            viva.republica.toss.send.periodic.view.PeriodicTransferPicker$IAuthTabCallback r1 = viva.republica.toss.send.periodic.view.PeriodicTransferPicker.IAuthTabCallback.WEEKLY
            goto L41
        L33:
            viva.republica.toss.send.periodic.view.PeriodicTransferPicker$IAuthTabCallback r1 = viva.republica.toss.send.periodic.view.PeriodicTransferPicker.IAuthTabCallback.MONTHLY
            int r2 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel.IAuthTabCallback
            int r2 = r2 + 51
            int r3 = r2 % 128
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel.onWarmupCompleted = r3
            int r2 = r2 % r0
            goto L41
        L3f:
            viva.republica.toss.send.periodic.view.PeriodicTransferPicker$IAuthTabCallback r1 = viva.republica.toss.send.periodic.view.PeriodicTransferPicker.IAuthTabCallback.ONE_TIME
        L41:
            int[] r2 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel.onExtraCallback.$EnumSwitchMapping$1
            int r3 = r1.ordinal()
            r2 = r2[r3]
            r3 = 1
            if (r2 == r3) goto L75
            int r3 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel.onWarmupCompleted
            int r3 = r3 + 31
            int r4 = r3 % 128
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel.IAuthTabCallback = r4
            int r3 = r3 % r0
            if (r2 == r0) goto L75
            r3 = 3
            if (r2 == r3) goto L72
            int r4 = r4 + 49
            int r3 = r4 % 128
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel.onWarmupCompleted = r3
            int r4 = r4 % r0
            r0 = 4
            if (r4 != 0) goto L67
            if (r2 != r0) goto L6c
            goto L69
        L67:
            if (r2 != r0) goto L6c
        L69:
            java.lang.String r0 = ""
            goto L77
        L6c:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L72:
            java.lang.String r0 = r5.transferDueDate
            goto L77
        L75:
            java.lang.String r0 = r5.transferDueDay
        L77:
            viva.republica.toss.send.periodic.view.PeriodicTransferPicker$onExtraCallback r2 = viva.republica.toss.send.periodic.view.PeriodicTransferPicker.Companion
            java.lang.String r0 = r2.onWarmupCompleted(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel.access000():java.lang.String");
    }

    public final boolean onWarmupCompleted(@NotNull KeyBoardVisiblePoint keyBoardVisiblePoint) {
        onDisclaimerClick ondisclaimerclickOnWarmupCompleted;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(keyBoardVisiblePoint, "");
        if (this.withdrawBankCode == Integer.parseInt(checkNavigationBarByWindowManagerService.TOSS.getCode())) {
            int i2 = IAuthTabCallback + 47;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            ondisclaimerclickOnWarmupCompleted = DERConstructedSet.IAuthTabCallback(this.withdrawAccountNo);
        } else {
            ondisclaimerclickOnWarmupCompleted = DERConstructedSet.onNavigationEvent.onWarmupCompleted(String.valueOf(this.withdrawBankCode), this.withdrawAccountNo);
        }
        boolean zAreEqual = Intrinsics.areEqual(ondisclaimerclickOnWarmupCompleted, keyBoardVisiblePoint);
        int i4 = onWarmupCompleted + 123;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return zAreEqual;
        }
        throw null;
    }

    @liq
    public static final class InvalidFields implements Parcelable {
        public static final int $stable = 0;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final Field amount;
        private final String commonMessage;
        private final Field date;
        private final Field depositAccount;
        private final Field withdrawAccount;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<InvalidFields> CREATOR = new onExtraCallbackWithResult();

        public static final class onExtraCallbackWithResult implements Parcelable.Creator<InvalidFields> {
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final InvalidFields IAuthTabCallback(Parcel parcel) {
                Field fieldCreateFromParcel;
                Field fieldCreateFromParcel2;
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                Field fieldCreateFromParcel3 = null;
                if (parcel.readInt() == 0) {
                    fieldCreateFromParcel = null;
                } else {
                    fieldCreateFromParcel = Field.CREATOR.createFromParcel(parcel);
                    int i2 = IAuthTabCallback + 91;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                }
                Field field = fieldCreateFromParcel;
                if (parcel.readInt() == 0) {
                    int i4 = onNavigationEvent + 25;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        throw null;
                    }
                    fieldCreateFromParcel2 = null;
                } else {
                    fieldCreateFromParcel2 = Field.CREATOR.createFromParcel(parcel);
                }
                Field field2 = fieldCreateFromParcel2;
                Field fieldCreateFromParcel4 = parcel.readInt() == 0 ? null : Field.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    fieldCreateFromParcel3 = Field.CREATOR.createFromParcel(parcel);
                    int i5 = onNavigationEvent + 61;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                }
                return new InvalidFields(field, field2, fieldCreateFromParcel4, fieldCreateFromParcel3, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ InvalidFields createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 25;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                InvalidFields invalidFieldsIAuthTabCallback = IAuthTabCallback(parcel);
                int i4 = onNavigationEvent + 17;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return invalidFieldsIAuthTabCallback;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ InvalidFields[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 71;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                InvalidFields[] invalidFieldsArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
                if (i4 == 0) {
                    int i5 = 70 / 0;
                }
                return invalidFieldsArrOnExtraCallbackWithResult;
            }

            public final InvalidFields[] onExtraCallbackWithResult(int i) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent;
                int i4 = i3 + 71;
                IAuthTabCallback = i4 % 128;
                InvalidFields[] invalidFieldsArr = new InvalidFields[i];
                if (i4 % 2 == 0) {
                    int i5 = 72 / 0;
                }
                int i6 = i3 + 79;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                return invalidFieldsArr;
            }
        }

        static {
            int i = onExtraCallbackWithResult + 55;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        public InvalidFields() {
            this((Field) null, (Field) null, (Field) null, (Field) null, (String) null, 31, (DefaultConstructorMarker) null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 121;
            onWarmupCompleted = i2 % 128;
            return i2 % 2 != 0 ? 1 : 0;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InvalidFields)) {
                int i2 = onNavigationEvent + 27;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 10 / 0;
                }
                return false;
            }
            InvalidFields invalidFields = (InvalidFields) obj;
            if (!Intrinsics.areEqual(this.depositAccount, invalidFields.depositAccount)) {
                int i4 = onNavigationEvent + 121;
                onWarmupCompleted = i4 % 128;
                return i4 % 2 != 0;
            }
            if (Intrinsics.areEqual(this.withdrawAccount, invalidFields.withdrawAccount)) {
                return !(Intrinsics.areEqual(this.amount, invalidFields.amount) ^ true) && Intrinsics.areEqual(this.date, invalidFields.date) && Intrinsics.areEqual(this.commonMessage, invalidFields.commonMessage);
            }
            int i5 = onWarmupCompleted + 53;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 9;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Field field = this.depositAccount;
            int iHashCode2 = field == null ? 0 : field.hashCode();
            Field field2 = this.withdrawAccount;
            if (field2 == null) {
                int i4 = onNavigationEvent + 97;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                iHashCode = 0;
            } else {
                iHashCode = field2.hashCode();
                int i6 = onWarmupCompleted + 109;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
            }
            Field field3 = this.amount;
            int iHashCode3 = field3 == null ? 0 : field3.hashCode();
            Field field4 = this.date;
            int iHashCode4 = field4 == null ? 0 : field4.hashCode();
            String str = this.commonMessage;
            int iHashCode5 = (((((((iHashCode2 * 31) + iHashCode) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str != null ? str.hashCode() : 0);
            int i8 = onNavigationEvent + 11;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 == 0) {
                return iHashCode5;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "InvalidFields(depositAccount=" + this.depositAccount + ", withdrawAccount=" + this.withdrawAccount + ", amount=" + this.amount + ", date=" + this.date + ", commonMessage=" + this.commonMessage + ")";
            int i2 = onNavigationEvent + 83;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            Field field = this.depositAccount;
            if (field == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                field.writeToParcel(parcel, i);
            }
            Field field2 = this.withdrawAccount;
            if (field2 == null) {
                int i3 = onWarmupCompleted + 19;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                field2.writeToParcel(parcel, i);
            }
            Field field3 = this.amount;
            if (field3 == null) {
                int i5 = onNavigationEvent + 95;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    parcel.writeInt(1);
                } else {
                    parcel.writeInt(0);
                }
            } else {
                parcel.writeInt(1);
                field3.writeToParcel(parcel, i);
            }
            Field field4 = this.date;
            if (field4 == null) {
                int i6 = onWarmupCompleted + 51;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    parcel.writeInt(1);
                } else {
                    parcel.writeInt(0);
                }
            } else {
                parcel.writeInt(1);
                field4.writeToParcel(parcel, i);
                int i7 = onNavigationEvent + 27;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
            }
            parcel.writeString(this.commonMessage);
        }

        public static final class Companion {
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<InvalidFields> serializer() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 125;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                PeriodicTransferModel$InvalidFields$$serializer periodicTransferModel$InvalidFields$$serializer = PeriodicTransferModel$InvalidFields$$serializer.INSTANCE;
                int i4 = onExtraCallbackWithResult + 35;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return periodicTransferModel$InvalidFields$$serializer;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public /* synthetic */ InvalidFields(int i, Field field, Field field2, Field field3, Field field4, String str, okycx okycxVar) {
            Object obj = null;
            if ((i & 1) == 0) {
                this.depositAccount = null;
            } else {
                this.depositAccount = field;
                int i2 = 2 % 2;
            }
            if ((i & 2) == 0) {
                this.withdrawAccount = null;
            } else {
                this.withdrawAccount = field2;
                int i3 = onNavigationEvent + 75;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 2 % 2;
                }
            }
            if ((i & 4) == 0) {
                this.amount = null;
            } else {
                this.amount = field3;
            }
            if ((i & 8) == 0) {
                int i5 = onWarmupCompleted + 57;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                this.date = null;
            } else {
                this.date = field4;
            }
            if ((i & 16) == 0) {
                int i7 = onNavigationEvent + 67;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                this.commonMessage = null;
                if (i8 != 0) {
                    throw null;
                }
                return;
            }
            this.commonMessage = str;
            int i9 = onNavigationEvent + 77;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        public InvalidFields(@Nullable Field field, @Nullable Field field2, @Nullable Field field3, @Nullable Field field4, @Nullable String str) {
            this.depositAccount = field;
            this.withdrawAccount = field2;
            this.amount = field3;
            this.date = field4;
            this.commonMessage = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void onNavigationEvent(viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel.InvalidFields r4, o.vyl r5, kotlinx.serialization.descriptors.SerialDescriptor r6) {
            /*
                r0 = 2
                int r1 = r0 % r0
                r1 = 0
                boolean r2 = r5.onWarmupCompleted(r6, r1)
                if (r2 != 0) goto Le
                viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel$InvalidFields$Field r2 = r4.depositAccount
                if (r2 == 0) goto L15
            Le:
                viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel$InvalidFields$Field$$serializer r2 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel$InvalidFields$Field$$serializer.INSTANCE
                viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel$InvalidFields$Field r3 = r4.depositAccount
                r5.onExtraCallbackWithResult(r6, r1, r2, r3)
            L15:
                r1 = 1
                boolean r2 = r5.onWarmupCompleted(r6, r1)
                if (r2 == r1) goto L29
                int r2 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel.InvalidFields.onNavigationEvent
                int r2 = r2 + 51
                int r3 = r2 % 128
                viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel.InvalidFields.onWarmupCompleted = r3
                int r2 = r2 % r0
                viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel$InvalidFields$Field r2 = r4.withdrawAccount
                if (r2 == 0) goto L30
            L29:
                viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel$InvalidFields$Field$$serializer r2 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel$InvalidFields$Field$$serializer.INSTANCE
                viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel$InvalidFields$Field r3 = r4.withdrawAccount
                r5.onExtraCallbackWithResult(r6, r1, r2, r3)
            L30:
                boolean r2 = r5.onWarmupCompleted(r6, r0)
                if (r2 != 0) goto L4d
                int r2 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel.InvalidFields.onWarmupCompleted
                int r2 = r2 + 97
                int r3 = r2 % 128
                viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel.InvalidFields.onNavigationEvent = r3
                int r2 = r2 % r0
                if (r2 == 0) goto L46
                viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel$InvalidFields$Field r2 = r4.amount
                if (r2 == 0) goto L54
                goto L4d
            L46:
                viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel$InvalidFields$Field r4 = r4.amount
                r4 = 0
                r4.hashCode()
                throw r4
            L4d:
                viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel$InvalidFields$Field$$serializer r2 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel$InvalidFields$Field$$serializer.INSTANCE
                viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel$InvalidFields$Field r3 = r4.amount
                r5.onExtraCallbackWithResult(r6, r0, r2, r3)
            L54:
                r0 = 3
                boolean r2 = r5.onWarmupCompleted(r6, r0)
                r2 = r2 ^ r1
                if (r2 == r1) goto L5d
                goto L61
            L5d:
                viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel$InvalidFields$Field r2 = r4.date
                if (r2 == 0) goto L68
            L61:
                viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel$InvalidFields$Field$$serializer r2 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel$InvalidFields$Field$$serializer.INSTANCE
                viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel$InvalidFields$Field r3 = r4.date
                r5.onExtraCallbackWithResult(r6, r0, r2, r3)
            L68:
                r0 = 4
                boolean r2 = r5.onWarmupCompleted(r6, r0)
                r2 = r2 ^ r1
                if (r2 == r1) goto L71
                goto L75
            L71:
                java.lang.String r1 = r4.commonMessage
                if (r1 == 0) goto L7c
            L75:
                o.getWriggleLayout r1 = o.getWriggleLayout.onNavigationEvent
                java.lang.String r4 = r4.commonMessage
                r5.onExtraCallbackWithResult(r6, r0, r1, r4)
            L7c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel.InvalidFields.onNavigationEvent(viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel$InvalidFields, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ InvalidFields(Field field, Field field2, Field field3, Field field4, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            Field field5;
            String str2;
            Field field6 = (i & 1) != 0 ? null : field;
            Field field7 = (i & 2) != 0 ? null : field2;
            if ((i & 4) != 0) {
                int i2 = 2 % 2;
                field5 = null;
            } else {
                field5 = field3;
            }
            Field field8 = (i & 8) != 0 ? null : field4;
            if ((i & 16) != 0) {
                int i3 = onWarmupCompleted;
                int i4 = i3 + 15;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 113;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 2 % 2;
                }
                str2 = null;
            } else {
                str2 = str;
            }
            this(field6, field7, field5, field8, str2);
        }

        public final Field onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 21;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            Field field = this.depositAccount;
            int i5 = i3 + 77;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return field;
            }
            throw null;
        }

        public final Field onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Field field = this.withdrawAccount;
            int i4 = i3 + 97;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return field;
        }

        public final Field onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 27;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return this.amount;
            }
            throw null;
        }

        public final Field onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 69;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            Field field = this.date;
            int i4 = i2 + 119;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 62 / 0;
            }
            return field;
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 113;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            String str = this.commonMessage;
            int i5 = i2 + 73;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        @liq
        public static final class Field implements Parcelable {
            public static final int $stable = 0;
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;
            private final String message;
            public static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<Field> CREATOR = new onExtraCallback();

            public static final class onExtraCallback implements Parcelable.Creator<Field> {
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ Field createFromParcel(Parcel parcel) {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 79;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 == 0) {
                        onExtraCallback(parcel);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    Field fieldOnExtraCallback = onExtraCallback(parcel);
                    int i3 = onExtraCallback + 19;
                    IAuthTabCallback = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 17 / 0;
                    }
                    return fieldOnExtraCallback;
                }

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ Field[] newArray(int i) {
                    int i2 = 2 % 2;
                    int i3 = IAuthTabCallback + 9;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    Field[] fieldArrOnWarmupCompleted = onWarmupCompleted(i);
                    int i5 = onExtraCallback + 117;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 97 / 0;
                    }
                    return fieldArrOnWarmupCompleted;
                }

                public final Field onExtraCallback(Parcel parcel) {
                    int i = 2 % 2;
                    Intrinsics.checkNotNullParameter(parcel, "");
                    Field field = new Field(parcel.readString());
                    int i2 = onExtraCallback + 99;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return field;
                }

                public final Field[] onWarmupCompleted(int i) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback;
                    int i4 = i3 + 1;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    Field[] fieldArr = new Field[i];
                    int i6 = i3 + 25;
                    IAuthTabCallback = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 37 / 0;
                    }
                    return fieldArr;
                }
            }

            static {
                int i = onWarmupCompleted + 95;
                onExtraCallback = i % 128;
                int i2 = i % 2;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public Field() {
                String str = null;
                this(str, 1, (DefaultConstructorMarker) str);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 67;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2 != 0 ? 1 : 0;
                int i5 = i3 + 1;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return i4;
                }
                throw null;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = onExtraCallbackWithResult + 121;
                    IAuthTabCallback = i2 % 128;
                    return i2 % 2 != 0;
                }
                if (!(obj instanceof Field)) {
                    int i3 = onExtraCallbackWithResult + 111;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    return false;
                }
                if (Intrinsics.areEqual(this.message, ((Field) obj).message)) {
                    return true;
                }
                int i5 = onExtraCallbackWithResult + 103;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 37;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = this.message.hashCode();
                int i4 = onExtraCallbackWithResult + 43;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 17 / 0;
                }
                return iHashCode;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Field(message=" + this.message + ")";
                int i2 = IAuthTabCallback + 29;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 89;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.message);
                int i5 = IAuthTabCallback + 69;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            }

            public static final class Companion {
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Field> serializer() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 125;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    PeriodicTransferModel$InvalidFields$Field$$serializer periodicTransferModel$InvalidFields$Field$$serializer = PeriodicTransferModel$InvalidFields$Field$$serializer.INSTANCE;
                    int i4 = onNavigationEvent + 65;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return periodicTransferModel$InvalidFields$Field$$serializer;
                }
            }

            public /* synthetic */ Field(int i, String str, okycx okycxVar) {
                if ((i & 1) == 0) {
                    this.message = "";
                    int i2 = onExtraCallbackWithResult + 111;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return;
                }
                this.message = str;
                int i4 = IAuthTabCallback + 57;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public Field(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.message = str;
            }

            @JvmStatic
            public static final /* synthetic */ void onWarmupCompleted(Field field, vyl vylVar, SerialDescriptor serialDescriptor) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 49;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0 ? !vylVar.onWarmupCompleted(serialDescriptor, 0) : !vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                    int i3 = IAuthTabCallback + 79;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 != 0) {
                        Intrinsics.areEqual(field.message, "");
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (Intrinsics.areEqual(field.message, "")) {
                        return;
                    }
                }
                vylVar.onExtraCallback(serialDescriptor, 0, field.message);
                int i4 = IAuthTabCallback + 3;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ Field(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 1) != 0) {
                    int i2 = IAuthTabCallback;
                    int i3 = i2 + 37;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 59 / 0;
                    }
                    int i5 = i2 + 115;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = 2 % 2;
                    str = "";
                }
                this(str);
            }

            public final String IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 5;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                String str = this.message;
                int i4 = i2 + 23;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 22 / 0;
                }
                return str;
            }
        }
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (KSerializer) onExtraCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, -1077710073, new Object[0], iIAuthTabCallback2, 1077710077, iIAuthTabCallback3);
    }

    public final String onTransact() {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (String) onExtraCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, 75691691, new Object[]{this}, iIAuthTabCallback2, -75691690, iIAuthTabCallback3);
    }

    public final fromBundle getInterfaceDescriptor() {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (fromBundle) onExtraCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, -887908164, new Object[]{this}, iIAuthTabCallback2, 887908164, iIAuthTabCallback3);
    }

    public final boolean ICustomTabsCallback() {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return ((Boolean) onExtraCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, 1773200630, new Object[]{this}, iIAuthTabCallback2, -1773200627, iIAuthTabCallback3)).booleanValue();
    }

    public final String onMinimized() {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (String) onExtraCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, -1294928205, new Object[]{this}, iIAuthTabCallback2, 1294928211, iIAuthTabCallback3);
    }

    public final String onPostMessage() {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (String) onExtraCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, -1179327145, new Object[]{this}, iIAuthTabCallback2, 1179327150, iIAuthTabCallback3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Object[] objArr = {this, parcel, Integer.valueOf(i)};
        onExtraCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 656970908, objArr, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -656970906, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
    }
}
