package im.toss.ads_sdk.remote.model;

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
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class EventType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EventType[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final EventType LOAD = new EventType("LOAD", 0);
    public static final EventType SHOW = new EventType("SHOW", 1);
    public static final EventType IMP = new EventType("IMP", 2);
    public static final EventType CLICK = new EventType("CLICK", 3);
    public static final EventType FAILED_TO_LOAD = new EventType("FAILED_TO_LOAD", 4);
    public static final EventType FAILED_TO_SHOW = new EventType("FAILED_TO_SHOW", 5);
    public static final EventType DISMISS = new EventType("DISMISS", 6);
    public static final EventType EARNED_REWARD = new EventType("EARNED_REWARD", 7);
    public static final EventType PAID = new EventType("PAID", 8);

    /* renamed from: $r8$lambda$U1VFrBm-Z9mxVC8eivaLXWtfm_8, reason: not valid java name */
    public static /* synthetic */ KSerializer m42$r8$lambda$U1VFrBmZ9mxVC8eivaLXWtfm_8() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializer_init_$_anonymous_ = _init_$_anonymous_();
        int i4 = onExtraCallbackWithResult + 67;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializer_init_$_anonymous_;
        }
        throw null;
    }

    private static final /* synthetic */ EventType[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 59;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        EventType[] eventTypeArr = {LOAD, SHOW, IMP, CLICK, FAILED_TO_LOAD, FAILED_TO_SHOW, DISMISS, EARNED_REWARD, PAID};
        int i5 = i2 + 21;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return eventTypeArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<EventType> getEntries() {
        EnumEntries<EventType> enumEntries;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            enumEntries = $ENTRIES;
            int i4 = 99 / 0;
        } else {
            enumEntries = $ENTRIES;
        }
        int i5 = i3 + 45;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return enumEntries;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EventType valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        EventType eventType = (EventType) Enum.valueOf(EventType.class, str);
        int i4 = onExtraCallback + 61;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return eventType;
        }
        throw null;
    }

    public static EventType[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        EventType[] eventTypeArr = (EventType[]) $VALUES.clone();
        int i3 = onExtraCallback + 23;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return eventTypeArr;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 89;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            KSerializer kSerializer = (KSerializer) EventType.access$get$cachedSerializer$delegate$cp().getValue();
            int i3 = IAuthTabCallback + 3;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return kSerializer;
        }

        public final KSerializer<EventType> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 23;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onWarmupCompleted();
            }
            onWarmupCompleted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private EventType(String str, int i) {
    }

    private static final /* synthetic */ KSerializer _init_$_anonymous_() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.ads_sdk.remote.model.EventType", values());
            throw null;
        }
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.ads_sdk.remote.model.EventType", values());
        int i3 = onExtraCallbackWithResult + 117;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return $cachedSerializer$delegate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        EventType[] eventTypeArr$values = $values();
        $VALUES = eventTypeArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(eventTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.ads_sdk.remote.model.EventType$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 79;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    EventType.m42$r8$lambda$U1VFrBmZ9mxVC8eivaLXWtfm_8();
                    throw null;
                }
                KSerializer kSerializerM42$r8$lambda$U1VFrBmZ9mxVC8eivaLXWtfm_8 = EventType.m42$r8$lambda$U1VFrBmZ9mxVC8eivaLXWtfm_8();
                int i3 = onNavigationEvent + 7;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 45 / 0;
                }
                return kSerializerM42$r8$lambda$U1VFrBmZ9mxVC8eivaLXWtfm_8;
            }
        });
        int i = onNavigationEvent + 123;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }
}
