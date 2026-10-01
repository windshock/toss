package o;

import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getClickArea extends setLottieAdTitleMaxLength<Integer, int[], getBackgroundDrawable> implements KSerializer<int[]> {
    public static final getClickArea onExtraCallback = new getClickArea();

    private getClickArea() {
        super(sp.IAuthTabCallback(IntCompanionObject.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    public int onExtraCallback(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        return iArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public getBackgroundDrawable IAuthTabCallback(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        return new getBackgroundDrawable(iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setLottieAdTitleMaxLength
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public int[] onNavigationEvent() {
        return new int[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.getTimeOutListener, o.wk
    public void onNavigationEvent(@NotNull yw ywVar, int i, @NotNull getBackgroundDrawable getbackgrounddrawable, boolean z) {
        Intrinsics.checkNotNullParameter(ywVar, "");
        Intrinsics.checkNotNullParameter(getbackgrounddrawable, "");
        getbackgrounddrawable.onExtraCallbackWithResult(ywVar.onTransact(getDescriptor(), i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setLottieAdTitleMaxLength
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public void onExtraCallbackWithResult(@NotNull vyl vylVar, @NotNull int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(vylVar, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        for (int i2 = 0; i2 < i; i2++) {
            vylVar.onExtraCallback(getDescriptor(), i2, iArr[i2]);
        }
    }
}
