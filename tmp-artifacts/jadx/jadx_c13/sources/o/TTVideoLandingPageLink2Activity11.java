package o;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class TTVideoLandingPageLink2Activity11 implements TTWebsiteActivity7 {
    private final Charset IAuthTabCallback;
    private final boolean onExtraCallback;
    private static final byte[] onWarmupCompleted = {63};
    private static final String onExtraCallbackWithResult = "?";
    private static final char[] onNavigationEvent = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private static ByteBuffer onWarmupCompleted(CharsetEncoder charsetEncoder, CharBuffer charBuffer, ByteBuffer byteBuffer) {
        while (charBuffer.hasRemaining()) {
            if (charsetEncoder.encode(charBuffer, byteBuffer, false).isOverflow()) {
                byteBuffer = dj13.IAuthTabCallback(byteBuffer, onNavigationEvent(charsetEncoder, charBuffer.remaining()));
            }
        }
        return byteBuffer;
    }

    private static CharBuffer onExtraCallback(CharBuffer charBuffer, char c) {
        charBuffer.position(0).limit(6);
        charBuffer.put('%');
        charBuffer.put('U');
        char[] cArr = onNavigationEvent;
        charBuffer.put(cArr[(c >> '\f') & 15]);
        charBuffer.put(cArr[(c >> '\b') & 15]);
        charBuffer.put(cArr[(c >> 4) & 15]);
        charBuffer.put(cArr[c & 15]);
        charBuffer.flip();
        return charBuffer;
    }

    private static int onNavigationEvent(CharsetEncoder charsetEncoder, int i) {
        return (int) Math.ceil(i * charsetEncoder.averageBytesPerChar());
    }

    private static int onExtraCallbackWithResult(CharsetEncoder charsetEncoder, int i) {
        return (int) Math.ceil(charsetEncoder.maxBytesPerChar() + ((i - 1) * charsetEncoder.averageBytesPerChar()));
    }

    TTVideoLandingPageLink2Activity11(Charset charset, boolean z) {
        this.IAuthTabCallback = charset;
        this.onExtraCallback = z;
    }

    @Override // o.TTWebsiteActivity7
    public boolean onWarmupCompleted(String str) {
        return IAuthTabCallback().canEncode(str);
    }

    @Override // o.TTWebsiteActivity7
    public String onNavigationEvent(byte[] bArr) throws IOException {
        return onExtraCallback().decode(ByteBuffer.wrap(bArr)).toString();
    }

    @Override // o.TTWebsiteActivity7
    public ByteBuffer onExtraCallbackWithResult(String str) {
        CharsetEncoder charsetEncoderIAuthTabCallback = IAuthTabCallback();
        CharBuffer charBufferWrap = CharBuffer.wrap(str);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(onExtraCallbackWithResult(charsetEncoderIAuthTabCallback, charBufferWrap.remaining()));
        CharBuffer charBufferAllocate = null;
        while (charBufferWrap.hasRemaining()) {
            CoderResult coderResultEncode = charsetEncoderIAuthTabCallback.encode(charBufferWrap, byteBufferAllocate, false);
            if (coderResultEncode.isUnmappable() || coderResultEncode.isMalformed()) {
                if (onNavigationEvent(charsetEncoderIAuthTabCallback, coderResultEncode.length() * 6) > byteBufferAllocate.remaining()) {
                    int i = 0;
                    for (int iPosition = charBufferWrap.position(); iPosition < charBufferWrap.limit(); iPosition++) {
                        i += !charsetEncoderIAuthTabCallback.canEncode(charBufferWrap.get(iPosition)) ? 6 : 1;
                    }
                    byteBufferAllocate = dj13.IAuthTabCallback(byteBufferAllocate, onNavigationEvent(charsetEncoderIAuthTabCallback, i) - byteBufferAllocate.remaining());
                }
                if (charBufferAllocate == null) {
                    charBufferAllocate = CharBuffer.allocate(6);
                }
                for (int i2 = 0; i2 < coderResultEncode.length(); i2++) {
                    byteBufferAllocate = onWarmupCompleted(charsetEncoderIAuthTabCallback, onExtraCallback(charBufferAllocate, charBufferWrap.get()), byteBufferAllocate);
                }
            } else if (coderResultEncode.isOverflow()) {
                byteBufferAllocate = dj13.IAuthTabCallback(byteBufferAllocate, onNavigationEvent(charsetEncoderIAuthTabCallback, charBufferWrap.remaining()));
            } else if (coderResultEncode.isUnderflow() || coderResultEncode.isError()) {
                break;
            }
        }
        charsetEncoderIAuthTabCallback.encode(charBufferWrap, byteBufferAllocate, true);
        byteBufferAllocate.limit(byteBufferAllocate.position());
        byteBufferAllocate.rewind();
        return byteBufferAllocate;
    }

    private CharsetDecoder onExtraCallback() {
        if (!this.onExtraCallback) {
            CharsetDecoder charsetDecoderNewDecoder = this.IAuthTabCallback.newDecoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
            return charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        }
        CharsetDecoder charsetDecoderNewDecoder2 = this.IAuthTabCallback.newDecoder();
        CodingErrorAction codingErrorAction2 = CodingErrorAction.REPLACE;
        return charsetDecoderNewDecoder2.onMalformedInput(codingErrorAction2).onUnmappableCharacter(codingErrorAction2).replaceWith(onExtraCallbackWithResult);
    }

    private CharsetEncoder IAuthTabCallback() {
        if (this.onExtraCallback) {
            CharsetEncoder charsetEncoderNewEncoder = this.IAuthTabCallback.newEncoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
            return charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).replaceWith(onWarmupCompleted);
        }
        CharsetEncoder charsetEncoderNewEncoder2 = this.IAuthTabCallback.newEncoder();
        CodingErrorAction codingErrorAction2 = CodingErrorAction.REPORT;
        return charsetEncoderNewEncoder2.onMalformedInput(codingErrorAction2).onUnmappableCharacter(codingErrorAction2);
    }
}
