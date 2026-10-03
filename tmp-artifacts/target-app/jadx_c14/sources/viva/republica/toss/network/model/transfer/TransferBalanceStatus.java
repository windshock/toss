package viva.republica.toss.network.model.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access15300;
import o.liq;
import o.updateRenderInfoForVideo;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TransferBalanceStatus implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransferBalanceStatus[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Parcelable.Creator<TransferBalanceStatus> CREATOR;
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final TransferBalanceStatus INVALID = new TransferBalanceStatus("INVALID", 0);
    public static final TransferBalanceStatus INQUIRY = new TransferBalanceStatus("INQUIRY", 1);
    public static final TransferBalanceStatus REFRESH_FAILED = new TransferBalanceStatus("REFRESH_FAILED", 2);
    public static final TransferBalanceStatus REFRESH = new TransferBalanceStatus("REFRESH", 3);

    /* renamed from: $r8$lambda$g8K7Ls-fv-VAatzHGnCu5EzCyJ8, reason: not valid java name */
    public static /* synthetic */ KSerializer m101$r8$lambda$g8K7LsfvVAatzHGnCu5EzCyJ8() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            _init_$_anonymous_();
            throw null;
        }
        KSerializer kSerializer_init_$_anonymous_ = _init_$_anonymous_();
        int i3 = onNavigationEvent + 107;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializer_init_$_anonymous_;
    }

    private static final /* synthetic */ TransferBalanceStatus[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return new TransferBalanceStatus[]{INVALID, INQUIRY, REFRESH_FAILED, REFRESH};
        }
        TransferBalanceStatus transferBalanceStatus = INVALID;
        TransferBalanceStatus transferBalanceStatus2 = INQUIRY;
        TransferBalanceStatus transferBalanceStatus3 = REFRESH_FAILED;
        TransferBalanceStatus transferBalanceStatus4 = REFRESH;
        TransferBalanceStatus[] transferBalanceStatusArr = new TransferBalanceStatus[4];
        transferBalanceStatusArr[1] = transferBalanceStatus;
        transferBalanceStatusArr[1] = transferBalanceStatus2;
        transferBalanceStatusArr[2] = transferBalanceStatus3;
        transferBalanceStatusArr[2] = transferBalanceStatus4;
        return transferBalanceStatusArr;
    }

    public static EnumEntries<TransferBalanceStatus> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        EnumEntries<TransferBalanceStatus> enumEntries = $ENTRIES;
        int i5 = i3 + 77;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return enumEntries;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static TransferBalanceStatus valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        TransferBalanceStatus transferBalanceStatus = (TransferBalanceStatus) Enum.valueOf(TransferBalanceStatus.class, str);
        int i4 = IAuthTabCallback + 53;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 90 / 0;
        }
        return transferBalanceStatus;
    }

    public static TransferBalanceStatus[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        TransferBalanceStatus[] transferBalanceStatusArr = (TransferBalanceStatus[]) $VALUES.clone();
        int i4 = IAuthTabCallback + 15;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 78 / 0;
        }
        return transferBalanceStatusArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 109;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2 == 0 ? 1 : 0;
        int i5 = i2 + 101;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 117;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 == 0) {
            parcel.writeString(name());
            int i5 = 60 / 0;
        } else {
            parcel.writeString(name());
        }
        int i6 = IAuthTabCallback + 31;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private TransferBalanceStatus(String str, int i) {
    }

    public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return $cachedSerializer$delegate;
        }
        throw null;
    }

    static {
        TransferBalanceStatus[] transferBalanceStatusArr$values = $values();
        $VALUES = transferBalanceStatusArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(transferBalanceStatusArr$values);
        Companion = new Companion(null);
        CREATOR = new Parcelable.Creator<TransferBalanceStatus>() { // from class: viva.republica.toss.network.model.transfer.TransferBalanceStatus.onNavigationEvent
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ TransferBalanceStatus createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 93;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                TransferBalanceStatus transferBalanceStatusOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
                int i4 = onNavigationEvent + 125;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return transferBalanceStatusOnExtraCallbackWithResult;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ TransferBalanceStatus[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 109;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    onExtraCallbackWithResult(i);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                TransferBalanceStatus[] transferBalanceStatusArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
                int i4 = IAuthTabCallback + 23;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return transferBalanceStatusArrOnExtraCallbackWithResult;
            }

            public final TransferBalanceStatus onExtraCallbackWithResult(Parcel parcel) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 43;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                TransferBalanceStatus transferBalanceStatusValueOf = TransferBalanceStatus.valueOf(parcel.readString());
                int i4 = IAuthTabCallback + 43;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return transferBalanceStatusValueOf;
            }

            public final TransferBalanceStatus[] onExtraCallbackWithResult(int i) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback;
                int i4 = i3 + 85;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                TransferBalanceStatus[] transferBalanceStatusArr = new TransferBalanceStatus[i];
                int i6 = i3 + 49;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                return transferBalanceStatusArr;
            }
        };
        $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.TransferBalanceStatus$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 47;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerM101$r8$lambda$g8K7LsfvVAatzHGnCu5EzCyJ8 = TransferBalanceStatus.m101$r8$lambda$g8K7LsfvVAatzHGnCu5EzCyJ8();
                int i4 = onNavigationEvent + 99;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return kSerializerM101$r8$lambda$g8K7LsfvVAatzHGnCu5EzCyJ8;
                }
                throw null;
            }
        });
        int i = onExtraCallback + 93;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 91;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializer = (KSerializer) TransferBalanceStatus.access$get$cachedSerializer$delegate$cp().getValue();
            int i4 = IAuthTabCallback + 59;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return kSerializer;
            }
            throw null;
        }

        public final KSerializer<TransferBalanceStatus> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 125;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            KSerializer<TransferBalanceStatus> kSerializerOnExtraCallback = onExtraCallback();
            int i4 = onExtraCallbackWithResult + 53;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnExtraCallback;
        }
    }

    private static final /* synthetic */ KSerializer _init_$_anonymous_() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.TransferBalanceStatus", values());
        int i4 = onNavigationEvent + 85;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }
}
