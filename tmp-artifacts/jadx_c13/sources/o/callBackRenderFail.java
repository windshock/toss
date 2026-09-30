package o;

import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class callBackRenderFail extends setLottieAdTitleMaxLength<Byte, byte[], beginHideFromVisible> implements KSerializer<byte[]> {
    public static final callBackRenderFail onExtraCallbackWithResult = new callBackRenderFail();

    private callBackRenderFail() {
        super(sp.onExtraCallback(ByteCompanionObject.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    public int onExtraCallback(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public beginHideFromVisible IAuthTabCallback(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return new beginHideFromVisible(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setLottieAdTitleMaxLength
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public byte[] onNavigationEvent() {
        return new byte[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.getTimeOutListener, o.wk
    public void onNavigationEvent(@NotNull yw ywVar, int i, @NotNull beginHideFromVisible beginhidefromvisible, boolean z) {
        Intrinsics.checkNotNullParameter(ywVar, "");
        Intrinsics.checkNotNullParameter(beginhidefromvisible, "");
        beginhidefromvisible.onExtraCallbackWithResult(ywVar.onExtraCallback(getDescriptor(), i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setLottieAdTitleMaxLength
    public void onExtraCallbackWithResult(@NotNull vyl vylVar, @NotNull byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(vylVar, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        for (int i2 = 0; i2 < i; i2++) {
            vylVar.onExtraCallbackWithResult(getDescriptor(), i2, bArr[i2]);
        }
    }
}
