package o;

import java.nio.ByteBuffer;
import org.xbill.DNS.WireParseException;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getBlob {
    private final int IAuthTabCallback;
    private final int onExtraCallback;
    private int onExtraCallbackWithResult;
    private final ByteBuffer onNavigationEvent;
    private int onWarmupCompleted;

    public getBlob(byte[] bArr) {
        this(ByteBuffer.wrap(bArr));
    }

    public getBlob(ByteBuffer byteBuffer) {
        this.onNavigationEvent = byteBuffer;
        this.IAuthTabCallback = byteBuffer.position();
        this.onExtraCallback = byteBuffer.limit();
        this.onWarmupCompleted = -1;
        this.onExtraCallbackWithResult = -1;
    }

    public int onWarmupCompleted() {
        return this.onNavigationEvent.position() - this.IAuthTabCallback;
    }

    public int IAuthTabCallbackDefault() {
        return this.onNavigationEvent.remaining();
    }

    private void onExtraCallbackWithResult(int i) throws WireParseException {
        if (i > IAuthTabCallbackDefault()) {
            throw new WireParseException("end of input");
        }
    }

    public void onNavigationEvent(int i) {
        if (i > this.onExtraCallback - this.onNavigationEvent.position()) {
            throw new IllegalArgumentException("cannot set active region past end of input");
        }
        ByteBuffer byteBuffer = this.onNavigationEvent;
        byteBuffer.limit(byteBuffer.position() + i);
    }

    public void onNavigationEvent() {
        this.onNavigationEvent.limit(this.onExtraCallback);
    }

    public int IAuthTabCallback_Parcel() {
        return this.onNavigationEvent.limit() - this.IAuthTabCallback;
    }

    public void onWarmupCompleted(int i) {
        int i2 = i + this.IAuthTabCallback;
        if (i2 > this.onExtraCallback) {
            throw new IllegalArgumentException("cannot set active region past end of input");
        }
        this.onNavigationEvent.limit(i2);
    }

    public void onExtraCallback(int i) {
        int i2 = i + this.IAuthTabCallback;
        if (i2 >= this.onExtraCallback) {
            throw new IllegalArgumentException("cannot jump past end of input");
        }
        this.onNavigationEvent.position(i2);
        this.onNavigationEvent.limit(this.onExtraCallback);
    }

    public void IAuthTabCallbackStub() {
        this.onWarmupCompleted = this.onNavigationEvent.position();
        this.onExtraCallbackWithResult = this.onNavigationEvent.limit();
    }

    public void onTransact() {
        int i = this.onWarmupCompleted;
        if (i < 0) {
            throw new IllegalStateException("no previous state");
        }
        this.onNavigationEvent.position(i);
        this.onNavigationEvent.limit(this.onExtraCallbackWithResult);
        this.onWarmupCompleted = -1;
        this.onExtraCallbackWithResult = -1;
    }

    public int asInterface() throws WireParseException {
        onExtraCallbackWithResult(1);
        return this.onNavigationEvent.get() & 255;
    }

    public int onExtraCallbackWithResult() throws WireParseException {
        onExtraCallbackWithResult(2);
        return this.onNavigationEvent.getShort() & 65535;
    }

    public long asBinder() throws WireParseException {
        onExtraCallbackWithResult(4);
        return this.onNavigationEvent.getInt() & 4294967295L;
    }

    public void onExtraCallback(byte[] bArr, int i, int i2) throws WireParseException {
        onExtraCallbackWithResult(i2);
        this.onNavigationEvent.get(bArr, i, i2);
    }

    public byte[] IAuthTabCallback(int i) throws WireParseException {
        onExtraCallbackWithResult(i);
        byte[] bArr = new byte[i];
        this.onNavigationEvent.get(bArr, 0, i);
        return bArr;
    }

    public byte[] onExtraCallback() {
        int iIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        byte[] bArr = new byte[iIAuthTabCallbackDefault];
        this.onNavigationEvent.get(bArr, 0, iIAuthTabCallbackDefault);
        return bArr;
    }

    public byte[] IAuthTabCallback() throws WireParseException {
        return IAuthTabCallback(asInterface());
    }
}
