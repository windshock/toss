package viva.republica.toss.network.model.transfer;

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
public final class NavigationType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NavigationType[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    public static final NavigationType TOSS_CORE_NATIVE = new NavigationType("TOSS_CORE_NATIVE", 0);
    public static final NavigationType TOSS_BANK_WEB = new NavigationType("TOSS_BANK_WEB", 1);

    public static /* synthetic */ KSerializer $r8$lambda$1XcPKXIXreueK9k2XVwuMLtUf8o() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializer_init_$_anonymous_ = _init_$_anonymous_();
        int i4 = onWarmupCompleted + 9;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializer_init_$_anonymous_;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ NavigationType[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 89;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        NavigationType[] navigationTypeArr = {TOSS_CORE_NATIVE, TOSS_BANK_WEB};
        int i5 = i2 + 49;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return navigationTypeArr;
    }

    public static EnumEntries<NavigationType> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        EnumEntries<NavigationType> enumEntries = $ENTRIES;
        if (i3 == 0) {
            int i4 = 37 / 0;
        }
        return enumEntries;
    }

    public static NavigationType valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        NavigationType navigationType = (NavigationType) Enum.valueOf(NavigationType.class, str);
        if (i3 != 0) {
            int i4 = 57 / 0;
        }
        return navigationType;
    }

    public static NavigationType[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        NavigationType[] navigationTypeArr = (NavigationType[]) $VALUES.clone();
        int i4 = onWarmupCompleted + 7;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return navigationTypeArr;
    }

    public static final class Companion {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 71;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object value = NavigationType.access$get$cachedSerializer$delegate$cp().getValue();
            if (i3 == 0) {
                return (KSerializer) value;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final KSerializer<NavigationType> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 89;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer<NavigationType> kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
            if (i3 == 0) {
                int i4 = 18 / 0;
            }
            return kSerializerOnExtraCallbackWithResult;
        }
    }

    private NavigationType(String str, int i) {
    }

    private static final /* synthetic */ KSerializer _init_$_anonymous_() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.NavigationType", values());
        int i4 = onWarmupCompleted + 65;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 19;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Lazy<KSerializer<Object>> lazy = $cachedSerializer$delegate;
        int i4 = i2 + 111;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return lazy;
    }

    static {
        NavigationType[] navigationTypeArr$values = $values();
        $VALUES = navigationTypeArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(navigationTypeArr$values);
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.NavigationType$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 41;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializer$r8$lambda$1XcPKXIXreueK9k2XVwuMLtUf8o = NavigationType.$r8$lambda$1XcPKXIXreueK9k2XVwuMLtUf8o();
                int i4 = onExtraCallback + 37;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return kSerializer$r8$lambda$1XcPKXIXreueK9k2XVwuMLtUf8o;
                }
                throw null;
            }
        });
        int i = onNavigationEvent + 15;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }
}
