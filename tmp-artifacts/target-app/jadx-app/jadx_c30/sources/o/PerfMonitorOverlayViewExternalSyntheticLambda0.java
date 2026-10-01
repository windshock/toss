package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class PerfMonitorOverlayViewExternalSyntheticLambda0 {
    private float IAuthTabCallback;
    private boolean onExtraCallback;
    private final long onExtraCallbackWithResult;
    private boolean onWarmupCompleted;

    public /* synthetic */ PerfMonitorOverlayViewExternalSyntheticLambda0(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    private PerfMonitorOverlayViewExternalSyntheticLambda0(long j) {
        this.onExtraCallbackWithResult = j;
    }

    public final boolean IAuthTabCallback() {
        return this.onExtraCallback;
    }

    public final boolean onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    public final float onExtraCallback() {
        return this.IAuthTabCallback;
    }

    public final boolean onWarmupCompleted(long j) {
        if (this.onWarmupCompleted) {
            return this.onExtraCallback;
        }
        this.onWarmupCompleted = true;
        int i = (int) (BodyPartID.bodyIdMax & j);
        if (Math.abs(Float.intBitsToFloat(i)) <= Math.abs(Float.intBitsToFloat((int) (j >> 32))) || Float.intBitsToFloat(i) <= 0.0f) {
            return false;
        }
        this.onExtraCallback = true;
        this.IAuthTabCallback = RangesKt.coerceAtLeast(Float.intBitsToFloat(i), 0.0f);
        return true;
    }

    public final void IAuthTabCallback(long j) {
        this.IAuthTabCallback = RangesKt.coerceIn(this.IAuthTabCallback + Float.intBitsToFloat((int) j), 0.0f, ((int) this.onExtraCallbackWithResult) / 2.0f);
    }

    public final void onWarmupCompleted() {
        this.onExtraCallback = false;
        this.onWarmupCompleted = false;
        this.IAuthTabCallback = 0.0f;
    }
}
