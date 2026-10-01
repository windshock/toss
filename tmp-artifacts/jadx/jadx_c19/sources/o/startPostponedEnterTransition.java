package o;

import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;
import o.setSharedElementReturnTransition;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class startPostponedEnterTransition extends OutputStream implements setSharedElementReturnTransition.IAuthTabCallback {
    public static final byte[] onExtraCallback = new byte[0];
    private byte[] IAuthTabCallback;
    private int IAuthTabCallbackDefault;
    private int onExtraCallbackWithResult;
    private final LinkedList<byte[]> onNavigationEvent;
    private final setSharedElementReturnTransition onWarmupCompleted;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
    }

    public startPostponedEnterTransition() {
        this((setSharedElementReturnTransition) null);
    }

    public startPostponedEnterTransition(setSharedElementReturnTransition setsharedelementreturntransition) {
        this(setsharedelementreturntransition, 500);
    }

    public startPostponedEnterTransition(int i2) {
        this(null, i2);
    }

    public startPostponedEnterTransition(setSharedElementReturnTransition setsharedelementreturntransition, int i2) {
        this.onNavigationEvent = new LinkedList<>();
        this.onWarmupCompleted = setsharedelementreturntransition;
        this.IAuthTabCallback = setsharedelementreturntransition == null ? new byte[i2 > 131072 ? 131072 : i2] : setsharedelementreturntransition.onExtraCallbackWithResult(2);
    }

    private startPostponedEnterTransition(setSharedElementReturnTransition setsharedelementreturntransition, byte[] bArr, int i2) {
        this.onNavigationEvent = new LinkedList<>();
        this.onWarmupCompleted = setsharedelementreturntransition;
        this.IAuthTabCallback = bArr;
        this.onExtraCallbackWithResult = i2;
    }

    public static startPostponedEnterTransition onExtraCallback(byte[] bArr, int i2) {
        return new startPostponedEnterTransition(null, bArr, i2);
    }

    public void IAuthTabCallbackDefault() {
        this.IAuthTabCallbackDefault = 0;
        this.onExtraCallbackWithResult = 0;
        if (this.onNavigationEvent.isEmpty()) {
            return;
        }
        this.onNavigationEvent.clear();
    }

    public void onExtraCallback() {
        byte[] bArr;
        IAuthTabCallbackDefault();
        setSharedElementReturnTransition setsharedelementreturntransition = this.onWarmupCompleted;
        if (setsharedelementreturntransition == null || (bArr = this.IAuthTabCallback) == null) {
            return;
        }
        setsharedelementreturntransition.onNavigationEvent(2, bArr);
        this.IAuthTabCallback = null;
    }

    public void onWarmupCompleted(int i2) {
        if (this.onExtraCallbackWithResult >= this.IAuthTabCallback.length) {
            IAuthTabCallbackStub();
        }
        byte[] bArr = this.IAuthTabCallback;
        int i3 = this.onExtraCallbackWithResult;
        this.onExtraCallbackWithResult = i3 + 1;
        bArr[i3] = (byte) i2;
    }

    public void onExtraCallbackWithResult(int i2) {
        int i3 = this.onExtraCallbackWithResult;
        byte[] bArr = this.IAuthTabCallback;
        int i4 = i3 + 1;
        if (i4 < bArr.length) {
            bArr[i3] = (byte) (i2 >> 8);
            this.onExtraCallbackWithResult = i3 + 2;
            bArr[i4] = (byte) i2;
        } else {
            onWarmupCompleted(i2 >> 8);
            onWarmupCompleted(i2);
        }
    }

    public void onExtraCallback(int i2) {
        int i3 = this.onExtraCallbackWithResult;
        byte[] bArr = this.IAuthTabCallback;
        int i4 = i3 + 2;
        if (i4 < bArr.length) {
            bArr[i3] = (byte) (i2 >> 16);
            bArr[i3 + 1] = (byte) (i2 >> 8);
            this.onExtraCallbackWithResult = i3 + 3;
            bArr[i4] = (byte) i2;
            return;
        }
        onWarmupCompleted(i2 >> 16);
        onWarmupCompleted(i2 >> 8);
        onWarmupCompleted(i2);
    }

    public byte[] asInterface() {
        int i2 = this.IAuthTabCallbackDefault + this.onExtraCallbackWithResult;
        if (i2 == 0) {
            return onExtraCallback;
        }
        byte[] bArr = new byte[i2];
        Iterator<byte[]> it = this.onNavigationEvent.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            byte[] next = it.next();
            int length = next.length;
            System.arraycopy(next, 0, bArr, i3, length);
            i3 += length;
        }
        System.arraycopy(this.IAuthTabCallback, 0, bArr, i3, this.onExtraCallbackWithResult);
        int i4 = i3 + this.onExtraCallbackWithResult;
        if (i4 != i2) {
            throw new RuntimeException("Internal error: total len assumed to be " + i2 + ", copied " + i4 + " bytes");
        }
        if (!this.onNavigationEvent.isEmpty()) {
            IAuthTabCallbackDefault();
        }
        return bArr;
    }

    @Override // o.setSharedElementReturnTransition.IAuthTabCallback
    public setSharedElementReturnTransition onWarmupCompleted() {
        return this.onWarmupCompleted;
    }

    public byte[] onTransact() {
        IAuthTabCallbackDefault();
        return this.IAuthTabCallback;
    }

    public byte[] onNavigationEvent() {
        IAuthTabCallbackStub();
        return this.IAuthTabCallback;
    }

    public byte[] IAuthTabCallback(int i2) {
        this.onExtraCallbackWithResult = i2;
        return asInterface();
    }

    public byte[] onExtraCallbackWithResult() {
        return this.IAuthTabCallback;
    }

    public void onNavigationEvent(int i2) {
        this.onExtraCallbackWithResult = i2;
    }

    public int IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i2, int i3) {
        while (true) {
            int iMin = Math.min(this.IAuthTabCallback.length - this.onExtraCallbackWithResult, i3);
            if (iMin > 0) {
                System.arraycopy(bArr, i2, this.IAuthTabCallback, this.onExtraCallbackWithResult, iMin);
                i2 += iMin;
                this.onExtraCallbackWithResult += iMin;
                i3 -= iMin;
            }
            if (i3 <= 0) {
                return;
            } else {
                IAuthTabCallbackStub();
            }
        }
    }

    @Override // java.io.OutputStream
    public void write(int i2) {
        onWarmupCompleted(i2);
    }

    private void IAuthTabCallbackStub() {
        int length = this.IAuthTabCallbackDefault + this.IAuthTabCallback.length;
        if (length < 0) {
            throw new IllegalStateException("Maximum Java array size (2GB) exceeded by `ByteArrayBuilder`");
        }
        this.IAuthTabCallbackDefault = length;
        int iMax = Math.max(length >> 1, 1000);
        if (iMax > 131072) {
            iMax = 131072;
        }
        this.onNavigationEvent.add(this.IAuthTabCallback);
        this.IAuthTabCallback = new byte[iMax];
        this.onExtraCallbackWithResult = 0;
    }
}
