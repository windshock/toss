package o;

import org.apache.commons.digester.Rules;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class PAGNativeAdsLoadListener implements Rules {
    private PAGVideoAdListener onWarmupCompleted;

    @Override // org.apache.commons.digester.Rules
    public void onExtraCallbackWithResult(PAGVideoAdListener pAGVideoAdListener) {
        this.onWarmupCompleted = pAGVideoAdListener;
    }
}
