package im.toss.core.workerservice;

import android.os.Bundle;
import kotlin.jvm.functions.Function1;
import o.onCallback;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class WorkerService$$ExternalSyntheticLambda8 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ int f$0;
    public final /* synthetic */ onCallback f$1;
    public final /* synthetic */ Bundle f$2;

    public /* synthetic */ WorkerService$$ExternalSyntheticLambda8(int i, onCallback oncallback, Bundle bundle) {
        this.f$0 = i;
        this.f$1 = oncallback;
        this.f$2 = bundle;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.f$0;
        if (i3 == 0) {
            return onCallback.onExtraCallback(i4, this.f$1, this.f$2, (String) obj);
        }
        Bundle bundleOnExtraCallback = onCallback.onExtraCallback(i4, this.f$1, this.f$2, (String) obj);
        int i5 = 10 / 0;
        return bundleOnExtraCallback;
    }
}
