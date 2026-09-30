package o;

import java.nio.ByteBuffer;
import o.HandwritingGestureApi34ExternalSyntheticLambda16;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SelectionManager_androidKtExternalSyntheticLambda4 extends HandwritingGestureApi34ExternalSyntheticLambda14 {
    private byte[] IAuthTabCallback;
    private int IAuthTabCallbackDefault;
    private byte[] IAuthTabCallbackStub;
    private final short IAuthTabCallbackStubProxy;
    private final long IAuthTabCallback_Parcel;
    private long ICustomTabsCallback;
    private final float access000;
    private int access100;
    private int asBinder;
    private boolean asInterface;
    private int extraCallbackWithResult;
    private final int getInterfaceDescriptor;
    private final long onTransact;
    private int onWarmupCompleted;

    private static int onNavigationEvent(byte b, byte b2) {
        return (b << 8) | (b2 & 255);
    }

    public SelectionManager_androidKtExternalSyntheticLambda4() {
        this(100000L, 0.2f, 2000000L, 10, (short) 1024);
    }

    public SelectionManager_androidKtExternalSyntheticLambda4(long j, float f, long j2, int i2, short s) {
        boolean z = false;
        this.access100 = 0;
        this.IAuthTabCallbackDefault = 0;
        this.asBinder = 0;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        }
        RecordingInputConnection_androidKt.onNavigationEvent(z);
        this.IAuthTabCallback_Parcel = j;
        this.access000 = f;
        this.onTransact = j2;
        this.getInterfaceDescriptor = i2;
        this.IAuthTabCallbackStubProxy = s;
        byte[] bArr = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted;
        this.IAuthTabCallbackStub = bArr;
        this.IAuthTabCallback = bArr;
    }

    public void onExtraCallback(boolean z) {
        this.asInterface = z;
    }

    public long IAuthTabCallback_Parcel() {
        return this.ICustomTabsCallback;
    }

    @Override // o.HandwritingGestureApi34ExternalSyntheticLambda14
    public HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback onNavigationEvent(HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback iAuthTabCallback) throws HandwritingGestureApi34ExternalSyntheticLambda16.onExtraCallbackWithResult {
        if (iAuthTabCallback.onExtraCallback == 2) {
            return iAuthTabCallback.onExtraCallbackWithResult == -1 ? HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback.onNavigationEvent : iAuthTabCallback;
        }
        throw new HandwritingGestureApi34ExternalSyntheticLambda16.onExtraCallbackWithResult(iAuthTabCallback);
    }

    @Override // o.HandwritingGestureApi34ExternalSyntheticLambda14, o.HandwritingGestureApi34ExternalSyntheticLambda16
    public boolean IAuthTabCallback() {
        return super.IAuthTabCallback() && this.asInterface;
    }

    @Override // o.HandwritingGestureApi34ExternalSyntheticLambda16
    public void onExtraCallbackWithResult(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !asInterface()) {
            int i2 = this.extraCallbackWithResult;
            if (i2 == 0) {
                onNavigationEvent(byteBuffer);
            } else if (i2 == 1) {
                IAuthTabCallbackDefault(byteBuffer);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @Override // o.HandwritingGestureApi34ExternalSyntheticLambda14
    public void IAuthTabCallbackDefault() {
        if (this.asBinder > 0) {
            onWarmupCompleted(true);
            this.access100 = 0;
        }
    }

    @Override // o.HandwritingGestureApi34ExternalSyntheticLambda14
    public void asBinder() {
        if (IAuthTabCallback()) {
            this.onWarmupCompleted = this.onExtraCallbackWithResult.onWarmupCompleted << 1;
            int iOnWarmupCompleted = onWarmupCompleted(onWarmupCompleted(this.IAuthTabCallback_Parcel) / 2) << 1;
            if (this.IAuthTabCallbackStub.length != iOnWarmupCompleted) {
                this.IAuthTabCallbackStub = new byte[iOnWarmupCompleted];
                this.IAuthTabCallback = new byte[iOnWarmupCompleted];
            }
        }
        this.extraCallbackWithResult = 0;
        this.ICustomTabsCallback = 0L;
        this.access100 = 0;
        this.IAuthTabCallbackDefault = 0;
        this.asBinder = 0;
    }

    @Override // o.HandwritingGestureApi34ExternalSyntheticLambda14
    public void IAuthTabCallbackStub() {
        this.asInterface = false;
        byte[] bArr = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted;
        this.IAuthTabCallbackStub = bArr;
        this.IAuthTabCallback = bArr;
    }

    private void onNavigationEvent(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.IAuthTabCallbackStub.length));
        int iOnExtraCallback = onExtraCallback(byteBuffer);
        if (iOnExtraCallback == byteBuffer.position()) {
            this.extraCallbackWithResult = 1;
        } else {
            byteBuffer.limit(Math.min(iOnExtraCallback, byteBuffer.capacity()));
            IAuthTabCallback(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    private void IAuthTabCallbackDefault(ByteBuffer byteBuffer) {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallbackDefault < this.IAuthTabCallbackStub.length);
        int iLimit = byteBuffer.limit();
        int iOnWarmupCompleted = onWarmupCompleted(byteBuffer);
        int iPosition = iOnWarmupCompleted - byteBuffer.position();
        int length = this.IAuthTabCallbackDefault;
        int i2 = this.asBinder;
        byte[] bArr = this.IAuthTabCallbackStub;
        int length2 = length + i2;
        if (length2 < bArr.length) {
            length = bArr.length;
        } else {
            length2 = i2 - (bArr.length - length);
        }
        int i3 = length - length2;
        boolean z = iOnWarmupCompleted < iLimit;
        int iMin = Math.min(iPosition, i3);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.IAuthTabCallbackStub, length2, iMin);
        int i4 = this.asBinder + iMin;
        this.asBinder = i4;
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(i4 <= this.IAuthTabCallbackStub.length);
        boolean z2 = z && iPosition < i3;
        onWarmupCompleted(z2);
        if (z2) {
            this.extraCallbackWithResult = 0;
            this.access100 = 0;
        }
        byteBuffer.limit(iLimit);
    }

    private void onWarmupCompleted(boolean z) {
        int length;
        int iOnExtraCallbackWithResult;
        int i2 = this.asBinder;
        byte[] bArr = this.IAuthTabCallbackStub;
        if (i2 == bArr.length || z) {
            if (this.access100 == 0) {
                if (z) {
                    onWarmupCompleted(i2, 3);
                    length = i2;
                } else {
                    RecordingInputConnection_androidKt.onExtraCallbackWithResult(i2 >= bArr.length / 2);
                    length = this.IAuthTabCallbackStub.length / 2;
                    onWarmupCompleted(length, 0);
                }
                iOnExtraCallbackWithResult = length;
            } else if (z) {
                int length2 = i2 - (bArr.length / 2);
                int length3 = bArr.length / 2;
                int iOnExtraCallbackWithResult2 = onExtraCallbackWithResult(length2) + (this.IAuthTabCallbackStub.length / 2);
                onWarmupCompleted(iOnExtraCallbackWithResult2, 2);
                length = length2 + length3;
                iOnExtraCallbackWithResult = iOnExtraCallbackWithResult2;
            } else {
                length = i2 - (bArr.length / 2);
                iOnExtraCallbackWithResult = onExtraCallbackWithResult(length);
                onWarmupCompleted(iOnExtraCallbackWithResult, 1);
            }
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(length % this.onWarmupCompleted == 0, "bytesConsumed is not aligned to frame size: %s" + length);
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(i2 >= iOnExtraCallbackWithResult);
            this.asBinder -= length;
            int i3 = this.IAuthTabCallbackDefault + length;
            this.IAuthTabCallbackDefault = i3;
            this.IAuthTabCallbackDefault = i3 % this.IAuthTabCallbackStub.length;
            this.access100 = this.access100 + (iOnExtraCallbackWithResult / this.onWarmupCompleted);
            this.ICustomTabsCallback += (length - iOnExtraCallbackWithResult) / r2;
        }
    }

    private int onExtraCallbackWithResult(int i2) {
        int iOnWarmupCompleted = ((onWarmupCompleted(this.onTransact) - this.access100) * this.onWarmupCompleted) - (this.IAuthTabCallbackStub.length / 2);
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(iOnWarmupCompleted >= 0);
        return onExtraCallback(Math.min((i2 * this.access000) + 0.5f, iOnWarmupCompleted));
    }

    private int onWarmupCompleted(int i2) {
        int i3 = this.onWarmupCompleted;
        return (i2 / i3) * i3;
    }

    private int onExtraCallback(float f) {
        return onWarmupCompleted((int) f);
    }

    private void onExtraCallback(byte[] bArr, int i2, int i3) {
        RecordingInputConnection_androidKt.onExtraCallback(i2 % this.onWarmupCompleted == 0, "byteOutput size is not aligned to frame size " + i2);
        onWarmupCompleted(bArr, i2, i3);
        IAuthTabCallback(i2).put(bArr, 0, i2).flip();
    }

    private void onWarmupCompleted(int i2, int i3) {
        if (i2 == 0) {
            return;
        }
        RecordingInputConnection_androidKt.onNavigationEvent(this.asBinder >= i2);
        if (i3 == 2) {
            int i4 = this.IAuthTabCallbackDefault;
            int i5 = this.asBinder;
            byte[] bArr = this.IAuthTabCallbackStub;
            int i6 = i4 + i5;
            if (i6 <= bArr.length) {
                System.arraycopy(bArr, i6 - i2, this.IAuthTabCallback, 0, i2);
            } else {
                int length = i5 - (bArr.length - i4);
                if (length >= i2) {
                    System.arraycopy(bArr, length - i2, this.IAuthTabCallback, 0, i2);
                } else {
                    int i7 = i2 - length;
                    System.arraycopy(bArr, bArr.length - i7, this.IAuthTabCallback, 0, i7);
                    System.arraycopy(this.IAuthTabCallbackStub, 0, this.IAuthTabCallback, i7, length);
                }
            }
        } else {
            int i8 = this.IAuthTabCallbackDefault;
            byte[] bArr2 = this.IAuthTabCallbackStub;
            if (i8 + i2 <= bArr2.length) {
                System.arraycopy(bArr2, i8, this.IAuthTabCallback, 0, i2);
            } else {
                int length2 = bArr2.length - i8;
                System.arraycopy(bArr2, i8, this.IAuthTabCallback, 0, length2);
                System.arraycopy(this.IAuthTabCallbackStub, 0, this.IAuthTabCallback, length2, i2 - length2);
            }
        }
        RecordingInputConnection_androidKt.onExtraCallback(i2 % this.onWarmupCompleted == 0, "sizeToOutput is not aligned to frame size: " + i2);
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallbackDefault < this.IAuthTabCallbackStub.length);
        onExtraCallback(this.IAuthTabCallback, i2, i3);
    }

    private void onWarmupCompleted(byte[] bArr, int i2, int i3) {
        int iIAuthTabCallback;
        if (i3 != 3) {
            for (int i4 = 0; i4 < i2; i4 += 2) {
                int iOnNavigationEvent = onNavigationEvent(bArr[i4 + 1], bArr[i4]);
                if (i3 == 0) {
                    iIAuthTabCallback = onExtraCallbackWithResult(i4, i2 - 1);
                } else if (i3 == 2) {
                    iIAuthTabCallback = IAuthTabCallback(i4, i2 - 1);
                } else {
                    iIAuthTabCallback = this.getInterfaceDescriptor;
                }
                onNavigationEvent(bArr, i4, (iOnNavigationEvent * iIAuthTabCallback) / 100);
            }
        }
    }

    private int onExtraCallbackWithResult(int i2, int i3) {
        return (((this.getInterfaceDescriptor - 100) * ((i2 * 1000) / i3)) / 1000) + 100;
    }

    private int IAuthTabCallback(int i2, int i3) {
        int i4 = this.getInterfaceDescriptor;
        return i4 + ((((100 - i4) * (i2 * 1000)) / i3) / 1000);
    }

    private static void onNavigationEvent(byte[] bArr, int i2, int i3) {
        if (i3 >= 32767) {
            bArr[i2] = -1;
            bArr[i2 + 1] = Byte.MAX_VALUE;
        } else if (i3 <= -32768) {
            bArr[i2] = 0;
            bArr[i2 + 1] = Byte.MIN_VALUE;
        } else {
            bArr[i2] = (byte) i3;
            bArr[i2 + 1] = (byte) (i3 >> 8);
        }
    }

    private void IAuthTabCallback(ByteBuffer byteBuffer) {
        IAuthTabCallback(byteBuffer.remaining()).put(byteBuffer).flip();
    }

    private int onWarmupCompleted(long j) {
        return (int) ((j * this.onExtraCallbackWithResult.onExtraCallbackWithResult) / 1000000);
    }

    private int onWarmupCompleted(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position() + 1; iPosition < byteBuffer.limit(); iPosition += 2) {
            if (onWarmupCompleted(byteBuffer.get(iPosition), byteBuffer.get(iPosition - 1))) {
                int i2 = this.onWarmupCompleted;
                return i2 * (iPosition / i2);
            }
        }
        return byteBuffer.limit();
    }

    private int onExtraCallback(ByteBuffer byteBuffer) {
        for (int iLimit = byteBuffer.limit() - 1; iLimit >= byteBuffer.position(); iLimit -= 2) {
            if (onWarmupCompleted(byteBuffer.get(iLimit), byteBuffer.get(iLimit - 1))) {
                int i2 = this.onWarmupCompleted;
                return ((iLimit / i2) * i2) + i2;
            }
        }
        return byteBuffer.position();
    }

    private boolean onWarmupCompleted(byte b, byte b2) {
        return Math.abs(onNavigationEvent(b, b2)) > this.IAuthTabCallbackStubProxy;
    }
}
