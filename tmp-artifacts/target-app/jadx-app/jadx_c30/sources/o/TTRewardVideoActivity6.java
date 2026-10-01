package o;

import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class TTRewardVideoActivity6 extends TTLandingPageActivity17 {
    private static final TTWebsiteActivity7 onWarmupCompleted = dj13.onExtraCallback("ASCII");
    private boolean IAuthTabCallback;
    private final int IAuthTabCallbackDefault;
    private boolean IAuthTabCallbackStub;
    private long IAuthTabCallback_Parcel;
    private final byte[] asBinder;
    private final PAGNativeAdInteractionListener asInterface;
    private long onExtraCallback;
    private String onExtraCallbackWithResult;
    private long onNavigationEvent;
    private boolean onTransact;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            if (!this.onTransact) {
                onWarmupCompleted();
            }
        } finally {
            if (!this.IAuthTabCallback) {
                this.asInterface.close();
                this.IAuthTabCallback = true;
            }
        }
    }

    public static /* synthetic */ void onWarmupCompleted(StringWriter stringWriter, String str, String str2) {
        int length = str.length() + str2.length() + 5;
        String str3 = length + " " + str + "=" + str2 + "\n";
        int length2 = str3.getBytes(StandardCharsets.UTF_8).length;
        while (length != length2) {
            str3 = length2 + " " + str + "=" + str2 + "\n";
            int i = length2;
            length2 = str3.getBytes(StandardCharsets.UTF_8).length;
            length = i;
        }
        stringWriter.write(str3);
    }

    public void onWarmupCompleted() throws IOException {
        if (this.onTransact) {
            throw new IOException("This archive has already been finished");
        }
        if (this.IAuthTabCallbackStub) {
            throw new IOException("This archive contains unclosed entries.");
        }
        onExtraCallback();
        onExtraCallback();
        IAuthTabCallback();
        this.asInterface.flush();
        this.onTransact = true;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.asInterface.flush();
    }

    private void IAuthTabCallback() throws IOException {
        int intExact = Math.toIntExact(this.IAuthTabCallback_Parcel % this.IAuthTabCallbackDefault);
        if (intExact != 0) {
            while (intExact < this.IAuthTabCallbackDefault) {
                onExtraCallback();
                intExact++;
            }
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (!this.IAuthTabCallbackStub) {
            throw new IllegalStateException("No current tar entry");
        }
        long j = i2;
        if (this.onExtraCallback + j > this.onNavigationEvent) {
            throw new IOException("Request to write '" + i2 + "' bytes exceeds size in header of '" + this.onNavigationEvent + "' bytes for entry '" + this.onExtraCallbackWithResult + "'");
        }
        this.asInterface.write(bArr, i, i2);
        this.onExtraCallback += j;
    }

    private void onExtraCallback() throws IOException {
        Arrays.fill(this.asBinder, (byte) 0);
        IAuthTabCallback(this.asBinder);
    }

    private void IAuthTabCallback(byte[] bArr) throws IOException {
        if (bArr.length != 512) {
            throw new IOException("Record to write has length '" + bArr.length + "' which is not the record size of '512'");
        }
        this.asInterface.write(bArr);
        this.IAuthTabCallback_Parcel++;
    }
}
