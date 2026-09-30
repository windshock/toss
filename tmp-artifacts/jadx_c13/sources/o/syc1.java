package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class syc1 extends setLottieAdTitleMaxLength<Long, long[], getLottieView> implements KSerializer<long[]> {
    public static final syc1 onExtraCallbackWithResult = new syc1();

    private syc1() {
        super(sp.onNavigationEvent(LongCompanionObject.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public int onExtraCallback(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "");
        return jArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public getLottieView IAuthTabCallback(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "");
        return new getLottieView(jArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setLottieAdTitleMaxLength
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public long[] onNavigationEvent() {
        return new long[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.getTimeOutListener, o.wk
    public void onNavigationEvent(@NotNull yw ywVar, int i, @NotNull getLottieView getlottieview, boolean z) {
        Intrinsics.checkNotNullParameter(ywVar, "");
        Intrinsics.checkNotNullParameter(getlottieview, "");
        getlottieview.onWarmupCompleted(ywVar.IAuthTabCallbackDefault(getDescriptor(), i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setLottieAdTitleMaxLength
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public void onExtraCallbackWithResult(@NotNull vyl vylVar, @NotNull long[] jArr, int i) {
        Intrinsics.checkNotNullParameter(vylVar, "");
        Intrinsics.checkNotNullParameter(jArr, "");
        for (int i2 = 0; i2 < i; i2++) {
            vylVar.onExtraCallback(getDescriptor(), i2, jArr[i2]);
        }
    }
}
