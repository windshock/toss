package im.toss.ads_sdk.model;

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
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class MediationPriority implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MediationPriority[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Parcelable.Creator<MediationPriority> CREATOR;
    public static final Companion Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public static final MediationPriority TOSS = new MediationPriority("TOSS", 0);
    public static final MediationPriority ADMOB = new MediationPriority("ADMOB", 1);

    public static /* synthetic */ KSerializer $r8$lambda$ix0GsnrJZ0PgIqVSQIwVSs3mGDs() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializer_init_$_anonymous_ = _init_$_anonymous_();
        int i4 = onExtraCallback + 101;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializer_init_$_anonymous_;
    }

    private static final /* synthetic */ MediationPriority[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        MediationPriority mediationPriority = TOSS;
        if (i3 == 0) {
            return new MediationPriority[]{mediationPriority, ADMOB};
        }
        MediationPriority mediationPriority2 = ADMOB;
        MediationPriority[] mediationPriorityArr = new MediationPriority[4];
        mediationPriorityArr[1] = mediationPriority;
        mediationPriorityArr[0] = mediationPriority2;
        return mediationPriorityArr;
    }

    public static EnumEntries<MediationPriority> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 75;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<MediationPriority> enumEntries = $ENTRIES;
        int i5 = i2 + 105;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static MediationPriority valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        MediationPriority mediationPriority = (MediationPriority) Enum.valueOf(MediationPriority.class, str);
        int i4 = IAuthTabCallback + 7;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return mediationPriority;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static MediationPriority[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        MediationPriority[] mediationPriorityArr = $VALUES;
        if (i3 != 0) {
            return (MediationPriority[]) mediationPriorityArr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 103;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 81;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 37;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 == 0) {
            parcel.writeString(name());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        parcel.writeString(name());
        int i5 = IAuthTabCallback + 87;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 11;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object value = MediationPriority.access$get$cachedSerializer$delegate$cp().getValue();
            if (i3 != 0) {
                return (KSerializer) value;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final KSerializer<MediationPriority> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 39;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer<MediationPriority> kSerializerOnWarmupCompleted = onWarmupCompleted();
            int i4 = IAuthTabCallback + 123;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnWarmupCompleted;
        }
    }

    private MediationPriority(String str, int i) {
    }

    private static final /* synthetic */ KSerializer _init_$_anonymous_() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.ads_sdk.model.MediationPriority", values());
        int i4 = IAuthTabCallback + 71;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>> lazy = $cachedSerializer$delegate;
        int i5 = i3 + 67;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return lazy;
        }
        throw null;
    }

    static {
        MediationPriority[] mediationPriorityArr$values = $values();
        $VALUES = mediationPriorityArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(mediationPriorityArr$values);
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        CREATOR = new Parcelable.Creator<MediationPriority>() { // from class: im.toss.ads_sdk.model.MediationPriority.IAuthTabCallback
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ MediationPriority createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 1;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                MediationPriority mediationPriorityOnNavigationEvent = onNavigationEvent(parcel);
                int i4 = onNavigationEvent + 107;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return mediationPriorityOnNavigationEvent;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ MediationPriority[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 97;
                IAuthTabCallback = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    onExtraCallback(i);
                    obj.hashCode();
                    throw null;
                }
                MediationPriority[] mediationPriorityArrOnExtraCallback = onExtraCallback(i);
                int i4 = onNavigationEvent + 65;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return mediationPriorityArrOnExtraCallback;
                }
                throw null;
            }

            public final MediationPriority[] onExtraCallback(int i) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 59;
                IAuthTabCallback = i3 % 128;
                MediationPriority[] mediationPriorityArr = new MediationPriority[i];
                if (i3 % 2 != 0) {
                    return mediationPriorityArr;
                }
                throw null;
            }

            public final MediationPriority onNavigationEvent(Parcel parcel) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 65;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                MediationPriority mediationPriorityValueOf = MediationPriority.valueOf(parcel.readString());
                if (i3 != 0) {
                    int i4 = 49 / 0;
                }
                return mediationPriorityValueOf;
            }
        };
        $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.ads_sdk.model.MediationPriority$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 113;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    MediationPriority.$r8$lambda$ix0GsnrJZ0PgIqVSQIwVSs3mGDs();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                KSerializer kSerializer$r8$lambda$ix0GsnrJZ0PgIqVSQIwVSs3mGDs = MediationPriority.$r8$lambda$ix0GsnrJZ0PgIqVSQIwVSs3mGDs();
                int i3 = onWarmupCompleted + 79;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return kSerializer$r8$lambda$ix0GsnrJZ0PgIqVSQIwVSs3mGDs;
            }
        });
        int i = onExtraCallbackWithResult + 79;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }
}
