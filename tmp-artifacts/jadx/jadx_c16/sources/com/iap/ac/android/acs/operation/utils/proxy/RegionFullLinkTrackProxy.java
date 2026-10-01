package com.iap.ac.android.acs.operation.utils.proxy;

import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.kernel.common.Proxiable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface RegionFullLinkTrackProxy extends Proxiable {
    void release(App app);

    void setRegionApp(App app);

    void trackFetchBatchQueryEndStage();

    void trackFetchBatchQueryStartStage(boolean z);

    void trackLoginEndStage();

    void trackLoginStartStage();
}
