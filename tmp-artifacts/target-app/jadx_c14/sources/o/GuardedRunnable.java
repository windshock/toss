package o;

import java.util.Calendar;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.GuardedRunnable;
import viva.republica.toss.network.model.pedometer.DailySyncReq;
import viva.republica.toss.network.model.pedometer.DailySyncRes;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class GuardedRunnable {
    public static final GuardedRunnable onExtraCallbackWithResult = new GuardedRunnable();
    private static final Lazy onWarmupCompleted = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.pedometer.PedometerEvent$$ExternalSyntheticLambda0
        public final Object invoke() {
            return GuardedRunnable.onNavigationEvent();
        }
    });
    private static final Lazy IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.pedometer.PedometerEvent$$ExternalSyntheticLambda1
        public final Object invoke() {
            return GuardedRunnable.asBinder();
        }
    });
    public static final int onNavigationEvent = 8;

    private GuardedRunnable() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getTimestampBytes onNavigationEvent() {
        return getTimestampBytes.IAuthTabCallback();
    }

    public final getTimestampBytes<Pair<Integer, Calendar>> IAuthTabCallback() {
        Object value = onWarmupCompleted.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (getTimestampBytes) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final setTid asBinder() {
        return setTid.onNavigationEvent();
    }

    public final setTid<Pair<DailySyncReq, DailySyncRes>> onExtraCallback() {
        Object value = IAuthTabCallback.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (setTid) value;
    }
}
