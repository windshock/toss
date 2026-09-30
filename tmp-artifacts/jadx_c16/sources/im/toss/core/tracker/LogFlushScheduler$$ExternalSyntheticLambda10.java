package im.toss.core.tracker;

import kotlin.jvm.functions.Function0;
import o.deserializeDecimalCollection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LogFlushScheduler$$ExternalSyntheticLambda10 implements Function0 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ deserializeDecimalCollection f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        deserializeDecimalCollection deserializedecimalcollection = this.f$0;
        if (i3 != 0) {
            return LogFlushScheduler.onWarmupCompleted(deserializedecimalcollection);
        }
        LogFlushScheduler.onWarmupCompleted(deserializedecimalcollection);
        throw null;
    }
}
