package o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class dv83 extends dvzb {
    private byte[] onExtraCallbackWithResult;
    private int onWarmupCompleted;

    public dv83() {
        this(1024);
    }

    public dv83(int i) {
        this.onExtraCallbackWithResult = new byte[1024];
        this.onExtraCallbackWithResult = new byte[i];
    }

    public byte[] onExtraCallback() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.dvzb, java.io.OutputStream
    public void write(byte[] bArr) {
        IAuthTabCallbackStub();
        write(bArr, 0, bArr.length);
    }

    @Override // o.dv9
    public void onNavigationEvent(byte[] bArr, int i, int i2) {
        IAuthTabCallbackStub();
        onExtraCallback(i2);
        System.arraycopy(bArr, i, this.onExtraCallbackWithResult, this.onWarmupCompleted, i2);
        this.onWarmupCompleted += i2;
    }

    @Override // o.dv9
    public void onWarmupCompleted(int i) {
        IAuthTabCallbackStub();
        onExtraCallback(1);
        byte[] bArr = this.onExtraCallbackWithResult;
        int i2 = this.onWarmupCompleted;
        this.onWarmupCompleted = i2 + 1;
        bArr[i2] = (byte) i;
    }

    @Override // o.dvzb
    protected void onNavigationEvent(int i, int i2) {
        IAuthTabCallbackStub();
        if (i < 0) {
            throw new IllegalArgumentException(String.format("position must be >= 0 but was %d", Integer.valueOf(i)));
        }
        int i3 = this.onWarmupCompleted;
        if (i > i3 - 1) {
            throw new IllegalArgumentException(String.format("position must be <= %d but was %d", Integer.valueOf(i3 - 1), Integer.valueOf(i)));
        }
        this.onExtraCallbackWithResult[i] = (byte) i2;
    }

    @Override // o.dv9
    public int onExtraCallbackWithResult() {
        IAuthTabCallbackStub();
        return this.onWarmupCompleted;
    }

    @Override // o.dv9
    public int IAuthTabCallback() {
        IAuthTabCallbackStub();
        return this.onWarmupCompleted;
    }

    @Override // o.dv9
    public void onNavigationEvent(int i) {
        IAuthTabCallbackStub();
        if (i > this.onWarmupCompleted || i < 0) {
            throw new IllegalArgumentException();
        }
        this.onWarmupCompleted = i;
    }

    public List<okzb1> onWarmupCompleted() {
        IAuthTabCallbackStub();
        return Arrays.asList(new jc5(ByteBuffer.wrap(this.onExtraCallbackWithResult, 0, this.onWarmupCompleted).duplicate().order(ByteOrder.LITTLE_ENDIAN)));
    }

    @Override // o.dvzb, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.onExtraCallbackWithResult = null;
    }

    private void IAuthTabCallbackStub() {
        if (this.onExtraCallbackWithResult == null) {
            throw new IllegalStateException("The output is closed");
        }
    }

    private void onExtraCallback(int i) {
        int i2 = this.onWarmupCompleted;
        int i3 = i + i2;
        byte[] bArr = this.onExtraCallbackWithResult;
        if (i3 <= bArr.length) {
            return;
        }
        int length = bArr.length << 1;
        if (length < i3) {
            length = i3 + 128;
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        this.onExtraCallbackWithResult = bArr2;
    }
}
