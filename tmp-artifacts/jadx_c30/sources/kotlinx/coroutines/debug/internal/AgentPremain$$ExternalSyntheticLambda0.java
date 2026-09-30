package kotlinx.coroutines.debug.internal;

import o.ry;
import sun.misc.Signal;
import sun.misc.SignalHandler;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class AgentPremain$$ExternalSyntheticLambda0 implements SignalHandler {
    public final void handle(Signal signal) {
        ry.onExtraCallback(signal);
    }
}
