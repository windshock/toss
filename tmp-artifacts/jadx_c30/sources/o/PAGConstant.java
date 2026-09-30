package o;

import java.util.List;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class PAGConstant {
    private static final int[] onWarmupCompleted = {0, 0, 1000, verifySignatureValue_NoAlgorithmInfo.RESULT_TOSS_CARD_AUTO_CHARGE_REMOVED, 100, 100, 100, 100, 100, 0};
    final int IAuthTabCallback;
    protected final setAdInteractionCallback onExtraCallbackWithResult;

    public PAGConstant(int i, setAdInteractionCallback setadinteractioncallback) {
        this.IAuthTabCallback = i;
        this.onExtraCallbackWithResult = setadinteractioncallback;
    }

    public static /* synthetic */ int IAuthTabCallback(long[] jArr, int i) {
        return (int) jArr[i];
    }

    public static /* synthetic */ void onExtraCallback(Map map, List list, Integer num, Integer num2) {
        if (num2.intValue() > 2 || map.size() < 256) {
            list.add(num);
        }
    }
}
