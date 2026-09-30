package o;

import org.jmrtd.lds.iso19794.IrisImageInfo;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class setAdInteractionCallback extends PAGConstant {
    private static final int[] onExtraCallback = {verifySignatureValue_NoAlgorithmInfo.ACTIVITY_REQ_CODE_CHOOSE_ACCOUNT, IrisImageInfo.IMAGE_QUAL_UNDEF, 208, 13};
    private final boolean IAuthTabCallbackStub;
    private final onExtraCallback asInterface;
    private final PangleAd onNavigationEvent;
    private final boolean onTransact;
    private boolean onWarmupCompleted;

    static class onExtraCallback {
        private final int[] onExtraCallbackWithResult;
        private final int[] onWarmupCompleted;

        private onExtraCallback() {
            this.onWarmupCompleted = new int[8];
            this.onExtraCallbackWithResult = new int[8];
        }
    }

    public setAdInteractionCallback() {
        super(1, null);
        this.onNavigationEvent = new PangleAd();
        this.onWarmupCompleted = true;
        this.IAuthTabCallbackStub = true;
        this.onTransact = true;
        this.asInterface = new onExtraCallback();
    }

    public void onExtraCallbackWithResult(int i) {
        this.onNavigationEvent.onExtraCallback(i);
    }
}
