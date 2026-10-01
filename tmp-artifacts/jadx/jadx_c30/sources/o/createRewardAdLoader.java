package o;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class createRewardAdLoader {
    private boolean asBinder;
    protected Map<createNativeAdLoader, Integer> onNavigationEvent;
    protected HashSet<createNativeAdLoader> onExtraCallbackWithResult = new HashSet<>();
    protected HashSet<createNativeAdLoader> onExtraCallback = new HashSet<>();
    private final HashSet<createNativeAdLoader> IAuthTabCallback = new HashSet<>();
    private final List<createNativeAdLoader> asInterface = new ArrayList(verifySignatureValue_NoAlgorithmInfo.RESULT_TOSS_CARD_AUTO_CHARGE_REMOVED);
    private final List<createNativeAdLoader> onWarmupCompleted = new ArrayList(verifySignatureValue_NoAlgorithmInfo.RESULT_TOSS_CARD_AUTO_CHARGE_REMOVED);

    public int IAuthTabCallback(createNativeAdLoader createnativeadloader) {
        if (!this.asBinder) {
            throw new IllegalStateException("Constant pool is not yet resolved; this does not make any sense");
        }
        Map<createNativeAdLoader, Integer> map = this.onNavigationEvent;
        if (map == null) {
            throw new IllegalStateException("Index cache is not initialized!");
        }
        Integer num = map.get(createnativeadloader);
        if (num != null) {
            return num.intValue() + 1;
        }
        return -1;
    }
}
