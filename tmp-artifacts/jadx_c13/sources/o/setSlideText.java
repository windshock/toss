package o;

import kotlin.UInt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setSlideText extends setLottieAdTitleMaxLength<UInt, access13400, getSlideUpAnimatorSet> implements KSerializer<access13400> {
    public static final setSlideText IAuthTabCallback = new setSlideText();

    @Override // o.wk
    public /* bridge */ /* synthetic */ Object IAuthTabCallback(Object obj) {
        return IAuthTabCallback(((access13400) obj).IAuthTabCallback());
    }

    @Override // o.wk
    public /* synthetic */ int onExtraCallback(Object obj) {
        return onWarmupCompleted(((access13400) obj).IAuthTabCallback());
    }

    @Override // o.setLottieAdTitleMaxLength
    public /* synthetic */ void onExtraCallbackWithResult(vyl vylVar, access13400 access13400Var, int i) {
        onExtraCallback(vylVar, access13400Var.IAuthTabCallback(), i);
    }

    @Override // o.setLottieAdTitleMaxLength
    public /* synthetic */ access13400 onNavigationEvent() {
        return access13400.onExtraCallback(onWarmupCompleted());
    }

    private setSlideText() {
        super(sp.onWarmupCompleted(UInt.Companion));
    }

    protected int onWarmupCompleted(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        return access13400.IAuthTabCallback(iArr);
    }

    protected getSlideUpAnimatorSet IAuthTabCallback(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        return new getSlideUpAnimatorSet(iArr, null);
    }

    protected int[] onWarmupCompleted() {
        return access13400.onExtraCallback(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.getTimeOutListener, o.wk
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public void onNavigationEvent(@NotNull yw ywVar, int i, @NotNull getSlideUpAnimatorSet getslideupanimatorset, boolean z) {
        Intrinsics.checkNotNullParameter(ywVar, "");
        Intrinsics.checkNotNullParameter(getslideupanimatorset, "");
        getslideupanimatorset.onExtraCallbackWithResult(UInt.m35constructorimpl(ywVar.asBinder(getDescriptor(), i).asInterface()));
    }

    protected void onExtraCallback(@NotNull vyl vylVar, @NotNull int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(vylVar, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        for (int i2 = 0; i2 < i; i2++) {
            vylVar.onNavigationEvent(getDescriptor(), i2).onWarmupCompleted(access13400.onExtraCallbackWithResult(iArr, i2));
        }
    }
}
