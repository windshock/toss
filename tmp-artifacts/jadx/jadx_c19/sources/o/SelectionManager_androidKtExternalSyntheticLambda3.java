package o;

import java.nio.ByteBuffer;
import o.HandwritingGestureApi34ExternalSyntheticLambda16;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SelectionManager_androidKtExternalSyntheticLambda3 extends HandwritingGestureApi34ExternalSyntheticLambda14 {
    private static final int IAuthTabCallback = Float.floatToIntBits(Float.NaN);

    @Override // o.HandwritingGestureApi34ExternalSyntheticLambda14
    public HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback onNavigationEvent(HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback iAuthTabCallback) throws HandwritingGestureApi34ExternalSyntheticLambda16.onExtraCallbackWithResult {
        int i2 = iAuthTabCallback.onExtraCallback;
        if (!TextFieldDecoratorModifierNodeExternalSyntheticLambda6.getInterfaceDescriptor(i2)) {
            throw new HandwritingGestureApi34ExternalSyntheticLambda16.onExtraCallbackWithResult(iAuthTabCallback);
        }
        if (i2 != 4) {
            return new HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback(iAuthTabCallback.onExtraCallbackWithResult, iAuthTabCallback.onWarmupCompleted, 4);
        }
        return HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback.onNavigationEvent;
    }

    @Override // o.HandwritingGestureApi34ExternalSyntheticLambda16
    public void onExtraCallbackWithResult(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferIAuthTabCallback;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        int i3 = this.onExtraCallbackWithResult.onExtraCallback;
        if (i3 == 21) {
            byteBufferIAuthTabCallback = IAuthTabCallback((i2 / 3) << 2);
            while (iPosition < iLimit) {
                onExtraCallback(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferIAuthTabCallback);
                iPosition += 3;
            }
        } else if (i3 == 22) {
            byteBufferIAuthTabCallback = IAuthTabCallback(i2);
            while (iPosition < iLimit) {
                onExtraCallback((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferIAuthTabCallback);
                iPosition += 4;
            }
        } else if (i3 == 1342177280) {
            byteBufferIAuthTabCallback = IAuthTabCallback((i2 / 3) << 2);
            while (iPosition < iLimit) {
                onExtraCallback(((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferIAuthTabCallback);
                iPosition += 3;
            }
        } else if (i3 == 1610612736) {
            byteBufferIAuthTabCallback = IAuthTabCallback(i2);
            while (iPosition < iLimit) {
                onExtraCallback((byteBuffer.get(iPosition + 3) & 255) | ((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferIAuthTabCallback);
                iPosition += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferIAuthTabCallback.flip();
    }

    private static void onExtraCallback(int i2, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (i2 * 4.656612875245797E-10d));
        if (iFloatToIntBits == IAuthTabCallback) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }
}
