package com.google.android.exoplayer2.text.subrip;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Collections;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SubripSubtitle implements Subtitle {
    private final long[] cueTimesUs;
    private final Cue[] cues;

    public SubripSubtitle(Cue[] cueArr, long[] jArr) {
        this.cues = cueArr;
        this.cueTimesUs = jArr;
    }

    public int getNextEventTimeIndex(long j) {
        int iBinarySearchCeil = Util.binarySearchCeil(this.cueTimesUs, j, false, false);
        if (iBinarySearchCeil < this.cueTimesUs.length) {
            return iBinarySearchCeil;
        }
        return -1;
    }

    public int getEventTimeCount() {
        return this.cueTimesUs.length;
    }

    public long getEventTime(int i2) {
        Assertions.checkArgument(i2 >= 0);
        Assertions.checkArgument(i2 < this.cueTimesUs.length);
        return this.cueTimesUs[i2];
    }

    public List<Cue> getCues(long j) {
        Cue cue;
        int iBinarySearchFloor = Util.binarySearchFloor(this.cueTimesUs, j, true, false);
        if (iBinarySearchFloor == -1 || (cue = this.cues[iBinarySearchFloor]) == Cue.EMPTY) {
            return Collections.EMPTY_LIST;
        }
        return Collections.singletonList(cue);
    }
}
