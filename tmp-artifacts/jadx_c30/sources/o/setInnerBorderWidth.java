package o;

import java.io.IOException;
import java.io.PushbackInputStream;
import java.util.Arrays;
import net.sf.scuba.smartcards.ISO7816;
import o.showPrivacyActivity;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.rainbow.util.GF2Field;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class setInnerBorderWidth extends dj18 {
    static final byte[] onExtraCallback = {-1, 6, 0, 0, 115, 78, 97, 80, ISO7816.INS_MANAGE_CHANNEL, 89};
    private final int IAuthTabCallback;
    private long IAuthTabCallbackDefault;
    private final PushbackInputStream IAuthTabCallbackStub;
    private int IAuthTabCallback_Parcel;
    private long access000;
    private final showPrivacyActivity.onNavigationEvent access100;
    private boolean asBinder;
    private final byte[] asInterface;
    private setMaskColor onExtraCallbackWithResult;
    private final setCornerTopRightRadius onNavigationEvent;
    private boolean onTransact;
    private final setInnerBorderColor onWarmupCompleted;

    static long IAuthTabCallback(long j) {
        long j2 = (j - 2726488792L) & BodyPartID.bodyIdMax;
        return ((j2 >> 17) | (j2 << 15)) & BodyPartID.bodyIdMax;
    }

    public static boolean onExtraCallback(byte[] bArr, int i) {
        byte[] bArr2 = onExtraCallback;
        if (i < bArr2.length) {
            return false;
        }
        if (bArr.length > bArr2.length) {
            bArr = Arrays.copyOf(bArr, bArr2.length);
        }
        return Arrays.equals(bArr, bArr2);
    }

    public int available() throws IOException {
        if (this.asBinder) {
            return Math.min(this.IAuthTabCallback_Parcel, this.IAuthTabCallbackStub.available());
        }
        setMaskColor setmaskcolor = this.onExtraCallbackWithResult;
        if (setmaskcolor != null) {
            return setmaskcolor.available();
        }
        return 0;
    }

    public void close() throws IOException {
        try {
            setMaskColor setmaskcolor = this.onExtraCallbackWithResult;
            if (setmaskcolor != null) {
                setmaskcolor.close();
                this.onExtraCallbackWithResult = null;
            }
        } finally {
            this.IAuthTabCallbackStub.close();
        }
    }

    public int read() throws IOException {
        if (read(this.asInterface, 0, 1) == -1) {
            return -1;
        }
        return this.asInterface[0] & 255;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(bArr, i, i2);
        if (iOnExtraCallbackWithResult != -1) {
            return iOnExtraCallbackWithResult;
        }
        onWarmupCompleted();
        if (this.onTransact) {
            return -1;
        }
        return onExtraCallbackWithResult(bArr, i, i2);
    }

    private long onExtraCallback() throws IOException {
        byte[] bArr = new byte[4];
        int iIAuthTabCallback = PAGNativeAdLoadListener.IAuthTabCallback(this.IAuthTabCallbackStub, bArr);
        onExtraCallbackWithResult(iIAuthTabCallback);
        if (iIAuthTabCallback != 4) {
            throw new IOException("Premature end of stream");
        }
        return showPrivacyActivity.onWarmupCompleted(bArr);
    }

    private void onWarmupCompleted() throws IOException {
        IAuthTabCallbackDefault();
        this.asBinder = false;
        int iIAuthTabCallback = IAuthTabCallback();
        if (iIAuthTabCallback == -1) {
            this.onTransact = true;
            return;
        }
        if (iIAuthTabCallback == 255) {
            this.IAuthTabCallbackStub.unread(iIAuthTabCallback);
            this.access000++;
            onExtraCallback(1L);
            asInterface();
            onWarmupCompleted();
            return;
        }
        if (iIAuthTabCallback == 254 || (iIAuthTabCallback > 127 && iIAuthTabCallback <= 253)) {
            asBinder();
            onWarmupCompleted();
            return;
        }
        if (iIAuthTabCallback >= 2 && iIAuthTabCallback <= 127) {
            throw new IOException("Unskippable chunk with type " + iIAuthTabCallback + " (hex " + Integer.toHexString(iIAuthTabCallback) + ") detected.");
        }
        if (iIAuthTabCallback == 1) {
            this.asBinder = true;
            int iOnNavigationEvent = onNavigationEvent() - 4;
            this.IAuthTabCallback_Parcel = iOnNavigationEvent;
            if (iOnNavigationEvent < 0) {
                throw new IOException("Found illegal chunk with negative size");
            }
            this.IAuthTabCallbackDefault = IAuthTabCallback(onExtraCallback());
            return;
        }
        if (iIAuthTabCallback == 0) {
            boolean zUsesChecksumWithCompressedChunks = this.onNavigationEvent.usesChecksumWithCompressedChunks();
            long jOnNavigationEvent = onNavigationEvent() - (zUsesChecksumWithCompressedChunks ? 4L : 0L);
            if (jOnNavigationEvent < 0) {
                throw new IOException("Found illegal chunk with negative size");
            }
            if (zUsesChecksumWithCompressedChunks) {
                this.IAuthTabCallbackDefault = IAuthTabCallback(onExtraCallback());
            } else {
                this.IAuthTabCallbackDefault = -1L;
            }
            setMaskColor setmaskcolor = new setMaskColor(new setMrcTrackerKey(this.IAuthTabCallbackStub, jOnNavigationEvent), this.IAuthTabCallback);
            this.onExtraCallbackWithResult = setmaskcolor;
            onNavigationEvent(setmaskcolor.onExtraCallbackWithResult());
            return;
        }
        throw new IOException("Unknown chunk type " + iIAuthTabCallback + " detected.");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int onExtraCallbackWithResult(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = -1;
        if (this.asBinder) {
            int iMin = Math.min(this.IAuthTabCallback_Parcel, i2);
            if (iMin == 0) {
                return -1;
            }
            i3 = this.IAuthTabCallbackStub.read(bArr, i, iMin);
            if (i3 != -1) {
                this.IAuthTabCallback_Parcel -= i3;
                onExtraCallbackWithResult(i3);
            }
        } else {
            setMaskColor setmaskcolor = this.onExtraCallbackWithResult;
            if (setmaskcolor != null) {
                long jOnExtraCallbackWithResult = setmaskcolor.onExtraCallbackWithResult();
                i3 = this.onExtraCallbackWithResult.read(bArr, i, i2);
                if (i3 == -1) {
                    this.onExtraCallbackWithResult.close();
                    this.onExtraCallbackWithResult = null;
                } else {
                    onNavigationEvent(this.onExtraCallbackWithResult.onExtraCallbackWithResult() - jOnExtraCallbackWithResult);
                }
            }
            if (i4 > 0) {
                this.onWarmupCompleted.update(bArr, i, i4);
            }
            return i4;
        }
        i4 = i3;
        if (i4 > 0) {
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int IAuthTabCallback() throws IOException {
        int i = this.IAuthTabCallbackStub.read();
        if (i == -1) {
            return -1;
        }
        onExtraCallbackWithResult(1);
        return i & GF2Field.MASK;
    }

    private int onNavigationEvent() throws IOException {
        return (int) showPrivacyActivity.IAuthTabCallback(this.access100, 3);
    }

    private void asInterface() throws IOException {
        byte[] bArr = new byte[10];
        int iIAuthTabCallback = PAGNativeAdLoadListener.IAuthTabCallback(this.IAuthTabCallbackStub, bArr);
        onExtraCallbackWithResult(iIAuthTabCallback);
        if (10 != iIAuthTabCallback || !onExtraCallback(bArr, 10)) {
            throw new IOException("Not a framed Snappy stream");
        }
    }

    private void asBinder() throws IOException {
        int iOnNavigationEvent = onNavigationEvent();
        if (iOnNavigationEvent < 0) {
            throw new IOException("Found illegal chunk with negative size");
        }
        long j = iOnNavigationEvent;
        long jOnExtraCallbackWithResult = PAGNativeAdLoadListener.onExtraCallbackWithResult(this.IAuthTabCallbackStub, j);
        onNavigationEvent(jOnExtraCallbackWithResult);
        if (jOnExtraCallbackWithResult != j) {
            throw new IOException("Premature end of stream");
        }
    }

    private void IAuthTabCallbackDefault() throws IOException {
        long j = this.IAuthTabCallbackDefault;
        if (j >= 0 && j != this.onWarmupCompleted.getValue()) {
            throw new IOException("Checksum verification failed");
        }
        this.IAuthTabCallbackDefault = -1L;
        this.onWarmupCompleted.reset();
    }
}
