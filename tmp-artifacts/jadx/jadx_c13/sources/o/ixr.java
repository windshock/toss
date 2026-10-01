package o;

import java.nio.ByteBuffer;
import o.hz;
import okhttp3.internal.url._UrlKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ixr extends iqv {
    private String onExtraCallback;
    private int onNavigationEvent;

    public ixr() {
        super(hz.onWarmupCompleted.CLOSING);
        onExtraCallback(_UrlKt.FRAGMENT_ENCODE_SET);
        onExtraCallbackWithResult(1000);
    }

    public void onExtraCallbackWithResult(int i) {
        this.onNavigationEvent = i;
        if (i == 1015) {
            this.onNavigationEvent = WebSocketProtocol.CLOSE_NO_STATUS_CODE;
            this.onExtraCallback = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        IAuthTabCallbackDefault();
    }

    public void onExtraCallback(String str) {
        if (str == null) {
            str = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        this.onExtraCallback = str;
        IAuthTabCallbackDefault();
    }

    public int onWarmupCompleted() {
        return this.onNavigationEvent;
    }

    public String onExtraCallbackWithResult() {
        return this.onExtraCallback;
    }

    @Override // o.jxj
    public String toString() {
        return super.toString() + "code: " + this.onNavigationEvent;
    }

    @Override // o.iqv, o.jxj
    public void onExtraCallback() throws gjv {
        super.onExtraCallback();
        int i = this.onNavigationEvent;
        if (i == 1007 && this.onExtraCallback == null) {
            throw new gjv(1007, "Received text is no valid utf8 string!");
        }
        if (i == 1005 && this.onExtraCallback.length() > 0) {
            throw new gjv(1002, "A close frame must have a closecode if it has a reason");
        }
        int i2 = this.onNavigationEvent;
        if (i2 > 1011 && i2 < 3000 && i2 != 1015) {
            throw new gjv(1002, "Trying to send an illegal close code!");
        }
        if (i2 == 1006 || i2 == 1015 || i2 == 1005 || i2 > 4999 || i2 < 1000 || i2 == 1004) {
            throw new gmd("closecode must not be sent over the wire: " + this.onNavigationEvent);
        }
    }

    @Override // o.jxj
    public void onWarmupCompleted(ByteBuffer byteBuffer) {
        this.onNavigationEvent = WebSocketProtocol.CLOSE_NO_STATUS_CODE;
        this.onExtraCallback = _UrlKt.FRAGMENT_ENCODE_SET;
        byteBuffer.mark();
        if (byteBuffer.remaining() == 0) {
            this.onNavigationEvent = 1000;
            return;
        }
        if (byteBuffer.remaining() == 1) {
            this.onNavigationEvent = 1002;
            return;
        }
        if (byteBuffer.remaining() >= 2) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.position(2);
            byteBufferAllocate.putShort(byteBuffer.getShort());
            byteBufferAllocate.position(0);
            this.onNavigationEvent = byteBufferAllocate.getInt();
        }
        byteBuffer.reset();
        try {
            int iPosition = byteBuffer.position();
            try {
                try {
                    byteBuffer.position(byteBuffer.position() + 2);
                    this.onExtraCallback = mtm.IAuthTabCallback(byteBuffer);
                } catch (IllegalArgumentException unused) {
                    throw new gjv(1007);
                }
            } finally {
                byteBuffer.position(iPosition);
            }
        } catch (gjv unused2) {
            this.onNavigationEvent = 1007;
            this.onExtraCallback = null;
        }
    }

    private void IAuthTabCallbackDefault() {
        byte[] bArrOnWarmupCompleted = mtm.onWarmupCompleted(this.onExtraCallback);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt(this.onNavigationEvent);
        byteBufferAllocate.position(2);
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bArrOnWarmupCompleted.length + 2);
        byteBufferAllocate2.put(byteBufferAllocate);
        byteBufferAllocate2.put(bArrOnWarmupCompleted);
        byteBufferAllocate2.rewind();
        super.onWarmupCompleted(byteBufferAllocate2);
    }

    @Override // o.jxj, o.hz
    public ByteBuffer IAuthTabCallback() {
        if (this.onNavigationEvent == 1005) {
            return mmq.onExtraCallbackWithResult();
        }
        return super.IAuthTabCallback();
    }
}
