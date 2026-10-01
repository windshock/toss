package org.apache.commons.compress.archivers.zip;

import java.util.concurrent.Callable;
import o.TTVideoLandingPageLink2Activity5;
import o.TTWebsiteActivity9;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class ParallelScatterZipCreator$$ExternalSyntheticLambda0 implements Callable {
    public final /* synthetic */ TTVideoLandingPageLink2Activity5 f$0;
    public final /* synthetic */ TTWebsiteActivity9 f$1;

    public /* synthetic */ ParallelScatterZipCreator$$ExternalSyntheticLambda0(TTVideoLandingPageLink2Activity5 tTVideoLandingPageLink2Activity5, TTWebsiteActivity9 tTWebsiteActivity9) {
        this.f$0 = tTVideoLandingPageLink2Activity5;
        this.f$1 = tTWebsiteActivity9;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return TTVideoLandingPageLink2Activity5.onWarmupCompleted(this.f$0, this.f$1);
    }
}
