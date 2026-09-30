package o;

import java.util.List;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getSdkTypeFactory {
    private final PAGBiddingRequest IAuthTabCallback;
    private final int asBinder;
    private int asInterface;
    private final int onExtraCallback;
    private int onExtraCallbackWithResult;
    private int onNavigationEvent;
    private int onTransact;
    private final int onWarmupCompleted;

    public void onWarmupCompleted(List<Integer> list) {
        this.onTransact = list.get(this.asBinder).intValue();
        int i = this.asBinder + this.onExtraCallback;
        this.onNavigationEvent = list.get(i).intValue();
        this.asInterface = list.get(i + this.onWarmupCompleted).intValue();
    }

    public void onExtraCallbackWithResult(createRewardAdLoader createrewardadloader) {
        PAGBiddingRequest pAGBiddingRequest = this.IAuthTabCallback;
        if (pAGBiddingRequest == null) {
            this.onExtraCallbackWithResult = 0;
        } else {
            pAGBiddingRequest.onExtraCallback(createrewardadloader);
            this.onExtraCallbackWithResult = createrewardadloader.IAuthTabCallback(this.IAuthTabCallback);
        }
    }
}
