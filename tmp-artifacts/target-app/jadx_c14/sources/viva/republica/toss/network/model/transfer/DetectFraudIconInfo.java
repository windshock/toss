package viva.republica.toss.network.model.transfer;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access15300;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.DetectFraudIconInfo$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DetectFraudIconInfo {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final onNavigationEvent playOption;
    private final onExtraCallback type;
    private final String url;

    private static final /* synthetic */ KSerializer asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.DetectFraudIconInfo.DetectFraudIconPlayOption", onNavigationEvent.values());
        int i4 = IAuthTabCallback + 9;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
        return kSerializerOnExtraCallbackWithResult;
    }

    private static final /* synthetic */ KSerializer asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.DetectFraudIconInfo.DetectFraudIconType", onExtraCallback.values());
        int i4 = IAuthTabCallback + 55;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerAsBinder = asBinder();
        int i4 = onExtraCallbackWithResult + 17;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
        return kSerializerAsBinder;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            asInterface();
            obj.hashCode();
            throw null;
        }
        KSerializer kSerializerAsInterface = asInterface();
        int i3 = IAuthTabCallback + 91;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializerAsInterface;
        }
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 119;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof DetectFraudIconInfo)) {
            int i3 = onExtraCallbackWithResult + 117;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        DetectFraudIconInfo detectFraudIconInfo = (DetectFraudIconInfo) obj;
        if (this.type != detectFraudIconInfo.type) {
            int i5 = onExtraCallbackWithResult + 123;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (this.playOption != detectFraudIconInfo.playOption) {
            int i7 = IAuthTabCallback + 33;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.url, detectFraudIconInfo.url)) {
            return true;
        }
        int i9 = onExtraCallbackWithResult;
        int i10 = i9 + 17;
        IAuthTabCallback = i10 % 128;
        int i11 = i10 % 2;
        int i12 = i9 + 121;
        IAuthTabCallback = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 22 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onExtraCallbackWithResult = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (((this.type.hashCode() << 110) - this.playOption.hashCode()) << 53) % this.url.hashCode() : (((this.type.hashCode() * 31) + this.playOption.hashCode()) * 31) + this.url.hashCode();
        int i3 = onExtraCallbackWithResult + 57;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 51 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DetectFraudIconInfo(type=" + this.type + ", playOption=" + this.playOption + ", url=" + this.url + ")";
        int i2 = IAuthTabCallback + 21;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
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

        public final KSerializer<DetectFraudIconInfo> serializer() {
            DetectFraudIconInfo$.serializer serializerVar;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 125;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                serializerVar = DetectFraudIconInfo$.serializer.INSTANCE;
                int i3 = 93 / 0;
            } else {
                serializerVar = DetectFraudIconInfo$.serializer.INSTANCE;
            }
            int i4 = onExtraCallback + 35;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.DetectFraudIconInfo$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 119;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnWarmupCompleted = DetectFraudIconInfo.onWarmupCompleted();
                int i4 = IAuthTabCallback + 37;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return kSerializerOnWarmupCompleted;
                }
                throw null;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.DetectFraudIconInfo$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 125;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnExtraCallbackWithResult = DetectFraudIconInfo.onExtraCallbackWithResult();
                int i4 = IAuthTabCallback + 3;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 26 / 0;
                }
                return kSerializerOnExtraCallbackWithResult;
            }
        }), null};
        int i = onWarmupCompleted + 73;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ DetectFraudIconInfo(int i, onExtraCallback onextracallback, onNavigationEvent onnavigationevent, String str, okycx okycxVar) {
        if (7 != (i & 7)) {
            int i2 = IAuthTabCallback + 19;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 7, DetectFraudIconInfo$.serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallbackWithResult + 67;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.type = onextracallback;
        this.playOption = onnavigationevent;
        this.url = str;
    }

    public DetectFraudIconInfo(@NotNull onExtraCallback onextracallback, @NotNull onNavigationEvent onnavigationevent, @NotNull String str) {
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.type = onextracallback;
        this.playOption = onnavigationevent;
        this.url = str;
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 77;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 71;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return lazyArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(DetectFraudIconInfo detectFraudIconInfo, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), detectFraudIconInfo.type);
        vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazyArr[1].getValue(), detectFraudIconInfo.playOption);
        vylVar.onExtraCallback(serialDescriptor, 2, detectFraudIconInfo.url);
        int i4 = IAuthTabCallback + 75;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final onExtraCallback onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        onExtraCallback onextracallback = this.type;
        int i5 = i3 + 83;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return onextracallback;
        }
        throw null;
    }

    public final onNavigationEvent onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        onNavigationEvent onnavigationevent = this.playOption;
        int i5 = i3 + 93;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return onnavigationevent;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.url;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        public static final onExtraCallback WEBP = new onExtraCallback("WEBP", 0);
        public static final onExtraCallback LOTTIE = new onExtraCallback("LOTTIE", 1);
        public static final onExtraCallback PNG = new onExtraCallback("PNG", 2);
        public static final onExtraCallback APNG = new onExtraCallback("APNG", 3);

        private static final /* synthetic */ onExtraCallback[] $values() {
            onExtraCallback[] onextracallbackArr;
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 57;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                onExtraCallback onextracallback = WEBP;
                onExtraCallback onextracallback2 = LOTTIE;
                onExtraCallback onextracallback3 = PNG;
                onExtraCallback onextracallback4 = APNG;
                onextracallbackArr = new onExtraCallback[4];
                onextracallbackArr[0] = onextracallback;
                onextracallbackArr[0] = onextracallback2;
                onextracallbackArr[2] = onextracallback3;
                onextracallbackArr[4] = onextracallback4;
            } else {
                onextracallbackArr = new onExtraCallback[]{WEBP, LOTTIE, PNG, APNG};
            }
            int i4 = i2 + 81;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 43 / 0;
            }
            return onextracallbackArr;
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 99;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            EnumEntries<onExtraCallback> enumEntries = $ENTRIES;
            int i4 = i2 + 109;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return enumEntries;
        }

        public static onExtraCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 93;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            if (i3 != 0) {
                throw null;
            }
            int i4 = onNavigationEvent + 103;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 39 / 0;
            }
            return onextracallback;
        }

        public static onExtraCallback[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 41;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            onExtraCallback[] onextracallbackArr = (onExtraCallback[]) $VALUES.clone();
            int i3 = onNavigationEvent + 5;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return onextracallbackArr;
        }

        private onExtraCallback(String str, int i) {
        }

        static {
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
            int i = IAuthTabCallback + 103;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onNavigationEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;
        public static final onNavigationEvent STATIC = new onNavigationEvent("STATIC", 0);
        public static final onNavigationEvent ONCE = new onNavigationEvent("ONCE", 1);
        public static final onNavigationEvent INFINITE = new onNavigationEvent("INFINITE", 2);

        private static final /* synthetic */ onNavigationEvent[] $values() {
            onNavigationEvent[] onnavigationeventArr;
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 55;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                onNavigationEvent onnavigationevent = STATIC;
                onNavigationEvent onnavigationevent2 = ONCE;
                onNavigationEvent onnavigationevent3 = INFINITE;
                onnavigationeventArr = new onNavigationEvent[5];
                onnavigationeventArr[1] = onnavigationevent;
                onnavigationeventArr[1] = onnavigationevent2;
                onnavigationeventArr[5] = onnavigationevent3;
            } else {
                onnavigationeventArr = new onNavigationEvent[]{STATIC, ONCE, INFINITE};
            }
            int i4 = i2 + 93;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onnavigationeventArr;
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 79;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return $ENTRIES;
            }
            throw null;
        }

        public static onNavigationEvent valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 49;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
            if (i3 != 0) {
                return onnavigationevent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onNavigationEvent[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 67;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent[] onnavigationeventArr = $VALUES;
            if (i3 != 0) {
                return (onNavigationEvent[]) onnavigationeventArr.clone();
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private onNavigationEvent(String str, int i) {
        }

        static {
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
            int i = onWarmupCompleted + 33;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 != 0) {
                int i2 = 40 / 0;
            }
        }
    }
}
