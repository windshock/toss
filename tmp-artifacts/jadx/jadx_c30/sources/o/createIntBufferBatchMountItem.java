package o;

import im.toss.features.benefit.ui.BenefitItemAdapter$;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class createIntBufferBatchMountItem {
    private final long onExtraCallback;
    private final long onExtraCallbackWithResult;

    public /* synthetic */ createIntBufferBatchMountItem(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    private createIntBufferBatchMountItem(long j, long j2) {
        this.onExtraCallbackWithResult = j;
        this.onExtraCallback = j2;
    }

    public final Pair<Float, Float> onNavigationEvent(float f) {
        Object[] objArr = {Long.valueOf(this.onExtraCallback), Long.valueOf(this.onExtraCallbackWithResult), Float.valueOf(f)};
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (Pair) NestfgetmSurfaceIdsWithPendingMountNotification.onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 395899455, objArr, -395899433, iOnExtraCallbackWithResult);
    }

    public final Pair<Float, setUseCaseAttached> onExtraCallbackWithResult(float f, long j, float f2, long j2) {
        long jIAuthTabCallback;
        float fCoerceIn = RangesKt.coerceIn(f2 * f, 1.0f, 5.0f);
        if (fCoerceIn > 1.0f) {
            Pair<Float, Float> pairOnNavigationEvent = onNavigationEvent(fCoerceIn);
            float fFloatValue = ((Number) pairOnNavigationEvent.onExtraCallbackWithResult()).floatValue();
            float fFloatValue2 = ((Number) pairOnNavigationEvent.IAuthTabCallback()).floatValue();
            float fCoerceIn2 = RangesKt.coerceIn(Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat((int) (j >> 32)), -fFloatValue, fFloatValue);
            float fCoerceIn3 = RangesKt.coerceIn(Float.intBitsToFloat((int) j2) + Float.intBitsToFloat((int) j), -fFloatValue2, fFloatValue2);
            jIAuthTabCallback = setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(fCoerceIn2) << 32) | (Float.floatToRawIntBits(fCoerceIn3) & BodyPartID.bodyIdMax));
        } else {
            jIAuthTabCallback = setUseCaseAttached.Companion.IAuthTabCallback();
        }
        return getWrite.IAuthTabCallback(Float.valueOf(fCoerceIn), setUseCaseAttached.onNavigationEvent(jIAuthTabCallback));
    }
}
