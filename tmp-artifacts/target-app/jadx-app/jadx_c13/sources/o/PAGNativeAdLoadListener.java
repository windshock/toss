package o;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.LinkOption;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class PAGNativeAdLoadListener {
    public static final LinkOption[] onExtraCallbackWithResult = new LinkOption[0];
    private static final byte[] onExtraCallback = new byte[4096];

    public static void onNavigationEvent(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long onWarmupCompleted(InputStream inputStream, OutputStream outputStream) throws IOException {
        return IAuthTabCallback(inputStream, outputStream, 8024);
    }

    public static long IAuthTabCallback(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        if (i <= 0) {
            throw new IllegalArgumentException("buffersize must be bigger than 0");
        }
        byte[] bArr = new byte[i];
        long j = 0;
        while (true) {
            int i2 = inputStream.read(bArr);
            if (-1 == i2) {
                return j;
            }
            if (outputStream != null) {
                outputStream.write(bArr, 0, i2);
            }
            j += i2;
        }
    }

    public static long onNavigationEvent(InputStream inputStream, long j, OutputStream outputStream) throws IOException {
        return onWarmupCompleted(inputStream, j, outputStream, 8024);
    }

    public static long onWarmupCompleted(InputStream inputStream, long j, OutputStream outputStream, int i) throws IOException {
        if (i <= 0) {
            throw new IllegalArgumentException("buffersize must be bigger than 0");
        }
        int iMin = (int) Math.min(i, j);
        byte[] bArr = new byte[iMin];
        long j2 = 0;
        while (j2 < j) {
            int i2 = inputStream.read(bArr, 0, (int) Math.min(j - j2, iMin));
            if (-1 == i2) {
                break;
            }
            if (outputStream != null) {
                outputStream.write(bArr, 0, i2);
            }
            j2 += i2;
        }
        return j2;
    }

    public static int IAuthTabCallback(InputStream inputStream, byte[] bArr) throws IOException {
        return onExtraCallback(inputStream, bArr, 0, bArr.length);
    }

    public static int onExtraCallback(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i2 < 0 || i < 0 || (i3 = i2 + i) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        int i4 = 0;
        while (i4 != i2) {
            int i5 = inputStream.read(bArr, i + i4, i2 - i4);
            if (i5 == -1) {
                break;
            }
            i4 += i5;
        }
        return i4;
    }

    public static void onExtraCallback(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) throws IOException {
        int iRemaining = byteBuffer.remaining();
        int i = 0;
        while (i < iRemaining) {
            int i2 = readableByteChannel.read(byteBuffer);
            if (i2 <= 0) {
                break;
            } else {
                i += i2;
            }
        }
        if (i < iRemaining) {
            throw new EOFException();
        }
    }

    public static byte[] onExtraCallback(InputStream inputStream, int i) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        onNavigationEvent(inputStream, i, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static long onExtraCallbackWithResult(InputStream inputStream, long j) throws IOException {
        int iOnExtraCallback;
        long j2 = j;
        while (j2 > 0) {
            long jSkip = inputStream.skip(j2);
            if (jSkip == 0) {
                break;
            }
            j2 -= jSkip;
        }
        while (j2 > 0 && (iOnExtraCallback = onExtraCallback(inputStream, onExtraCallback, 0, (int) Math.min(j2, 4096L))) > 0) {
            j2 -= iOnExtraCallback;
        }
        return j - j2;
    }
}
