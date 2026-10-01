package o;

import java.lang.Throwable;
import o.getDislikeSendTip;

@FunctionalInterface
/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface getDislikeSendTip<E extends Throwable> {
    public static final getDislikeSendTip onExtraCallbackWithResult = new getDislikeSendTip() { // from class: org.apache.commons.lang3.function.FailableDoubleToLongFunction$$ExternalSyntheticLambda0
        public final int applyAsLong(double d) {
            return getDislikeSendTip.onExtraCallback(d);
        }
    };

    static /* synthetic */ int onExtraCallback(double d) {
        return 0;
    }
}
