package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SingleSampleMediaPeriod$SampleStreamImpl implements SampleStream {
    private static final int STREAM_STATE_END_OF_STREAM = 2;
    private static final int STREAM_STATE_SEND_FORMAT = 0;
    private static final int STREAM_STATE_SEND_SAMPLE = 1;
    private boolean notifiedDownstreamFormat;
    private int streamState;
    final /* synthetic */ SingleSampleMediaPeriod this$0;

    private SingleSampleMediaPeriod$SampleStreamImpl(SingleSampleMediaPeriod singleSampleMediaPeriod) {
        this.this$0 = singleSampleMediaPeriod;
    }

    public void reset() {
        if (this.streamState == 2) {
            this.streamState = 1;
        }
    }

    public boolean isReady() {
        return this.this$0.loadingFinished;
    }

    public void maybeThrowError() throws IOException {
        SingleSampleMediaPeriod singleSampleMediaPeriod = this.this$0;
        if (singleSampleMediaPeriod.treatLoadErrorsAsEndOfStream) {
            return;
        }
        singleSampleMediaPeriod.loader.maybeThrowError();
    }

    public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
        maybeNotifyDownstreamFormat();
        SingleSampleMediaPeriod singleSampleMediaPeriod = this.this$0;
        boolean z = singleSampleMediaPeriod.loadingFinished;
        if (z && singleSampleMediaPeriod.sampleData == null) {
            this.streamState = 2;
        }
        int i3 = this.streamState;
        if (i3 == 2) {
            decoderInputBuffer.addFlag(4);
            return -4;
        }
        if ((i2 & 2) != 0 || i3 == 0) {
            formatHolder.format = singleSampleMediaPeriod.format;
            this.streamState = 1;
            return -5;
        }
        if (!z) {
            return -3;
        }
        Assertions.checkNotNull(singleSampleMediaPeriod.sampleData);
        decoderInputBuffer.addFlag(1);
        decoderInputBuffer.timeUs = 0L;
        if ((i2 & 4) == 0) {
            decoderInputBuffer.ensureSpaceForWrite(this.this$0.sampleSize);
            ByteBuffer byteBuffer = decoderInputBuffer.data;
            SingleSampleMediaPeriod singleSampleMediaPeriod2 = this.this$0;
            byteBuffer.put(singleSampleMediaPeriod2.sampleData, 0, singleSampleMediaPeriod2.sampleSize);
        }
        if ((i2 & 1) == 0) {
            this.streamState = 2;
        }
        return -4;
    }

    public int skipData(long j) {
        maybeNotifyDownstreamFormat();
        if (j <= 0 || this.streamState == 2) {
            return 0;
        }
        this.streamState = 2;
        return 1;
    }

    private void maybeNotifyDownstreamFormat() {
        if (this.notifiedDownstreamFormat) {
            return;
        }
        SingleSampleMediaPeriod.access$300(this.this$0).downstreamFormatChanged(MimeTypes.getTrackType(this.this$0.format.sampleMimeType), this.this$0.format, 0, (Object) null, 0L);
        this.notifiedDownstreamFormat = true;
    }
}
