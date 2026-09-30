package im.toss.appsintoss.iap.model;

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
public final class InAppPurchaseProductAuthorizer {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InAppPurchaseProductAuthorizer[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private static int IAuthTabCallback = 1;
    public static final InAppPurchaseProductAuthorizer PARTNER;
    public static final InAppPurchaseProductAuthorizer TOSS = new InAppPurchaseProductAuthorizer("TOSS", 0);

    /* renamed from: default, reason: not valid java name */
    private static final InAppPurchaseProductAuthorizer f0default;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ KSerializer $r8$lambda$TyPEFhiZlYmTdfpTEoO5SENCqro() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializer_init_$_anonymous_ = _init_$_anonymous_();
        int i4 = IAuthTabCallback + 107;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializer_init_$_anonymous_;
        }
        throw null;
    }

    private static final /* synthetic */ InAppPurchaseProductAuthorizer[] $values() {
        InAppPurchaseProductAuthorizer[] inAppPurchaseProductAuthorizerArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 81;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            InAppPurchaseProductAuthorizer inAppPurchaseProductAuthorizer = TOSS;
            InAppPurchaseProductAuthorizer inAppPurchaseProductAuthorizer2 = PARTNER;
            inAppPurchaseProductAuthorizerArr = new InAppPurchaseProductAuthorizer[3];
            inAppPurchaseProductAuthorizerArr[0] = inAppPurchaseProductAuthorizer;
            inAppPurchaseProductAuthorizerArr[1] = inAppPurchaseProductAuthorizer2;
        } else {
            inAppPurchaseProductAuthorizerArr = new InAppPurchaseProductAuthorizer[]{TOSS, PARTNER};
        }
        int i4 = i2 + 65;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return inAppPurchaseProductAuthorizerArr;
    }

    public static EnumEntries<InAppPurchaseProductAuthorizer> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        throw null;
    }

    public static InAppPurchaseProductAuthorizer valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        InAppPurchaseProductAuthorizer inAppPurchaseProductAuthorizer = (InAppPurchaseProductAuthorizer) Enum.valueOf(InAppPurchaseProductAuthorizer.class, str);
        int i4 = onNavigationEvent + 15;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return inAppPurchaseProductAuthorizer;
        }
        throw null;
    }

    public static InAppPurchaseProductAuthorizer[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        InAppPurchaseProductAuthorizer[] inAppPurchaseProductAuthorizerArr = (InAppPurchaseProductAuthorizer[]) $VALUES.clone();
        int i4 = IAuthTabCallback + 115;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return inAppPurchaseProductAuthorizerArr;
        }
        throw null;
    }

    private InAppPurchaseProductAuthorizer(String str, int i) {
    }

    public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
        Lazy<KSerializer<Object>> lazy;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            lazy = $cachedSerializer$delegate;
            int i4 = 51 / 0;
        } else {
            lazy = $cachedSerializer$delegate;
        }
        int i5 = i3 + 21;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return lazy;
    }

    public static final /* synthetic */ InAppPurchaseProductAuthorizer access$getDefault$cp() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        InAppPurchaseProductAuthorizer inAppPurchaseProductAuthorizer = f0default;
        int i5 = i3 + 25;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return inAppPurchaseProductAuthorizer;
        }
        throw null;
    }

    static {
        InAppPurchaseProductAuthorizer inAppPurchaseProductAuthorizer = new InAppPurchaseProductAuthorizer("PARTNER", 1);
        PARTNER = inAppPurchaseProductAuthorizer;
        InAppPurchaseProductAuthorizer[] inAppPurchaseProductAuthorizerArr$values = $values();
        $VALUES = inAppPurchaseProductAuthorizerArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(inAppPurchaseProductAuthorizerArr$values);
        Companion = new Companion(null);
        f0default = inAppPurchaseProductAuthorizer;
        $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.appsintoss.iap.model.InAppPurchaseProductAuthorizer$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                KSerializer kSerializer$r8$lambda$TyPEFhiZlYmTdfpTEoO5SENCqro;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 33;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    kSerializer$r8$lambda$TyPEFhiZlYmTdfpTEoO5SENCqro = InAppPurchaseProductAuthorizer.$r8$lambda$TyPEFhiZlYmTdfpTEoO5SENCqro();
                    int i3 = 40 / 0;
                } else {
                    kSerializer$r8$lambda$TyPEFhiZlYmTdfpTEoO5SENCqro = InAppPurchaseProductAuthorizer.$r8$lambda$TyPEFhiZlYmTdfpTEoO5SENCqro();
                }
                int i4 = IAuthTabCallback + 15;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 97 / 0;
                }
                return kSerializer$r8$lambda$TyPEFhiZlYmTdfpTEoO5SENCqro;
            }
        });
        int i = onWarmupCompleted + 33;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            int i2 = 98 / 0;
        }
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 47;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            KSerializer kSerializer = (KSerializer) InAppPurchaseProductAuthorizer.access$get$cachedSerializer$delegate$cp().getValue();
            int i3 = IAuthTabCallback + 125;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 15 / 0;
            }
            return kSerializer;
        }

        public final KSerializer<InAppPurchaseProductAuthorizer> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 11;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onWarmupCompleted();
            }
            onWarmupCompleted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final InAppPurchaseProductAuthorizer onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 13;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            InAppPurchaseProductAuthorizer inAppPurchaseProductAuthorizerAccess$getDefault$cp = InAppPurchaseProductAuthorizer.access$getDefault$cp();
            if (i3 != 0) {
                int i4 = 67 / 0;
            }
            return inAppPurchaseProductAuthorizerAccess$getDefault$cp;
        }
    }

    private static final /* synthetic */ KSerializer _init_$_anonymous_() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.appsintoss.iap.model.InAppPurchaseProductAuthorizer", values());
        int i4 = onNavigationEvent + 51;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
