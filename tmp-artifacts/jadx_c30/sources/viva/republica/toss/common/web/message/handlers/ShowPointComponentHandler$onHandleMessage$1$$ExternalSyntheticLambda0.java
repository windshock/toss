package viva.republica.toss.common.web.message.handlers;

import androidx.activity.ComponentActivity;
import kotlin.jvm.functions.Function0;
import o.isCritical;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class ShowPointComponentHandler$onHandleMessage$1$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ isCritical f$0;
    public final /* synthetic */ ComponentActivity f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ ShowPointComponentHandler$onHandleMessage$1$$ExternalSyntheticLambda0(isCritical iscritical, ComponentActivity componentActivity, String str) {
        this.f$0 = iscritical;
        this.f$1 = componentActivity;
        this.f$2 = str;
    }

    public final Object invoke() {
        return isCritical.IAuthTabCallback.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2);
    }
}
