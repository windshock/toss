package o;

import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class aeu3 extends setLottieAdTitleMaxLength<Float, float[], aeu1> implements KSerializer<float[]> {
    public static final aeu3 IAuthTabCallback = new aeu3();

    private aeu3() {
        super(sp.onWarmupCompleted(FloatCompanionObject.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public int onExtraCallback(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "");
        return fArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public aeu1 IAuthTabCallback(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "");
        return new aeu1(fArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setLottieAdTitleMaxLength
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public float[] onNavigationEvent() {
        return new float[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.getTimeOutListener, o.wk
    public void onNavigationEvent(@NotNull yw ywVar, int i, @NotNull aeu1 aeu1Var, boolean z) {
        Intrinsics.checkNotNullParameter(ywVar, "");
        Intrinsics.checkNotNullParameter(aeu1Var, "");
        aeu1Var.onWarmupCompleted(ywVar.onWarmupCompleted(getDescriptor(), i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setLottieAdTitleMaxLength
    public void onExtraCallbackWithResult(@NotNull vyl vylVar, @NotNull float[] fArr, int i) {
        Intrinsics.checkNotNullParameter(vylVar, "");
        Intrinsics.checkNotNullParameter(fArr, "");
        for (int i2 = 0; i2 < i; i2++) {
            vylVar.onExtraCallback(getDescriptor(), i2, fArr[i2]);
        }
    }
}
