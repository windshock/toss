package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.util.Assertions;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class ExoplayerCuesDecoder$SingleEventSubtitle implements Subtitle {
    private final ImmutableList<Cue> cues;
    private final long timeUs;

    public int getEventTimeCount() {
        return 1;
    }

    public ExoplayerCuesDecoder$SingleEventSubtitle(long j, ImmutableList<Cue> immutableList) {
        this.timeUs = j;
        this.cues = immutableList;
    }

    public int getNextEventTimeIndex(long j) {
        return this.timeUs > j ? 0 : -1;
    }

    public long getEventTime(int i2) {
        Assertions.checkArgument(i2 == 0);
        return this.timeUs;
    }

    public List<Cue> getCues(long j) {
        return j >= this.timeUs ? this.cues : ImmutableList.of();
    }
}
