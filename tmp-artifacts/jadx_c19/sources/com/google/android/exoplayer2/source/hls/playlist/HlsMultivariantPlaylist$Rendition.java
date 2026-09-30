package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class HlsMultivariantPlaylist$Rendition {
    public final Format format;
    public final String groupId;
    public final String name;
    public final Uri url;

    public HlsMultivariantPlaylist$Rendition(@Nullable Uri uri, Format format, String str, String str2) {
        this.url = uri;
        this.format = format;
        this.groupId = str;
        this.name = str2;
    }
}
