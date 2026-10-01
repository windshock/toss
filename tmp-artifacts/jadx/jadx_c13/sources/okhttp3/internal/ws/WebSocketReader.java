package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import java.util.zip.DataFormatException;
import kotlin.jvm.internal.Intrinsics;
import o.TTAppOpenAdTransActivity;
import o.TTBaseActivity;
import o.TTBaseLandingPageActivity;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class WebSocketReader implements Closeable {
    private boolean closed;
    private final TTBaseActivity controlFrameBuffer;
    private final FrameCallback frameCallback;
    private long frameLength;
    private final boolean isClient;
    private boolean isControlFrame;
    private boolean isFinalFrame;
    private final TTBaseActivity.onNavigationEvent maskCursor;
    private final byte[] maskKey;
    private final TTBaseActivity messageFrameBuffer;
    private MessageInflater messageInflater;
    private final boolean noContextTakeover;
    private int opcode;
    private final boolean perMessageDeflate;
    private boolean readingCompressedMessage;
    private final TTAppOpenAdTransActivity source;

    public interface FrameCallback {
        void onReadClose(int i, @NotNull String str);

        void onReadMessage(@NotNull String str) throws IOException;

        void onReadMessage(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity) throws IOException;

        void onReadPing(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity);

        void onReadPong(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity);
    }

    public WebSocketReader(boolean z, @NotNull TTAppOpenAdTransActivity tTAppOpenAdTransActivity, @NotNull FrameCallback frameCallback, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(tTAppOpenAdTransActivity, "");
        Intrinsics.checkNotNullParameter(frameCallback, "");
        this.isClient = z;
        this.source = tTAppOpenAdTransActivity;
        this.frameCallback = frameCallback;
        this.perMessageDeflate = z2;
        this.noContextTakeover = z3;
        this.controlFrameBuffer = new TTBaseActivity();
        this.messageFrameBuffer = new TTBaseActivity();
        this.maskKey = z ? null : new byte[4];
        this.maskCursor = z ? null : new TTBaseActivity.onNavigationEvent();
    }

    public final TTAppOpenAdTransActivity getSource() {
        return this.source;
    }

    public final void processNextFrame() throws IOException {
        readHeader();
        if (this.isControlFrame) {
            readControlFrame();
        } else {
            readMessageFrame();
        }
    }

    private final void readHeader() throws IOException {
        boolean z;
        String str;
        if (this.closed) {
            throw new IOException("closed");
        }
        long jTimeoutNanos = this.source.timeout().timeoutNanos();
        this.source.timeout().clearTimeout();
        try {
            int iAnd = _UtilCommonKt.and(this.source.ICustomTabsCallback(), 255);
            this.source.timeout().timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
            int i = iAnd & 15;
            this.opcode = i;
            boolean z2 = (iAnd & 128) != 0;
            this.isFinalFrame = z2;
            boolean z3 = (iAnd & 8) != 0;
            this.isControlFrame = z3;
            if (z3 && !z2) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z4 = (iAnd & 64) != 0;
            if (i == 1 || i == 2) {
                if (!z4) {
                    z = false;
                } else {
                    if (!this.perMessageDeflate) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z = true;
                }
                this.readingCompressedMessage = z;
            } else if (z4) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((iAnd & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((iAnd & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            int iAnd2 = _UtilCommonKt.and(this.source.ICustomTabsCallback(), 255);
            boolean z5 = (iAnd2 & 128) != 0;
            boolean z6 = this.isClient;
            if (z5 == z6) {
                if (z6) {
                    str = "Server-sent frames must not be masked.";
                } else {
                    str = "Client-sent frames must be masked.";
                }
                throw new ProtocolException(str);
            }
            long j = iAnd2 & 127;
            this.frameLength = j;
            if (j == 126) {
                this.frameLength = _UtilCommonKt.and(this.source.onActivityResized(), Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            } else if (j == 127) {
                long jOnMessageChannelReady = this.source.onMessageChannelReady();
                this.frameLength = jOnMessageChannelReady;
                if (jOnMessageChannelReady < 0) {
                    throw new ProtocolException("Frame length 0x" + _UtilJvmKt.toHexString(this.frameLength) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.isControlFrame && this.frameLength > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z5) {
                TTAppOpenAdTransActivity tTAppOpenAdTransActivity = this.source;
                byte[] bArr = this.maskKey;
                Intrinsics.checkNotNull(bArr);
                tTAppOpenAdTransActivity.onExtraCallbackWithResult(bArr);
            }
        } catch (Throwable th) {
            this.source.timeout().timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    private final void readControlFrame() throws IOException {
        short sOnActivityResized;
        String strOnRelationshipValidationResult;
        long j = this.frameLength;
        if (j > 0) {
            this.source.IAuthTabCallback(this.controlFrameBuffer, j);
            if (!this.isClient) {
                TTBaseActivity tTBaseActivity = this.controlFrameBuffer;
                TTBaseActivity.onNavigationEvent onnavigationevent = this.maskCursor;
                Intrinsics.checkNotNull(onnavigationevent);
                tTBaseActivity.onExtraCallback(onnavigationevent);
                this.maskCursor.onNavigationEvent(0L);
                WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                TTBaseActivity.onNavigationEvent onnavigationevent2 = this.maskCursor;
                byte[] bArr = this.maskKey;
                Intrinsics.checkNotNull(bArr);
                webSocketProtocol.toggleMask(onnavigationevent2, bArr);
                this.maskCursor.close();
            }
        }
        switch (this.opcode) {
            case 8:
                long jICustomTabsCallbackDefault = this.controlFrameBuffer.ICustomTabsCallbackDefault();
                if (jICustomTabsCallbackDefault == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (jICustomTabsCallbackDefault == 0) {
                    sOnActivityResized = 1005;
                    strOnRelationshipValidationResult = _UrlKt.FRAGMENT_ENCODE_SET;
                } else {
                    sOnActivityResized = this.controlFrameBuffer.onActivityResized();
                    strOnRelationshipValidationResult = this.controlFrameBuffer.onRelationshipValidationResult();
                    String strCloseCodeExceptionMessage = WebSocketProtocol.INSTANCE.closeCodeExceptionMessage(sOnActivityResized);
                    if (strCloseCodeExceptionMessage != null) {
                        throw new ProtocolException(strCloseCodeExceptionMessage);
                    }
                }
                this.frameCallback.onReadClose(sOnActivityResized, strOnRelationshipValidationResult);
                this.closed = true;
                return;
            case 9:
                this.frameCallback.onReadPing(this.controlFrameBuffer.writeTypedObject());
                return;
            case 10:
                this.frameCallback.onReadPong(this.controlFrameBuffer.writeTypedObject());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + _UtilJvmKt.toHexString(this.opcode));
        }
    }

    private final void readMessageFrame() throws DataFormatException, IOException {
        int i = this.opcode;
        if (i != 1 && i != 2) {
            throw new ProtocolException("Unknown opcode: " + _UtilJvmKt.toHexString(i));
        }
        readMessage();
        if (this.readingCompressedMessage) {
            MessageInflater messageInflater = this.messageInflater;
            if (messageInflater == null) {
                messageInflater = new MessageInflater(this.noContextTakeover);
                this.messageInflater = messageInflater;
            }
            messageInflater.inflate(this.messageFrameBuffer);
        }
        if (i == 1) {
            this.frameCallback.onReadMessage(this.messageFrameBuffer.onRelationshipValidationResult());
        } else {
            this.frameCallback.onReadMessage(this.messageFrameBuffer.writeTypedObject());
        }
    }

    private final void readUntilNonControlFrame() throws IOException {
        while (!this.closed) {
            readHeader();
            if (!this.isControlFrame) {
                return;
            } else {
                readControlFrame();
            }
        }
    }

    private final void readMessage() throws IOException {
        while (!this.closed) {
            long j = this.frameLength;
            if (j > 0) {
                this.source.IAuthTabCallback(this.messageFrameBuffer, j);
                if (!this.isClient) {
                    TTBaseActivity tTBaseActivity = this.messageFrameBuffer;
                    TTBaseActivity.onNavigationEvent onnavigationevent = this.maskCursor;
                    Intrinsics.checkNotNull(onnavigationevent);
                    tTBaseActivity.onExtraCallback(onnavigationevent);
                    this.maskCursor.onNavigationEvent(this.messageFrameBuffer.ICustomTabsCallbackDefault() - this.frameLength);
                    WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                    TTBaseActivity.onNavigationEvent onnavigationevent2 = this.maskCursor;
                    byte[] bArr = this.maskKey;
                    Intrinsics.checkNotNull(bArr);
                    webSocketProtocol.toggleMask(onnavigationevent2, bArr);
                    this.maskCursor.close();
                }
            }
            if (this.isFinalFrame) {
                return;
            }
            readUntilNonControlFrame();
            if (this.opcode != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + _UtilJvmKt.toHexString(this.opcode));
            }
        }
        throw new IOException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        MessageInflater messageInflater = this.messageInflater;
        if (messageInflater != null) {
            _UtilCommonKt.closeQuietly(messageInflater);
        }
        _UtilCommonKt.closeQuietly(this.source);
    }
}
