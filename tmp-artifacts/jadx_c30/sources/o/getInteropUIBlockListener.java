package o;

import im.toss.features.benefit.ui.BenefitItemAdapter$;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class getInteropUIBlockListener {
    private final long IAuthTabCallback;
    private final long onExtraCallback;
    private boolean onWarmupCompleted;

    public /* synthetic */ getInteropUIBlockListener(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    private getInteropUIBlockListener(long j, long j2) {
        this.IAuthTabCallback = j;
        this.onExtraCallback = j2;
    }

    public final setUseCaseAttached onWarmupCompleted(long j, float f, long j2) {
        if (this.onWarmupCompleted) {
            return null;
        }
        Pair pair = (Pair) NestfgetmSurfaceIdsWithPendingMountNotification.onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 395899455, new Object[]{Long.valueOf(this.onExtraCallback), Long.valueOf(this.IAuthTabCallback), Float.valueOf(f)}, -395899433, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
        float fFloatValue = ((Number) pair.onExtraCallbackWithResult()).floatValue();
        float fFloatValue2 = ((Number) pair.IAuthTabCallback()).floatValue();
        int i = (int) (j2 >> 32);
        boolean z = Float.intBitsToFloat(i) >= fFloatValue;
        boolean z2 = Float.intBitsToFloat(i) <= (-fFloatValue);
        if ((z && Float.intBitsToFloat((int) (j >> 32)) > 0.0f) || (z2 && Float.intBitsToFloat((int) (j >> 32)) < 0.0f)) {
            this.onWarmupCompleted = true;
            return null;
        }
        return setUseCaseAttached.onNavigationEvent(setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(RangesKt.coerceIn(Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (j >> 32)), r14, fFloatValue)) << 32) | (Float.floatToRawIntBits(RangesKt.coerceIn(Float.intBitsToFloat((int) j2) + Float.intBitsToFloat((int) j), -fFloatValue2, fFloatValue2)) & BodyPartID.bodyIdMax)));
    }
}
