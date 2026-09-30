package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.Surface;
import com.google.android.exoplayer2.decoder.CryptoInfo;
import com.google.android.exoplayer2.mediacodec.MediaCodecAdapter;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SynchronousMediaCodecAdapter implements MediaCodecAdapter {
    private final MediaCodec codec;
    private ByteBuffer[] inputByteBuffers;
    private ByteBuffer[] outputByteBuffers;

    public boolean needsReconfiguration() {
        return false;
    }

    private SynchronousMediaCodecAdapter(MediaCodec mediaCodec) {
        this.codec = mediaCodec;
        if (Util.SDK_INT < 21) {
            this.inputByteBuffers = mediaCodec.getInputBuffers();
            this.outputByteBuffers = mediaCodec.getOutputBuffers();
        }
    }

    public int dequeueInputBufferIndex() {
        return this.codec.dequeueInputBuffer(0L);
    }

    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && Util.SDK_INT < 21) {
                this.outputByteBuffers = this.codec.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    public MediaFormat getOutputFormat() {
        return this.codec.getOutputFormat();
    }

    public ByteBuffer getInputBuffer(int i2) {
        if (Util.SDK_INT >= 21) {
            return this.codec.getInputBuffer(i2);
        }
        return ((ByteBuffer[]) Util.castNonNull(this.inputByteBuffers))[i2];
    }

    public ByteBuffer getOutputBuffer(int i2) {
        if (Util.SDK_INT >= 21) {
            return this.codec.getOutputBuffer(i2);
        }
        return ((ByteBuffer[]) Util.castNonNull(this.outputByteBuffers))[i2];
    }

    public void queueInputBuffer(int i2, int i3, int i4, long j, int i5) throws MediaCodec.CryptoException {
        this.codec.queueInputBuffer(i2, i3, i4, j, i5);
    }

    public void queueSecureInputBuffer(int i2, int i3, CryptoInfo cryptoInfo, long j, int i4) throws MediaCodec.CryptoException {
        this.codec.queueSecureInputBuffer(i2, i3, cryptoInfo.getFrameworkCryptoInfo(), j, i4);
    }

    public void releaseOutputBuffer(int i2, boolean z) {
        this.codec.releaseOutputBuffer(i2, z);
    }

    public void releaseOutputBuffer(int i2, long j) {
        this.codec.releaseOutputBuffer(i2, j);
    }

    public void flush() {
        this.codec.flush();
    }

    public void release() {
        this.inputByteBuffers = null;
        this.outputByteBuffers = null;
        this.codec.release();
    }

    public void setOnFrameRenderedListener(final MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, Handler handler) {
        this.codec.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: com.google.android.exoplayer2.mediacodec.SynchronousMediaCodecAdapter$$ExternalSyntheticLambda0
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                onFrameRenderedListener.onFrameRendered(this.f$0, j, j2);
            }
        }, handler);
    }

    public void setOutputSurface(Surface surface) {
        this.codec.setOutputSurface(surface);
    }

    public void setParameters(Bundle bundle) {
        this.codec.setParameters(bundle);
    }

    public void setVideoScalingMode(int i2) {
        this.codec.setVideoScalingMode(i2);
    }

    public PersistableBundle getMetrics() {
        return this.codec.getMetrics();
    }
}
