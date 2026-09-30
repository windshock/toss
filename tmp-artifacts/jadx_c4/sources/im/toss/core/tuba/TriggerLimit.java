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
public final class TriggerLimit {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final int upTo;

    static {
        int i = onExtraCallbackWithResult + 119;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 63;
            onNavigationEvent = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof TriggerLimit)) {
            return false;
        }
        if (this.upTo != ((TriggerLimit) obj).upTo) {
            int i3 = onNavigationEvent + 25;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = onNavigationEvent + 21;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.upTo;
        if (i3 != 0) {
            return Integer.hashCode(i4);
        }
        Integer.hashCode(i4);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TriggerLimit(upTo=" + this.upTo + ")";
        int i2 = onWarmupCompleted + 63;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TriggerLimit> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 65;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            TriggerLimit$$serializer triggerLimit$$serializer = TriggerLimit$$serializer.INSTANCE;
            if (i3 != 0) {
                int i4 = 89 / 0;
            }
            return triggerLimit$$serializer;
        }
    }

    public /* synthetic */ TriggerLimit(int i, int i2, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i3 = onWarmupCompleted + 53;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            htf31.onExtraCallbackWithResult(i, 1, TriggerLimit$$serializer.INSTANCE.getDescriptor());
            int i5 = onWarmupCompleted + 45;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
        }
        this.upTo = i2;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(TriggerLimit triggerLimit, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, triggerLimit.upTo);
        int i4 = onNavigationEvent + 51;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        int i5 = this.upTo;
        int i6 = i3 + 69;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
