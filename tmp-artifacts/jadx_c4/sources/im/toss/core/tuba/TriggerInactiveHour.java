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
public final class TriggerInactiveHour {
    public static final Companion Companion = new Companion(null);
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final int endHour;
    private final int endMinute;
    private final int startHour;
    private final int startMinute;

    static {
        int i = onExtraCallbackWithResult + 3;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 81;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof TriggerInactiveHour)) {
            return false;
        }
        TriggerInactiveHour triggerInactiveHour = (TriggerInactiveHour) obj;
        if (this.startHour != triggerInactiveHour.startHour) {
            return false;
        }
        if (this.startMinute != triggerInactiveHour.startMinute) {
            int i4 = onExtraCallback + 25;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.endHour != triggerInactiveHour.endHour) {
            return false;
        }
        if (this.endMinute != triggerInactiveHour.endMinute) {
            int i6 = onWarmupCompleted + 41;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = onExtraCallback + 25;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((Integer.hashCode(this.startHour) * 31) + Integer.hashCode(this.startMinute)) * 31) + Integer.hashCode(this.endHour)) * 31) + Integer.hashCode(this.endMinute);
        int i4 = onExtraCallback + 9;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TriggerInactiveHour(startHour=" + this.startHour + ", startMinute=" + this.startMinute + ", endHour=" + this.endHour + ", endMinute=" + this.endMinute + ")";
        int i2 = onExtraCallback + 115;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TriggerInactiveHour> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 25;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                TriggerInactiveHour$$serializer triggerInactiveHour$$serializer = TriggerInactiveHour$$serializer.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            TriggerInactiveHour$$serializer triggerInactiveHour$$serializer2 = TriggerInactiveHour$$serializer.INSTANCE;
            int i3 = onNavigationEvent + 51;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return triggerInactiveHour$$serializer2;
        }
    }

    public /* synthetic */ TriggerInactiveHour(int i, int i2, int i3, int i4, int i5, okycx okycxVar) {
        if (15 != (i & 15)) {
            int i6 = onExtraCallback + 49;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            htf31.onExtraCallbackWithResult(i, 15, TriggerInactiveHour$$serializer.INSTANCE.getDescriptor());
            int i8 = onWarmupCompleted + 45;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
        }
        this.startHour = i2;
        this.startMinute = i3;
        this.endHour = i4;
        this.endMinute = i5;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(TriggerInactiveHour triggerInactiveHour, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, triggerInactiveHour.startHour);
        vylVar.onExtraCallback(serialDescriptor, 1, triggerInactiveHour.startMinute);
        vylVar.onExtraCallback(serialDescriptor, 2, triggerInactiveHour.endHour);
        vylVar.onExtraCallback(serialDescriptor, 3, triggerInactiveHour.endMinute);
        int i4 = onExtraCallback + 95;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public final int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 43;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.startHour;
        int i6 = i2 + 93;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.startMinute;
        }
        throw null;
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 89;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.endHour;
        int i6 = i2 + 9;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 75;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.endMinute;
        int i6 = i2 + 103;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }
}
