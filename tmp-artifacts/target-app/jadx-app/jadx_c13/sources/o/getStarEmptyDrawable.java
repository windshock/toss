package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getStarEmptyDrawable extends setLottieAdTitleMaxLength<getU64, TombstoneProtosRegisterBuilder, thx2> implements KSerializer<TombstoneProtosRegisterBuilder> {
    public static final getStarEmptyDrawable IAuthTabCallback = new getStarEmptyDrawable();

    @Override // o.wk
    public /* bridge */ /* synthetic */ Object IAuthTabCallback(Object obj) {
        return IAuthTabCallback(((TombstoneProtosRegisterBuilder) obj).onWarmupCompleted());
    }

    @Override // o.wk
    public /* synthetic */ int onExtraCallback(Object obj) {
        return onWarmupCompleted(((TombstoneProtosRegisterBuilder) obj).onWarmupCompleted());
    }

    @Override // o.setLottieAdTitleMaxLength
    public /* synthetic */ void onExtraCallbackWithResult(vyl vylVar, TombstoneProtosRegisterBuilder tombstoneProtosRegisterBuilder, int i) {
        onWarmupCompleted(vylVar, tombstoneProtosRegisterBuilder.onWarmupCompleted(), i);
    }

    @Override // o.setLottieAdTitleMaxLength
    public /* synthetic */ TombstoneProtosRegisterBuilder onNavigationEvent() {
        return TombstoneProtosRegisterBuilder.onWarmupCompleted(onWarmupCompleted());
    }

    private getStarEmptyDrawable() {
        super(sp.onExtraCallback(getU64.Companion));
    }

    protected int onWarmupCompleted(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "");
        return TombstoneProtosRegisterBuilder.onExtraCallbackWithResult(sArr);
    }

    protected thx2 IAuthTabCallback(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "");
        return new thx2(sArr, null);
    }

    protected short[] onWarmupCompleted() {
        return TombstoneProtosRegisterBuilder.onExtraCallback(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.getTimeOutListener, o.wk
    public void onNavigationEvent(@NotNull yw ywVar, int i, @NotNull thx2 thx2Var, boolean z) {
        Intrinsics.checkNotNullParameter(ywVar, "");
        Intrinsics.checkNotNullParameter(thx2Var, "");
        thx2Var.onWarmupCompleted(getU64.onNavigationEvent(ywVar.asBinder(getDescriptor(), i).IAuthTabCallbackStubProxy()));
    }

    protected void onWarmupCompleted(@NotNull vyl vylVar, @NotNull short[] sArr, int i) {
        Intrinsics.checkNotNullParameter(vylVar, "");
        Intrinsics.checkNotNullParameter(sArr, "");
        for (int i2 = 0; i2 < i; i2++) {
            vylVar.onNavigationEvent(getDescriptor(), i2).onExtraCallbackWithResult(TombstoneProtosRegisterBuilder.onWarmupCompleted(sArr, i2));
        }
    }
}
