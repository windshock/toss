package viva.republica.toss.verify.session.util;

import kotlin.jvm.functions.Function1;
import o.enableVirtualViewWindowFocusDetection;
import o.onPreemption;
import o.onTracingStateChanged;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class VerifySessionViewModelStateExtKt$$ExternalSyntheticLambda26 implements Function1 {
    public final /* synthetic */ onPreemption.IAuthTabCallback f$0;

    public final Object invoke(Object obj) {
        return onTracingStateChanged.onExtraCallbackWithResult(this.f$0, (enableVirtualViewWindowFocusDetection) obj);
    }
}
