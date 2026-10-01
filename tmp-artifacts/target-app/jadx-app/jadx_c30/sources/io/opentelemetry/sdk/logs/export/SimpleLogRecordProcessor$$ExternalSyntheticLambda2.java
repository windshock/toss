package io.opentelemetry.sdk.logs.export;

import o.extractTombstoneThreads;
import o.setMetadataTrimMetrics;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class SimpleLogRecordProcessor$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ setMetadataTrimMetrics f$0;
    public final /* synthetic */ extractTombstoneThreads f$1;

    public /* synthetic */ SimpleLogRecordProcessor$$ExternalSyntheticLambda2(setMetadataTrimMetrics setmetadatatrimmetrics, extractTombstoneThreads extracttombstonethreads) {
        this.f$0 = setmetadatatrimmetrics;
        this.f$1 = extracttombstonethreads;
    }

    @Override // java.lang.Runnable
    public final void run() {
        setMetadataTrimMetrics.onWarmupCompleted(this.f$0, this.f$1);
    }
}
