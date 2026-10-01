package com.iap.ac.android.acs.operation.biz.region;

import com.iap.ac.android.acs.operation.biz.region.operation.bean.SearchAppsResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class RegionManager$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ FetchSearchAppsByKeywordCallBack f$0;
    public final /* synthetic */ SearchAppsResult f$1;

    public /* synthetic */ RegionManager$$ExternalSyntheticLambda1(FetchSearchAppsByKeywordCallBack fetchSearchAppsByKeywordCallBack, SearchAppsResult searchAppsResult) {
        this.f$0 = fetchSearchAppsByKeywordCallBack;
        this.f$1 = searchAppsResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RegionManager.$r8$lambda$_hmVsST4efLScszBYlXwqLqqEXk(this.f$0, this.f$1);
    }
}
