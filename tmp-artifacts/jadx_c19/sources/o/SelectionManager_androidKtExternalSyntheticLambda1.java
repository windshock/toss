package o;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SelectionManager_androidKtExternalSyntheticLambda1 {
    private static final byte[] onNavigationEvent = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};
    private static final byte[] onWarmupCompleted = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    private ByteBuffer IAuthTabCallback = HandwritingGestureApi34ExternalSyntheticLambda16.onNavigationEvent;
    private int onExtraCallback = 0;
    private int onExtraCallbackWithResult = 2;

    public void onExtraCallbackWithResult(SelectionControllerExternalSyntheticLambda2 selectionControllerExternalSyntheticLambda2, List<byte[]> list) {
        ByteBuffer byteBuffer = selectionControllerExternalSyntheticLambda2.onExtraCallback;
        if (selectionControllerExternalSyntheticLambda2.onExtraCallback.limit() - selectionControllerExternalSyntheticLambda2.onExtraCallback.position() == 0) {
            return;
        }
        this.IAuthTabCallback = onNavigationEvent(selectionControllerExternalSyntheticLambda2.onExtraCallback, (this.onExtraCallbackWithResult == 2 && (list.size() == 1 || list.size() == 3)) ? list.get(0) : null);
        selectionControllerExternalSyntheticLambda2.onNavigationEvent();
        selectionControllerExternalSyntheticLambda2.IAuthTabCallback(this.IAuthTabCallback.remaining());
        selectionControllerExternalSyntheticLambda2.onExtraCallback.put(this.IAuthTabCallback);
        selectionControllerExternalSyntheticLambda2.IAuthTabCallbackDefault();
    }

    public void onWarmupCompleted() {
        this.IAuthTabCallback = HandwritingGestureApi34ExternalSyntheticLambda16.onNavigationEvent;
        this.onExtraCallback = 0;
        this.onExtraCallbackWithResult = 2;
    }

    private ByteBuffer onNavigationEvent(ByteBuffer byteBuffer, @Nullable byte[] bArr) {
        int i2;
        int length;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i3 = iLimit - iPosition;
        int i4 = (i3 + OggPageHeader.MAX_SEGMENT_COUNT) / OggPageHeader.MAX_SEGMENT_COUNT;
        int length2 = i4 + 27 + i3;
        if (this.onExtraCallbackWithResult == 2) {
            if (bArr != null) {
                length = bArr.length + 28;
            } else {
                length = onNavigationEvent.length;
            }
            length2 += onWarmupCompleted.length + length;
            i2 = length;
        } else {
            i2 = 0;
        }
        ByteBuffer byteBufferOnExtraCallback = onExtraCallback(length2);
        if (this.onExtraCallbackWithResult == 2) {
            if (bArr != null) {
                onWarmupCompleted(byteBufferOnExtraCallback, bArr);
            } else {
                byteBufferOnExtraCallback.put(onNavigationEvent);
            }
            byteBufferOnExtraCallback.put(onWarmupCompleted);
        }
        int iOnExtraCallbackWithResult = this.onExtraCallback + ExposedDropdownMenu_androidExternalSyntheticLambda0.onExtraCallbackWithResult(byteBuffer);
        this.onExtraCallback = iOnExtraCallbackWithResult;
        onNavigationEvent(byteBufferOnExtraCallback, iOnExtraCallbackWithResult, this.onExtraCallbackWithResult, i4, false);
        for (int i5 = 0; i5 < i4; i5++) {
            if (i3 >= 255) {
                byteBufferOnExtraCallback.put((byte) -1);
                i3 -= 255;
            } else {
                byteBufferOnExtraCallback.put((byte) i3);
                i3 = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBufferOnExtraCallback.put(byteBuffer.get(iPosition));
            iPosition++;
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferOnExtraCallback.flip();
        if (this.onExtraCallbackWithResult == 2) {
            byte[] bArrArray = byteBufferOnExtraCallback.array();
            int iArrayOffset = byteBufferOnExtraCallback.arrayOffset();
            byte[] bArr2 = onWarmupCompleted;
            Object[] objArr = {bArrArray, Integer.valueOf(iArrayOffset + i2 + bArr2.length), Integer.valueOf(byteBufferOnExtraCallback.limit() - byteBufferOnExtraCallback.position()), 0};
            byteBufferOnExtraCallback.putInt(i2 + bArr2.length + 22, ((Integer) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(473604105, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, -473604088)).intValue());
        } else {
            Object[] objArr2 = {byteBufferOnExtraCallback.array(), Integer.valueOf(byteBufferOnExtraCallback.arrayOffset()), Integer.valueOf(byteBufferOnExtraCallback.limit() - byteBufferOnExtraCallback.position()), 0};
            byteBufferOnExtraCallback.putInt(22, ((Integer) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(473604105, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr2, -473604088)).intValue());
        }
        this.onExtraCallbackWithResult++;
        return byteBufferOnExtraCallback;
    }

    private void onWarmupCompleted(ByteBuffer byteBuffer, byte[] bArr) {
        onNavigationEvent(byteBuffer, 0L, 0, 1, true);
        byteBuffer.put(UnsignedBytes.checkedCast(bArr.length));
        byteBuffer.put(bArr);
        Object[] objArr = {byteBuffer.array(), Integer.valueOf(byteBuffer.arrayOffset()), Integer.valueOf(bArr.length + 28), 0};
        byteBuffer.putInt(22, ((Integer) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(473604105, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, -473604088)).intValue());
        byteBuffer.position(bArr.length + 28);
    }

    private void onNavigationEvent(ByteBuffer byteBuffer, long j, int i2, int i3, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i2);
        byteBuffer.putInt(0);
        byteBuffer.put(UnsignedBytes.checkedCast(i3));
    }

    private ByteBuffer onExtraCallback(int i2) {
        if (this.IAuthTabCallback.capacity() < i2) {
            this.IAuthTabCallback = ByteBuffer.allocate(i2).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.IAuthTabCallback.clear();
        }
        return this.IAuthTabCallback;
    }
}
