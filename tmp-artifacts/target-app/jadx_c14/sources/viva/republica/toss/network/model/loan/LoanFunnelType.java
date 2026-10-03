package viva.republica.toss.network.model.loan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
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
public final class LoanFunnelType implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LoanFunnelType[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Parcelable.Creator<LoanFunnelType> CREATOR;
    public static final Companion Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("MANUAL")
    public static final LoanFunnelType MANUAL = new LoanFunnelType("MANUAL", 0);

    @SerializedName("DOCUMENT_WALLET")
    public static final LoanFunnelType DOCUMENT_WALLET = new LoanFunnelType("DOCUMENT_WALLET", 1);

    @SerializedName("BUSINESS_NTS_SCRAPE")
    public static final LoanFunnelType BUSINESS_NTS_SCRAPE = new LoanFunnelType("BUSINESS_NTS_SCRAPE", 2);

    @SerializedName("HEALTH_INSURANCE_SCRAPE")
    public static final LoanFunnelType HEALTH_INSURANCE_SCRAPE = new LoanFunnelType("HEALTH_INSURANCE_SCRAPE", 3);

    public static /* synthetic */ KSerializer $r8$lambda$97YvS3y3yh3C4Z6Z_qMVUAqgz7c() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializer_init_$_anonymous_ = _init_$_anonymous_();
        int i4 = onWarmupCompleted + 9;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializer_init_$_anonymous_;
        }
        throw null;
    }

    private static final /* synthetic */ LoanFunnelType[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 21;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        LoanFunnelType[] loanFunnelTypeArr = {MANUAL, DOCUMENT_WALLET, BUSINESS_NTS_SCRAPE, HEALTH_INSURANCE_SCRAPE};
        int i5 = i2 + 69;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 26 / 0;
        }
        return loanFunnelTypeArr;
    }

    public static EnumEntries<LoanFunnelType> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 77;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        EnumEntries<LoanFunnelType> enumEntries = $ENTRIES;
        int i4 = i2 + 47;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return enumEntries;
        }
        throw null;
    }

    public static LoanFunnelType valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        LoanFunnelType loanFunnelType = (LoanFunnelType) Enum.valueOf(LoanFunnelType.class, str);
        int i4 = onExtraCallback + 47;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return loanFunnelType;
    }

    public static LoanFunnelType[] values() {
        LoanFunnelType[] loanFunnelTypeArr;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            loanFunnelTypeArr = (LoanFunnelType[]) $VALUES.clone();
            int i3 = 2 / 0;
        } else {
            loanFunnelTypeArr = (LoanFunnelType[]) $VALUES.clone();
        }
        int i4 = onWarmupCompleted + 97;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 73 / 0;
        }
        return loanFunnelTypeArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 57;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
        int i5 = onWarmupCompleted + 105;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 58 / 0;
        }
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 9;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializer = (KSerializer) LoanFunnelType.access$get$cachedSerializer$delegate$cp().getValue();
            if (i3 == 0) {
                return kSerializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final KSerializer<LoanFunnelType> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 11;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer<LoanFunnelType> kSerializerIAuthTabCallback = IAuthTabCallback();
            int i4 = onNavigationEvent + 113;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerIAuthTabCallback;
        }
    }

    private LoanFunnelType(String str, int i) {
    }

    private static final /* synthetic */ KSerializer _init_$_anonymous_() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.loan.LoanFunnelType", values());
        }
        updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.loan.LoanFunnelType", values());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return $cachedSerializer$delegate;
        }
        throw null;
    }

    static {
        LoanFunnelType[] loanFunnelTypeArr$values = $values();
        $VALUES = loanFunnelTypeArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(loanFunnelTypeArr$values);
        Companion = new Companion(null);
        CREATOR = new Parcelable.Creator<LoanFunnelType>() { // from class: viva.republica.toss.network.model.loan.LoanFunnelType.onWarmupCompleted
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ LoanFunnelType createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 55;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                LoanFunnelType loanFunnelTypeOnExtraCallback = onExtraCallback(parcel);
                int i4 = IAuthTabCallback + 41;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 80 / 0;
                }
                return loanFunnelTypeOnExtraCallback;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ LoanFunnelType[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 95;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                LoanFunnelType[] loanFunnelTypeArrOnNavigationEvent = onNavigationEvent(i);
                int i5 = onWarmupCompleted + 3;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return loanFunnelTypeArrOnNavigationEvent;
            }

            public final LoanFunnelType onExtraCallback(Parcel parcel) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 65;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                LoanFunnelType loanFunnelTypeValueOf = LoanFunnelType.valueOf(parcel.readString());
                int i4 = IAuthTabCallback + 35;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 46 / 0;
                }
                return loanFunnelTypeValueOf;
            }

            public final LoanFunnelType[] onNavigationEvent(int i) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback;
                int i4 = i3 + 23;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                LoanFunnelType[] loanFunnelTypeArr = new LoanFunnelType[i];
                int i6 = i3 + 97;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    return loanFunnelTypeArr;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.loan.LoanFunnelType$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 1;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializer$r8$lambda$97YvS3y3yh3C4Z6Z_qMVUAqgz7c = LoanFunnelType.$r8$lambda$97YvS3y3yh3C4Z6Z_qMVUAqgz7c();
                int i4 = IAuthTabCallback + 15;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return kSerializer$r8$lambda$97YvS3y3yh3C4Z6Z_qMVUAqgz7c;
            }
        });
        int i = onNavigationEvent + 5;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }
}
