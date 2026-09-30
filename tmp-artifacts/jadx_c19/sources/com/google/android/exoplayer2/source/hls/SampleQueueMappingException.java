package com.google.android.exoplayer2.source.hls;

import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SampleQueueMappingException extends IOException {
    public SampleQueueMappingException(@Nullable String str) {
        super("Unable to bind a sample queue to TrackGroup with mime type " + str + ".");
    }
}
