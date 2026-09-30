package o;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setIsPreventTouchEvent {
    private final CharsetDecoder IAuthTabCallback;
    private char IAuthTabCallbackDefault;
    private boolean onExtraCallback;
    private final InputStream onExtraCallbackWithResult;
    private final ByteBuffer onNavigationEvent;
    private final Charset onWarmupCompleted;

    public setIsPreventTouchEvent(@NotNull InputStream inputStream, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(inputStream, "");
        Intrinsics.checkNotNullParameter(charset, "");
        this.onExtraCallbackWithResult = inputStream;
        this.onWarmupCompleted = charset;
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetDecoder charsetDecoderOnUnmappableCharacter = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        Intrinsics.checkNotNullExpressionValue(charsetDecoderOnUnmappableCharacter, "");
        this.IAuthTabCallback = charsetDecoderOnUnmappableCharacter;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(getMaterialMeta.onExtraCallbackWithResult.onExtraCallbackWithResult());
        Intrinsics.checkNotNullExpressionValue(byteBufferWrap, "");
        this.onNavigationEvent = byteBufferWrap;
        byteBufferWrap.flip();
    }

    public final int IAuthTabCallback(@NotNull char[] cArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(cArr, "");
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        if (i < 0 || i >= cArr.length || i2 < 0 || i + i2 > cArr.length) {
            throw new IllegalArgumentException(("Unexpected arguments: " + i + ", " + i2 + ", " + cArr.length).toString());
        }
        if (this.onExtraCallback) {
            cArr[i] = this.IAuthTabCallbackDefault;
            i++;
            i2--;
            this.onExtraCallback = false;
            if (i2 == 0) {
                return 1;
            }
            i3 = 1;
        }
        if (i2 == 1) {
            int iOnWarmupCompleted = onWarmupCompleted();
            if (iOnWarmupCompleted == -1) {
                return i3 == 0 ? -1 : 1;
            }
            cArr[i] = (char) iOnWarmupCompleted;
            return i3 + 1;
        }
        return onExtraCallbackWithResult(cArr, i, i2) + i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int onExtraCallbackWithResult(char[] cArr, int i, int i2) throws CharacterCodingException {
        CharBuffer charBufferWrap = CharBuffer.wrap(cArr, i, i2);
        if (charBufferWrap.position() != 0) {
            charBufferWrap = charBufferWrap.slice();
        }
        boolean z = false;
        while (true) {
            CoderResult coderResultDecode = this.IAuthTabCallback.decode(this.onNavigationEvent, charBufferWrap, z);
            if (coderResultDecode.isUnderflow()) {
                if (!z && charBufferWrap.hasRemaining()) {
                    if (onExtraCallbackWithResult() < 0) {
                        if (charBufferWrap.position() == 0 && !this.onNavigationEvent.hasRemaining()) {
                            break;
                        }
                        this.IAuthTabCallback.reset();
                        z = true;
                    } else {
                        continue;
                    }
                } else {
                    break;
                }
            } else {
                if (coderResultDecode.isOverflow()) {
                    charBufferWrap.position();
                    break;
                }
                coderResultDecode.throwException();
            }
            if (charBufferWrap.position() != 0) {
                return -1;
            }
            return charBufferWrap.position();
        }
        if (z) {
            this.IAuthTabCallback.reset();
        }
        if (charBufferWrap.position() != 0) {
        }
    }

    private final int onExtraCallbackWithResult() {
        this.onNavigationEvent.compact();
        try {
            int iLimit = this.onNavigationEvent.limit();
            int iPosition = this.onNavigationEvent.position();
            int i = this.onExtraCallbackWithResult.read(this.onNavigationEvent.array(), this.onNavigationEvent.arrayOffset() + iPosition, iPosition <= iLimit ? iLimit - iPosition : 0);
            if (i < 0) {
                return i;
            }
            ByteBuffer byteBuffer = this.onNavigationEvent;
            Intrinsics.checkNotNull(byteBuffer, "");
            byteBuffer.position(iPosition + i);
            this.onNavigationEvent.flip();
            return this.onNavigationEvent.remaining();
        } finally {
            this.onNavigationEvent.flip();
        }
    }

    private final int onWarmupCompleted() {
        if (this.onExtraCallback) {
            this.onExtraCallback = false;
            return this.IAuthTabCallbackDefault;
        }
        char[] cArr = new char[2];
        int iIAuthTabCallback = IAuthTabCallback(cArr, 0, 2);
        if (iIAuthTabCallback == -1) {
            return -1;
        }
        if (iIAuthTabCallback == 1) {
            return cArr[0];
        }
        if (iIAuthTabCallback == 2) {
            this.IAuthTabCallbackDefault = cArr[1];
            this.onExtraCallback = true;
            return cArr[0];
        }
        throw new IllegalStateException(("Unreachable state: " + iIAuthTabCallback).toString());
    }

    public final void IAuthTabCallback() {
        getMaterialMeta getmaterialmeta = getMaterialMeta.onExtraCallbackWithResult;
        byte[] bArrArray = this.onNavigationEvent.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "");
        getmaterialmeta.onNavigationEvent(bArrArray);
    }
}
