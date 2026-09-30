package o;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class TTVideoLandingPageLink2Activity12 implements Closeable {
    private long IAuthTabCallback;
    private long IAuthTabCallbackStub;
    private final CRC32 onExtraCallback = new CRC32();
    private final byte[] onExtraCallbackWithResult = new byte[PKIFailureInfo.certConfirmed];
    private final byte[] onNavigationEvent = new byte[PKIFailureInfo.certConfirmed];
    private long onTransact;
    private final Deflater onWarmupCompleted;

    protected abstract void onWarmupCompleted(byte[] bArr, int i, int i2) throws IOException;

    static final class onExtraCallbackWithResult extends TTVideoLandingPageLink2Activity12 {
        private final PAGInterstitialAdInteractionCallback IAuthTabCallback;

        public onExtraCallbackWithResult(Deflater deflater, PAGInterstitialAdInteractionCallback pAGInterstitialAdInteractionCallback) {
            super(deflater);
            this.IAuthTabCallback = pAGInterstitialAdInteractionCallback;
        }

        @Override // o.TTVideoLandingPageLink2Activity12
        protected void onWarmupCompleted(byte[] bArr, int i, int i2) throws IOException {
            this.IAuthTabCallback.onNavigationEvent(bArr, i, i2);
        }
    }

    public static TTVideoLandingPageLink2Activity12 onExtraCallback(int i, PAGInterstitialAdInteractionCallback pAGInterstitialAdInteractionCallback) {
        return new onExtraCallbackWithResult(new Deflater(i, true), pAGInterstitialAdInteractionCallback);
    }

    TTVideoLandingPageLink2Activity12(Deflater deflater) {
        this.onWarmupCompleted = deflater;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.onWarmupCompleted.end();
    }

    void onNavigationEvent() throws IOException {
        Deflater deflater = this.onWarmupCompleted;
        byte[] bArr = this.onExtraCallbackWithResult;
        int iDeflate = deflater.deflate(bArr, 0, bArr.length);
        if (iDeflate > 0) {
            IAuthTabCallback(this.onExtraCallbackWithResult, 0, iDeflate);
        }
    }

    public void onExtraCallbackWithResult(InputStream inputStream, int i) throws IOException {
        IAuthTabCallbackStub();
        while (true) {
            byte[] bArr = this.onNavigationEvent;
            int i2 = inputStream.read(bArr, 0, bArr.length);
            if (i2 < 0) {
                break;
            } else {
                onExtraCallback(this.onNavigationEvent, 0, i2, i);
            }
        }
        if (i == 8) {
            onWarmupCompleted();
        }
    }

    private void asBinder() throws IOException {
        while (!this.onWarmupCompleted.needsInput()) {
            onNavigationEvent();
        }
    }

    void onWarmupCompleted() throws IOException {
        this.onWarmupCompleted.finish();
        while (!this.onWarmupCompleted.finished()) {
            onNavigationEvent();
        }
    }

    public long onExtraCallback() {
        return this.IAuthTabCallback;
    }

    public long IAuthTabCallback() {
        return this.onTransact;
    }

    public long onExtraCallbackWithResult() {
        return this.onExtraCallback.getValue();
    }

    public long asInterface() {
        return this.IAuthTabCallbackStub;
    }

    void IAuthTabCallbackStub() {
        this.onExtraCallback.reset();
        this.onWarmupCompleted.reset();
        this.IAuthTabCallback = 0L;
        this.onTransact = 0L;
    }

    long onExtraCallback(byte[] bArr, int i, int i2, int i3) throws IOException {
        long j = this.onTransact;
        this.onExtraCallback.update(bArr, i, i2);
        if (i3 == 8) {
            onExtraCallbackWithResult(bArr, i, i2);
        } else {
            IAuthTabCallback(bArr, i, i2);
        }
        this.IAuthTabCallback += i2;
        return this.onTransact - j;
    }

    public void onNavigationEvent(byte[] bArr) throws IOException {
        IAuthTabCallback(bArr, 0, bArr.length);
    }

    public void IAuthTabCallback(byte[] bArr, int i, int i2) throws IOException {
        onWarmupCompleted(bArr, i, i2);
        long j = i2;
        this.onTransact += j;
        this.IAuthTabCallbackStub += j;
    }

    private void onExtraCallbackWithResult(byte[] bArr, int i, int i2) throws IOException {
        if (i2 <= 0 || this.onWarmupCompleted.finished()) {
            return;
        }
        if (i2 <= 8192) {
            this.onWarmupCompleted.setInput(bArr, i, i2);
            asBinder();
            return;
        }
        int i3 = i2 / PKIFailureInfo.certRevoked;
        for (int i4 = 0; i4 < i3; i4++) {
            this.onWarmupCompleted.setInput(bArr, (i4 << 13) + i, PKIFailureInfo.certRevoked);
            asBinder();
        }
        int i5 = i3 << 13;
        if (i5 < i2) {
            this.onWarmupCompleted.setInput(bArr, i + i5, i2 - i5);
            asBinder();
        }
    }
}
