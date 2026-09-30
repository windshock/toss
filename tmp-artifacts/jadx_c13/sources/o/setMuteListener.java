package o;

import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setMuteListener extends setLottieAdTitleMaxLength<Double, double[], setLogoUnionHeight> implements KSerializer<double[]> {
    public static final setMuteListener onNavigationEvent = new setMuteListener();

    private setMuteListener() {
        super(sp.onWarmupCompleted(DoubleCompanionObject.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public int onExtraCallback(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "");
        return dArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public setLogoUnionHeight IAuthTabCallback(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "");
        return new setLogoUnionHeight(dArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setLottieAdTitleMaxLength
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public double[] onNavigationEvent() {
        return new double[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.getTimeOutListener, o.wk
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public void onNavigationEvent(@NotNull yw ywVar, int i, @NotNull setLogoUnionHeight setlogounionheight, boolean z) {
        Intrinsics.checkNotNullParameter(ywVar, "");
        Intrinsics.checkNotNullParameter(setlogounionheight, "");
        setlogounionheight.onExtraCallback(ywVar.IAuthTabCallback(getDescriptor(), i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setLottieAdTitleMaxLength
    public void onExtraCallbackWithResult(@NotNull vyl vylVar, @NotNull double[] dArr, int i) {
        Intrinsics.checkNotNullParameter(vylVar, "");
        Intrinsics.checkNotNullParameter(dArr, "");
        for (int i2 = 0; i2 < i; i2++) {
            vylVar.onExtraCallbackWithResult(getDescriptor(), i2, dArr[i2]);
        }
    }
}
