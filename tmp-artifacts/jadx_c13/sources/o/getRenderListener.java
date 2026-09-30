package o;

import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getRenderListener extends setLottieAdTitleMaxLength<Character, char[], getBgMaterialCenterCalcColor> implements KSerializer<char[]> {
    public static final getRenderListener onNavigationEvent = new getRenderListener();

    private getRenderListener() {
        super(sp.onExtraCallbackWithResult(CharCompanionObject.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    public int onExtraCallback(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "");
        return cArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    public getBgMaterialCenterCalcColor IAuthTabCallback(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "");
        return new getBgMaterialCenterCalcColor(cArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setLottieAdTitleMaxLength
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public char[] onNavigationEvent() {
        return new char[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.getTimeOutListener, o.wk
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public void onNavigationEvent(@NotNull yw ywVar, int i, @NotNull getBgMaterialCenterCalcColor getbgmaterialcentercalccolor, boolean z) {
        Intrinsics.checkNotNullParameter(ywVar, "");
        Intrinsics.checkNotNullParameter(getbgmaterialcentercalccolor, "");
        getbgmaterialcentercalccolor.onWarmupCompleted(ywVar.onNavigationEvent(getDescriptor(), i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setLottieAdTitleMaxLength
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public void onExtraCallbackWithResult(@NotNull vyl vylVar, @NotNull char[] cArr, int i) {
        Intrinsics.checkNotNullParameter(vylVar, "");
        Intrinsics.checkNotNullParameter(cArr, "");
        for (int i2 = 0; i2 < i; i2++) {
            vylVar.onExtraCallback(getDescriptor(), i2, cArr[i2]);
        }
    }
}
