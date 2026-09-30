package o;

import java.io.DataInput;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class showPrivacyActivity {
    public static final byte[] onExtraCallback = new byte[0];

    public static void onWarmupCompleted(onExtraCallbackWithResult onextracallbackwithresult, long j, int i) throws IOException {
    }

    private static void onExtraCallback(int i) {
        if (i > 8) {
            throw new IllegalArgumentException("Can't read more than eight bytes into a long value");
        }
    }

    public static long onWarmupCompleted(byte[] bArr) {
        return onExtraCallbackWithResult(bArr, 0, bArr.length);
    }

    public static long onExtraCallbackWithResult(byte[] bArr, int i, int i2) {
        onExtraCallback(i2);
        long j = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j |= (bArr[i + i3] & 255) << (i3 << 3);
        }
        return j;
    }

    public static long IAuthTabCallback(onNavigationEvent onnavigationevent, int i) throws IOException {
        onExtraCallback(i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long asByte = onnavigationevent.getAsByte();
            if (asByte == -1) {
                throw new IOException("Premature end of data");
            }
            j |= asByte << (i2 << 3);
        }
        return j;
    }

    public static long IAuthTabCallback(DataInput dataInput, int i) throws IOException {
        onExtraCallback(i);
        long unsignedByte = 0;
        for (int i2 = 0; i2 < i; i2++) {
            unsignedByte |= dataInput.readUnsignedByte() << (i2 << 3);
        }
        return unsignedByte;
    }

    public static void onNavigationEvent(byte[] bArr, long j, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i + i3] = (byte) (255 & j);
            j >>= 8;
        }
    }

    public static void onExtraCallbackWithResult(OutputStream outputStream, long j, int i) throws IOException {
        for (int i2 = 0; i2 < i; i2++) {
            outputStream.write((int) (255 & j));
            j >>= 8;
        }
    }
}
