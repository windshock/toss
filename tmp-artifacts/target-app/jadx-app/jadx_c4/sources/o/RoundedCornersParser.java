package o;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes4.dex */
final class RoundedCornersParser {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    RoundedCornersParser() {
    }

    static byte[] IAuthTabCallback(char[] cArr) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        CharBuffer charBufferWrap = CharBuffer.wrap(cArr);
        ByteBuffer byteBufferEncode = Charset.forName("UTF-8").encode(charBufferWrap);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(byteBufferEncode.array(), byteBufferEncode.position(), byteBufferEncode.limit());
        Arrays.fill(charBufferWrap.array(), (char) 0);
        Arrays.fill(byteBufferEncode.array(), (byte) 0);
        int i4 = onWarmupCompleted + 45;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return bArrCopyOfRange;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static char[] onExtraCallbackWithResult(byte[] bArr) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Charset charsetForName = Charset.forName("UTF-8");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        CharBuffer charBufferDecode = charsetForName.decode(byteBufferWrap);
        char[] cArrCopyOf = Arrays.copyOf(charBufferDecode.array(), charBufferDecode.limit());
        Arrays.fill(charBufferDecode.array(), (char) 0);
        Arrays.fill(byteBufferWrap.array(), (byte) 0);
        int i4 = onWarmupCompleted + 81;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return cArrCopyOf;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
