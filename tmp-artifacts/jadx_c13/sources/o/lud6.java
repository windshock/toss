package o;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.bouncycastle.asn1.BERTags;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class lud6 extends dj18 {
    private final boolean IAuthTabCallback;
    private final byte[] IAuthTabCallbackDefault;
    private final InputStream IAuthTabCallbackStub;
    private Inflater asBinder;
    private boolean asInterface;
    private final byte[] onExtraCallback;
    private final PAGNativeAd1 onExtraCallbackWithResult;
    private int onNavigationEvent;
    private final zblud onTransact;
    private final CRC32 onWarmupCompleted;

    private static byte[] onExtraCallback(DataInput dataInput) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            try {
                int unsignedByte = dataInput.readUnsignedByte();
                if (unsignedByte != 0) {
                    byteArrayOutputStream.write(unsignedByte);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
    }

    public lud6(InputStream inputStream) throws IOException {
        this(inputStream, false);
    }

    public lud6(InputStream inputStream, boolean z) throws IOException {
        this.onExtraCallback = new byte[TTHistoryActivity2.SIZE];
        this.asBinder = new Inflater(true);
        this.onWarmupCompleted = new CRC32();
        this.IAuthTabCallbackDefault = new byte[1];
        this.onTransact = new zblud();
        PAGNativeAd1 pAGNativeAd1 = new PAGNativeAd1(inputStream);
        this.onExtraCallbackWithResult = pAGNativeAd1;
        if (pAGNativeAd1.markSupported()) {
            this.IAuthTabCallbackStub = pAGNativeAd1;
        } else {
            this.IAuthTabCallbackStub = new BufferedInputStream(pAGNativeAd1);
        }
        this.IAuthTabCallback = z;
        onNavigationEvent(true);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Inflater inflater = this.asBinder;
        if (inflater != null) {
            inflater.end();
            this.asBinder = null;
        }
        InputStream inputStream = this.IAuthTabCallbackStub;
        if (inputStream != System.in) {
            inputStream.close();
        }
    }

    private boolean onNavigationEvent(boolean z) throws IOException {
        int i = this.IAuthTabCallbackStub.read();
        if (i == -1 && !z) {
            return false;
        }
        if (i != 31 || this.IAuthTabCallbackStub.read() != 139) {
            throw new IOException(z ? "Input is not in the .gz format" : "Garbage after a valid .gz stream");
        }
        DataInputStream dataInputStream = new DataInputStream(this.IAuthTabCallbackStub);
        int unsignedByte = dataInputStream.readUnsignedByte();
        if (unsignedByte != 8) {
            throw new IOException("Unsupported compression method " + unsignedByte + " in the .gz header");
        }
        int unsignedByte2 = dataInputStream.readUnsignedByte();
        if ((unsignedByte2 & BERTags.FLAGS) != 0) {
            throw new IOException("Reserved flags are set in the .gz header");
        }
        this.onTransact.onNavigationEvent(showPrivacyActivity.IAuthTabCallback(dataInputStream, 4) * 1000);
        int unsignedByte3 = dataInputStream.readUnsignedByte();
        if (unsignedByte3 == 2) {
            this.onTransact.onExtraCallback(9);
        } else if (unsignedByte3 == 4) {
            this.onTransact.onExtraCallback(1);
        }
        this.onTransact.onNavigationEvent(dataInputStream.readUnsignedByte());
        if ((unsignedByte2 & 4) != 0) {
            for (int unsignedByte4 = (dataInputStream.readUnsignedByte() << 8) | dataInputStream.readUnsignedByte(); unsignedByte4 > 0; unsignedByte4--) {
                dataInputStream.readUnsignedByte();
            }
        }
        if ((unsignedByte2 & 8) != 0) {
            this.onTransact.onNavigationEvent(new String(onExtraCallback(dataInputStream), NiceImageView.onWarmupCompleted));
        }
        if ((unsignedByte2 & 16) != 0) {
            this.onTransact.onExtraCallback(new String(onExtraCallback(dataInputStream), NiceImageView.onWarmupCompleted));
        }
        if ((unsignedByte2 & 2) != 0) {
            dataInputStream.readShort();
        }
        this.asBinder.reset();
        this.onWarmupCompleted.reset();
        return true;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.IAuthTabCallbackDefault, 0, 1) == -1) {
            return -1;
        }
        return this.IAuthTabCallbackDefault[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws DataFormatException, IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.asInterface) {
            return -1;
        }
        int i3 = 0;
        while (i2 > 0) {
            if (this.asBinder.needsInput()) {
                this.IAuthTabCallbackStub.mark(this.onExtraCallback.length);
                int i4 = this.IAuthTabCallbackStub.read(this.onExtraCallback);
                this.onNavigationEvent = i4;
                if (i4 == -1) {
                    throw new EOFException();
                }
                this.asBinder.setInput(this.onExtraCallback, 0, i4);
            }
            try {
                int iInflate = this.asBinder.inflate(bArr, i, i2);
                this.onWarmupCompleted.update(bArr, i, iInflate);
                i += iInflate;
                i2 -= iInflate;
                i3 += iInflate;
                onExtraCallbackWithResult(iInflate);
                if (this.asBinder.finished()) {
                    this.IAuthTabCallbackStub.reset();
                    long remaining = this.onNavigationEvent - this.asBinder.getRemaining();
                    if (PAGNativeAdLoadListener.onExtraCallbackWithResult(this.IAuthTabCallbackStub, remaining) != remaining) {
                        throw new IOException();
                    }
                    this.onNavigationEvent = 0;
                    DataInputStream dataInputStream = new DataInputStream(this.IAuthTabCallbackStub);
                    if (showPrivacyActivity.IAuthTabCallback(dataInputStream, 4) != this.onWarmupCompleted.getValue()) {
                        throw new IOException("Gzip-compressed data is corrupt (CRC32 error)");
                    }
                    if (showPrivacyActivity.IAuthTabCallback(dataInputStream, 4) != (this.asBinder.getBytesWritten() & 4294967295L)) {
                        throw new IOException("Gzip-compressed data is corrupt(uncompressed size mismatch)");
                    }
                    if (!this.IAuthTabCallback || !onNavigationEvent(false)) {
                        this.asBinder.end();
                        this.asBinder = null;
                        this.asInterface = true;
                        if (i3 == 0) {
                            return -1;
                        }
                        return i3;
                    }
                }
            } catch (DataFormatException unused) {
                throw new IOException("Gzip-compressed data is corrupt");
            }
        }
        return i3;
    }
}
