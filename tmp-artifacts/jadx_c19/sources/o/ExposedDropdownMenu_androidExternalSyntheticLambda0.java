package o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ExposedDropdownMenu_androidExternalSyntheticLambda0 {
    private static long onExtraCallbackWithResult(byte b, byte b2) {
        int i2;
        int i3 = b & 3;
        if (i3 != 0) {
            i2 = 2;
            if (i3 != 1 && i3 != 2) {
                i2 = b2 & 63;
            }
        } else {
            i2 = 1;
        }
        int i4 = (b & 255) >> 3;
        return i2 * (i4 >= 16 ? 2500 << r0 : i4 >= 12 ? 10000 << (i4 & 1) : (i4 & 3) == 3 ? 60000 : 10000 << r0);
    }

    public static int onNavigationEvent(byte[] bArr) {
        return bArr[9] & 255;
    }

    public static List<byte[]> onExtraCallbackWithResult(byte[] bArr) {
        long jIAuthTabCallback = IAuthTabCallback(onWarmupCompleted(bArr));
        long jIAuthTabCallback2 = IAuthTabCallback(3840L);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(onNavigationEvent(jIAuthTabCallback));
        arrayList.add(onNavigationEvent(jIAuthTabCallback2));
        return arrayList;
    }

    public static int onExtraCallback(ByteBuffer byteBuffer) {
        int iOnNavigationEvent = onNavigationEvent(byteBuffer);
        int i2 = byteBuffer.get(iOnNavigationEvent + 26) + 27 + iOnNavigationEvent;
        return (int) ((onExtraCallbackWithResult(byteBuffer.get(i2), byteBuffer.limit() - i2 > 1 ? byteBuffer.get(i2 + 1) : (byte) 0) * 48000) / 1000000);
    }

    public static int onNavigationEvent(ByteBuffer byteBuffer) {
        if ((byteBuffer.get(5) & 2) == 0) {
            return 0;
        }
        byte b = byteBuffer.get(26);
        int i2 = 28;
        int i3 = 28;
        for (int i4 = 0; i4 < b; i4++) {
            i3 += byteBuffer.get(i4 + 27);
        }
        byte b2 = byteBuffer.get(i3 + 26);
        for (int i5 = 0; i5 < b2; i5++) {
            i2 += byteBuffer.get(i3 + 27 + i5);
        }
        return i3 + i2;
    }

    public static int onExtraCallbackWithResult(ByteBuffer byteBuffer) {
        return (int) ((onExtraCallbackWithResult(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }

    public static long onExtraCallback(byte[] bArr) {
        return onExtraCallbackWithResult(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    public static int onWarmupCompleted(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static boolean onWarmupCompleted(long j, long j2) {
        return j - j2 <= IAuthTabCallback(3840L) / 1000;
    }

    private static byte[] onNavigationEvent(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }

    private static long IAuthTabCallback(long j) {
        return (j * 1000000000) / 48000;
    }
}
