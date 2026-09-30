package o;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import net.sf.scuba.smartcards.ISO7816;
import o.showPrivacyActivity;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.CertificateHolderAuthorization;
import org.bouncycastle.pqc.crypto.rainbow.util.GF2Field;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class onTick extends dj18 {
    private InputStream IAuthTabCallbackDefault;
    private boolean IAuthTabCallbackStub;
    private final PAGNativeAd1 IAuthTabCallbackStubProxy;
    private boolean IAuthTabCallback_Parcel;
    private boolean access000;
    private final byte[] access100;
    private boolean asBinder;
    private final boolean asInterface;
    private boolean getInterfaceDescriptor;
    private final isCoverSrc onExtraCallback;
    private final isCoverSrc onExtraCallbackWithResult;
    private boolean onTransact;
    private byte[] onWarmupCompleted;
    private final showPrivacyActivity.onNavigationEvent readTypedObject;
    static final byte[] onNavigationEvent = {4, ISO7816.INS_MSE, 77, 24};
    private static final byte[] IAuthTabCallback = {ISO7816.INS_PSO, 77, 24};

    private static boolean onExtraCallbackWithResult(byte[] bArr) {
        if ((bArr[0] & 80) != 80) {
            return false;
        }
        for (int i = 1; i < 4; i++) {
            if (bArr[i] != IAuthTabCallback[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean onNavigationEvent(byte[] bArr, int i) {
        byte[] bArr2 = onNavigationEvent;
        if (i < bArr2.length) {
            return false;
        }
        if (bArr.length > bArr2.length) {
            bArr = Arrays.copyOf(bArr, bArr2.length);
        }
        return Arrays.equals(bArr, bArr2);
    }

    private void onNavigationEvent(byte[] bArr, int i, int i2) {
        int iMin = Math.min(i2, this.onWarmupCompleted.length);
        if (iMin > 0) {
            byte[] bArr2 = this.onWarmupCompleted;
            int length = bArr2.length - iMin;
            if (length > 0) {
                System.arraycopy(bArr2, iMin, bArr2, 0, length);
            }
            System.arraycopy(bArr, i, this.onWarmupCompleted, length, iMin);
        }
    }

    public void close() throws IOException {
        try {
            InputStream inputStream = this.IAuthTabCallbackDefault;
            if (inputStream != null) {
                inputStream.close();
                this.IAuthTabCallbackDefault = null;
            }
        } finally {
            this.IAuthTabCallbackStubProxy.close();
        }
    }

    private void onExtraCallbackWithResult(boolean z) throws IOException {
        if (onNavigationEvent(z)) {
            onWarmupCompleted();
            IAuthTabCallback();
        }
    }

    private void onExtraCallback() throws IOException {
        InputStream inputStream = this.IAuthTabCallbackDefault;
        if (inputStream != null) {
            inputStream.close();
            this.IAuthTabCallbackDefault = null;
            if (this.IAuthTabCallbackStub) {
                onNavigationEvent(this.onExtraCallback, "block");
                this.onExtraCallback.reset();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.InputStream, o.isCircle, o.ul5] */
    private void IAuthTabCallback() throws IOException {
        onExtraCallback();
        long jIAuthTabCallback = showPrivacyActivity.IAuthTabCallback(this.readTypedObject, 4);
        boolean z = ((-2147483648L) & jIAuthTabCallback) != 0;
        int i = (int) (jIAuthTabCallback & 2147483647L);
        if (i == 0) {
            IAuthTabCallbackDefault();
            if (!this.asInterface) {
                this.onTransact = true;
                return;
            } else {
                onExtraCallbackWithResult(false);
                return;
            }
        }
        setVideoAdListener setmrctrackerkey = new setMrcTrackerKey(this.IAuthTabCallbackStubProxy, i);
        if (this.IAuthTabCallbackStub) {
            setmrctrackerkey = new setVideoAdListener(this.onExtraCallback, setmrctrackerkey);
        }
        if (z) {
            this.IAuthTabCallback_Parcel = true;
            this.IAuthTabCallbackDefault = setmrctrackerkey;
            return;
        }
        this.IAuthTabCallback_Parcel = false;
        ?? ul5Var = new ul5(setmrctrackerkey);
        if (this.asBinder) {
            ul5Var.onExtraCallbackWithResult(this.onWarmupCompleted);
        }
        this.IAuthTabCallbackDefault = ul5Var;
    }

    public int read() throws IOException {
        if (read(this.access100, 0, 1) == -1) {
            return -1;
        }
        return this.access100[0] & 255;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.onTransact) {
            return -1;
        }
        int iIAuthTabCallback = IAuthTabCallback(bArr, i, i2);
        if (iIAuthTabCallback == -1) {
            IAuthTabCallback();
            if (!this.onTransact) {
                iIAuthTabCallback = IAuthTabCallback(bArr, i, i2);
            }
        }
        if (iIAuthTabCallback != -1) {
            if (this.asBinder) {
                onNavigationEvent(bArr, i, iIAuthTabCallback);
            }
            if (this.getInterfaceDescriptor) {
                this.onExtraCallbackWithResult.update(bArr, i, iIAuthTabCallback);
            }
        }
        return iIAuthTabCallback;
    }

    private void onWarmupCompleted() throws IOException {
        int iOnNavigationEvent = onNavigationEvent();
        if (iOnNavigationEvent == -1) {
            throw new IOException("Premature end of stream while reading frame flags");
        }
        this.onExtraCallbackWithResult.update(iOnNavigationEvent);
        if ((iOnNavigationEvent & CertificateHolderAuthorization.CVCA) != 64) {
            throw new IOException("Unsupported version " + (iOnNavigationEvent >> 6));
        }
        boolean z = (iOnNavigationEvent & 32) == 0;
        this.asBinder = z;
        if (z) {
            if (this.onWarmupCompleted == null) {
                this.onWarmupCompleted = new byte[PKIFailureInfo.notAuthorized];
            }
        } else {
            this.onWarmupCompleted = null;
        }
        this.IAuthTabCallbackStub = (iOnNavigationEvent & 16) != 0;
        this.access000 = (iOnNavigationEvent & 8) != 0;
        this.getInterfaceDescriptor = (iOnNavigationEvent & 4) != 0;
        int iOnNavigationEvent2 = onNavigationEvent();
        if (iOnNavigationEvent2 == -1) {
            throw new IOException("Premature end of stream while reading frame BD byte");
        }
        this.onExtraCallbackWithResult.update(iOnNavigationEvent2);
        if (this.access000) {
            byte[] bArr = new byte[8];
            int iIAuthTabCallback = PAGNativeAdLoadListener.IAuthTabCallback(this.IAuthTabCallbackStubProxy, bArr);
            onExtraCallbackWithResult(iIAuthTabCallback);
            if (8 != iIAuthTabCallback) {
                throw new IOException("Premature end of stream while reading content size");
            }
            this.onExtraCallbackWithResult.update(bArr, 0, 8);
        }
        int iOnNavigationEvent3 = onNavigationEvent();
        if (iOnNavigationEvent3 == -1) {
            throw new IOException("Premature end of stream while reading frame header checksum");
        }
        int value = (int) ((this.onExtraCallbackWithResult.getValue() >> 8) & 255);
        this.onExtraCallbackWithResult.reset();
        if (iOnNavigationEvent3 != value) {
            throw new IOException("Frame header checksum mismatch");
        }
    }

    private int IAuthTabCallback(byte[] bArr, int i, int i2) throws IOException {
        if (this.IAuthTabCallback_Parcel) {
            int i3 = this.IAuthTabCallbackDefault.read(bArr, i, i2);
            onExtraCallbackWithResult(i3);
            return i3;
        }
        ul5 ul5Var = (ul5) this.IAuthTabCallbackDefault;
        long jOnExtraCallbackWithResult = ul5Var.onExtraCallbackWithResult();
        int i4 = this.IAuthTabCallbackDefault.read(bArr, i, i2);
        onNavigationEvent(ul5Var.onExtraCallbackWithResult() - jOnExtraCallbackWithResult);
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int onNavigationEvent() throws IOException {
        int i = this.IAuthTabCallbackStubProxy.read();
        if (i == -1) {
            return -1;
        }
        onExtraCallbackWithResult(1);
        return i & GF2Field.MASK;
    }

    private boolean onNavigationEvent(boolean z) throws IOException {
        String str = z ? "Not a LZ4 frame stream" : "LZ4 frame stream followed by garbage";
        byte[] bArr = new byte[4];
        int iIAuthTabCallback = PAGNativeAdLoadListener.IAuthTabCallback(this.IAuthTabCallbackStubProxy, bArr);
        onExtraCallbackWithResult(iIAuthTabCallback);
        if (iIAuthTabCallback == 0 && !z) {
            this.onTransact = true;
            return false;
        }
        if (4 != iIAuthTabCallback) {
            throw new IOException(str);
        }
        int iIAuthTabCallback2 = IAuthTabCallback(bArr);
        if (iIAuthTabCallback2 == 0 && !z) {
            this.onTransact = true;
            return false;
        }
        if (4 == iIAuthTabCallback2 && onNavigationEvent(bArr, 4)) {
            return true;
        }
        throw new IOException(str);
    }

    private int IAuthTabCallback(byte[] bArr) throws IOException {
        int iIAuthTabCallback = 4;
        while (iIAuthTabCallback == 4 && onExtraCallbackWithResult(bArr)) {
            long jIAuthTabCallback = showPrivacyActivity.IAuthTabCallback(this.readTypedObject, 4);
            if (jIAuthTabCallback < 0) {
                throw new IOException("Found illegal skippable frame with negative size");
            }
            long jOnExtraCallbackWithResult = PAGNativeAdLoadListener.onExtraCallbackWithResult(this.IAuthTabCallbackStubProxy, jIAuthTabCallback);
            onNavigationEvent(jOnExtraCallbackWithResult);
            if (jIAuthTabCallback != jOnExtraCallbackWithResult) {
                throw new IOException("Premature end of stream while skipping frame");
            }
            iIAuthTabCallback = PAGNativeAdLoadListener.IAuthTabCallback(this.IAuthTabCallbackStubProxy, bArr);
            onExtraCallbackWithResult(iIAuthTabCallback);
        }
        return iIAuthTabCallback;
    }

    private void onNavigationEvent(isCoverSrc iscoversrc, String str) throws IOException {
        byte[] bArr = new byte[4];
        int iIAuthTabCallback = PAGNativeAdLoadListener.IAuthTabCallback(this.IAuthTabCallbackStubProxy, bArr);
        onExtraCallbackWithResult(iIAuthTabCallback);
        if (4 != iIAuthTabCallback) {
            throw new IOException("Premature end of stream while reading " + str + " checksum");
        }
        if (iscoversrc.getValue() == showPrivacyActivity.onWarmupCompleted(bArr)) {
            return;
        }
        throw new IOException(str + " checksum mismatch.");
    }

    private void IAuthTabCallbackDefault() throws IOException {
        if (this.getInterfaceDescriptor) {
            onNavigationEvent(this.onExtraCallbackWithResult, "content");
        }
        this.onExtraCallbackWithResult.reset();
    }
}
