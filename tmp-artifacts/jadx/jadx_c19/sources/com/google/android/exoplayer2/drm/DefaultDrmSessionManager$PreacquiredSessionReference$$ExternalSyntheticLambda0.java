package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class DefaultDrmSessionManager$PreacquiredSessionReference$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ DefaultDrmSessionManager.PreacquiredSessionReference f$0;
    public final /* synthetic */ Format f$1;

    public /* synthetic */ DefaultDrmSessionManager$PreacquiredSessionReference$$ExternalSyntheticLambda0(DefaultDrmSessionManager.PreacquiredSessionReference preacquiredSessionReference, Format format) {
        this.f$0 = preacquiredSessionReference;
        this.f$1 = format;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DefaultDrmSessionManager.PreacquiredSessionReference.$r8$lambda$YpXXpl9LmBj2CPJf8j0JHYUxFMw(this.f$0, this.f$1);
    }
}
