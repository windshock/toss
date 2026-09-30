package o;

import java.io.InputStream;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class dj10 {
    private final PAGInterstitialAd1 IAuthTabCallback;
    private final int onNavigationEvent;

    public int onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }

    public InputStream onExtraCallback() {
        return this.IAuthTabCallback.onExtraCallbackWithResult();
    }
}
