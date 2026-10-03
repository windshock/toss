package viva.republica.toss.network.model.verify;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access15300;
import o.liq;
import o.updateRenderInfoForVideo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ReusedSessionScreenType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ReusedSessionScreenType[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    public static final ReusedSessionScreenType FULL_SCREEN = new ReusedSessionScreenType("FULL_SCREEN", 0);
    public static final ReusedSessionScreenType TOAST = new ReusedSessionScreenType("TOAST", 1);
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ KSerializer $r8$lambda$I4P7jrZOxHyE55bHZ8UVrHHtDJk() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            _init_$_anonymous_();
            throw null;
        }
        KSerializer kSerializer_init_$_anonymous_ = _init_$_anonymous_();
        int i3 = onExtraCallback + 75;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return kSerializer_init_$_anonymous_;
    }

    private static final /* synthetic */ ReusedSessionScreenType[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 35;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        ReusedSessionScreenType[] reusedSessionScreenTypeArr = {FULL_SCREEN, TOAST};
        int i5 = i2 + 1;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return reusedSessionScreenTypeArr;
        }
        throw null;
    }

    public static EnumEntries<ReusedSessionScreenType> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 17;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<ReusedSessionScreenType> enumEntries = $ENTRIES;
        int i5 = i2 + 61;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return enumEntries;
        }
        throw null;
    }

    public static ReusedSessionScreenType valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ReusedSessionScreenType reusedSessionScreenType = (ReusedSessionScreenType) Enum.valueOf(ReusedSessionScreenType.class, str);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onNavigationEvent + 101;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return reusedSessionScreenType;
    }

    public static ReusedSessionScreenType[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ReusedSessionScreenType[] reusedSessionScreenTypeArr = (ReusedSessionScreenType[]) $VALUES.clone();
        int i4 = onNavigationEvent + 27;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return reusedSessionScreenTypeArr;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer onWarmupCompleted() {
            KSerializer kSerializer;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 31;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                kSerializer = (KSerializer) ReusedSessionScreenType.access$get$cachedSerializer$delegate$cp().getValue();
                int i3 = 61 / 0;
            } else {
                kSerializer = (KSerializer) ReusedSessionScreenType.access$get$cachedSerializer$delegate$cp().getValue();
            }
            int i4 = onExtraCallbackWithResult + 15;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return kSerializer;
            }
            throw null;
        }

        public final KSerializer<ReusedSessionScreenType> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 109;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer<ReusedSessionScreenType> kSerializerOnWarmupCompleted = onWarmupCompleted();
            int i4 = onNavigationEvent + 91;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnWarmupCompleted;
        }
    }

    private ReusedSessionScreenType(String str, int i) {
    }

    private static final /* synthetic */ KSerializer _init_$_anonymous_() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.verify.ReusedSessionScreenType", values());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.verify.ReusedSessionScreenType", values());
        int i3 = onNavigationEvent + 45;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Lazy<KSerializer<Object>> lazy = $cachedSerializer$delegate;
        int i4 = i3 + 3;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 29 / 0;
        }
        return lazy;
    }

    static {
        ReusedSessionScreenType[] reusedSessionScreenTypeArr$values = $values();
        $VALUES = reusedSessionScreenTypeArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(reusedSessionScreenTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.verify.ReusedSessionScreenType$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 9;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    ReusedSessionScreenType.$r8$lambda$I4P7jrZOxHyE55bHZ8UVrHHtDJk();
                    throw null;
                }
                KSerializer kSerializer$r8$lambda$I4P7jrZOxHyE55bHZ8UVrHHtDJk = ReusedSessionScreenType.$r8$lambda$I4P7jrZOxHyE55bHZ8UVrHHtDJk();
                int i3 = IAuthTabCallback + 35;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 35 / 0;
                }
                return kSerializer$r8$lambda$I4P7jrZOxHyE55bHZ8UVrHHtDJk;
            }
        });
        int i = onWarmupCompleted + 57;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }
}
