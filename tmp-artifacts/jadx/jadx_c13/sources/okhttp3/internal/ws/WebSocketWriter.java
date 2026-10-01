package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;
import o.TTAppOpenAdActivity9;
import o.TTBaseActivity;
import o.TTBaseLandingPageActivity;
import okhttp3.internal._UtilCommonKt;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class WebSocketWriter implements Closeable {
    private final boolean isClient;
    private final TTBaseActivity.onNavigationEvent maskCursor;
    private final byte[] maskKey;
    private final TTBaseActivity messageBuffer;
    private MessageDeflater messageDeflater;
    private final long minimumDeflateSize;
    private final boolean noContextTakeover;
    private final boolean perMessageDeflate;
    private final Random random;
    private final TTAppOpenAdActivity9 sink;
    private final TTBaseActivity sinkBuffer;
    private boolean writerClosed;

    public WebSocketWriter(boolean z, @NotNull TTAppOpenAdActivity9 tTAppOpenAdActivity9, @NotNull Random random, boolean z2, boolean z3, long j) {
        Intrinsics.checkNotNullParameter(tTAppOpenAdActivity9, "");
        Intrinsics.checkNotNullParameter(random, "");
        this.isClient = z;
        this.sink = tTAppOpenAdActivity9;
        this.random = random;
        this.perMessageDeflate = z2;
        this.noContextTakeover = z3;
        this.minimumDeflateSize = j;
        this.messageBuffer = new TTBaseActivity();
        this.sinkBuffer = tTAppOpenAdActivity9.access100();
        this.maskKey = z ? new byte[4] : null;
        this.maskCursor = z ? new TTBaseActivity.onNavigationEvent() : null;
    }

    public final TTAppOpenAdActivity9 getSink() {
        return this.sink;
    }

    public final Random getRandom() {
        return this.random;
    }

    public final void writePing(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity) throws IOException {
        Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
        writeControlFrame(9, tTBaseLandingPageActivity);
    }

    public final void writePong(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity) throws IOException {
        Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
        writeControlFrame(10, tTBaseLandingPageActivity);
    }

    public final void writeClose(int i, @Nullable TTBaseLandingPageActivity tTBaseLandingPageActivity) throws IOException {
        TTBaseLandingPageActivity tTBaseLandingPageActivityWriteTypedObject = TTBaseLandingPageActivity.EMPTY;
        if (i != 0 || tTBaseLandingPageActivity != null) {
            if (i != 0) {
                WebSocketProtocol.INSTANCE.validateCloseCode(i);
            }
            TTBaseActivity tTBaseActivity = new TTBaseActivity();
            tTBaseActivity.IAuthTabCallbackDefault(i);
            if (tTBaseLandingPageActivity != null) {
                tTBaseActivity.onExtraCallback(tTBaseLandingPageActivity);
            }
            tTBaseLandingPageActivityWriteTypedObject = tTBaseActivity.writeTypedObject();
        }
        try {
            writeControlFrame(8, tTBaseLandingPageActivityWriteTypedObject);
        } finally {
            this.writerClosed = true;
        }
    }

    private final void writeControlFrame(int i, TTBaseLandingPageActivity tTBaseLandingPageActivity) throws IOException {
        if (this.writerClosed) {
            throw new IOException("closed");
        }
        int iAccess100 = tTBaseLandingPageActivity.access100();
        if (iAccess100 > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        this.sinkBuffer.onExtraCallbackWithResult(i | 128);
        if (this.isClient) {
            this.sinkBuffer.onExtraCallbackWithResult(iAccess100 | 128);
            Random random = this.random;
            byte[] bArr = this.maskKey;
            Intrinsics.checkNotNull(bArr);
            random.nextBytes(bArr);
            this.sinkBuffer.onExtraCallback(this.maskKey);
            if (iAccess100 > 0) {
                long jICustomTabsCallbackDefault = this.sinkBuffer.ICustomTabsCallbackDefault();
                this.sinkBuffer.onExtraCallback(tTBaseLandingPageActivity);
                TTBaseActivity tTBaseActivity = this.sinkBuffer;
                TTBaseActivity.onNavigationEvent onnavigationevent = this.maskCursor;
                Intrinsics.checkNotNull(onnavigationevent);
                tTBaseActivity.onExtraCallback(onnavigationevent);
                this.maskCursor.onNavigationEvent(jICustomTabsCallbackDefault);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        } else {
            this.sinkBuffer.onExtraCallbackWithResult(iAccess100);
            this.sinkBuffer.onExtraCallback(tTBaseLandingPageActivity);
        }
        this.sink.flush();
    }

    public final void writeMessageFrame(int i, @NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity) throws IOException {
        Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
        if (this.writerClosed) {
            throw new IOException("closed");
        }
        this.messageBuffer.onExtraCallback(tTBaseLandingPageActivity);
        int i2 = i | 128;
        if (this.perMessageDeflate && tTBaseLandingPageActivity.access100() >= this.minimumDeflateSize) {
            MessageDeflater messageDeflater = this.messageDeflater;
            if (messageDeflater == null) {
                messageDeflater = new MessageDeflater(this.noContextTakeover);
                this.messageDeflater = messageDeflater;
            }
            messageDeflater.deflate(this.messageBuffer);
            i2 = i | BERTags.PRIVATE;
        }
        long jICustomTabsCallbackDefault = this.messageBuffer.ICustomTabsCallbackDefault();
        this.sinkBuffer.onExtraCallbackWithResult(i2);
        int i3 = this.isClient ? 128 : 0;
        if (jICustomTabsCallbackDefault <= 125) {
            this.sinkBuffer.onExtraCallbackWithResult(i3 | ((int) jICustomTabsCallbackDefault));
        } else if (jICustomTabsCallbackDefault <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            this.sinkBuffer.onExtraCallbackWithResult(i3 | 126);
            this.sinkBuffer.IAuthTabCallbackDefault((int) jICustomTabsCallbackDefault);
        } else {
            this.sinkBuffer.onExtraCallbackWithResult(i3 | 127);
            this.sinkBuffer.access100(jICustomTabsCallbackDefault);
        }
        if (this.isClient) {
            Random random = this.random;
            byte[] bArr = this.maskKey;
            Intrinsics.checkNotNull(bArr);
            random.nextBytes(bArr);
            this.sinkBuffer.onExtraCallback(this.maskKey);
            if (jICustomTabsCallbackDefault > 0) {
                TTBaseActivity tTBaseActivity = this.messageBuffer;
                TTBaseActivity.onNavigationEvent onnavigationevent = this.maskCursor;
                Intrinsics.checkNotNull(onnavigationevent);
                tTBaseActivity.onExtraCallback(onnavigationevent);
                this.maskCursor.onNavigationEvent(0L);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        }
        this.sinkBuffer.write(this.messageBuffer, jICustomTabsCallbackDefault);
        this.sink.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        MessageDeflater messageDeflater = this.messageDeflater;
        if (messageDeflater != null) {
            _UtilCommonKt.closeQuietly(messageDeflater);
        }
        _UtilCommonKt.closeQuietly(this.sink);
    }
}
