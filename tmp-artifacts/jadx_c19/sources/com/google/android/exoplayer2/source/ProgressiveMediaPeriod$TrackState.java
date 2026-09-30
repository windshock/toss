package com.google.android.exoplayer2.source;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class ProgressiveMediaPeriod$TrackState {
    public final boolean[] trackEnabledStates;
    public final boolean[] trackIsAudioVideoFlags;
    public final boolean[] trackNotifiedDownstreamFormats;
    public final TrackGroupArray tracks;

    public ProgressiveMediaPeriod$TrackState(TrackGroupArray trackGroupArray, boolean[] zArr) {
        this.tracks = trackGroupArray;
        this.trackIsAudioVideoFlags = zArr;
        int i2 = trackGroupArray.length;
        this.trackEnabledStates = new boolean[i2];
        this.trackNotifiedDownstreamFormats = new boolean[i2];
    }
}
