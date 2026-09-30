package o;

import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setClipChildren extends setLottieAdTitleMaxLength<Boolean, boolean[], yyc> implements KSerializer<boolean[]> {
    public static final setClipChildren onWarmupCompleted = new setClipChildren();

    private setClipChildren() {
        super(sp.onExtraCallback(BooleanCompanionObject.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    public int onExtraCallback(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "");
        return zArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public yyc IAuthTabCallback(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "");
        return new yyc(zArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setLottieAdTitleMaxLength
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public boolean[] onNavigationEvent() {
        return new boolean[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.getTimeOutListener, o.wk
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public void onNavigationEvent(@NotNull yw ywVar, int i, @NotNull yyc yycVar, boolean z) {
        Intrinsics.checkNotNullParameter(ywVar, "");
        Intrinsics.checkNotNullParameter(yycVar, "");
        yycVar.onNavigationEvent(ywVar.onExtraCallbackWithResult(getDescriptor(), i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setLottieAdTitleMaxLength
    public void onExtraCallbackWithResult(@NotNull vyl vylVar, @NotNull boolean[] zArr, int i) {
        Intrinsics.checkNotNullParameter(vylVar, "");
        Intrinsics.checkNotNullParameter(zArr, "");
        for (int i2 = 0; i2 < i; i2++) {
            vylVar.onNavigationEvent(getDescriptor(), i2, zArr[i2]);
        }
    }
}
