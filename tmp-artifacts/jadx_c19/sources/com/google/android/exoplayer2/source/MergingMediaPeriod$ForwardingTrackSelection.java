package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class MergingMediaPeriod$ForwardingTrackSelection implements ExoTrackSelection {
    private final TrackGroup trackGroup;
    private final ExoTrackSelection trackSelection;

    public MergingMediaPeriod$ForwardingTrackSelection(ExoTrackSelection exoTrackSelection, TrackGroup trackGroup) {
        this.trackSelection = exoTrackSelection;
        this.trackGroup = trackGroup;
    }

    public int getType() {
        return this.trackSelection.getType();
    }

    public TrackGroup getTrackGroup() {
        return this.trackGroup;
    }

    public int length() {
        return this.trackSelection.length();
    }

    public Format getFormat(int i2) {
        return this.trackSelection.getFormat(i2);
    }

    public int getIndexInTrackGroup(int i2) {
        return this.trackSelection.getIndexInTrackGroup(i2);
    }

    public int indexOf(Format format) {
        return this.trackSelection.indexOf(format);
    }

    public int indexOf(int i2) {
        return this.trackSelection.indexOf(i2);
    }

    public void enable() {
        this.trackSelection.enable();
    }

    public void disable() {
        this.trackSelection.disable();
    }

    public Format getSelectedFormat() {
        return this.trackSelection.getSelectedFormat();
    }

    public int getSelectedIndexInTrackGroup() {
        return this.trackSelection.getSelectedIndexInTrackGroup();
    }

    public int getSelectedIndex() {
        return this.trackSelection.getSelectedIndex();
    }

    public int getSelectionReason() {
        return this.trackSelection.getSelectionReason();
    }

    public Object getSelectionData() {
        return this.trackSelection.getSelectionData();
    }

    public void onPlaybackSpeed(float f) {
        this.trackSelection.onPlaybackSpeed(f);
    }

    public void onDiscontinuity() {
        this.trackSelection.onDiscontinuity();
    }

    public void onRebuffer() {
        this.trackSelection.onRebuffer();
    }

    public void onPlayWhenReadyChanged(boolean z) {
        this.trackSelection.onPlayWhenReadyChanged(z);
    }

    public void updateSelectedTrack(long j, long j2, long j3, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr) {
        this.trackSelection.updateSelectedTrack(j, j2, j3, list, mediaChunkIteratorArr);
    }

    public int evaluateQueueSize(long j, List<? extends MediaChunk> list) {
        return this.trackSelection.evaluateQueueSize(j, list);
    }

    public boolean shouldCancelChunkLoad(long j, Chunk chunk, List<? extends MediaChunk> list) {
        return this.trackSelection.shouldCancelChunkLoad(j, chunk, list);
    }

    public boolean blacklist(int i2, long j) {
        return this.trackSelection.blacklist(i2, j);
    }

    public boolean isBlacklisted(int i2, long j) {
        return this.trackSelection.isBlacklisted(i2, j);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MergingMediaPeriod$ForwardingTrackSelection)) {
            return false;
        }
        MergingMediaPeriod$ForwardingTrackSelection mergingMediaPeriod$ForwardingTrackSelection = (MergingMediaPeriod$ForwardingTrackSelection) obj;
        return this.trackSelection.equals(mergingMediaPeriod$ForwardingTrackSelection.trackSelection) && this.trackGroup.equals(mergingMediaPeriod$ForwardingTrackSelection.trackGroup);
    }

    public int hashCode() {
        return ((this.trackGroup.hashCode() + 527) * 31) + this.trackSelection.hashCode();
    }
}
