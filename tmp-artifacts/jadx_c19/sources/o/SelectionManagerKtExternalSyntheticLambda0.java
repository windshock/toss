package o;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.Arrays;
import o.HandwritingGestureApi34ExternalSyntheticLambda16;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SelectionManagerKtExternalSyntheticLambda0 extends HandwritingGestureApi34ExternalSyntheticLambda14 {
    private int[] IAuthTabCallback;
    private int[] onWarmupCompleted;

    public void onExtraCallbackWithResult(@Nullable int[] iArr) {
        this.onWarmupCompleted = iArr;
    }

    @Override // o.HandwritingGestureApi34ExternalSyntheticLambda14
    public HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback onNavigationEvent(HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback iAuthTabCallback) throws HandwritingGestureApi34ExternalSyntheticLambda16.onExtraCallbackWithResult {
        int[] iArr = this.onWarmupCompleted;
        if (iArr == null) {
            return HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback.onNavigationEvent;
        }
        if (!TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallbackStubProxy(iAuthTabCallback.onExtraCallback)) {
            throw new HandwritingGestureApi34ExternalSyntheticLambda16.onExtraCallbackWithResult(iAuthTabCallback);
        }
        boolean z = iAuthTabCallback.onWarmupCompleted != iArr.length;
        int i2 = 0;
        while (i2 < iArr.length) {
            int i3 = iArr[i2];
            if (i3 >= iAuthTabCallback.onWarmupCompleted) {
                throw new HandwritingGestureApi34ExternalSyntheticLambda16.onExtraCallbackWithResult("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", iAuthTabCallback);
            }
            z |= i3 != i2;
            i2++;
        }
        if (z) {
            return new HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback(iAuthTabCallback.onExtraCallbackWithResult, iArr.length, iAuthTabCallback.onExtraCallback);
        }
        return HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback.onNavigationEvent;
    }

    @Override // o.HandwritingGestureApi34ExternalSyntheticLambda16
    public void onExtraCallbackWithResult(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallback);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferIAuthTabCallback = IAuthTabCallback(((iLimit - iPosition) / this.onExtraCallbackWithResult.IAuthTabCallback) * this.onExtraCallback.IAuthTabCallback);
        while (iPosition < iLimit) {
            for (int i2 : iArr) {
                int iIntValue = (((Integer) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(-1761319957, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{Integer.valueOf(this.onExtraCallbackWithResult.onExtraCallback)}, 1761319976)).intValue() * i2) + iPosition;
                int i3 = this.onExtraCallbackWithResult.onExtraCallback;
                if (i3 == 2) {
                    byteBufferIAuthTabCallback.putShort(byteBuffer.getShort(iIntValue));
                } else if (i3 == 3) {
                    byteBufferIAuthTabCallback.put(byteBuffer.get(iIntValue));
                } else if (i3 == 4) {
                    byteBufferIAuthTabCallback.putFloat(byteBuffer.getFloat(iIntValue));
                } else if (i3 == 21) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallbackWithResult(byteBufferIAuthTabCallback, TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(byteBuffer, iIntValue));
                } else {
                    if (i3 != 22) {
                        if (i3 != 268435456) {
                            if (i3 != 1342177280) {
                                if (i3 != 1610612736) {
                                    throw new IllegalStateException("Unexpected encoding: " + this.onExtraCallbackWithResult.onExtraCallback);
                                }
                            }
                            TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallbackWithResult(byteBufferIAuthTabCallback, TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(byteBuffer, iIntValue));
                        }
                        byteBufferIAuthTabCallback.putShort(byteBuffer.getShort(iIntValue));
                    }
                    byteBufferIAuthTabCallback.putInt(byteBuffer.getInt(iIntValue));
                }
            }
            iPosition += this.onExtraCallbackWithResult.IAuthTabCallback;
        }
        byteBuffer.position(iLimit);
        byteBufferIAuthTabCallback.flip();
    }

    @Override // o.HandwritingGestureApi34ExternalSyntheticLambda14
    public void asBinder() {
        this.IAuthTabCallback = this.onWarmupCompleted;
    }

    @Override // o.HandwritingGestureApi34ExternalSyntheticLambda14
    public void IAuthTabCallbackStub() {
        this.IAuthTabCallback = null;
        this.onWarmupCompleted = null;
    }
}
