package im.toss.core.tuba;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class TriggerFrequencyByPeriod {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final int inDays;
    private final int maxTimes;

    static {
        int i = IAuthTabCallback + 109;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 81;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 31;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(obj instanceof TriggerFrequencyByPeriod)) {
            int i8 = i2 + 1;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            int i10 = i2 + 111;
            onExtraCallback = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 1 / 0;
            }
            return false;
        }
        TriggerFrequencyByPeriod triggerFrequencyByPeriod = (TriggerFrequencyByPeriod) obj;
        if (this.maxTimes != triggerFrequencyByPeriod.maxTimes) {
            return false;
        }
        if (this.inDays == triggerFrequencyByPeriod.inDays) {
            return true;
        }
        int i12 = i4 + 37;
        onNavigationEvent = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.maxTimes);
        return i3 == 0 ? (iHashCode >> 48) / Integer.hashCode(this.inDays) : (iHashCode * 31) + Integer.hashCode(this.inDays);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TriggerFrequencyByPeriod(maxTimes=" + this.maxTimes + ", inDays=" + this.inDays + ")";
        int i2 = onExtraCallback + 39;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TriggerFrequencyByPeriod> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 71;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            TriggerFrequencyByPeriod$$serializer triggerFrequencyByPeriod$$serializer = TriggerFrequencyByPeriod$$serializer.INSTANCE;
            int i4 = onWarmupCompleted + 19;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return triggerFrequencyByPeriod$$serializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ TriggerFrequencyByPeriod(int i, int i2, int i3, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i4 = onNavigationEvent + 53;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            htf31.onExtraCallbackWithResult(i, 3, TriggerFrequencyByPeriod$$serializer.INSTANCE.getDescriptor());
            int i6 = 2 % 2;
        }
        this.maxTimes = i2;
        this.inDays = i3;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(TriggerFrequencyByPeriod triggerFrequencyByPeriod, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, triggerFrequencyByPeriod.maxTimes);
        vylVar.onExtraCallback(serialDescriptor, 1, triggerFrequencyByPeriod.inDays);
        int i4 = onExtraCallback + 73;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int IAuthTabCallback() {
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 43;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            i = this.maxTimes;
            int i5 = 0 / 0;
        } else {
            i = this.maxTimes;
        }
        int i6 = i3 + 29;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return i;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = this.inDays;
        int i6 = i3 + 9;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }
}
