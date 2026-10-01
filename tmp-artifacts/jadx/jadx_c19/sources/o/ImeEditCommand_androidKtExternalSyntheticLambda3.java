package o;

import java.nio.ByteBuffer;
import o.HandwritingGestureApi34ExternalSyntheticLambda16;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ImeEditCommand_androidKtExternalSyntheticLambda3 extends HandwritingGestureApi34ExternalSyntheticLambda14 {
    @Override // o.HandwritingGestureApi34ExternalSyntheticLambda14
    public HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback onNavigationEvent(HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback iAuthTabCallback) throws HandwritingGestureApi34ExternalSyntheticLambda16.onExtraCallbackWithResult {
        int i2 = iAuthTabCallback.onExtraCallback;
        if (i2 != 3 && i2 != 2 && i2 != 268435456 && i2 != 21 && i2 != 1342177280 && i2 != 22 && i2 != 1610612736 && i2 != 4) {
            throw new HandwritingGestureApi34ExternalSyntheticLambda16.onExtraCallbackWithResult(iAuthTabCallback);
        }
        if (i2 != 2) {
            return new HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback(iAuthTabCallback.onExtraCallbackWithResult, iAuthTabCallback.onWarmupCompleted, 2);
        }
        return HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback.onNavigationEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    @Override // o.HandwritingGestureApi34ExternalSyntheticLambda16
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onExtraCallbackWithResult(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        int i3 = this.onExtraCallbackWithResult.onExtraCallback;
        if (i3 == 3) {
            i2 <<= 1;
        } else if (i3 != 4) {
            if (i3 != 21) {
                if (i3 != 22) {
                    if (i3 != 268435456) {
                        if (i3 != 1342177280) {
                            if (i3 != 1610612736) {
                                throw new IllegalStateException();
                            }
                            i2 /= 2;
                        }
                    }
                }
            }
            i2 /= 3;
            i2 <<= 1;
        } else {
            i2 /= 2;
        }
        ByteBuffer byteBufferIAuthTabCallback = IAuthTabCallback(i2);
        int i4 = this.onExtraCallbackWithResult.onExtraCallback;
        if (i4 == 3) {
            while (iPosition < iLimit) {
                byteBufferIAuthTabCallback.put((byte) 0);
                byteBufferIAuthTabCallback.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i4 == 4) {
            while (iPosition < iLimit) {
                short sOnWarmupCompleted = (short) (TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferIAuthTabCallback.put((byte) sOnWarmupCompleted);
                byteBufferIAuthTabCallback.put((byte) (sOnWarmupCompleted >> 8));
                iPosition += 4;
            }
        } else if (i4 == 21) {
            while (iPosition < iLimit) {
                byteBufferIAuthTabCallback.put(byteBuffer.get(iPosition + 1));
                byteBufferIAuthTabCallback.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i4 == 22) {
            while (iPosition < iLimit) {
                byteBufferIAuthTabCallback.put(byteBuffer.get(iPosition + 2));
                byteBufferIAuthTabCallback.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        } else if (i4 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferIAuthTabCallback.put(byteBuffer.get(iPosition + 1));
                byteBufferIAuthTabCallback.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i4 == 1342177280) {
            while (iPosition < iLimit) {
                byteBufferIAuthTabCallback.put(byteBuffer.get(iPosition + 1));
                byteBufferIAuthTabCallback.put(byteBuffer.get(iPosition));
                iPosition += 3;
            }
        } else {
            if (i4 != 1610612736) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferIAuthTabCallback.put(byteBuffer.get(iPosition + 1));
                byteBufferIAuthTabCallback.put(byteBuffer.get(iPosition));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferIAuthTabCallback.flip();
    }
}
