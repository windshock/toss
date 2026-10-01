package viva.republica.toss.service;

import android.app.Activity;
import o.RuntimeScheduler;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class CaWebViewScraper$LabScrapingInterface$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ RuntimeScheduler f$0;
    public final /* synthetic */ Activity f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ CaWebViewScraper$LabScrapingInterface$$ExternalSyntheticLambda0(RuntimeScheduler runtimeScheduler, Activity activity, String str) {
        this.f$0 = runtimeScheduler;
        this.f$1 = activity;
        this.f$2 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RuntimeScheduler.onNavigationEvent.IAuthTabCallback(this.f$0, this.f$1, this.f$2);
    }
}
