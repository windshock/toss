package im.toss.securities.libs.performance.tracker.data.model.v1;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.oty1;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MetricBody {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final Long end;
    private final Long start;
    private final String step;
    private final String value;

    static {
        int i = onNavigationEvent + 65;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetricBody)) {
            return false;
        }
        MetricBody metricBody = (MetricBody) obj;
        if (!Intrinsics.areEqual(this.step, metricBody.step)) {
            return false;
        }
        if (Intrinsics.areEqual(this.start, metricBody.start)) {
            return Intrinsics.areEqual(this.end, metricBody.end) && !(Intrinsics.areEqual(this.value, metricBody.value) ^ true);
        }
        int i2 = onWarmupCompleted + 111;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 37;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode3 = this.step.hashCode();
        Long l = this.start;
        int i4 = 0;
        if (l == null) {
            int i5 = onWarmupCompleted + 35;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = l.hashCode();
        }
        Long l2 = this.end;
        if (l2 == null) {
            int i7 = onExtraCallback + 119;
            onWarmupCompleted = i7 % 128;
            iHashCode2 = i7 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode2 = l2.hashCode();
        }
        String str = this.value;
        if (str != null) {
            int i8 = onWarmupCompleted + 7;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            int iHashCode4 = str.hashCode();
            if (i9 == 0) {
                int i10 = 24 / 0;
            }
            i4 = iHashCode4;
        }
        return (((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2) * 31) + i4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MetricBody(step=" + this.step + ", start=" + this.start + ", end=" + this.end + ", value=" + this.value + ")";
        int i2 = onWarmupCompleted + 87;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MetricBody> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 71;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            MetricBody$$serializer metricBody$$serializer = MetricBody$$serializer.INSTANCE;
            int i4 = onExtraCallback + 15;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return metricBody$$serializer;
            }
            throw null;
        }
    }

    public /* synthetic */ MetricBody(int i, String str, Long l, Long l2, String str2, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = onExtraCallback + 63;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, MetricBody$$serializer.INSTANCE.getDescriptor());
        }
        this.step = str;
        if ((i & 2) == 0) {
            this.start = null;
        } else {
            this.start = l;
        }
        if ((i & 4) == 0) {
            int i4 = onWarmupCompleted + 9;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            this.end = null;
            int i6 = 2 % 2;
        } else {
            this.end = l2;
        }
        if ((i & 8) != 0) {
            this.value = str2;
            return;
        }
        int i7 = onWarmupCompleted + 91;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        this.value = null;
    }

    public MetricBody(@NotNull String str, @Nullable Long l, @Nullable Long l2, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.step = str;
        this.start = l;
        this.end = l2;
        this.value = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(MetricBody metricBody, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, metricBody.step);
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || metricBody.start != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, oty1.onExtraCallback, metricBody.start);
            int i4 = onWarmupCompleted + 117;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 / 3;
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || metricBody.end != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, oty1.onExtraCallback, metricBody.end);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
            int i6 = onExtraCallback + 7;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                String str = metricBody.value;
                throw null;
            }
            if (metricBody.value == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, metricBody.value);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MetricBody(String str, Long l, Long l2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        l = (i & 2) != 0 ? null : l;
        if ((i & 4) != 0) {
            int i2 = onWarmupCompleted + 13;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            l2 = null;
        }
        if ((i & 8) != 0) {
            int i4 = onExtraCallback + 121;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
            str2 = null;
        }
        this(str, l, l2, str2);
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 39;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.step;
        int i5 = i2 + 37;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 75;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Long l = this.start;
        int i5 = i2 + 33;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 39 / 0;
        }
        return l;
    }

    public final Long IAuthTabCallback() {
        Long l;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            l = this.end;
            int i4 = 36 / 0;
        } else {
            l = this.end;
        }
        int i5 = i3 + 55;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return l;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.value;
        int i5 = i3 + 41;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
