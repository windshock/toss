package viva.republica.toss.common.web.message.handlers.pedometer;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import o.X9FieldID;
import o.setOnOutOfMemeryErrorCallback;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class PedometerEnabledHandler$enablePedometer$1$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ Context f$0;
    public final /* synthetic */ setOnOutOfMemeryErrorCallback f$1;

    public /* synthetic */ PedometerEnabledHandler$enablePedometer$1$$ExternalSyntheticLambda0(Context context, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) {
        this.f$0 = context;
        this.f$1 = setonoutofmemeryerrorcallback;
    }

    public final Object invoke() {
        return X9FieldID.onWarmupCompleted.onWarmupCompleted(this.f$0, this.f$1);
    }
}
