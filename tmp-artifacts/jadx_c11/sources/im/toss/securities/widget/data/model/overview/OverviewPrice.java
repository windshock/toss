package im.toss.securities.widget.data.model.overview;

import im.toss.tosssecurities.core.currency.domain.Currency;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.liq;
import o.okycx;
import o.setVideoListener;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class OverviewPrice {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static final OverviewPrice ZERO;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final Double krw;
    private final Double usd;

    public static final /* synthetic */ class onWarmupCompleted {
        public static final /* synthetic */ int[] onExtraCallback;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int[] iArr = new int[Currency.values().length];
            try {
                iArr[Currency.KRW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Currency.USD.ordinal()] = 2;
                int i = onWarmupCompleted + 119;
                onNavigationEvent = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            onExtraCallback = iArr;
            int i4 = onNavigationEvent + 119;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OverviewPrice() {
        Double d = null;
        this(d, d, 3, (DefaultConstructorMarker) d);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OverviewPrice)) {
            int i2 = onExtraCallback + 65;
            onWarmupCompleted = i2 % 128;
            return i2 % 2 != 0;
        }
        OverviewPrice overviewPrice = (OverviewPrice) obj;
        if (!Intrinsics.areEqual(this.krw, overviewPrice.krw)) {
            int i3 = onWarmupCompleted + 77;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.usd, overviewPrice.usd)) {
            return true;
        }
        int i5 = onExtraCallback + 117;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 99;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Double d = this.krw;
        int iHashCode2 = 0;
        if (d == null) {
            int i5 = i2 + 39;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 4;
            }
            iHashCode = 0;
        } else {
            iHashCode = d.hashCode();
        }
        Double d2 = this.usd;
        if (d2 != null) {
            iHashCode2 = d2.hashCode();
            int i7 = onExtraCallback + 53;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = (iHashCode * 31) + iHashCode2;
        int i10 = onWarmupCompleted + 33;
        onExtraCallback = i10 % 128;
        int i11 = i10 % 2;
        return i9;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OverviewPrice(krw=" + this.krw + ", usd=" + this.usd + ")";
        int i2 = onExtraCallback + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ OverviewPrice(int i, Double d, Double d2, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.krw = null;
            int i2 = onWarmupCompleted + 39;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } else {
            this.krw = d;
        }
        if ((i & 2) != 0) {
            this.usd = d2;
            return;
        }
        int i5 = onExtraCallback + 101;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        this.usd = null;
        if (i6 != 0) {
            int i7 = 10 / 0;
        }
    }

    public OverviewPrice(@Nullable Double d, @Nullable Double d2) {
        this.krw = d;
        this.usd = d2;
    }

    public static final /* synthetic */ OverviewPrice onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 107;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        OverviewPrice overviewPrice = ZERO;
        int i5 = i2 + 41;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return overviewPrice;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(OverviewPrice overviewPrice, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0 ? vylVar.onWarmupCompleted(serialDescriptor, 0) : vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, setVideoListener.onWarmupCompleted, overviewPrice.krw);
        } else if (overviewPrice.krw != null) {
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i3 = onWarmupCompleted + 25;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            if (overviewPrice.usd != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 1, setVideoListener.onWarmupCompleted, overviewPrice.usd);
            }
        }
        int i5 = onWarmupCompleted + 51;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OverviewPrice(Double d, Double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallback;
            int i3 = i2 + 105;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 77;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 5 / 2;
            } else {
                int i7 = 2 % 2;
            }
            d = null;
        }
        if ((i & 2) != 0) {
            int i8 = onWarmupCompleted + 125;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            d2 = null;
        }
        this(d, d2);
    }

    public final Double IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Double d = this.krw;
        if (i3 == 0) {
            int i4 = 86 / 0;
        }
        return d;
    }

    public final Double onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 117;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Double d = this.usd;
        int i5 = i2 + 15;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return d;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Double IAuthTabCallback(@NotNull Currency currency) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(currency, "");
        int i4 = onWarmupCompleted.onExtraCallback[currency.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                return this.usd;
            }
            throw new NoWhenBranchMatchedException();
        }
        Double d = this.krw;
        int i5 = onWarmupCompleted + 19;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return d;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final OverviewPrice onWarmupCompleted(@NotNull OverviewPrice overviewPrice) {
        Double d;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(overviewPrice, "");
        Double dValueOf = overviewPrice.krw;
        Double dValueOf2 = null;
        if (dValueOf != null) {
            int i2 = onExtraCallback + 117;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            Double d2 = this.krw;
            if (d2 != null) {
                dValueOf = Double.valueOf(d2.doubleValue() - overviewPrice.krw.doubleValue());
            } else {
                Double d3 = this.krw;
                if (d3 != null) {
                    int i3 = onWarmupCompleted + 61;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    dValueOf = d3;
                }
            }
        }
        Double d4 = overviewPrice.usd;
        if (d4 == null || (d = this.usd) == null) {
            Double d5 = this.usd;
            if (d5 != null) {
                dValueOf2 = d5;
            } else if (d4 != null) {
                dValueOf2 = Double.valueOf(-d4.doubleValue());
                int i5 = onWarmupCompleted + 121;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
            }
        } else {
            int i7 = onExtraCallback + 125;
            onWarmupCompleted = i7 % 128;
            dValueOf2 = Double.valueOf(i7 % 2 != 0 ? d.doubleValue() / overviewPrice.usd.doubleValue() : d.doubleValue() - overviewPrice.usd.doubleValue());
        }
        OverviewPrice overviewPrice2 = new OverviewPrice(dValueOf, dValueOf2);
        int i8 = onWarmupCompleted + 111;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        return overviewPrice2;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OverviewPrice> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 81;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            OverviewPrice$$serializer overviewPrice$$serializer = OverviewPrice$$serializer.INSTANCE;
            int i4 = onExtraCallback + 5;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 86 / 0;
            }
            return overviewPrice$$serializer;
        }

        public final OverviewPrice onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 41;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return OverviewPrice.onExtraCallback();
            }
            OverviewPrice.onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        Double dValueOf = Double.valueOf(0.0d);
        ZERO = new OverviewPrice(dValueOf, dValueOf);
        int i = onNavigationEvent + 123;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 42 / 0;
        }
    }
}
