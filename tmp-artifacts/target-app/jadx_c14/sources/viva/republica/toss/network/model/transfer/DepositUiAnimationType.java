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
public final class DepositUiAnimationType implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DepositUiAnimationType[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Parcelable.Creator<DepositUiAnimationType> CREATOR;
    public static final Companion Companion;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    public static final DepositUiAnimationType SLIDE_LINE = new DepositUiAnimationType("SLIDE_LINE", 0);
    public static final DepositUiAnimationType FADE_LINE = new DepositUiAnimationType("FADE_LINE", 1);

    /* renamed from: $r8$lambda$-cqCkAon_rcI6_aul2Kiu6zKzIE, reason: not valid java name */
    public static /* synthetic */ KSerializer m84$r8$lambda$cqCkAon_rcI6_aul2Kiu6zKzIE() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializer_init_$_anonymous_ = _init_$_anonymous_();
        int i4 = onNavigationEvent + 55;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializer_init_$_anonymous_;
        }
        throw null;
    }

    private static final /* synthetic */ DepositUiAnimationType[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        DepositUiAnimationType[] depositUiAnimationTypeArr = {SLIDE_LINE, FADE_LINE};
        int i5 = i3 + 91;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return depositUiAnimationTypeArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<DepositUiAnimationType> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        EnumEntries<DepositUiAnimationType> enumEntries = $ENTRIES;
        int i5 = i3 + 107;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static DepositUiAnimationType valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        DepositUiAnimationType depositUiAnimationType = (DepositUiAnimationType) Enum.valueOf(DepositUiAnimationType.class, str);
        if (i3 == 0) {
            int i4 = 55 / 0;
        }
        return depositUiAnimationType;
    }

    public static DepositUiAnimationType[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        DepositUiAnimationType[] depositUiAnimationTypeArr = (DepositUiAnimationType[]) $VALUES.clone();
        int i3 = onExtraCallbackWithResult + 121;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return depositUiAnimationTypeArr;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 107;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 93;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 9;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        String strName = name();
        if (i4 == 0) {
            parcel.writeString(strName);
        } else {
            parcel.writeString(strName);
            int i5 = 20 / 0;
        }
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 89;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializer = (KSerializer) DepositUiAnimationType.access$get$cachedSerializer$delegate$cp().getValue();
            int i4 = onNavigationEvent + 49;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return kSerializer;
            }
            throw null;
        }

        public final KSerializer<DepositUiAnimationType> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 15;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer<DepositUiAnimationType> kSerializerOnNavigationEvent = onNavigationEvent();
            int i4 = onExtraCallback + 79;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnNavigationEvent;
        }
    }

    private DepositUiAnimationType(String str, int i) {
    }

    private static final /* synthetic */ KSerializer _init_$_anonymous_() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.DepositUiAnimationType", values());
        }
        updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.DepositUiAnimationType", values());
        throw null;
    }

    public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return $cachedSerializer$delegate;
        }
        throw null;
    }

    static {
        DepositUiAnimationType[] depositUiAnimationTypeArr$values = $values();
        $VALUES = depositUiAnimationTypeArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(depositUiAnimationTypeArr$values);
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        CREATOR = new Parcelable.Creator<DepositUiAnimationType>() { // from class: viva.republica.toss.network.model.transfer.DepositUiAnimationType.onExtraCallback
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final DepositUiAnimationType[] IAuthTabCallback(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 21;
                int i4 = i3 % 128;
                IAuthTabCallback = i4;
                int i5 = i3 % 2;
                DepositUiAnimationType[] depositUiAnimationTypeArr = new DepositUiAnimationType[i];
                int i6 = i4 + 77;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                return depositUiAnimationTypeArr;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ DepositUiAnimationType createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 89;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    onExtraCallback(parcel);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                DepositUiAnimationType depositUiAnimationTypeOnExtraCallback = onExtraCallback(parcel);
                int i3 = onExtraCallback + 15;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return depositUiAnimationTypeOnExtraCallback;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ DepositUiAnimationType[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 61;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                DepositUiAnimationType[] depositUiAnimationTypeArrIAuthTabCallback = IAuthTabCallback(i);
                int i5 = onExtraCallback + 51;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return depositUiAnimationTypeArrIAuthTabCallback;
            }

            public final DepositUiAnimationType onExtraCallback(Parcel parcel) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 57;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                DepositUiAnimationType depositUiAnimationTypeValueOf = DepositUiAnimationType.valueOf(parcel.readString());
                if (i3 == 0) {
                    int i4 = 85 / 0;
                }
                int i5 = onExtraCallback + 121;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 1 / 0;
                }
                return depositUiAnimationTypeValueOf;
            }
        };
        $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.DepositUiAnimationType$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 111;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    DepositUiAnimationType.m84$r8$lambda$cqCkAon_rcI6_aul2Kiu6zKzIE();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                KSerializer kSerializerM84$r8$lambda$cqCkAon_rcI6_aul2Kiu6zKzIE = DepositUiAnimationType.m84$r8$lambda$cqCkAon_rcI6_aul2Kiu6zKzIE();
                int i3 = onNavigationEvent + 95;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return kSerializerM84$r8$lambda$cqCkAon_rcI6_aul2Kiu6zKzIE;
            }
        });
        int i = onExtraCallback + 87;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }
}
