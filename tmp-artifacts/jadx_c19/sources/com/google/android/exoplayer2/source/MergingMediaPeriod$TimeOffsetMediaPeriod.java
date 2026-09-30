package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class MergingMediaPeriod$TimeOffsetMediaPeriod implements MediaPeriod, MediaPeriod.Callback {
    private MediaPeriod.Callback callback;
    private final MediaPeriod mediaPeriod;
    private final long timeOffsetUs;

    public MergingMediaPeriod$TimeOffsetMediaPeriod(MediaPeriod mediaPeriod, long j) {
        this.mediaPeriod = mediaPeriod;
        this.timeOffsetUs = j;
    }

    public void prepare(MediaPeriod.Callback callback, long j) {
        this.callback = callback;
        this.mediaPeriod.prepare(this, j - this.timeOffsetUs);
    }

    public void maybeThrowPrepareError() throws IOException {
        this.mediaPeriod.maybeThrowPrepareError();
    }

    public TrackGroupArray getTrackGroups() {
        return this.mediaPeriod.getTrackGroups();
    }

    public List<StreamKey> getStreamKeys(List<ExoTrackSelection> list) {
        return this.mediaPeriod.getStreamKeys(list);
    }

    public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        SampleStream[] sampleStreamArr2 = new SampleStream[sampleStreamArr.length];
        int i2 = 0;
        while (true) {
            SampleStream childStream = null;
            if (i2 >= sampleStreamArr.length) {
                break;
            }
            MergingMediaPeriod$TimeOffsetSampleStream mergingMediaPeriod$TimeOffsetSampleStream = (MergingMediaPeriod$TimeOffsetSampleStream) sampleStreamArr[i2];
            if (mergingMediaPeriod$TimeOffsetSampleStream != null) {
                childStream = mergingMediaPeriod$TimeOffsetSampleStream.getChildStream();
            }
            sampleStreamArr2[i2] = childStream;
            i2++;
        }
        long jSelectTracks = this.mediaPeriod.selectTracks(exoTrackSelectionArr, zArr, sampleStreamArr2, zArr2, j - this.timeOffsetUs);
        for (int i3 = 0; i3 < sampleStreamArr.length; i3++) {
            final SampleStream sampleStream = sampleStreamArr2[i3];
            if (sampleStream == null) {
                sampleStreamArr[i3] = null;
            } else {
                SampleStream sampleStream2 = sampleStreamArr[i3];
                if (sampleStream2 == null || ((MergingMediaPeriod$TimeOffsetSampleStream) sampleStream2).getChildStream() != sampleStream) {
                    final long j2 = this.timeOffsetUs;
                    sampleStreamArr[i3] = new SampleStream(sampleStream, j2) { // from class: com.google.android.exoplayer2.source.MergingMediaPeriod$TimeOffsetSampleStream
                        private final SampleStream sampleStream;
                        private final long timeOffsetUs;

                        {
                            this.sampleStream = sampleStream;
                            this.timeOffsetUs = j2;
                        }

                        public SampleStream getChildStream() {
                            return this.sampleStream;
                        }

                        public boolean isReady() {
                            return this.sampleStream.isReady();
                        }

                        public void maybeThrowError() throws IOException {
                            this.sampleStream.maybeThrowError();
                        }

                        public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i4) {
                            int data = this.sampleStream.readData(formatHolder, decoderInputBuffer, i4);
                            if (data == -4) {
                                decoderInputBuffer.timeUs = Math.max(0L, decoderInputBuffer.timeUs + this.timeOffsetUs);
                            }
                            return data;
                        }

                        public int skipData(long j3) {
                            return this.sampleStream.skipData(j3 - this.timeOffsetUs);
                        }
                    };
                }
            }
        }
        return jSelectTracks + this.timeOffsetUs;
    }

    public void discardBuffer(long j, boolean z) {
        this.mediaPeriod.discardBuffer(j - this.timeOffsetUs, z);
    }

    public long readDiscontinuity() {
        long discontinuity = this.mediaPeriod.readDiscontinuity();
        if (discontinuity == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return discontinuity + this.timeOffsetUs;
    }

    public long seekToUs(long j) {
        return this.mediaPeriod.seekToUs(j - this.timeOffsetUs) + this.timeOffsetUs;
    }

    public long getAdjustedSeekPositionUs(long j, SeekParameters seekParameters) {
        return this.mediaPeriod.getAdjustedSeekPositionUs(j - this.timeOffsetUs, seekParameters) + this.timeOffsetUs;
    }

    public long getBufferedPositionUs() {
        long bufferedPositionUs = this.mediaPeriod.getBufferedPositionUs();
        if (bufferedPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return bufferedPositionUs + this.timeOffsetUs;
    }

    public long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.mediaPeriod.getNextLoadPositionUs();
        if (nextLoadPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return nextLoadPositionUs + this.timeOffsetUs;
    }

    public boolean continueLoading(long j) {
        return this.mediaPeriod.continueLoading(j - this.timeOffsetUs);
    }

    public boolean isLoading() {
        return this.mediaPeriod.isLoading();
    }

    public void reevaluateBuffer(long j) {
        this.mediaPeriod.reevaluateBuffer(j - this.timeOffsetUs);
    }

    public void onPrepared(MediaPeriod mediaPeriod) {
        ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onPrepared(this);
    }

    public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
        ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
    }
}
