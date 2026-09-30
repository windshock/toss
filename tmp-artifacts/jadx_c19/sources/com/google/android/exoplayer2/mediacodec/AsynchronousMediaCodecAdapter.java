package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PersistableBundle;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.CryptoInfo;
import com.google.android.exoplayer2.mediacodec.MediaCodecAdapter;
import com.google.android.exoplayer2.util.TraceUtil;
import java.nio.ByteBuffer;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class AsynchronousMediaCodecAdapter implements MediaCodecAdapter {
    private static final int STATE_CREATED = 0;
    private static final int STATE_INITIALIZED = 1;
    private static final int STATE_SHUT_DOWN = 2;
    private final AsynchronousMediaCodecCallback asynchronousMediaCodecCallback;
    private final AsynchronousMediaCodecBufferEnqueuer bufferEnqueuer;
    private final MediaCodec codec;
    private boolean codecReleased;
    private int state;
    private final boolean synchronizeCodecInteractionsWithQueueing;

    public boolean needsReconfiguration() {
        return false;
    }

    private AsynchronousMediaCodecAdapter(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z) {
        this.codec = mediaCodec;
        this.asynchronousMediaCodecCallback = new AsynchronousMediaCodecCallback(handlerThread);
        this.bufferEnqueuer = new AsynchronousMediaCodecBufferEnqueuer(mediaCodec, handlerThread2);
        this.synchronizeCodecInteractionsWithQueueing = z;
        this.state = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initialize(@Nullable MediaFormat mediaFormat, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto, int i2) {
        this.asynchronousMediaCodecCallback.initialize(this.codec);
        TraceUtil.beginSection("configureCodec");
        this.codec.configure(mediaFormat, surface, mediaCrypto, i2);
        TraceUtil.endSection();
        this.bufferEnqueuer.start();
        TraceUtil.beginSection("startCodec");
        this.codec.start();
        TraceUtil.endSection();
        this.state = 1;
    }

    public void queueInputBuffer(int i2, int i3, int i4, long j, int i5) {
        this.bufferEnqueuer.queueInputBuffer(i2, i3, i4, j, i5);
    }

    public void queueSecureInputBuffer(int i2, int i3, CryptoInfo cryptoInfo, long j, int i4) {
        this.bufferEnqueuer.queueSecureInputBuffer(i2, i3, cryptoInfo, j, i4);
    }

    public void releaseOutputBuffer(int i2, boolean z) {
        this.codec.releaseOutputBuffer(i2, z);
    }

    public void releaseOutputBuffer(int i2, long j) {
        this.codec.releaseOutputBuffer(i2, j);
    }

    public int dequeueInputBufferIndex() {
        return this.asynchronousMediaCodecCallback.dequeueInputBufferIndex();
    }

    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        return this.asynchronousMediaCodecCallback.dequeueOutputBufferIndex(bufferInfo);
    }

    public MediaFormat getOutputFormat() {
        return this.asynchronousMediaCodecCallback.getOutputFormat();
    }

    public ByteBuffer getInputBuffer(int i2) {
        return this.codec.getInputBuffer(i2);
    }

    public ByteBuffer getOutputBuffer(int i2) {
        return this.codec.getOutputBuffer(i2);
    }

    public void flush() {
        this.bufferEnqueuer.flush();
        this.codec.flush();
        this.asynchronousMediaCodecCallback.flush();
        this.codec.start();
    }

    public void release() {
        try {
            if (this.state == 1) {
                this.bufferEnqueuer.shutdown();
                this.asynchronousMediaCodecCallback.shutdown();
            }
            this.state = 2;
        } finally {
            if (!this.codecReleased) {
                this.codec.release();
                this.codecReleased = true;
            }
        }
    }

    public void setOnFrameRenderedListener(final MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, Handler handler) {
        maybeBlockOnQueueing();
        this.codec.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecAdapter$$ExternalSyntheticLambda0
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                onFrameRenderedListener.onFrameRendered(this.f$0, j, j2);
            }
        }, handler);
    }

    public void setOutputSurface(Surface surface) {
        maybeBlockOnQueueing();
        this.codec.setOutputSurface(surface);
    }

    public void setParameters(Bundle bundle) {
        maybeBlockOnQueueing();
        this.codec.setParameters(bundle);
    }

    public void setVideoScalingMode(int i2) {
        maybeBlockOnQueueing();
        this.codec.setVideoScalingMode(i2);
    }

    public PersistableBundle getMetrics() {
        maybeBlockOnQueueing();
        return this.codec.getMetrics();
    }

    void onError(MediaCodec.CodecException codecException) {
        this.asynchronousMediaCodecCallback.onError(this.codec, codecException);
    }

    void onOutputFormatChanged(MediaFormat mediaFormat) {
        this.asynchronousMediaCodecCallback.onOutputFormatChanged(this.codec, mediaFormat);
    }

    private void maybeBlockOnQueueing() {
        if (this.synchronizeCodecInteractionsWithQueueing) {
            try {
                this.bufferEnqueuer.waitUntilQueueingComplete();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String createCallbackThreadLabel(int i2) {
        return createThreadLabel(i2, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String createQueueingThreadLabel(int i2) {
        return createThreadLabel(i2, "ExoPlayer:MediaCodecQueueingThread:");
    }

    private static String createThreadLabel(int i2, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i2 == 1) {
            sb.append("Audio");
        } else if (i2 == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i2);
            sb.append(")");
        }
        return sb.toString();
    }
}
