package im.toss.securities.libs.performance.tracker.data.model;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.oty1;
import o.setVideoListener;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MetricRequestBody {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final Long end;
    private final Long start;
    private final String step;
    private final Double value;

    static {
        int i = onWarmupCompleted + 23;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 21;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof MetricRequestBody)) {
            int i4 = onExtraCallbackWithResult + 25;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        MetricRequestBody metricRequestBody = (MetricRequestBody) obj;
        if (!Intrinsics.areEqual(this.step, metricRequestBody.step) || !Intrinsics.areEqual(this.start, metricRequestBody.start) || !Intrinsics.areEqual(this.end, metricRequestBody.end) || !Intrinsics.areEqual(this.value, metricRequestBody.value)) {
            return false;
        }
        int i6 = onExtraCallbackWithResult + 13;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.step.hashCode();
        Long l = this.start;
        int iHashCode3 = 0;
        if (l == null) {
            int i2 = onExtraCallbackWithResult + 43;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = l.hashCode();
        }
        Long l2 = this.end;
        int iHashCode4 = l2 == null ? 0 : l2.hashCode();
        Double d = this.value;
        if (d != null) {
            int i4 = onExtraCallbackWithResult + 97;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            iHashCode3 = d.hashCode();
        }
        int i6 = (((((iHashCode2 * 31) + iHashCode) * 31) + iHashCode4) * 31) + iHashCode3;
        int i7 = onExtraCallbackWithResult + 19;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MetricRequestBody(step=" + this.step + ", start=" + this.start + ", end=" + this.end + ", value=" + this.value + ")";
        int i2 = IAuthTabCallback + 47;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MetricRequestBody> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 53;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            MetricRequestBody$$serializer metricRequestBody$$serializer = MetricRequestBody$$serializer.INSTANCE;
            int i4 = onExtraCallbackWithResult + 41;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return metricRequestBody$$serializer;
        }
    }

    public /* synthetic */ MetricRequestBody(int i, String str, Long l, Long l2, Double d, okycx okycxVar) {
        if (1 != (i & 1)) {
            htf31.onExtraCallbackWithResult(i, 1, MetricRequestBody$$serializer.INSTANCE.getDescriptor());
        }
        this.step = str;
        if ((i & 2) == 0) {
            this.start = null;
        } else {
            this.start = l;
        }
        int i2 = 2 % 2;
        if ((i & 4) == 0) {
            int i3 = IAuthTabCallback + 25;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            this.end = null;
        } else {
            this.end = l2;
            int i5 = onExtraCallbackWithResult + 109;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        }
        if ((i & 8) == 0) {
            this.value = null;
        } else {
            this.value = d;
        }
    }

    public MetricRequestBody(@NotNull String str, @Nullable Long l, @Nullable Long l2, @Nullable Double d) {
        Intrinsics.checkNotNullParameter(str, "");
        this.step = str;
        this.start = l;
        this.end = l2;
        this.value = d;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void IAuthTabCallback(MetricRequestBody metricRequestBody, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, metricRequestBody.step);
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i4 = onExtraCallbackWithResult + 33;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 47 / 0;
                if (metricRequestBody.start != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 1, oty1.onExtraCallback, metricRequestBody.start);
                }
            } else if (metricRequestBody.start != null) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || metricRequestBody.end != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, oty1.onExtraCallback, metricRequestBody.end);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
            int i6 = IAuthTabCallback + 33;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                Double d = metricRequestBody.value;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (metricRequestBody.value != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 3, setVideoListener.onWarmupCompleted, metricRequestBody.value);
            }
        }
        int i7 = onExtraCallbackWithResult + 109;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
    }
}
