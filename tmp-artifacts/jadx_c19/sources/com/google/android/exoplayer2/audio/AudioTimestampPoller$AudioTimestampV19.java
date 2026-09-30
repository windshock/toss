package com.google.android.exoplayer2.audio;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class AudioTimestampPoller$AudioTimestampV19 {
    private final AudioTimestamp audioTimestamp = new AudioTimestamp();
    private final AudioTrack audioTrack;
    private long lastTimestampPositionFrames;
    private long lastTimestampRawPositionFrames;
    private long rawTimestampFramePositionWrapCount;

    public AudioTimestampPoller$AudioTimestampV19(AudioTrack audioTrack) {
        this.audioTrack = audioTrack;
    }

    public boolean maybeUpdateTimestamp() {
        boolean timestamp = this.audioTrack.getTimestamp(this.audioTimestamp);
        if (timestamp) {
            long j = this.audioTimestamp.framePosition;
            if (this.lastTimestampRawPositionFrames > j) {
                this.rawTimestampFramePositionWrapCount++;
            }
            this.lastTimestampRawPositionFrames = j;
            this.lastTimestampPositionFrames = j + (this.rawTimestampFramePositionWrapCount << 32);
        }
        return timestamp;
    }

    public long getTimestampSystemTimeUs() {
        return this.audioTimestamp.nanoTime / 1000;
    }

    public long getTimestampPositionFrames() {
        return this.lastTimestampPositionFrames;
    }
}
