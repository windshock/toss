package viva.republica.toss.network.model.cardsales.funnel;

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
public final class CardIssueTossCertStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CardIssueTossCertStatus[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public static final CardIssueTossCertStatus REQUESTED = new CardIssueTossCertStatus("REQUESTED", 0);
    public static final CardIssueTossCertStatus IN_PROGRESS = new CardIssueTossCertStatus("IN_PROGRESS", 1);
    public static final CardIssueTossCertStatus COMPLETED = new CardIssueTossCertStatus("COMPLETED", 2);
    public static final CardIssueTossCertStatus EXPIRED = new CardIssueTossCertStatus("EXPIRED", 3);

    public static /* synthetic */ KSerializer $r8$lambda$DmGqBZ5_pxRuw6owS5IoUNysVhI() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializer_init_$_anonymous_ = _init_$_anonymous_();
        if (i3 == 0) {
            int i4 = 54 / 0;
        }
        return kSerializer_init_$_anonymous_;
    }

    private static final /* synthetic */ CardIssueTossCertStatus[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 69;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        CardIssueTossCertStatus[] cardIssueTossCertStatusArr = {REQUESTED, IN_PROGRESS, COMPLETED, EXPIRED};
        int i5 = i2 + 23;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return cardIssueTossCertStatusArr;
    }

    public static EnumEntries<CardIssueTossCertStatus> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 109;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<CardIssueTossCertStatus> enumEntries = $ENTRIES;
        int i5 = i2 + 39;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static CardIssueTossCertStatus valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        CardIssueTossCertStatus cardIssueTossCertStatus = (CardIssueTossCertStatus) Enum.valueOf(CardIssueTossCertStatus.class, str);
        int i4 = onExtraCallback + 37;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return cardIssueTossCertStatus;
    }

    public static CardIssueTossCertStatus[] values() {
        CardIssueTossCertStatus[] cardIssueTossCertStatusArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            cardIssueTossCertStatusArr = (CardIssueTossCertStatus[]) $VALUES.clone();
            int i3 = 98 / 0;
        } else {
            cardIssueTossCertStatusArr = (CardIssueTossCertStatus[]) $VALUES.clone();
        }
        int i4 = onExtraCallback + 1;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return cardIssueTossCertStatusArr;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 1;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            KSerializer kSerializer = (KSerializer) CardIssueTossCertStatus.access$get$cachedSerializer$delegate$cp().getValue();
            int i3 = onNavigationEvent + 103;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 81 / 0;
            }
            return kSerializer;
        }

        public final KSerializer<CardIssueTossCertStatus> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 89;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                onExtraCallback();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            KSerializer<CardIssueTossCertStatus> kSerializerOnExtraCallback = onExtraCallback();
            int i3 = IAuthTabCallback + 29;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return kSerializerOnExtraCallback;
        }
    }

    private CardIssueTossCertStatus(String str, int i) {
    }

    private static final /* synthetic */ KSerializer _init_$_anonymous_() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.cardsales.funnel.CardIssueTossCertStatus", values());
        }
        updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.cardsales.funnel.CardIssueTossCertStatus", values());
        throw null;
    }

    public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 47;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>> lazy = $cachedSerializer$delegate;
        int i5 = i2 + 53;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return lazy;
        }
        throw null;
    }

    static {
        CardIssueTossCertStatus[] cardIssueTossCertStatusArr$values = $values();
        $VALUES = cardIssueTossCertStatusArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(cardIssueTossCertStatusArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.cardsales.funnel.CardIssueTossCertStatus$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 19;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    return CardIssueTossCertStatus.$r8$lambda$DmGqBZ5_pxRuw6owS5IoUNysVhI();
                }
                CardIssueTossCertStatus.$r8$lambda$DmGqBZ5_pxRuw6owS5IoUNysVhI();
                throw null;
            }
        });
        int i = onExtraCallbackWithResult + 123;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
