package viva.republica.toss.network.model.home;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.home.CardRecommendBanner$;
import viva.republica.toss.network.model.home.ConsumptionCardRecommendBannerResp$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ConsumptionCardRecommendBannerResp {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final CardRecommendBanner banner;

    static {
        int i = onExtraCallbackWithResult + 67;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ConsumptionCardRecommendBannerResp() {
        CardRecommendBanner cardRecommendBanner = null;
        this(cardRecommendBanner, 1, (DefaultConstructorMarker) cardRecommendBanner);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 37;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof ConsumptionCardRecommendBannerResp)) {
            int i4 = onNavigationEvent + 95;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.banner, ((ConsumptionCardRecommendBannerResp) obj).banner)) {
            return false;
        }
        int i6 = onWarmupCompleted + 21;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        CardRecommendBanner cardRecommendBanner = this.banner;
        if (cardRecommendBanner != null) {
            int iHashCode = cardRecommendBanner.hashCode();
            int i5 = onWarmupCompleted + 9;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 107;
        int i7 = i6 % 128;
        onWarmupCompleted = i7;
        int i8 = (i6 % 2 == 0 ? 0 : 1) ^ 1;
        int i9 = i7 + 123;
        onNavigationEvent = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 80 / 0;
        }
        return i8;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ConsumptionCardRecommendBannerResp(banner=" + this.banner + ")";
        int i2 = onNavigationEvent + 75;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 33 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ConsumptionCardRecommendBannerResp> serializer() {
            ConsumptionCardRecommendBannerResp$.serializer serializerVar;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 65;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                serializerVar = ConsumptionCardRecommendBannerResp$.serializer.INSTANCE;
                int i3 = 67 / 0;
            } else {
                serializerVar = ConsumptionCardRecommendBannerResp$.serializer.INSTANCE;
            }
            int i4 = onWarmupCompleted + 29;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ ConsumptionCardRecommendBannerResp(int i, CardRecommendBanner cardRecommendBanner, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.banner = null;
            int i2 = onNavigationEvent + 121;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        this.banner = cardRecommendBanner;
        int i4 = onNavigationEvent + 63;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public ConsumptionCardRecommendBannerResp(@Nullable CardRecommendBanner cardRecommendBanner) {
        this.banner = cardRecommendBanner;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(ConsumptionCardRecommendBannerResp consumptionCardRecommendBannerResp, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i4 = onNavigationEvent + 121;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                CardRecommendBanner cardRecommendBanner = consumptionCardRecommendBannerResp.banner;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (consumptionCardRecommendBannerResp.banner == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 0, CardRecommendBanner$.serializer.INSTANCE, consumptionCardRecommendBannerResp.banner);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ConsumptionCardRecommendBannerResp(CardRecommendBanner cardRecommendBanner, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 19;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 5;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            cardRecommendBanner = null;
        }
        this(cardRecommendBanner);
    }

    public final CardRecommendBanner onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 21;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        CardRecommendBanner cardRecommendBanner = this.banner;
        int i5 = i2 + 109;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return cardRecommendBanner;
    }
}
