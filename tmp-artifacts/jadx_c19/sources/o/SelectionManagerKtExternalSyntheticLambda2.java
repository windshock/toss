package o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SelectionManagerKtExternalSyntheticLambda2 {
    public static ByteBuffer IAuthTabCallback(ByteBuffer byteBuffer, int i2, int i3, int i4, int i5) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
        int iPosition = byteBuffer.position();
        while (byteBuffer.hasRemaining() && i4 < i5) {
            onNavigationEvent(byteBufferOrder, (int) ((IAuthTabCallback(byteBuffer, i2) * i4) / i5), i2);
            if (byteBuffer.position() == iPosition + i3) {
                i4++;
                iPosition = byteBuffer.position();
            }
        }
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.flip();
        return byteBufferOrder;
    }

    public static int IAuthTabCallback(ByteBuffer byteBuffer, int i2) {
        if (i2 == 2) {
            return ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
        }
        if (i2 == 3) {
            return (byteBuffer.get() & 255) << 24;
        }
        if (i2 == 4) {
            float fOnWarmupCompleted = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(byteBuffer.getFloat(), -1.0f, 1.0f);
            return fOnWarmupCompleted < 0.0f ? (int) ((-fOnWarmupCompleted) * (-2.1474836E9f)) : (int) (fOnWarmupCompleted * 2.1474836E9f);
        }
        if (i2 == 21) {
            return ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
        }
        if (i2 == 22) {
            return ((byteBuffer.get() & 255) << 24) | (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
        }
        if (i2 == 268435456) {
            return ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 24);
        }
        if (i2 == 1342177280) {
            return ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
        }
        if (i2 == 1610612736) {
            return (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8);
        }
        throw new IllegalStateException();
    }

    public static void onNavigationEvent(ByteBuffer byteBuffer, int i2, int i3) {
        if (i3 == 2) {
            byteBuffer.put((byte) (i2 >> 16));
            byteBuffer.put((byte) (i2 >> 24));
            return;
        }
        if (i3 == 3) {
            byteBuffer.put((byte) (i2 >> 24));
            return;
        }
        if (i3 == 4) {
            if (i2 < 0) {
                byteBuffer.putFloat((-i2) / (-2.1474836E9f));
                return;
            } else {
                byteBuffer.putFloat(i2 / 2.1474836E9f);
                return;
            }
        }
        if (i3 == 21) {
            byteBuffer.put((byte) (i2 >> 8));
            byteBuffer.put((byte) (i2 >> 16));
            byteBuffer.put((byte) (i2 >> 24));
            return;
        }
        if (i3 == 22) {
            byteBuffer.put((byte) i2);
            byteBuffer.put((byte) (i2 >> 8));
            byteBuffer.put((byte) (i2 >> 16));
            byteBuffer.put((byte) (i2 >> 24));
            return;
        }
        if (i3 == 268435456) {
            byteBuffer.put((byte) (i2 >> 24));
            byteBuffer.put((byte) (i2 >> 16));
            return;
        }
        if (i3 == 1342177280) {
            byteBuffer.put((byte) (i2 >> 24));
            byteBuffer.put((byte) (i2 >> 16));
            byteBuffer.put((byte) (i2 >> 8));
        } else {
            if (i3 == 1610612736) {
                byteBuffer.put((byte) (i2 >> 24));
                byteBuffer.put((byte) (i2 >> 16));
                byteBuffer.put((byte) (i2 >> 8));
                byteBuffer.put((byte) i2);
                return;
            }
            throw new IllegalStateException();
        }
    }
}
