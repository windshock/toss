package im.toss.securities.widget.data.model.watchlists;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.liq;
import o.okycx;
import o.setVideoListener;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class Price {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final Double krw;
    private final Double usd;

    static {
        int i = onExtraCallback + 71;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 67 / 0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Price() {
        Double d = null;
        this(d, d, 3, (DefaultConstructorMarker) d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        r6 = null;
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if ((r6 instanceof im.toss.securities.widget.data.model.watchlists.Price) == true) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        r1 = r1 + 89;
        im.toss.securities.widget.data.model.watchlists.Price.onExtraCallbackWithResult = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        r6 = (im.toss.securities.widget.data.model.watchlists.Price) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.krw, r6.krw)) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        r6 = im.toss.securities.widget.data.model.watchlists.Price.onNavigationEvent + 121;
        im.toss.securities.widget.data.model.watchlists.Price.onExtraCallbackWithResult = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.usd, r6.usd)) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        r6 = im.toss.securities.widget.data.model.watchlists.Price.onNavigationEvent + 11;
        im.toss.securities.widget.data.model.watchlists.Price.onExtraCallbackWithResult = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r1 = r1 + 35;
        im.toss.securities.widget.data.model.watchlists.Price.onExtraCallbackWithResult = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if ((r1 % 2) != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 41;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 58 / 0;
        }
    }

    public int hashCode() {
        Double d;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i2 % 128;
        int iHashCode = 0;
        int iHashCode2 = (i2 % 2 == 0 ? (d = this.krw) != null : (d = this.krw) != null) ? d.hashCode() : 0;
        Double d2 = this.usd;
        if (d2 != null) {
            int i3 = onExtraCallbackWithResult + 9;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = d2.hashCode();
        }
        int i5 = (iHashCode2 * 31) + iHashCode;
        int i6 = onExtraCallbackWithResult + 45;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Price(krw=" + this.krw + ", usd=" + this.usd + ")";
        int i2 = onExtraCallbackWithResult + 37;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<Price> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 111;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Price$$serializer price$$serializer = Price$$serializer.INSTANCE;
            if (i3 != 0) {
                return price$$serializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ Price(int i, Double d, Double d2, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.krw = null;
        } else {
            this.krw = d;
            int i2 = onExtraCallbackWithResult + 113;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        if ((i & 2) == 0) {
            this.usd = null;
            return;
        }
        this.usd = d2;
        int i5 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    public Price(@Nullable Double d, @Nullable Double d2) {
        this.krw = d;
        this.usd = d2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(Price price, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || price.krw != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, setVideoListener.onWarmupCompleted, price.krw);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i4 = onNavigationEvent + 53;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 66 / 0;
                if (price.usd != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 1, setVideoListener.onWarmupCompleted, price.usd);
                }
            } else if (price.usd != null) {
            }
        }
        int i6 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Price(Double d, Double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 77;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            d = null;
        }
        if ((i & 2) != 0) {
            int i5 = onNavigationEvent + 33;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            d2 = null;
        }
        this(d, d2);
    }

    public final Double onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.krw;
        }
        throw null;
    }

    public final Double onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 69;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Double d = this.usd;
        int i5 = i2 + 35;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return d;
    }
}
