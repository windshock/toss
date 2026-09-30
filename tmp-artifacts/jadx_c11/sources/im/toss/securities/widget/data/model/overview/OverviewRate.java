package im.toss.securities.widget.data.model.overview;

import im.toss.tosssecurities.core.currency.domain.Currency;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.discard;
import o.liq;
import o.okycx;
import o.setVideoListener;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class OverviewRate {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final Double krw;
    private final Double usd;

    static {
        int i = onNavigationEvent + 29;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 58 / 0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OverviewRate() {
        Double d = null;
        this(d, d, 3, (DefaultConstructorMarker) d);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 59;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 93;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(obj instanceof OverviewRate)) {
            int i8 = i2 + 39;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        OverviewRate overviewRate = (OverviewRate) obj;
        if (!Intrinsics.areEqual(this.krw, overviewRate.krw) || !Intrinsics.areEqual(this.usd, overviewRate.usd)) {
            return false;
        }
        int i10 = onExtraCallback + 73;
        onExtraCallbackWithResult = i10 % 128;
        if (i10 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        Double d;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        onExtraCallback = i2 % 128;
        int iHashCode = 0;
        int iHashCode2 = (i2 % 2 != 0 ? (d = this.krw) != null : (d = this.krw) != null) ? d.hashCode() : 0;
        Double d2 = this.usd;
        if (d2 != null) {
            int i3 = onExtraCallback + 87;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                int iHashCode3 = d2.hashCode();
                int i4 = 61 / 0;
                iHashCode = iHashCode3;
            } else {
                iHashCode = d2.hashCode();
            }
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OverviewRate(krw=" + this.krw + ", usd=" + this.usd + ")";
        int i2 = onExtraCallbackWithResult + 79;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OverviewRate> serializer() {
            OverviewRate$$serializer overviewRate$$serializer;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 5;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                overviewRate$$serializer = OverviewRate$$serializer.INSTANCE;
                int i3 = 67 / 0;
            } else {
                overviewRate$$serializer = OverviewRate$$serializer.INSTANCE;
            }
            int i4 = onNavigationEvent + 125;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 51 / 0;
            }
            return overviewRate$$serializer;
        }
    }

    public /* synthetic */ OverviewRate(int i, Double d, Double d2, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.krw = null;
            int i2 = onExtraCallback + 31;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } else {
            this.krw = d;
        }
        if ((i & 2) != 0) {
            this.usd = d2;
            return;
        }
        int i5 = onExtraCallback + 9;
        int i6 = i5 % 128;
        onExtraCallbackWithResult = i6;
        int i7 = i5 % 2;
        this.usd = null;
        int i8 = i6 + 101;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
    }

    public OverviewRate(@Nullable Double d, @Nullable Double d2) {
        this.krw = d;
        this.usd = d2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void IAuthTabCallback(OverviewRate overviewRate, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i2 = onExtraCallbackWithResult + 65;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Double d = overviewRate.krw;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (overviewRate.krw != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 0, setVideoListener.onWarmupCompleted, overviewRate.krw);
                int i3 = onExtraCallbackWithResult + 101;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || overviewRate.usd != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, setVideoListener.onWarmupCompleted, overviewRate.usd);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OverviewRate(Double d, Double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 83;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            d = null;
        }
        if ((i & 2) != 0) {
            int i3 = onExtraCallback + 11;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            d2 = null;
        }
        this(d, d2);
    }

    public final Double onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        Double d = this.krw;
        int i5 = i3 + 17;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return d;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Double onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 109;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Double d = this.usd;
        int i5 = i2 + 39;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return d;
        }
        throw null;
    }

    public final Double onNavigationEvent(@NotNull Currency currency) {
        double dDoubleValue;
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(currency, "");
            Currency currency2 = Currency.KRW;
            throw null;
        }
        Intrinsics.checkNotNullParameter(currency, "");
        if (currency == Currency.KRW) {
            return this.krw;
        }
        Double d = this.usd;
        if (d != null) {
            int i3 = onExtraCallback + 113;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            dDoubleValue = d.doubleValue();
        } else {
            int i5 = onExtraCallback + 121;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 % 2;
            }
            dDoubleValue = 0.0d;
        }
        return Double.valueOf(dDoubleValue);
    }

    public final String onWarmupCompleted(@NotNull Currency currency, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(currency, "");
        Object obj = null;
        if (currency == Currency.KRW) {
            int i4 = onExtraCallback + 41;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return IAuthTabCallback(z);
            }
            IAuthTabCallback(z);
            throw null;
        }
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(z);
        int i5 = onExtraCallbackWithResult + 11;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return strOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026 A[Catch: all -> 0x003b, PHI: r2
      0x0026: PHI (r2v6 double) = (r2v5 double), (r2v9 double) binds: [B:12:0x0024, B:9:0x001d] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x003b, blocks: (B:3:0x0004, B:7:0x0015, B:14:0x002a, B:16:0x0036, B:13:0x0026, B:11:0x0020), top: B:26:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String onExtraCallbackWithResult(boolean z) {
        Object obj;
        Double d;
        String str;
        double dDoubleValue;
        int i = 2 % 2;
        Object obj2 = null;
        try {
            Result.Companion companion = Result.Companion;
            d = this.usd;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (d != null) {
            int i2 = onExtraCallbackWithResult + 65;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                dDoubleValue = d.doubleValue();
                if (z) {
                }
                str = discard.onExtraCallback.onExtraCallback().format(dDoubleValue);
            } else {
                dDoubleValue = d.doubleValue();
                int i3 = 16 / 0;
                if (z) {
                    dDoubleValue = Math.abs(dDoubleValue);
                }
                str = discard.onExtraCallback.onExtraCallback().format(dDoubleValue);
            }
            if (Result.onExtraCallback(obj)) {
                obj2 = obj;
            } else {
                int i4 = onExtraCallback + 73;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            }
            return (String) obj2;
        }
        str = null;
        obj = Result.constructor-impl(str);
        if (Result.onExtraCallback(obj)) {
        }
        return (String) obj2;
    }

    private final String IAuthTabCallback(boolean z) {
        Object obj;
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        try {
            Result.Companion companion = Result.Companion;
            Double d = this.krw;
            if (d != null) {
                double dDoubleValue = d.doubleValue();
                if (z) {
                    dDoubleValue = Math.abs(dDoubleValue);
                }
                str = discard.onExtraCallback.onExtraCallback().format(dDoubleValue);
                int i4 = onExtraCallback + 45;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            } else {
                str = null;
            }
            obj = Result.constructor-impl(str);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(obj)) {
            obj = null;
        }
        String str2 = (String) obj;
        int i6 = onExtraCallback + 87;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return str2;
        }
        obj2.hashCode();
        throw null;
    }
}
