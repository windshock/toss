package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class otyycx extends setLottieAdTitleMaxLength<Short, short[], setDislikeWidth> implements KSerializer<short[]> {
    public static final otyycx onExtraCallback = new otyycx();

    private otyycx() {
        super(sp.onNavigationEvent(ShortCompanionObject.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public int onExtraCallback(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "");
        return sArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public setDislikeWidth IAuthTabCallback(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "");
        return new setDislikeWidth(sArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setLottieAdTitleMaxLength
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public short[] onNavigationEvent() {
        return new short[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.getTimeOutListener, o.wk
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public void onNavigationEvent(@NotNull yw ywVar, int i, @NotNull setDislikeWidth setdislikewidth, boolean z) {
        Intrinsics.checkNotNullParameter(ywVar, "");
        Intrinsics.checkNotNullParameter(setdislikewidth, "");
        setdislikewidth.onNavigationEvent(ywVar.IAuthTabCallbackStub(getDescriptor(), i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setLottieAdTitleMaxLength
    public void onExtraCallbackWithResult(@NotNull vyl vylVar, @NotNull short[] sArr, int i) {
        Intrinsics.checkNotNullParameter(vylVar, "");
        Intrinsics.checkNotNullParameter(sArr, "");
        for (int i2 = 0; i2 < i; i2++) {
            vylVar.onWarmupCompleted(getDescriptor(), i2, sArr[i2]);
        }
    }
}
