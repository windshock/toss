package o;

import java.nio.ByteBuffer;
import o.SaversKtExternalSyntheticLambda33;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class interruptTask implements SaversKtExternalSyntheticLambda33<ByteBuffer> {
    private final ByteBuffer onExtraCallbackWithResult;

    @Override // o.SaversKtExternalSyntheticLambda33
    public void onWarmupCompleted() {
    }

    public interruptTask(ByteBuffer byteBuffer) {
        this.onExtraCallbackWithResult = byteBuffer;
    }

    @Override // o.SaversKtExternalSyntheticLambda33
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public ByteBuffer onNavigationEvent() {
        this.onExtraCallbackWithResult.position(0);
        return this.onExtraCallbackWithResult;
    }

    public static class onNavigationEvent implements SaversKtExternalSyntheticLambda33.onExtraCallback<ByteBuffer> {
        @Override // o.SaversKtExternalSyntheticLambda33.onExtraCallback
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public SaversKtExternalSyntheticLambda33<ByteBuffer> onExtraCallback(ByteBuffer byteBuffer) {
            return new interruptTask(byteBuffer);
        }

        @Override // o.SaversKtExternalSyntheticLambda33.onExtraCallback
        public Class<ByteBuffer> onExtraCallbackWithResult() {
            return ByteBuffer.class;
        }
    }
}
