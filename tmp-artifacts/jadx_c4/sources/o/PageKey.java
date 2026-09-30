package o;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class PageKey {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ byte[] onWarmupCompleted(CharSequence charSequence, Charset charset, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 1;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            charset = Charset.forName("UTF-8");
            Intrinsics.checkNotNullExpressionValue(charset, "");
        }
        byte[] bArrIAuthTabCallback = IAuthTabCallback(charSequence, charset);
        int i4 = onWarmupCompleted + 39;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return bArrIAuthTabCallback;
    }

    public static final byte[] IAuthTabCallback(@NotNull CharSequence charSequence, @NotNull Charset charset) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charset, "");
        if (charSequence instanceof String) {
            byte[] bytes = ((String) charSequence).getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            return bytes;
        }
        Object obj = null;
        if (charSequence instanceof GraniteBrownfieldModule_closeView) {
            int i2 = onWarmupCompleted + 37;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return ((GraniteBrownfieldModule_closeView) charSequence).onWarmupCompleted();
            }
            ((GraniteBrownfieldModule_closeView) charSequence).onWarmupCompleted();
            obj.hashCode();
            throw null;
        }
        if (Class.forName("o.setMax").isInstance(charSequence)) {
            int i3 = onNavigationEvent + 13;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                byte[] bArrOnExtraCallbackWithResult = ((setMax) charSequence).onExtraCallbackWithResult();
                return bArrOnExtraCallbackWithResult == null ? new byte[0] : bArrOnExtraCallbackWithResult;
            }
            ((setMax) charSequence).onExtraCallbackWithResult();
            throw null;
        }
        CharBuffer charBufferAllocate = CharBuffer.allocate(charSequence.length());
        int i4 = onNavigationEvent + 111;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        int i6 = 0;
        int i7 = 0;
        while (i6 < charSequence.length()) {
            charBufferAllocate.put(i7, charSequence.charAt(i6));
            i6++;
            i7++;
            int i8 = onNavigationEvent + 123;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
        }
        ByteBuffer byteBufferEncode = Charset.forName("UTF-8").encode(charBufferAllocate);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(byteBufferEncode.array(), byteBufferEncode.position(), byteBufferEncode.limit());
        Arrays.fill(byteBufferEncode.array(), (byte) 0);
        Intrinsics.checkNotNull(bArrCopyOfRange);
        return bArrCopyOfRange;
    }

    public static final CharSequence onWarmupCompleted(@NotNull CharSequence charSequence) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char cCharAt = charSequence.charAt(i2);
            Object objOnExtraCallbackWithResult = CharsKt.onExtraCallbackWithResult(cCharAt);
            if (objOnExtraCallbackWithResult == null) {
                int i3 = onNavigationEvent + 29;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    Character.valueOf(cCharAt);
                    throw null;
                }
                objOnExtraCallbackWithResult = Character.valueOf(cCharAt);
                int i4 = onNavigationEvent + 85;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            }
            sb.append(objOnExtraCallbackWithResult);
            Intrinsics.checkNotNullExpressionValue(sb, "");
        }
        return sb;
    }
}
