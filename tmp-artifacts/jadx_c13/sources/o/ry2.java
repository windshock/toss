package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ry2 extends setLottieAdTitleMaxLength<access13000, access13100, syc2> implements KSerializer<access13100> {
    public static final ry2 onExtraCallback = new ry2();

    @Override // o.wk
    public /* bridge */ /* synthetic */ Object IAuthTabCallback(Object obj) {
        return IAuthTabCallback(((access13100) obj).onWarmupCompleted());
    }

    @Override // o.wk
    public /* synthetic */ int onExtraCallback(Object obj) {
        return onExtraCallbackWithResult(((access13100) obj).onWarmupCompleted());
    }

    @Override // o.setLottieAdTitleMaxLength
    public /* synthetic */ void onExtraCallbackWithResult(vyl vylVar, access13100 access13100Var, int i) {
        onExtraCallback(vylVar, access13100Var.onWarmupCompleted(), i);
    }

    @Override // o.setLottieAdTitleMaxLength
    public /* synthetic */ access13100 onNavigationEvent() {
        return access13100.onExtraCallbackWithResult(onWarmupCompleted());
    }

    private ry2() {
        super(sp.onExtraCallback(access13000.Companion));
    }

    protected int onExtraCallbackWithResult(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "");
        return access13100.onWarmupCompleted(jArr);
    }

    protected syc2 IAuthTabCallback(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "");
        return new syc2(jArr, null);
    }

    protected long[] onWarmupCompleted() {
        return access13100.IAuthTabCallback(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.getTimeOutListener, o.wk
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public void onNavigationEvent(@NotNull yw ywVar, int i, @NotNull syc2 syc2Var, boolean z) {
        Intrinsics.checkNotNullParameter(ywVar, "");
        Intrinsics.checkNotNullParameter(syc2Var, "");
        syc2Var.onNavigationEvent(access13000.onExtraCallback(ywVar.asBinder(getDescriptor(), i).access100()));
    }

    protected void onExtraCallback(@NotNull vyl vylVar, @NotNull long[] jArr, int i) {
        Intrinsics.checkNotNullParameter(vylVar, "");
        Intrinsics.checkNotNullParameter(jArr, "");
        for (int i2 = 0; i2 < i; i2++) {
            vylVar.onNavigationEvent(getDescriptor(), i2).onExtraCallbackWithResult(access13100.onWarmupCompleted(jArr, i2));
        }
    }
}
