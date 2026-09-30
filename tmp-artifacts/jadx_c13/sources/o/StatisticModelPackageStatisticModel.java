package o;

import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class StatisticModelPackageStatisticModel extends AbstractCoroutineContextElement {
    public static final onExtraCallbackWithResult onWarmupCompleted = new onExtraCallbackWithResult(null);
    public boolean onExtraCallback;

    public static final class onExtraCallbackWithResult implements CoroutineContext.onExtraCallback<StatisticModelPackageStatisticModel> {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    public StatisticModelPackageStatisticModel() {
        super(onWarmupCompleted);
    }
}
