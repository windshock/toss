package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmSessionManager;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SampleQueue$SharedSampleMetadata {
    public final DrmSessionManager.DrmSessionReference drmSessionReference;
    public final Format format;

    private SampleQueue$SharedSampleMetadata(Format format, DrmSessionManager.DrmSessionReference drmSessionReference) {
        this.format = format;
        this.drmSessionReference = drmSessionReference;
    }
}
