package o;

import java.nio.ByteOrder;
import java.nio.charset.Charset;
import org.bson.types.ObjectId;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class sya21 implements dv81 {
    private okzb1 onExtraCallbackWithResult;
    private int onWarmupCompleted = -1;
    private static final Charset onNavigationEvent = Charset.forName("UTF-8");
    private static final String[] onExtraCallback = new String[128];

    static {
        int i = 0;
        while (true) {
            String[] strArr = onExtraCallback;
            if (i >= strArr.length) {
                return;
            }
            strArr[i] = String.valueOf((char) i);
            i++;
        }
    }

    public sya21(okzb1 okzb1Var) {
        if (okzb1Var == null) {
            throw new IllegalArgumentException("buffer can not be null");
        }
        this.onExtraCallbackWithResult = okzb1Var;
        okzb1Var.onExtraCallbackWithResult(ByteOrder.LITTLE_ENDIAN);
    }

    @Override // o.dv81
    public int onExtraCallbackWithResult() {
        asBinder();
        return this.onExtraCallbackWithResult.IAuthTabCallbackStub();
    }

    @Override // o.dv81
    public byte IAuthTabCallback() {
        asBinder();
        onWarmupCompleted(1);
        return this.onExtraCallbackWithResult.onExtraCallbackWithResult();
    }

    @Override // o.dv81
    public void onWarmupCompleted(byte[] bArr) {
        asBinder();
        onWarmupCompleted(bArr.length);
        this.onExtraCallbackWithResult.onExtraCallbackWithResult(bArr);
    }

    @Override // o.dv81
    public long IAuthTabCallbackStub() {
        asBinder();
        onWarmupCompleted(8);
        return this.onExtraCallbackWithResult.onNavigationEvent();
    }

    @Override // o.dv81
    public double onExtraCallback() {
        asBinder();
        onWarmupCompleted(8);
        return this.onExtraCallbackWithResult.onWarmupCompleted();
    }

    @Override // o.dv81
    public int onNavigationEvent() {
        asBinder();
        onWarmupCompleted(4);
        return this.onExtraCallbackWithResult.onExtraCallback();
    }

    @Override // o.dv81
    public ObjectId onTransact() {
        asBinder();
        byte[] bArr = new byte[12];
        onWarmupCompleted(bArr);
        return new ObjectId(bArr);
    }

    @Override // o.dv81
    public String IAuthTabCallbackDefault() {
        asBinder();
        int iOnNavigationEvent = onNavigationEvent();
        if (iOnNavigationEvent <= 0) {
            throw new ycxsya1(String.format("While decoding a BSON string found a size that is not a positive number: %d", Integer.valueOf(iOnNavigationEvent)));
        }
        return onExtraCallback(iOnNavigationEvent);
    }

    @Override // o.dv81
    public String onWarmupCompleted() {
        asBinder();
        int iIAuthTabCallbackStub = this.onExtraCallbackWithResult.IAuthTabCallbackStub();
        access100();
        int iIAuthTabCallbackStub2 = this.onExtraCallbackWithResult.IAuthTabCallbackStub();
        this.onExtraCallbackWithResult.onWarmupCompleted(iIAuthTabCallbackStub);
        return onExtraCallback(iIAuthTabCallbackStub2 - iIAuthTabCallbackStub);
    }

    private String onExtraCallback(int i) {
        if (i == 2) {
            byte bIAuthTabCallback = IAuthTabCallback();
            if (IAuthTabCallback() != 0) {
                throw new ycxsya1("Found a BSON string that is not null-terminated");
            }
            if (bIAuthTabCallback < 0) {
                return onNavigationEvent.newDecoder().replacement();
            }
            return onExtraCallback[bIAuthTabCallback];
        }
        byte[] bArr = new byte[i - 1];
        onWarmupCompleted(bArr);
        if (IAuthTabCallback() != 0) {
            throw new ycxsya1("Found a BSON string that is not null-terminated");
        }
        return new String(bArr, onNavigationEvent);
    }

    private void access100() {
        while (IAuthTabCallback() != 0) {
        }
    }

    @Override // o.dv81
    public void asInterface() {
        asBinder();
        access100();
    }

    @Override // o.dv81
    public void onExtraCallbackWithResult(int i) {
        asBinder();
        okzb1 okzb1Var = this.onExtraCallbackWithResult;
        okzb1Var.onWarmupCompleted(okzb1Var.IAuthTabCallbackStub() + i);
    }

    @Override // o.dv81
    public dv7 IAuthTabCallback(int i) {
        return new dv7() { // from class: o.sya21.3
            private int onNavigationEvent;

            {
                this.onNavigationEvent = sya21.this.onExtraCallbackWithResult.IAuthTabCallbackStub();
            }

            @Override // o.dv7
            public void IAuthTabCallback() {
                sya21.this.asBinder();
                sya21.this.onExtraCallbackWithResult.onWarmupCompleted(this.onNavigationEvent);
            }
        };
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.onExtraCallbackWithResult.onTransact();
        this.onExtraCallbackWithResult = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void asBinder() {
        if (this.onExtraCallbackWithResult == null) {
            throw new IllegalStateException("Stream is closed");
        }
    }

    private void onWarmupCompleted(int i) {
        if (this.onExtraCallbackWithResult.IAuthTabCallbackDefault() >= i) {
            return;
        }
        throw new ycxsya1(String.format("While decoding a BSON document %d bytes were required, but only %d remain", Integer.valueOf(i), Integer.valueOf(this.onExtraCallbackWithResult.IAuthTabCallbackDefault())));
    }
}
