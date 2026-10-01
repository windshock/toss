package im.toss.appsintoss.data.remote.model;

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
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AnimationType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AnimationType[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private static int IAuthTabCallback = 1;
    public static final AnimationType NONE = new AnimationType("NONE", 0);
    public static final AnimationType RISING_TEXT = new AnimationType("RISING_TEXT", 1);
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ KSerializer $r8$lambda$n295jdKh3vwLe4dtKVb5p_T8o1s() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 81;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        KSerializer kSerializer_init_$_anonymous_ = _init_$_anonymous_();
        int i5 = IAuthTabCallback + 101;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return kSerializer_init_$_anonymous_;
        }
        throw null;
    }

    private static final /* synthetic */ AnimationType[] $values() {
        AnimationType[] animationTypeArr;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 51;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        if (i3 % 2 != 0) {
            AnimationType animationType = NONE;
            AnimationType animationType2 = RISING_TEXT;
            animationTypeArr = new AnimationType[3];
            animationTypeArr[1] = animationType;
            animationTypeArr[0] = animationType2;
        } else {
            animationTypeArr = new AnimationType[]{NONE, RISING_TEXT};
        }
        int i5 = i4 + 125;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return animationTypeArr;
    }

    public static EnumEntries<AnimationType> getEntries() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 31;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        EnumEntries<AnimationType> enumEntries = $ENTRIES;
        int i6 = i4 + 23;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return enumEntries;
    }

    public static AnimationType valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 107;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        AnimationType animationType = (AnimationType) Enum.valueOf(AnimationType.class, str);
        if (i4 != 0) {
            return animationType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static AnimationType[] values() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 25;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        AnimationType[] animationTypeArr = (AnimationType[]) $VALUES.clone();
        int i5 = IAuthTabCallback + 111;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return animationTypeArr;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer onExtraCallback() {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 37;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            KSerializer kSerializer = (KSerializer) AnimationType.access$get$cachedSerializer$delegate$cp().getValue();
            int i5 = onExtraCallback + 81;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 41 / 0;
            }
            return kSerializer;
        }

        public final KSerializer<AnimationType> serializer() {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 61;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            KSerializer<AnimationType> kSerializerOnExtraCallback = onExtraCallback();
            int i5 = onExtraCallback + 19;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return kSerializerOnExtraCallback;
            }
            throw null;
        }
    }

    private AnimationType(String str, int i2) {
    }

    private static final /* synthetic */ KSerializer _init_$_anonymous_() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 95;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.appsintoss.data.remote.model.AnimationType", values());
        }
        updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.appsintoss.data.remote.model.AnimationType", values());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 23;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Lazy<KSerializer<Object>> lazy = $cachedSerializer$delegate;
        int i6 = i3 + 27;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return lazy;
    }

    static {
        AnimationType[] animationTypeArr$values = $values();
        $VALUES = animationTypeArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(animationTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.appsintoss.data.remote.model.AnimationType$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 15;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                KSerializer kSerializer$r8$lambda$n295jdKh3vwLe4dtKVb5p_T8o1s = AnimationType.$r8$lambda$n295jdKh3vwLe4dtKVb5p_T8o1s();
                int i5 = onExtraCallback + 45;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return kSerializer$r8$lambda$n295jdKh3vwLe4dtKVb5p_T8o1s;
            }
        });
        int i2 = onNavigationEvent + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
    }
}
