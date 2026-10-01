package o;

import java.nio.ByteBuffer;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class MenuKtExternalSyntheticLambda6 implements MaterialThemeKtExternalSyntheticLambda2 {
    protected abstract HandwritingHandlerNodeExternalSyntheticLambda0 onExtraCallbackWithResult(MenuKtExternalSyntheticLambda5 menuKtExternalSyntheticLambda5, ByteBuffer byteBuffer);

    @Override // o.MaterialThemeKtExternalSyntheticLambda2
    public final HandwritingHandlerNodeExternalSyntheticLambda0 onExtraCallback(MenuKtExternalSyntheticLambda5 menuKtExternalSyntheticLambda5) {
        ByteBuffer byteBuffer = (ByteBuffer) RecordingInputConnection_androidKt.onExtraCallbackWithResult(menuKtExternalSyntheticLambda5.onExtraCallback);
        RecordingInputConnection_androidKt.onNavigationEvent(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return onExtraCallbackWithResult(menuKtExternalSyntheticLambda5, byteBuffer);
    }
}
