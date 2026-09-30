package o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class jc5 implements okzb1 {
    private ByteBuffer onExtraCallback;
    private final AtomicInteger onNavigationEvent = new AtomicInteger(1);

    public jc5(ByteBuffer byteBuffer) {
        this.onExtraCallback = byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override // o.okzb1
    public void onTransact() {
        if (this.onNavigationEvent.decrementAndGet() < 0) {
            this.onNavigationEvent.incrementAndGet();
            throw new IllegalStateException("Attempted to decrement the reference count below 0");
        }
        if (this.onNavigationEvent.get() == 0) {
            this.onExtraCallback = null;
        }
    }

    @Override // o.okzb1
    public int IAuthTabCallbackDefault() {
        return this.onExtraCallback.remaining();
    }

    @Override // o.okzb1
    public byte[] IAuthTabCallback() {
        return this.onExtraCallback.array();
    }

    @Override // o.okzb1
    public int asInterface() {
        return this.onExtraCallback.limit();
    }

    @Override // o.okzb1
    public okzb1 onWarmupCompleted(int i) {
        this.onExtraCallback.position(i);
        return this;
    }

    @Override // o.okzb1
    public okzb1 onExtraCallbackWithResult(ByteOrder byteOrder) {
        this.onExtraCallback.order(byteOrder);
        return this;
    }

    @Override // o.okzb1
    public byte onExtraCallbackWithResult() {
        return this.onExtraCallback.get();
    }

    @Override // o.okzb1
    public okzb1 onExtraCallbackWithResult(byte[] bArr) {
        this.onExtraCallback.get(bArr);
        return this;
    }

    @Override // o.okzb1
    public long onNavigationEvent() {
        return this.onExtraCallback.getLong();
    }

    @Override // o.okzb1
    public double onWarmupCompleted() {
        return this.onExtraCallback.getDouble();
    }

    @Override // o.okzb1
    public int onExtraCallback() {
        return this.onExtraCallback.getInt();
    }

    @Override // o.okzb1
    public int IAuthTabCallbackStub() {
        return this.onExtraCallback.position();
    }
}
