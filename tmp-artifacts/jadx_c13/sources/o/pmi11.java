package o;

import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class pmi11 extends setLottieAdTitleMaxLength<UByte, access13200, getShakeLayout> implements KSerializer<access13200> {
    public static final pmi11 onWarmupCompleted = new pmi11();

    @Override // o.wk
    public /* synthetic */ Object IAuthTabCallback(Object obj) {
        return onExtraCallback(((access13200) obj).onWarmupCompleted());
    }

    @Override // o.wk
    public /* synthetic */ int onExtraCallback(Object obj) {
        return onNavigationEvent(((access13200) obj).onWarmupCompleted());
    }

    @Override // o.setLottieAdTitleMaxLength
    public /* synthetic */ void onExtraCallbackWithResult(vyl vylVar, access13200 access13200Var, int i) {
        onWarmupCompleted(vylVar, access13200Var.onWarmupCompleted(), i);
    }

    @Override // o.setLottieAdTitleMaxLength
    public /* synthetic */ access13200 onNavigationEvent() {
        return access13200.onExtraCallback(onWarmupCompleted());
    }

    private pmi11() {
        super(sp.onNavigationEvent(UByte.Companion));
    }

    protected int onNavigationEvent(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return access13200.onWarmupCompleted(bArr);
    }

    protected getShakeLayout onExtraCallback(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return new getShakeLayout(bArr, null);
    }

    protected byte[] onWarmupCompleted() {
        return access13200.onExtraCallback(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.getTimeOutListener, o.wk
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public void onNavigationEvent(@NotNull yw ywVar, int i, @NotNull getShakeLayout getshakelayout, boolean z) {
        Intrinsics.checkNotNullParameter(ywVar, "");
        Intrinsics.checkNotNullParameter(getshakelayout, "");
        getshakelayout.onWarmupCompleted(UByte.m34constructorimpl(ywVar.asBinder(getDescriptor(), i).IAuthTabCallbackStub()));
    }

    protected void onWarmupCompleted(@NotNull vyl vylVar, @NotNull byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(vylVar, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        for (int i2 = 0; i2 < i; i2++) {
            vylVar.onNavigationEvent(getDescriptor(), i2).onExtraCallbackWithResult(access13200.onExtraCallback(bArr, i2));
        }
    }
}
